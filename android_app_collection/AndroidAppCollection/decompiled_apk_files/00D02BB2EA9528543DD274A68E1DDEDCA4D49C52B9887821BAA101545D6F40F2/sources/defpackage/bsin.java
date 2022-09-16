package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsin  reason: default package */
/* loaded from: classes4.dex */
public class bsin implements bsgw, jaa {
    private final gga a;
    private final Resources b;
    @dzsi
    private final izz c;
    private final List<bsgy> d;

    public bsin(gga ggaVar, List<bsgy> list, izz izzVar) {
        this.a = ggaVar;
        this.b = ggaVar.getResources();
        this.d = dcdc.r(list);
        this.c = izzVar;
    }

    private final void h() {
        fd H = this.a.g().H("opening_hours_bottom_sheet");
        if (H instanceof bsau) {
            ((bsau) H).aJ();
        }
    }

    @Override // defpackage.izz
    public cqkl a() {
        h();
        return this.c.a();
    }

    @Override // defpackage.izz
    public cqkl b() {
        h();
        return this.c.b();
    }

    @Override // defpackage.jaa
    public jib c() {
        throw null;
    }

    @Override // defpackage.jaa
    public List<cqix<?>> d() {
        return dcdc.f(cqgr.fT(new bseu(), this));
    }

    @Override // defpackage.jaa
    @dzsi
    public cjtd e() {
        return cjtd.a(dtxp.G);
    }

    @Override // defpackage.bsgw
    public CharSequence f() {
        return this.b.getString(R.string.RESTRICTION_OPENING_HOURS_CUSTOM_TITLE);
    }

    @Override // defpackage.bsgw
    public CharSequence g() {
        return "";
    }

    @Override // defpackage.bsgw
    public Float i() {
        return Float.valueOf(this.d.size());
    }

    @Override // defpackage.bsgw
    public List<bsgy> j() {
        return dcdc.r(this.d);
    }

    @Override // defpackage.bsgw
    @dzsi
    public cjtd k() {
        return cjtd.a(dtxp.E);
    }
}
