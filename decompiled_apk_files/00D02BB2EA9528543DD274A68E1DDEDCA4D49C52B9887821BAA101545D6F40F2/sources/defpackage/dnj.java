package defpackage;
/* compiled from: PG */
/* renamed from: dnj  reason: default package */
/* loaded from: classes6.dex */
public final class dnj {
    private final Object a = new Object();
    @dzsi
    private final ckoy b;

    public dnj(dbsg<ckox> dbsgVar) {
        this.b = ((ckox) ((dbsu) dbsgVar).a).b(ckpa.EARTH_AR_SESSION_START_TO_FINISH, dszg.AUGMENTED_REALITY, ckow.SELF_MANAGED, true, true, true, true);
    }

    public final void a() {
        synchronized (this.a) {
            ckoy ckoyVar = this.b;
            if (ckoyVar != null) {
                ckoyVar.b(0);
            }
        }
    }

    public final void b() {
        synchronized (this.a) {
            ckoy ckoyVar = this.b;
            if (ckoyVar != null) {
                ckoyVar.c(0);
            }
        }
    }
}
