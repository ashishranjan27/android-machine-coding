package com.example.app.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import okhttp3.OkHttpClient;

@ScopeMetadata("javax.inject.Singleton")
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
public final class NetworkModule_GetOkhttpClientFactory implements Factory<OkHttpClient> {
  private final NetworkModule module;

  public NetworkModule_GetOkhttpClientFactory(NetworkModule module) {
    this.module = module;
  }

  @Override
  public OkHttpClient get() {
    return getOkhttpClient(module);
  }

  public static NetworkModule_GetOkhttpClientFactory create(NetworkModule module) {
    return new NetworkModule_GetOkhttpClientFactory(module);
  }

  public static OkHttpClient getOkhttpClient(NetworkModule instance) {
    return Preconditions.checkNotNullFromProvides(instance.getOkhttpClient());
  }
}
