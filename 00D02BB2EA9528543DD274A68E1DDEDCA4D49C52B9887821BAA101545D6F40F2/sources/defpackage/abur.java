package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abur  reason: default package */
/* loaded from: classes.dex */
public class abur implements abiu {
    private static final jic a = new jic(null, ckqc.FULLY_QUALIFIED, R.drawable.ic_popular_areas_link_24);
    private final Activity b;
    private final abfb c;
    private final akpm d;
    @dzsi
    private final acwt e;
    private final absg f;

    public abur(Activity activity, abfb abfbVar, akpm akpmVar, @dzsi acwt acwtVar, absg absgVar) {
        this.b = activity;
        this.c = abfbVar;
        this.d = akpmVar;
        this.e = acwtVar;
        this.f = absgVar;
    }

    @Override // defpackage.abiu
    public String d() {
        return this.b.getString(R.string.EXPLORE_POPULAR_AREAS_CONTENT_DESCRIPTION);
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        acwt acwtVar = this.e;
        if (acwtVar != null) {
            acwtVar.a();
        }
        akpm akpmVar = this.d;
        this.c.f(akpmVar.Y(akpmVar.n()));
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return cjtd.a(this.f == absg.AREA_EXPLORE ? dtxj.cI : dtxr.aD);
    }

    @Override // defpackage.abiu
    @dzsi
    public jic l() {
        return a;
    }
}
