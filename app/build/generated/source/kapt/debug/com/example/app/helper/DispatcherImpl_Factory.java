package com.example.app.helper;

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
public final class DispatcherImpl_Factory implements Factory<DispatcherImpl> {
  @Override
  public DispatcherImpl get() {
    return newInstance();
  }

  public static DispatcherImpl_Factory create() {
    return InstanceHolder.INSTANCE;
  }

  public static DispatcherImpl newInstance() {
    return new DispatcherImpl();
  }

  private static final class InstanceHolder {
    private static final DispatcherImpl_Factory INSTANCE = new DispatcherImpl_Factory();
  }
}
