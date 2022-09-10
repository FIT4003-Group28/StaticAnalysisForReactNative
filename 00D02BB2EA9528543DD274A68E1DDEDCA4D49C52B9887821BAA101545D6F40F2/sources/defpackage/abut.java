package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abut  reason: default package */
/* loaded from: classes.dex */
public class abut implements abiu {
    private final Activity a;
    private final dxio<abfb> b;
    private final cjtd c;
    private final akpm d;
    private final dxio<akzh> e;
    @dzsi
    private final acwt f;

    public abut(Activity activity, dxio<abfb> dxioVar, akpm akpmVar, dxio<akzh> dxioVar2, @dzsi acwt acwtVar, absg absgVar) {
        this.a = activity;
        this.b = dxioVar;
        this.d = akpmVar;
        this.e = dxioVar2;
        this.f = acwtVar;
        this.c = cjtd.a(absgVar == absg.AREA_EXPLORE ? dtxj.cF : dtxr.aA);
    }

    @Override // defpackage.abiu
    public String d() {
        return this.a.getString(R.string.EXPLORE_MORE_SUBINTENTS);
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        this.f.a();
        this.b.a().f(this.d.Y(this.e.a().p()));
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return this.c;
    }

    @Override // defpackage.abiu
    public jic l() {
        return null;
    }
}
