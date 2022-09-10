package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bfcc  reason: default package */
/* loaded from: classes3.dex */
public class bfcc extends bfcb {
    private final Activity b;
    private final baal c;
    private final cpv d;
    private bexz e;
    private ilo f;

    public bfcc(Activity activity, cpv cpvVar, baal baalVar, bexz bexzVar) {
        super(activity);
        this.b = activity;
        this.c = baalVar;
        this.e = bexzVar;
        this.d = cpvVar;
        this.f = batz.b(baalVar);
        this.a = true;
    }

    @Override // defpackage.bfcb, defpackage.jad
    public cqkl c() {
        boolean f;
        if (this.a) {
            f = this.e.g(this.c);
        } else {
            f = this.e.f(this.c);
        }
        if (f) {
            this.a = !this.a;
            cqkx.p(this);
            View o = cqkx.o(this);
            if (o != null) {
                cpv cpvVar = this.d;
                Activity activity = this.b;
                cpvVar.f(o, activity.getString(true != this.a ? R.string.ACCESSIBILITY_UNFOLLOWED_PLACE_STATUS : R.string.ACCESSIBILITY_FOLLOWING_PLACE_STATUS, new Object[]{this.c.y(activity)}));
            }
        } else {
            Activity activity2 = this.b;
            cjxu.i(activity2, activity2.getString(R.string.LOCAL_FOLLOW_FAILURE_MESSAGE));
        }
        return cqkl.a;
    }

    @Override // defpackage.jad
    public cjtd d() {
        cjta c = cjtd.c(this.f.bZ());
        c.d = this.a ? dtyg.A : dtyg.x;
        return c.a();
    }

    @Override // defpackage.bfca
    public CharSequence k() {
        if (this.a) {
            Activity activity = this.b;
            return activity.getString(R.string.ACCESSIBILITY_FOLLOWING_PLACE, new Object[]{this.c.y(activity)});
        }
        Activity activity2 = this.b;
        return activity2.getString(R.string.ACCESSIBILITY_FOLLOW_PLACE, new Object[]{this.c.y(activity2)});
    }

    public void m(ilo iloVar) {
        this.f = iloVar;
    }

    public void n(bexz bexzVar) {
        this.e = bexzVar;
        this.a = bexzVar.e(this.c);
        cqkx.p(this);
    }
}
