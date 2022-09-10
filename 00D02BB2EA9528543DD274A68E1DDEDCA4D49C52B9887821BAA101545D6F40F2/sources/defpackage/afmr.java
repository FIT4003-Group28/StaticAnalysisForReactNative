package defpackage;
/* compiled from: PG */
/* renamed from: afmr  reason: default package */
/* loaded from: classes2.dex */
public final class afmr implements Runnable {
    final /* synthetic */ qdg a;
    final /* synthetic */ afms b;

    public afmr(afms afmsVar, qdg qdgVar) {
        this.b = afmsVar;
        this.a = qdgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.a().t(this.a);
    }
}
