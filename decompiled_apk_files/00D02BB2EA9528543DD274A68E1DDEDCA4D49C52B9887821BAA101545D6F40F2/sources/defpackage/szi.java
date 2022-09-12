package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: szi  reason: default package */
/* loaded from: classes7.dex */
public class szi extends szn implements syy {
    private final Activity a;
    private final wuv b;
    @dzsi
    private final sun c;

    public szi(Activity activity, sxg sxgVar, wuv wuvVar) {
        this.a = activity;
        this.b = wuvVar;
        Activity activity2 = (Activity) ((dxjd) sxgVar.a).a;
        sxg.a(activity2, 1);
        dxio a = ((dxjh) sxgVar.b).a();
        sxg.a(a, 2);
        sxg.a(wuvVar, 3);
        this.c = new sxf(activity2, a, wuvVar);
    }

    @Override // defpackage.syy
    @dzsi
    public sun a() {
        return this.c;
    }

    @Override // defpackage.syy
    public CharSequence b() {
        return this.b.A(this.a.getResources());
    }

    @Override // defpackage.szn
    public Boolean c() {
        return true;
    }
}
