package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: aofq  reason: default package */
/* loaded from: classes2.dex */
public final class aofq extends aogh {
    public dbsg<akqq> a = dbpy.a;
    public dbsg<Float> b = dbpy.a;
    public dbsg<akqq> c = dbpy.a;
    public dbsg<aogl> d = dbpy.a;
    public dbsg<Rect> e = dbpy.a;
    private dcdc<akqq> f;
    private dcdc<aogj> g;
    private Boolean h;

    @Override // defpackage.aogh
    public final void b(dcdc<akqq> dcdcVar) {
        if (dcdcVar != null) {
            this.f = dcdcVar;
            return;
        }
        throw new NullPointerException("Null fitViewportToLatLngs");
    }

    @Override // defpackage.aogh
    public final void c(dbsg<akqq> dbsgVar) {
        this.a = dbsgVar;
    }

    @Override // defpackage.aogh
    public final void d(dbsg<akqq> dbsgVar) {
        this.c = dbsgVar;
    }

    @Override // defpackage.aogh
    public final void e(dbsg<Float> dbsgVar) {
        this.b = dbsgVar;
    }

    @Override // defpackage.aogh
    public final void f(dcdc<aogj> dcdcVar) {
        if (dcdcVar != null) {
            this.g = dcdcVar;
            return;
        }
        throw new NullPointerException("Null placeLabels");
    }

    @Override // defpackage.aogh
    public final void g(boolean z) {
        this.h = Boolean.valueOf(z);
    }

    @Override // defpackage.aogh
    public final aogm a() {
        String str = this.f == null ? " fitViewportToLatLngs" : "";
        if (this.g == null) {
            str = str.concat(" placeLabels");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" restrictLabeling");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new aofr(this.a, this.b, this.c, this.d, this.f, this.e, this.g, this.h.booleanValue());
    }
}
