package com.example.app.data.mapper;

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
public final class ProductMapper_Factory implements Factory<ProductMapper> {
  @Override
  public ProductMapper get() {
    return newInstance();
  }

  public static ProductMapper_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static ProductMapper newInstance() {
    return new ProductMapper();
  }

  private static final class InstanceHolder {
    private static final ProductMapper_Factory INSTANCE = new ProductMapper_Factory();
  }
}
