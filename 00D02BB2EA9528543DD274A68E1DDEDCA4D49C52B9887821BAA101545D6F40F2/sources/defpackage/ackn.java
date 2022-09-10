package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ackn  reason: default package */
/* loaded from: classes2.dex */
public final class ackn extends bfdp {
    public cqkj a;
    public acvl b;
    private acvg c;

    @Override // defpackage.bfdp
    protected final jib g() {
        return jib.g(J(), Rp(R.string.SERVICE_HOURS_PAGE_TITLE));
    }

    @Override // defpackage.bfdp
    protected final View i(ilo iloVar) {
        cqkf c = this.a.c(new acud(), null);
        if (this.c == null) {
            acvl acvlVar = this.b;
            Activity activity = (Activity) ((dxjd) acvlVar.a).a;
            acvl.a(activity, 1);
            cqat a = acvlVar.b.a();
            acvl.a(a, 2);
            boxa a2 = acvlVar.c.a();
            acvl.a(a2, 3);
            bhat a3 = acvlVar.d.a();
            acvl.a(a3, 4);
            bgvx a4 = acvlVar.e.a();
            acvl.a(a4, 5);
            acvl.a(iloVar, 6);
            this.c = new acvk(activity, a, a2, a3, a4, iloVar);
        }
        c.e(this.c);
        return c.c();
    }

    @Override // defpackage.ges
    public final ddho p() {
        return dtxx.cb;
    }
}
