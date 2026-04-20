package com.example.app.data.repository;

import com.example.app.data.mapper.ProductMapper;
import com.example.app.data.remote.ProductApiService;
import com.example.app.helper.Dispatcher;
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
public final class ProductRepositoryImpl_Factory implements Factory<ProductRepositoryImpl> {
  private final Provider<ProductApiService> productApiProvider;

  private final Provider<Dispatcher> dispatcherProvider;

  private final Provider<ProductMapper> productMapperProvider;

  public ProductRepositoryImpl_Factory(Provider<ProductApiService> productApiProvider,
      Provider<Dispatcher> dispatcherProvider, Provider<ProductMapper> productMapperProvider) {
    this.productApiProvider = productApiProvider;
    this.dispatcherProvider = dispatcherProvider;
    this.productMapperProvider = productMapperProvider;
  }

  @Override
  public ProductRepositoryImpl get() {
    return newInstance(productApiProvider.get(), dispatcherProvider.get(), productMapperProvider.get());
  }

  public static ProductRepositoryImpl_Factory create(Provider<ProductApiService> productApiProvider,
      Provider<Dispatcher> dispatcherProvider, Provider<ProductMapper> productMapperProvider) {
    return new ProductRepositoryImpl_Factory(productApiProvider, dispatcherProvider, productMapperProvider);
  }

  public static ProductRepositoryImpl newInstance(ProductApiService productApi,
      Dispatcher dispatcher, ProductMapper productMapper) {
    return new ProductRepositoryImpl(productApi, dispatcher, productMapper);
  }
}
