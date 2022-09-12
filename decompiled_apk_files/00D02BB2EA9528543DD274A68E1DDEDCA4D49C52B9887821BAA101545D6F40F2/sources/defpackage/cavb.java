package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cavb  reason: default package */
/* loaded from: classes4.dex */
public class cavb extends cava<dkde> {
    public cavb(Activity activity, isd isdVar, cavf<dkde> cavfVar) {
        super(activity, isdVar, cavfVar);
        this.c = dcdc.g(new cavg(activity.getString(R.string.CONTRIBUTIONS_SORT_BY_NEWEST), dkde.CAPTURE_TIMESTAMP, cjtd.a(dtyd.ca)), new cavg(activity.getString(R.string.CONTRIBUTIONS_SORT_BY_MOST_VIEWED), dkde.VIEWCOUNT, cjtd.a(dtyd.bZ)));
        this.d = (cavg) this.c.get(0);
    }

    @Override // defpackage.cafd
    public Boolean f() {
        return false;
    }
}
