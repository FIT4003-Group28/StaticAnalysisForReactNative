package defpackage;
/* compiled from: PG */
/* renamed from: axbx  reason: default package */
/* loaded from: classes.dex */
final class axbx implements awwb {
    private final axds a;
    private final dcdn<awvv<?>, awwa> b;

    public axbx(axds axdsVar, dcdn<awvv<?>, awwa> dcdnVar) {
        this.a = axdsVar;
        this.b = dcdnVar;
    }

    @Override // defpackage.awwb
    public final <P extends dssj> dbsg<P> a(awvv<P> awvvVar) {
        awwx a = awwy.a(awvvVar);
        return a.a(this.a) > 0 ? dbsg.i(a.j(this.a, 0)) : dbpy.a;
    }

    @Override // defpackage.awwb
    public final long b(awvv<?> awvvVar) {
        awwx a = awwy.a(awvvVar);
        if (a.a(this.a) > 0) {
            return a.c(this.a, 0);
        }
        return -1L;
    }

    @Override // defpackage.awwb
    public final awwa c(awvv<?> awvvVar) {
        if (!this.b.containsKey(awvvVar)) {
            return awwa.NOT_REQUESTED;
        }
        return this.b.get(awvvVar);
    }

    @Override // defpackage.awwb
    @dzsi
    public final String d() {
        axds axdsVar = this.a;
        if ((axdsVar.a & 4) != 0) {
            return axdsVar.d;
        }
        return null;
    }

    public final boolean equals(@dzsi Object obj) {
        if (obj instanceof awwb) {
            return awvz.a(this, (awwb) obj);
        }
        return false;
    }

    public final int hashCode() {
        return awvz.b(this);
    }
}
