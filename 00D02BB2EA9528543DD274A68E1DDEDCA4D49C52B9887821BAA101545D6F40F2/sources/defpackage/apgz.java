package defpackage;

import android.content.res.Resources;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apgz  reason: default package */
/* loaded from: classes2.dex */
public class apgz implements bsgz {
    private static final dcdn<aoxr, ddho> a;
    private final Resources b;
    private final gft c;
    private final gn d;
    private final apgy e;
    private aoxr f;
    private final dcdc<aoxr> g;

    static {
        dcdg p = dcdn.p();
        p.f(aoxr.LAST_VISIT_TIME, dtyi.aW);
        p.f(aoxr.NUM_VISITS, dtyi.aX);
        p.f(aoxr.ALPHABETICALLY, dtyi.aV);
        a = p.b();
    }

    public apgz(Resources resources, gga ggaVar, gft gftVar, apgy apgyVar, aoxr aoxrVar, dcdc<aoxr> dcdcVar) {
        this.b = resources;
        this.c = gftVar;
        this.d = ggaVar.g();
        this.e = apgyVar;
        this.f = aoxrVar;
        this.g = dcdcVar;
    }

    @Override // defpackage.bsgz
    public Boolean Rg(int i) {
        return Boolean.valueOf(i < c().intValue());
    }

    public dcdc<aoxr> a() {
        return this.g;
    }

    @Override // defpackage.jab
    public Integer c() {
        return Integer.valueOf(this.g.size());
    }

    @Override // defpackage.jab
    public Boolean d(int i) {
        boolean z = false;
        if (i >= c().intValue()) {
            return false;
        }
        if (this.g.get(i) == this.f) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jab
    public CharSequence e(int i) {
        return i < c().intValue() ? aoxs.a(this.b, this.g.get(i)) : "";
    }

    @Override // defpackage.jab
    public cqkl f(cjqm cjqmVar, int i) {
        aoxr aoxrVar = this.g.get(i);
        this.f = aoxrVar;
        ((apev) this.e).a.Nw(aoxrVar);
        if (((ges) this.c).aD) {
            this.d.f();
        }
        return cqkl.a;
    }

    @Override // defpackage.jab
    @dzsi
    public cjtd g(int i) {
        if (i >= c().intValue()) {
            return null;
        }
        aoxr aoxrVar = this.g.get(i);
        dcdn<aoxr, ddho> dcdnVar = a;
        if (!dcdnVar.containsKey(aoxrVar)) {
            return null;
        }
        ddho ddhoVar = dcdnVar.get(aoxrVar);
        dbsk.s(ddhoVar);
        return cjtd.a(ddhoVar);
    }

    @Override // defpackage.bsgz
    public CharSequence h() {
        return this.b.getString(R.string.SEARCH_SORT_BY);
    }

    @Override // defpackage.bsgz
    public CharSequence i() {
        return "";
    }

    @Override // defpackage.bsgz
    public CharSequence j(int i) {
        String string;
        if (i >= c().intValue()) {
            return "";
        }
        if (this.f.equals(this.g.get(i))) {
            string = this.b.getString(R.string.RESTRICTION_SELECTED);
        } else {
            string = this.b.getString(R.string.RESTRICTION_NOT_SELECTED);
        }
        return this.b.getString(R.string.RESTRICTION_FILTER_OPTION_DESCRIPTION, e(i), string);
    }

    @Override // defpackage.bsgz
    public Boolean k(int i) {
        return false;
    }

    public aoxr l() {
        return this.f;
    }
}
