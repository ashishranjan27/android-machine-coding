package com.example.app.domain.usecase;

import com.example.app.domain.repository.ProductRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@Generated(
    value = "dagger.internal.codegen.ComponentProcessor",
    comments = "https://dagger.dev"
)
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava",
    "cast"
})
public final class GetProductItemUseCase_Factory implements Factory<GetProductItemUseCase> {
  private final Provider<ProductRepository> productRepositoryProvider;

  public GetProductItemUseCase_Factory(Provider<ProductRepository> productRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public GetProductItemUseCase get() {
    return newInstance(productRepositoryProvider.get());
  }

  public static GetProductItemUseCase_Factory create(
      Provider<ProductRepository> productRepositoryProvider) {
    return new GetProductItemUseCase_Factory(productRepositoryProvider);
  }

  public static GetProductItemUseCase newInstance(ProductRepository productRepository) {
    return new GetProductItemUseCase(productRepository);
  }
}
