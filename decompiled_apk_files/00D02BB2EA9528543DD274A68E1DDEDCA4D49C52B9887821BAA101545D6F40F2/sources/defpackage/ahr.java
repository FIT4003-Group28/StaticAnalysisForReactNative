package defpackage;

import android.content.Intent;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: ahr  reason: default package */
/* loaded from: classes2.dex */
public final class ahr {
    public final Intent a = new Intent("android.intent.action.VIEW");
    private final ahq b = new ahq();

    public final ahs a() {
        if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", null);
            this.a.putExtras(bundle);
        }
        this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        Intent intent = this.a;
        Integer num = this.b.a;
        Bundle bundle2 = new Bundle();
        if (num != null) {
            bundle2.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(bundle2);
        this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        return new ahs(this.a);
    }

    @Deprecated
    public final void b() {
        this.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
    }

    @Deprecated
    public final void c(int i) {
        this.b.a = Integer.valueOf(i | (-16777216));
    }

    public final void d() {
        this.a.putExtra("android.support.customtabs.extra.ENABLE_URLBAR_HIDING", true);
    }
}
