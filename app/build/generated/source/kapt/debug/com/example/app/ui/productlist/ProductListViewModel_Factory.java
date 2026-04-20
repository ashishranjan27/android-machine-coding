package com.example.app.ui.productlist;

import com.example.app.domain.usecase.GetProductItemUseCase;
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
public final class ProductListViewModel_Factory implements Factory<ProductListViewModel> {
  private final Provider<GetProductItemUseCase> getProductItemUseCaseProvider;

  public ProductListViewModel_Factory(
      Provider<GetProductItemUseCase> getProductItemUseCaseProvider) {
    this.getProductItemUseCaseProvider = getProductItemUseCaseProvider;
  }

  @Override
  public ProductListViewModel get() {
    return newInstance(getProductItemUseCaseProvider.get());
  }

  public static ProductListViewModel_Factory create(
      Provider<GetProductItemUseCase> getProductItemUseCaseProvider) {
    return new ProductListViewModel_Factory(getProductItemUseCaseProvider);
  }

  public static ProductListViewModel newInstance(GetProductItemUseCase getProductItemUseCase) {
    return new ProductListViewModel(getProductItemUseCase);
  }
}
