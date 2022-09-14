package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cavd  reason: default package */
/* loaded from: classes4.dex */
public class cavd extends cava<dwvy> {
    public cavd(Activity activity, isd isdVar, cavf<dwvy> cavfVar) {
        super(activity, isdVar, cavfVar);
        this.c = dcdc.i(new cavg(activity.getString(R.string.CONTRIBUTIONS_SORT_BY_NEWEST), dwvy.NEWEST, cjtd.a(dtyd.cn)), new cavg(activity.getString(R.string.CONTRIBUTIONS_SORT_BY_OLDEST), dwvy.OLDEST, cjtd.a(dtyd.co)), new cavg(activity.getString(R.string.CONTRIBUTIONS_SORT_BY_MOST_LIKED), dwvy.MOST_LIKED, cjtd.a(dtyd.cl)), new cavg(activity.getString(R.string.CONTRIBUTIONS_SORT_BY_MOST_VIEWED), dwvy.MOST_VIEWED, cjtd.a(dtyd.cm)));
        this.d = (cavg) this.c.get(0);
    }

    @Override // defpackage.cafd
    public Boolean f() {
        return true;
    }
}
