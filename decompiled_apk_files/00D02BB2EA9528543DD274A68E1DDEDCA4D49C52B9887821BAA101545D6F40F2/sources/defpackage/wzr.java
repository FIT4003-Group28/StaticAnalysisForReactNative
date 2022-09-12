package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: wzr  reason: default package */
/* loaded from: classes7.dex */
public class wzr implements wyq {
    private final Activity a;
    private final wzq b;

    public wzr(Activity activity, wzq wzqVar) {
        this.a = activity;
        this.b = wzqVar;
    }

    @Override // defpackage.wyq
    public CharSequence a() {
        return this.a.getResources().getString(R.string.TRANSIT_TRIP_ATTRIBUTES_BANNER_TEXT);
    }

    @Override // defpackage.wyq
    public CharSequence b() {
        return this.a.getResources().getString(R.string.TRANSIT_TRIP_ATTRIBUTES_BANNER_BUTTON_LABEL);
    }

    @Override // defpackage.wyq
    public cqkl c() {
        wvt wvtVar = ((wvq) this.b).a;
        bvjj bvjjVar = wvtVar.e;
        dbsk.s(bvjjVar);
        if (!bvjjVar.m(bvjk.kh, false)) {
            bvjj bvjjVar2 = wvtVar.e;
            dbsk.s(bvjjVar2);
            bvjjVar2.S(bvjk.kh, true);
        }
        wvtVar.aT();
        return cqkl.a;
    }
}
