package defpackage;
/* compiled from: PG */
/* renamed from: uja  reason: default package */
/* loaded from: classes4.dex */
public final class uja implements ugk {
    private final ucs a;
    private final ampq b;

    public uja(ucs ucsVar, ampq ampqVar) {
        this.a = ucsVar;
        this.b = ampqVar;
    }

    @Override // defpackage.ugk
    public final void a(String str, aoqu aoquVar, Throwable th) {
        uev.g("RemoveTargetCallback", "Unregistration finished for account: %s (FAILURE).", str);
        try {
            ucl b = this.a.b(str).b();
            b.d(ubx.FAILED_UNREGISTRATION);
            this.a.e(b.a());
            ((agax) ((ampv) this.b).a).c(th);
        } catch (ucr unused) {
        }
    }

    @Override // defpackage.ugk
    public final void b(String str, aoqu aoquVar, aoqu aoquVar2) {
        uev.e("RemoveTargetCallback", "Unregistration finished for account: %s (SUCCESS).", str);
        try {
            ucl b = this.a.b(str).b();
            b.d(ubx.UNREGISTERED);
            b.f = 0L;
            b.e = 0L;
            b.c(0);
            this.a.e(b.a());
            ((agax) ((ampv) this.b).a).d();
        } catch (ucr unused) {
        }
    }
}
