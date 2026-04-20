package com.example.app.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.annotation.processing.Generated;
import javax.inject.Provider;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;

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
public final class NetworkModule_GetRetrofitFactory implements Factory<Retrofit> {
  private final NetworkModule module;

  private final Provider<OkHttpClient> okHttpClientProvider;

  public NetworkModule_GetRetrofitFactory(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    this.module = module;
    this.okHttpClientProvider = okHttpClientProvider;
  }

  @Override
  public Retrofit get() {
    return getRetrofit(module, okHttpClientProvider.get());
  }

  public static NetworkModule_GetRetrofitFactory create(NetworkModule module,
      Provider<OkHttpClient> okHttpClientProvider) {
    return new NetworkModule_GetRetrofitFactory(module, okHttpClientProvider);
  }

  public static Retrofit getRetrofit(NetworkModule instance, OkHttpClient okHttpClient) {
    return Preconditions.checkNotNullFromProvides(instance.getRetrofit(okHttpClient));
  }
}
