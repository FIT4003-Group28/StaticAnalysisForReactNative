package defpackage;
/* compiled from: PG */
/* renamed from: bzjy  reason: default package */
/* loaded from: classes4.dex */
public final class bzjy extends bzkq {
    public bzlf a;
    public int b;
    private Boolean c;
    private Boolean d;
    private Boolean e;
    private Boolean f;
    private Boolean g;
    private Boolean h;
    private Boolean i;
    private Boolean j;
    private int k;

    @Override // defpackage.bzkq
    public final void b(boolean z) {
        this.c = Boolean.valueOf(z);
    }

    @Override // defpackage.bzkq
    public final void c() {
        this.d = false;
    }

    @Override // defpackage.bzkq
    public final void d() {
        this.i = false;
    }

    @Override // defpackage.bzkq
    public final void e(boolean z) {
        this.f = Boolean.valueOf(z);
    }

    @Override // defpackage.bzkq
    public final void f(boolean z) {
        this.g = Boolean.valueOf(z);
    }

    @Override // defpackage.bzkq
    public final void g(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.bzkq
    public final void h(boolean z) {
        this.e = Boolean.valueOf(z);
    }

    @Override // defpackage.bzkq
    public final void i(boolean z) {
        this.j = Boolean.valueOf(z);
    }

    @Override // defpackage.bzkq
    public final void j(int i) {
        this.k = i;
    }

    @Override // defpackage.bzkq
    public final bzkr a() {
        String str = this.c == null ? " allowDoubleChip" : "";
        if (this.d == null) {
            str = str.concat(" allowSingleChipOnRight");
        }
        if (this.e == null) {
            str = String.valueOf(str).concat(" preferRealtimeToTwoDepartures");
        }
        if (this.f == null) {
            str = String.valueOf(str).concat(" enableExpandedView");
        }
        if (this.g == null) {
            str = String.valueOf(str).concat(" enableRealtime");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" enableVehicleOccupancy");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" enableAlertsSummaryIcon");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" useDestinationSpecificHeader");
        }
        if (this.k == 0) {
            str = String.valueOf(str).concat(" departureTimeFormatPolicy");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" timeFormatSpec");
        }
        if (this.b == 0) {
            str = String.valueOf(str).concat(" hourDisplayMode");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new bzjz(this.c.booleanValue(), this.d.booleanValue(), this.e.booleanValue(), this.f.booleanValue(), this.g.booleanValue(), this.h.booleanValue(), this.i.booleanValue(), this.j.booleanValue(), this.k, this.a, this.b);
    }
}
