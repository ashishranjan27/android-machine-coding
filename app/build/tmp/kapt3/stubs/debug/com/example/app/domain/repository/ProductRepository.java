package com.example.app.domain.repository;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007J\"\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\u00032\u0006\u0010\u000b\u001a\u00020\u0006H\u00a6@\u00a2\u0006\u0002\u0010\u0007\u00a8\u0006\f"}, d2 = {"Lcom/example/app/domain/repository/ProductRepository;", "", "getProductDetailsById", "Lcom/example/app/helper/UiState;", "Lcom/example/app/domain/model/ProductDetailsModel;", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getProductList", "", "Lcom/example/app/domain/model/ProductItemModel;", "limit", "app_debug"})
public abstract interface ProductRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProductList(int limit, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.app.helper.UiState<? extends java.util.List<com.example.app.domain.model.ProductItemModel>>> $completion);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getProductDetailsById(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.app.helper.UiState<com.example.app.domain.model.ProductDetailsModel>> $completion);
}