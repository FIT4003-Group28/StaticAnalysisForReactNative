package defpackage;
/* compiled from: PG */
/* renamed from: dyuo  reason: default package */
/* loaded from: classes6.dex */
final class dyuo implements Runnable {
    final /* synthetic */ dyup a;

    public dyuo(dyup dyupVar) {
        this.a = dyupVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        dyuq dyuqVar = this.a.a;
        this.a.a.b.u(dyuqVar.b.t(dyuqVar.a.d + 1));
    }
}
