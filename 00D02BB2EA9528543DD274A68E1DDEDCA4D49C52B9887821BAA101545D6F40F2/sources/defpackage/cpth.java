package defpackage;
/* compiled from: PG */
/* renamed from: cpth  reason: default package */
/* loaded from: classes5.dex */
final class cpth implements Runnable {
    final /* synthetic */ float a;
    final /* synthetic */ float b;
    final /* synthetic */ cptj c;

    public cpth(cptj cptjVar, float f, float f2) {
        this.c = cptjVar;
        this.a = f;
        this.b = f2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cptj cptjVar = this.c;
        cptjVar.d.a(cptjVar.h(), this.a, this.b);
    }
}
