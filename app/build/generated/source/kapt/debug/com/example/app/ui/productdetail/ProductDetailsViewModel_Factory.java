package com.example.app.ui.productdetail;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;

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
public final class ProductDetailsViewModel_Factory implements Factory<ProductDetailsViewModel> {
  @Override
  public ProductDetailsViewModel get() {
    return newInstance();
  }

  public static ProductDetailsViewModel_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ProductDetailsViewModel newInstance() {
    return new ProductDetailsViewModel();
  }

  private static final class InstanceHolder {
    private static final ProductDetailsViewModel_Factory INSTANCE = new ProductDetailsViewModel_Factory();
  }
}
