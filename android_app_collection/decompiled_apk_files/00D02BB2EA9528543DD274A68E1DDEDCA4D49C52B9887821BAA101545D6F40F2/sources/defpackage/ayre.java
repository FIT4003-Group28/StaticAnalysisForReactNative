package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ayre  reason: default package */
/* loaded from: classes3.dex */
public class ayre implements aymw {
    private final gga a;
    private final cklf b;
    private final bwrs<baad> c;

    public ayre(gga ggaVar, cklf cklfVar, bwrs<baad> bwrsVar) {
        this.a = ggaVar;
        this.b = cklfVar;
        this.c = bwrsVar;
    }

    private final baad d() {
        baad c = this.c.c();
        dbsk.s(c);
        return c;
    }

    private final Integer e() {
        return Integer.valueOf(dcbg.b(d().i()).o(ayrd.a).k());
    }

    @Override // defpackage.aymw
    public Float a() {
        long S = d().S();
        if (!Boolean.valueOf(d().k() > 0).booleanValue() || S < 0) {
            return Float.valueOf(0.0f);
        }
        return Float.valueOf(((float) S) / e().intValue());
    }

    @Override // defpackage.aymw
    public String b() {
        int intValue = e().intValue();
        long S = d().S();
        return (intValue == 0 || S < 0) ? "" : this.a.getResources().getQuantityString(R.plurals.USER_LIST_PROGRESS_SUBTITLE, intValue, Integer.valueOf(decl.a(S)), Integer.valueOf(intValue));
    }

    @Override // defpackage.aymw
    public cqkl c() {
        this.b.a("location_history");
        return cqkl.a;
    }
}
