package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: abss  reason: default package */
/* loaded from: classes2.dex */
public class abss implements abiu {
    private static final jic a = new jic(null, ckqc.FULLY_QUALIFIED, 2131231588);
    private static final cjtd b = cjtd.a(dtyi.y);
    private final Activity c;
    private final gga d;

    public abss(Activity activity, gga ggaVar) {
        this.c = activity;
        this.d = ggaVar;
    }

    @Override // defpackage.abiu
    public String d() {
        return this.c.getString(R.string.NAVIGATE_UP);
    }

    @Override // defpackage.abiu
    public cqkl h(cjqm cjqmVar) {
        this.d.g().f();
        return cqkl.a;
    }

    @Override // defpackage.abiu
    public cjtd i() {
        return b;
    }

    @Override // defpackage.abiu
    @dzsi
    public jic l() {
        return a;
    }
}
