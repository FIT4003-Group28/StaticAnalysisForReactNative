package defpackage;
/* compiled from: PG */
/* renamed from: bxrn  reason: default package */
/* loaded from: classes4.dex */
final class bxrn {
    public static final dbsz<dcdc<dpte>> a = bxrj.a;
    public final awvv<dvhq> b;
    public final awvy c;
    public final bxrf d;
    public final dxio<akox> e;
    public final dbsg<dxio<aeaa>> f;
    public final awwt g;
    public final bxrk h;
    public dbsz<dcdc<dpte>> i = a;

    /* JADX WARN: Multi-variable type inference failed */
    public bxrn(awvv awvvVar, awvy awvyVar, bxrf bxrfVar, dxio dxioVar, dbsg dbsgVar) {
        dcdc f;
        this.b = awvvVar;
        this.c = awvyVar;
        this.d = bxrfVar;
        this.e = dxioVar;
        this.f = dbsgVar;
        awws u = awwt.u();
        drbk drbkVar = drbk.UNKNOWN_CONTENT_TYPE;
        int ordinal = awvvVar.O.ordinal();
        if (ordinal == 22) {
            f = dcdc.f("recent_history");
        } else if (ordinal == 57) {
            f = dcdc.f("personalized_history");
        } else {
            String valueOf = String.valueOf(awvvVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("Unsupported Content Type: ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        }
        u.t(f);
        u.e(awvvVar);
        this.g = u.a();
        this.h = new bxrk(this);
    }
}
