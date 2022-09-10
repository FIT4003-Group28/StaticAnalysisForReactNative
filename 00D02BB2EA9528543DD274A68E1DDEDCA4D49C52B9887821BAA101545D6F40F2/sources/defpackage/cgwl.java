package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cgwl  reason: default package */
/* loaded from: classes4.dex */
public class cgwl extends ivw {
    private final dxio<cqg> c;

    public cgwl(Activity activity, dxio<cqg> dxioVar) {
        super(activity, ivu.FIXED, jaq.DAY_NIGHT_BLUE_ON_WHITE, cqrt.f(2131232494), activity.getString(R.string.ADD_A_MISSING_PLACE), cjtd.a(dtyd.T), true, 0);
        this.c = dxioVar;
    }

    @Override // defpackage.jar
    public cqkl a(cjqm cjqmVar) {
        this.c.a().b(cqf.a(dnqb.UGC_TASK_SETS), true);
        return cqkl.a;
    }
}
