package c.c.a.b;

import android.content.ComponentName;
import android.content.Context;
import g.a.a.c;
/* loaded from: classes.dex */
public class a {

    /* renamed from: c  reason: collision with root package name */
    public static final a f2716c = new a();

    /* renamed from: a  reason: collision with root package name */
    private Boolean f2717a;

    /* renamed from: b  reason: collision with root package name */
    private ComponentName f2718b;

    private a() {
    }

    private void b(Context context, int i) {
        Boolean bool = this.f2717a;
        if (bool == null) {
            this.f2717a = Boolean.valueOf(c.a(context, i));
            c.d.d.e.a.c("ApplicationBadgeHelper", this.f2717a.booleanValue() ? "First attempt to use automatic badger succeeded; permanently enabling method." : "First attempt to use automatic badger failed; permanently disabling method.");
        } else if (!bool.booleanValue()) {
        } else {
            c.a(context, i);
        }
    }

    public void a(Context context, int i) {
        if (this.f2718b == null) {
            this.f2718b = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName()).getComponent();
        }
        b(context, i);
    }
}
