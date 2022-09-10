package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: znj  reason: default package */
/* loaded from: classes7.dex */
public class znj extends ivw implements jar {
    private final Activity c;
    private final qbr d;
    private final vnk e;
    private final qbi f;

    public znj(Activity activity, qbr qbrVar, vnk vnkVar, qbi qbiVar) {
        super(activity, ivu.FIXED, jaq.NO_TINT_DAY_NIGHT_ON_WHITE, cqrt.g(2131231736, ibm.p()), activity.getString(R.string.MENU_SEARCH_ENROUTE), cjtd.a(dtxn.db), true, 0, ivv.MOD_MINI);
        this.c = activity;
        this.d = qbrVar;
        this.e = vnkVar;
        this.f = qbiVar;
    }

    @Override // defpackage.ivw, defpackage.jar
    public Boolean A() {
        boolean z = false;
        if (!this.e.l().d().a() && this.f.bM()) {
            Activity activity = this.c;
            if (activity.findViewById(R.id.mainmap_container).getHeight() > cqrp.d(activity.getResources().getConfiguration().orientation == 2 ? 420.0d : 530.0d).e(activity)) {
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        this.d.c();
        return cqkl.a;
    }
}
