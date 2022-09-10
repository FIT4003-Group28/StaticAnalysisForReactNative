package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: hc  reason: default package */
/* loaded from: classes6.dex */
public final class hc implements Runnable {
    final /* synthetic */ fd a;
    final /* synthetic */ akq b;
    final /* synthetic */ fy c;

    public hc(fy fyVar, fd fdVar, akq akqVar) {
        this.c = fyVar;
        this.a = fdVar;
        this.b = akqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.c.b(this.a, this.b);
    }
}
