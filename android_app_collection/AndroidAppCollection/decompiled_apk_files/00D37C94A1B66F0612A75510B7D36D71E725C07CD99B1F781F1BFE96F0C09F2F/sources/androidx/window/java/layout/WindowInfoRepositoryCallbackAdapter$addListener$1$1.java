package androidx.window.java.layout;
/* compiled from: PG */
@azrk(b = "androidx.window.java.layout.WindowInfoRepositoryCallbackAdapter$addListener$1$1", c = "WindowInfoRepositoryCallbackAdapter.kt", d = "invokeSuspend", e = {112})
/* loaded from: classes.dex */
final class WindowInfoRepositoryCallbackAdapter$addListener$1$1 extends azrn implements azsg {
    final /* synthetic */ ji $consumer;
    final /* synthetic */ azxe $flow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WindowInfoRepositoryCallbackAdapter$addListener$1$1(azxe azxeVar, ji jiVar, azqy azqyVar) {
        super(2, azqyVar);
        this.$flow = azxeVar;
        this.$consumer = jiVar;
    }

    @Override // defpackage.azrg
    public final azqy create(Object obj, azqy azqyVar) {
        return new WindowInfoRepositoryCallbackAdapter$addListener$1$1(this.$flow, this.$consumer, azqyVar);
    }

    @Override // defpackage.azsg
    public final Object invoke(azuw azuwVar, azqy azqyVar) {
        return ((WindowInfoRepositoryCallbackAdapter$addListener$1$1) create(azuwVar, azqyVar)).invokeSuspend(azqm.a);
    }

    @Override // defpackage.azrg
    public final Object invokeSuspend(Object obj) {
        azrf azrfVar = azrf.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            azqj.q(obj);
            azxe azxeVar = this.$flow;
            final ji jiVar = this.$consumer;
            azxf azxfVar = new azxf() { // from class: androidx.window.java.layout.WindowInfoRepositoryCallbackAdapter$addListener$1$1$invokeSuspend$$inlined$collect$1
                @Override // defpackage.azxf
                public Object emit(Object obj2, azqy azqyVar) {
                    ji.this.accept(obj2);
                    return azqm.a;
                }
            };
            this.label = 1;
            if (azxeVar.a(azxfVar, this) == azrfVar) {
                return azrfVar;
            }
        } else if (i == 1) {
            azqj.q(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return azqm.a;
    }
}
