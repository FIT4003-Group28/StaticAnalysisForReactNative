package defpackage;
/* compiled from: PG */
/* renamed from: ksm  reason: default package */
/* loaded from: classes7.dex */
final class ksm implements Runnable {
    final /* synthetic */ qbn a;
    final /* synthetic */ qbm b;
    final /* synthetic */ ksq c;
    final /* synthetic */ ksn d;

    public ksm(ksn ksnVar, qbn qbnVar, qbm qbmVar, ksq ksqVar) {
        this.d = ksnVar;
        this.a = qbnVar;
        this.b = qbmVar;
        this.c = ksqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = ksr.h;
        this.d.a.j(this.a, this.b, this.c);
    }
}
