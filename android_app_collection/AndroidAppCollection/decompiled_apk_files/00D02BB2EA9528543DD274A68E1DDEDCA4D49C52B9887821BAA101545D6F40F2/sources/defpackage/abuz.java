package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: abuz  reason: default package */
/* loaded from: classes.dex */
public class abuz implements abns {
    @dzsi
    private final acwt a;
    private final List<abms> b = new ArrayList();
    private final dxio<abfb> c;
    private final abux d;
    private final akpm e;
    private final absg f;
    private final dxio<akzh> g;
    private final String h;
    private final abuo i;

    public abuz(Activity activity, abuo abuoVar, dxio dxioVar, abuy abuyVar, akpm akpmVar, dxio dxioVar2, acwt acwtVar, absg absgVar) {
        this.i = abuoVar;
        this.a = acwtVar;
        this.c = dxioVar;
        this.h = activity.getString(R.string.EXPLORE_POPULAR_AREAS_LEAF_PAGE_TITLE);
        bnjv a = abuyVar.a.a();
        abuy.a(a, 1);
        dxio a2 = ((dxjh) abuyVar.b).a();
        abuy.a(a2, 2);
        Activity activity2 = (Activity) ((dxjd) abuyVar.c).a;
        abuy.a(activity2, 3);
        bvpe a3 = abuyVar.d.a();
        abuy.a(a3, 4);
        huc a4 = abuyVar.e.a();
        abuy.a(a4, 5);
        ahjq a5 = abuyVar.f.a();
        abuy.a(a5, 6);
        bvsl a6 = abuyVar.g.a();
        abuy.a(a6, 7);
        abuu a7 = abuyVar.h.a();
        abuy.a(a7, 8);
        abuy.a(absgVar, 10);
        this.d = new abux(a, a2, activity2, a3, a4, a5, a6, a7, acwtVar, absgVar);
        this.e = akpmVar;
        this.g = dxioVar2;
        this.f = absgVar;
        k(null);
    }

    private final void j() {
        this.a.a();
        this.c.a().f(this.e.Y(this.g.a().p()));
    }

    private final void k(@dzsi djrm djrmVar) {
        if (djrmVar != null) {
            this.b.clear();
            this.d.k(djrmVar.e);
            for (dvyw dvywVar : djrmVar.e) {
                int i = dvywVar.a;
                if ((i & 1) != 0 || (i & 4) != 0) {
                    this.b.add(this.i.b(dvywVar, this.a, this.f == absg.AREA_EXPLORE ? dtxj.cG : dtxr.aB));
                }
            }
            return;
        }
        this.d.k(new ArrayList());
        this.b.clear();
    }

    @Override // defpackage.abns
    public Boolean a(@dzsi djrm djrmVar) {
        k(djrmVar);
        cqkx.p(this);
        return true;
    }

    @Override // defpackage.abns
    @dzsi
    public String b() {
        return this.h;
    }

    @Override // defpackage.abns
    public List<abms> c() {
        return this.b;
    }

    @Override // defpackage.abns
    public cqkl d(cjqm cjqmVar) {
        j();
        return cqkl.a;
    }

    @Override // defpackage.abns
    public cqkl e(cjqm cjqmVar) {
        j();
        return cqkl.a;
    }

    @Override // defpackage.abns
    public cjtd g() {
        return cjtd.a(this.f == absg.AREA_EXPLORE ? dtxj.cJ : dtxr.aE);
    }

    @Override // defpackage.abns
    public cjtd h() {
        return cjtd.a(this.f == absg.AREA_EXPLORE ? dtxj.cH : dtxr.aC);
    }

    @Override // defpackage.abns
    /* renamed from: i */
    public abux f() {
        return this.d;
    }
}
