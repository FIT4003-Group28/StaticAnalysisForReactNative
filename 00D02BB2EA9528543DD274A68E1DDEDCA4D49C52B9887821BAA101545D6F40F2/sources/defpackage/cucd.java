package defpackage;
/* compiled from: PG */
/* renamed from: cucd  reason: default package */
/* loaded from: classes5.dex */
final class cucd extends ctyv {
    private Long a;
    private ctzb b;
    private dspd c;
    private ctyx d;

    @Override // defpackage.ctyv
    public final void b(ctzb ctzbVar) {
        if (ctzbVar != null) {
            this.b = ctzbVar;
            return;
        }
        throw new NullPointerException("Null accountUsers");
    }

    @Override // defpackage.ctyv
    public final void c(long j) {
        this.a = Long.valueOf(j);
    }

    @Override // defpackage.ctyv
    public final void d(dspd dspdVar) {
        if (dspdVar != null) {
            this.c = dspdVar;
            return;
        }
        throw new NullPointerException("Null serverRegistrationId");
    }

    @Override // defpackage.ctyv
    public final void e(ctyx ctyxVar) {
        if (ctyxVar != null) {
            this.d = ctyxVar;
            return;
        }
        throw new NullPointerException("Null serverRegistrationStatus");
    }

    @Override // defpackage.ctyv
    public final ctyy a() {
        String str = this.a == null ? " registrationId" : "";
        if (this.b == null) {
            str = str.concat(" accountUsers");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" serverRegistrationId");
        }
        if (this.d == null) {
            str = String.valueOf(str).concat(" serverRegistrationStatus");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cuce(this.a.longValue(), this.b, this.c, this.d);
    }
}
