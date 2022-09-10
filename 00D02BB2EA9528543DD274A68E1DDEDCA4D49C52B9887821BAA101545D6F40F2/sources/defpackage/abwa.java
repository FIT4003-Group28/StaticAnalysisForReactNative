package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abwa  reason: default package */
/* loaded from: classes.dex */
public class abwa implements abiu {
    private final Activity a;
    private final dxio<brba> b;
    private final cjtd c;
    @dzsi
    private final acwt d;
    private String e;

    public abwa(Activity activity, dxio<brba> dxioVar, @dzsi acwt acwtVar, absg absgVar) {
        this.a = activity;
        this.d = acwtVar;
        this.c = cjtd.a(absgVar == absg.AREA_EXPLORE ? dtxj.cW : dtxr.aT);
        this.b = dxioVar;
        this.e = "";
    }

    public void a(String str) {
        this.e = str;
    }

    @Override // defpackage.abiu
    public String d() {
        return this.a.getString(R.string.EXPLORE_MORE_SUBINTENTS);
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        dnqh dnqhVar;
        this.d.a();
        if (cjqmVar.a().a()) {
            dnqg bZ = dnqh.p.bZ();
            String b = cjqmVar.a().b();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dnqh dnqhVar2 = (dnqh) bZ.b;
            b.getClass();
            dnqhVar2.a |= 2;
            dnqhVar2.c = b;
            dnqhVar = bZ.bK();
        } else {
            dnqhVar = null;
        }
        this.b.a().n(abwg.j(this.e), dnqhVar);
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
