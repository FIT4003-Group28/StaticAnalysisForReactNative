package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dalg  reason: default package */
/* loaded from: classes5.dex */
public final class dalg implements Runnable {
    final /* synthetic */ dame a;
    final /* synthetic */ int b;
    final /* synthetic */ int c;
    final /* synthetic */ dalh d;

    public dalg(dalh dalhVar, dame dameVar, int i, int i2) {
        this.d = dalhVar;
        this.a = dameVar;
        this.b = i;
        this.c = i2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dalh dalhVar = this.d;
        dame dameVar = this.a;
        dakn daknVar = (dakn) dameVar;
        dalhVar.f(new dakn(daknVar.a, this.b, this.c, daknVar.c, daknVar.d, daknVar.e, daknVar.f, daknVar.g, daknVar.h));
    }
}
