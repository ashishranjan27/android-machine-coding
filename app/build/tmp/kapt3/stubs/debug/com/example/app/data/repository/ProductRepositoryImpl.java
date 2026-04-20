package com.example.app.data.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\u001c\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u000eJ\"\u0010\u000f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\u00100\n2\u0006\u0010\u0012\u001a\u00020\rH\u0096@\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0013"}, d2 = {"Lcom/example/app/data/repository/ProductRepositoryImpl;", "Lcom/example/app/domain/repository/ProductRepository;", "productApi", "Lcom/example/app/data/remote/ProductApiService;", "dispatcher", "Lcom/example/app/helper/Dispatcher;", "productMapper", "Lcom/example/app/data/mapper/ProductMapper;", "(Lcom/example/app/data/remote/ProductApiService;Lcom/example/app/helper/Dispatcher;Lcom/example/app/data/mapper/ProductMapper;)V", "getProductDetailsById", "Lcom/example/app/helper/UiState;", "Lcom/example/app/domain/model/ProductDetailsModel;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductList", "", "Lcom/example/app/domain/model/ProductItemModel;", "limit", "app_debug"})
public final class ProductRepositoryImpl implements com.example.app.domain.repository.ProductRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.app.data.remote.ProductApiService productApi = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.app.helper.Dispatcher dispatcher = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.app.data.mapper.ProductMapper productMapper = null;
    
    @javax.inject.Inject()
    public ProductRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.example.app.data.remote.ProductApiService productApi, @org.jetbrains.annotations.NotNull()
    com.example.app.helper.Dispatcher dispatcher, @org.jetbrains.annotations.NotNull()
    com.example.app.data.mapper.ProductMapper productMapper) {
        super();
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getProductList(int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.app.helper.UiState<? extends java.util.List<com.example.app.domain.model.ProductItemModel>>> $completion) {
        return null;
    }
    
    @java.lang.Override()
    @org.jetbrains.annotations.Nullable()
    public java.lang.Object getProductDetailsById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.app.helper.UiState<com.example.app.domain.model.ProductDetailsModel>> $completion) {
        return null;
    }
}