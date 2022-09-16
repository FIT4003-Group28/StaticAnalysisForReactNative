package defpackage;

import android.content.Context;
import com.google.protos.youtube.api.innertube.UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer;
import j$.util.function.Function;
/* compiled from: PG */
/* renamed from: okl  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class okl implements Function {
    public final /* synthetic */ okq a;
    private final /* synthetic */ int b;

    public /* synthetic */ okl(okq okqVar, int i) {
        this.b = i;
        this.a = okqVar;
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function andThen(Function function) {
        return this.b != 0 ? function.getClass() : function.getClass();
    }

    @Override // j$.util.function.Function
    public final /* synthetic */ Function compose(Function function) {
        return this.b != 0 ? function.getClass() : function.getClass();
    }

    @Override // j$.util.function.Function
    public final Object apply(Object obj) {
        if (this.b == 0) {
            return this.a.r(((Integer) obj).intValue());
        }
        okq okqVar = this.a;
        UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer = (UploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer) obj;
        olb olbVar = okqVar.j;
        Context context = okqVar.q.getContext();
        imq imqVar = (imq) olbVar.a.get();
        imqVar.getClass();
        context.getClass();
        uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer.getClass();
        return new ola(imqVar, context, uploadProgressArrowRendererOuterClass$UploadProgressArrowRenderer);
    }
}
