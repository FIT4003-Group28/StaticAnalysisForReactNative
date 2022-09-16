package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: ojy  reason: default package */
/* loaded from: classes3.dex */
public final class ojy {
    public boolean a;
    private final Activity b;

    public ojy(Activity activity) {
        this.b = activity;
        this.a = zew.y(activity);
    }

    public final void a(Configuration configuration) {
        if (configuration != null) {
            this.a = zew.y(this.b.createConfigurationContext(configuration));
        }
    }
}
