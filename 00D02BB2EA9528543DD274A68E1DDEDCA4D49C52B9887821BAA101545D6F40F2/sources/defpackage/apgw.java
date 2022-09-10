package defpackage;

import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: apgw  reason: default package */
/* loaded from: classes2.dex */
public class apgw implements bskm {
    private static final dcdn<aoxr, Integer> e;
    private final Resources a;
    private final apgu b;
    private final aoxr c;
    private final boolean d;

    static {
        dcdg p = dcdn.p();
        p.f(aoxr.LAST_VISIT_TIME, Integer.valueOf((int) R.string.MAPS_ACTIVITY_SORT_BY_MOST_RECENT_DESCRIPTION));
        p.f(aoxr.NUM_VISITS, Integer.valueOf((int) R.string.MAPS_ACTIVITY_SORT_BY_MOST_VISITED_DESCRIPTION));
        e = p.b();
    }

    public apgw(Resources resources, apgu apguVar, aoxr aoxrVar, boolean z) {
        this.a = resources;
        this.b = apguVar;
        this.c = aoxrVar;
        this.d = z;
    }

    @Override // defpackage.bskm
    public String a() {
        if (this.d) {
            return aoxs.a(this.a, this.c);
        }
        return this.a.getString(R.string.SEARCH_SORT_BY);
    }

    @Override // defpackage.bskm
    public String b() {
        if (this.d) {
            Resources resources = this.a;
            Integer num = e.get(this.c);
            dbsk.s(num);
            return resources.getString(num.intValue(), a(), a());
        }
        return this.a.getString(R.string.MAPS_ACTIVITY_SORT_BY_PIVOT_DESCIPTION);
    }

    @Override // defpackage.bskm
    public Boolean c() {
        return Boolean.valueOf(this.d);
    }

    @Override // defpackage.bskm
    public Boolean d() {
        return true;
    }

    @Override // defpackage.bskm
    public cqkl e(cjqm cjqmVar) {
        this.b.g();
        return cqkl.a;
    }

    @Override // defpackage.bskm
    public cjtd f() {
        return cjtd.a(dtyi.aY);
    }

    @Override // defpackage.bskm
    @dzsi
    public cqtd g() {
        return null;
    }

    @Override // defpackage.bskm
    public View.OnClickListener h() {
        return bskj.a(this);
    }

    @Override // defpackage.bskm
    public Boolean i() {
        return bskj.b();
    }

    @Override // defpackage.bskm
    public cqfc j() {
        return bskl.a;
    }
}
