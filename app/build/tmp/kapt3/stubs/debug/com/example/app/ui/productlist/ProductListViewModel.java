package com.example.app.ui.productlist;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0010\u001a\u00020\u0012R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR#\u0010\u000e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0013"}, d2 = {"Lcom/example/app/ui/productlist/ProductListViewModel;", "Landroidx/lifecycle/ViewModel;", "getProductItemUseCase", "Lcom/example/app/domain/usecase/GetProductItemUseCase;", "(Lcom/example/app/domain/usecase/GetProductItemUseCase;)V", "_productList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/app/helper/UiState;", "", "Lcom/example/app/domain/model/ProductItemModel;", "limit", "", "getLimit", "()I", "productList", "Lkotlinx/coroutines/flow/StateFlow;", "getProductList", "()Lkotlinx/coroutines/flow/StateFlow;", "", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel()
public final class ProductListViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull()
    private final com.example.app.domain.usecase.GetProductItemUseCase getProductItemUseCase = null;
    private final int limit = 20;
    @org.jetbrains.annotations.NotNull()
    private kotlinx.coroutines.flow.MutableStateFlow<com.example.app.helper.UiState<java.util.List<com.example.app.domain.model.ProductItemModel>>> _productList;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.example.app.helper.UiState<java.util.List<com.example.app.domain.model.ProductItemModel>>> productList = null;
    
    @javax.inject.Inject()
    public ProductListViewModel(@org.jetbrains.annotations.NotNull()
    com.example.app.domain.usecase.GetProductItemUseCase getProductItemUseCase) {
        super();
    }
    
    public final int getLimit() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.example.app.helper.UiState<java.util.List<com.example.app.domain.model.ProductItemModel>>> getProductList() {
        return null;
    }
    
    public final void getProductList() {
    }
}