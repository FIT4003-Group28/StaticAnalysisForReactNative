package defpackage;
/* compiled from: PG */
/* renamed from: avey  reason: default package */
/* loaded from: classes2.dex */
final class avey implements degu<Void> {
    final /* synthetic */ avfd a;

    public avey(avfd avfdVar) {
        this.a = avfdVar;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (!(th instanceof avlo) || ((avlo) th).a.e != drtc.ALREADY_EXISTS.s) {
            return;
        }
        this.a.k.h();
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(@dzsi Void r1) {
    }
}
