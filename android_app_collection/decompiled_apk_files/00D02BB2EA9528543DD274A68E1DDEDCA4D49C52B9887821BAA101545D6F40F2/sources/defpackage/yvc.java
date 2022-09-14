package defpackage;
/* compiled from: PG */
/* renamed from: yvc  reason: default package */
/* loaded from: classes7.dex */
final class yvc extends yvj {
    private String a;
    private dcdc<dvzn> b;
    private dcdc<drij> c;
    private int d;

    @Override // defpackage.yvj
    public final void b(dcdc<dvzn> dcdcVar) {
        if (dcdcVar != null) {
            this.b = dcdcVar;
            return;
        }
        throw new NullPointerException("Null polylineSegments");
    }

    @Override // defpackage.yvj
    public final void c(dcdc<drij> dcdcVar) {
        if (dcdcVar != null) {
            this.c = dcdcVar;
            return;
        }
        throw new NullPointerException("Null transitStops");
    }

    @Override // defpackage.yvj
    public final void d(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null vehicleToken");
    }

    @Override // defpackage.yvj
    public final void e(int i) {
        this.d = i;
    }

    @Override // defpackage.yvj
    public final yvk a() {
        String str = this.a == null ? " vehicleToken" : "";
        if (this.b == null) {
            str = str.concat(" polylineSegments");
        }
        if (this.c == null) {
            str = String.valueOf(str).concat(" transitStops");
        }
        if (this.d == 0) {
            str = String.valueOf(str).concat(" polylineType");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new yvd(this.a, this.b, this.c, this.d);
    }
}
