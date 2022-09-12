package defpackage;
/* compiled from: PG */
/* renamed from: dymr  reason: default package */
/* loaded from: classes6.dex */
final class dymr implements Runnable {
    final /* synthetic */ Object a;
    final /* synthetic */ dymu b;

    public dymr(dymu dymuVar, Object obj) {
        this.b = dymuVar;
        this.a = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.a.c(this.a);
    }
}
