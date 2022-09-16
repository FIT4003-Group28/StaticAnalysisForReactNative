package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: udo  reason: default package */
/* loaded from: classes7.dex */
public class udo extends ivw implements jar {
    private final udk c;
    private boolean d;
    private boolean e;

    public udo(Activity activity, cqhn cqhnVar, udk udkVar, boolean z, boolean z2) {
        super(activity, ivu.FIXED, jaq.NO_TINT_DAY_NIGHT_ON_WHITE, cqrt.g(2131231736, ibm.p()), activity.getString(R.string.MENU_SEARCH_ENROUTE), cjtd.a(dtxn.db), true, 0, ivv.MOD_MINI);
        this.c = udkVar;
        this.d = z;
        this.e = z2;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean A() {
        boolean z = false;
        if (!this.e && this.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        this.c.c();
        return cqkl.a;
    }

    public void g(boolean z) {
        if (this.e != z) {
            this.e = z;
            cqkx.p(this);
        }
    }

    public void h(boolean z) {
        if (this.d != z) {
            this.d = z;
            cqkx.p(this);
        }
    }
}
