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
public final class GetProductDetailsUseCase_Factory implements Factory<GetProductDetailsUseCase> {
  private final Provider<ProductRepository> productRepositoryProvider;

  public GetProductDetailsUseCase_Factory(Provider<ProductRepository> productRepositoryProvider) {
    this.productRepositoryProvider = productRepositoryProvider;
  }

  @Override
  public GetProductDetailsUseCase get() {
    return newInstance(productRepositoryProvider.get());
  }

  public static GetProductDetailsUseCase_Factory create(
      Provider<ProductRepository> productRepositoryProvider) {
    return new GetProductDetailsUseCase_Factory(productRepositoryProvider);
  }

  public static GetProductDetailsUseCase newInstance(ProductRepository productRepository) {
    return new GetProductDetailsUseCase(productRepository);
  }
}
