package defpackage;
/* compiled from: PG */
/* renamed from: ascs  reason: default package */
/* loaded from: classes2.dex */
final class ascs implements Runnable {
    final /* synthetic */ gga a;
    final /* synthetic */ begg b;
    final /* synthetic */ begj c;

    public ascs(gga ggaVar, begg beggVar, begj begjVar) {
        this.a = ggaVar;
        this.b = beggVar;
        this.c = begjVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.w();
        this.b.o(this.c, false, null);
    }
}
