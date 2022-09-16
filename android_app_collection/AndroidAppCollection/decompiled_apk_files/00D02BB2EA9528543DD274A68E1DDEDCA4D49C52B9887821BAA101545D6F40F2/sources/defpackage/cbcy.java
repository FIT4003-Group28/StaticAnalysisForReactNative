package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbcy  reason: default package */
/* loaded from: classes4.dex */
public class cbcy extends ixr {
    private static final cbcx e = new cbcx();
    private static final cbcw f = new cbcw();
    private final gga g;
    private final btrm h;
    private final bwqv i;
    private final cbcl j;

    public cbcy(cbcl cbclVar, ixq ixqVar, gga ggaVar, btrm btrmVar, bwqv bwqvVar) {
        super(ixqVar);
        this.g = ggaVar;
        this.h = btrmVar;
        this.i = bwqvVar;
        this.j = cbclVar;
    }

    @Override // defpackage.ivk, defpackage.izs
    public String E() {
        return this.g.getString(R.string.EVENT_CREATION_LOCATION_HINT);
    }

    @Override // defpackage.ixr, defpackage.izs
    public izi ae() {
        return e;
    }

    @Override // defpackage.ixr, defpackage.izs
    public izh af() {
        return f;
    }

    @Override // defpackage.ixr, defpackage.ivk, defpackage.izs
    public cqkl c() {
        cbdc i = cbdc.i(this.i, this.g, null);
        i.ad = this.j;
        this.g.C(i, gfu.ACTIVITY_FRAGMENT, new gfs[0]);
        return cqkl.a;
    }

    @Override // defpackage.ivk, defpackage.izs
    public cqkl k() {
        I("");
        this.h.b(new brco());
        return cqkl.a;
    }
}
