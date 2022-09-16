package defpackage;

import android.util.Log;
/* compiled from: PG */
/* renamed from: dwi  reason: default package */
/* loaded from: classes3.dex */
final class dwi implements aynl {
    final /* synthetic */ dwj a;

    public dwi(dwj dwjVar) {
        this.a = dwjVar;
    }

    @Override // defpackage.aynl
    public final void a() {
        ((amzw) ((amzw) dwj.a.b()).i("com/google/android/apps/search/assistant/platform/appintegration/client/GrpcConnector$1", "onCompleted", 64, "GrpcConnector.java")).q("onCompleted()");
    }

    @Override // defpackage.aynl
    public final void b(Throwable th) {
        ((amzw) ((amzw) ((amzw) dwj.a.g()).h(th)).i("com/google/android/apps/search/assistant/platform/appintegration/client/GrpcConnector$1", "onError", ':', "GrpcConnector.java")).q("onError()");
        gpr gprVar = this.a.b.e;
        int i = gps.b;
    }

    @Override // defpackage.aynl
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        sme smeVar = (sme) obj;
        ((amzw) ((amzw) dwj.a.b()).i("com/google/android/apps/search/assistant/platform/appintegration/client/GrpcConnector$1", "onNext", 49, "GrpcConnector.java")).s("onNext(%s)", smeVar);
        if ((smeVar.b & 1) != 0) {
            if (smeVar.c == null) {
                int i = smi.a;
            }
            Log.w("AIClientCbStub", String.format("callback is not an instance of CallbackExt: %s", this.a.b.e));
        }
    }
}
