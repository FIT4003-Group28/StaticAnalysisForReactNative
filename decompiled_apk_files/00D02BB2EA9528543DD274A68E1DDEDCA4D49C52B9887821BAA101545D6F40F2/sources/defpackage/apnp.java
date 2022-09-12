package defpackage;
/* compiled from: PG */
/* renamed from: apnp  reason: default package */
/* loaded from: classes2.dex */
final class apnp implements apnr {
    final /* synthetic */ apnq a;

    public apnp(apnq apnqVar) {
        this.a = apnqVar;
    }

    @Override // defpackage.apnr
    public final void a(apns apnsVar) {
        this.a.a.add(apnsVar);
        this.a.b();
    }

    @Override // defpackage.apnr
    public final void b(apns apnsVar) {
        this.a.a.remove(apnsVar);
        apnq apnqVar = this.a;
        if (apnsVar == apnqVar.b) {
            apnqVar.d();
            this.a.b();
        }
    }
}
