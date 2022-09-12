package defpackage;
/* compiled from: PG */
/* renamed from: qbd  reason: default package */
/* loaded from: classes7.dex */
public final class qbd extends qdz {
    public akqq a;
    private Double c;
    private dvzd e;
    private dbsg<djqr> d = dbpy.a;
    public dbsg<djqt> b = dbpy.a;

    @Override // defpackage.qdz
    public final void b(double d) {
        this.c = Double.valueOf(d);
    }

    @Override // defpackage.qdz
    public final void c(djqr djqrVar) {
        this.d = dbsg.i(djqrVar);
    }

    @Override // defpackage.qdz
    public final void d(dvzd dvzdVar) {
        if (dvzdVar != null) {
            this.e = dvzdVar;
            return;
        }
        throw new NullPointerException("Null transitStationParams");
    }

    @Override // defpackage.qdz
    public final qea a() {
        String str = this.a == null ? " latLng" : "";
        if (this.c == null) {
            str = str.concat(" radiusMeters");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" transitStationParams");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new qbe(this.a, this.c.doubleValue(), this.d, this.b, this.e);
    }
}
