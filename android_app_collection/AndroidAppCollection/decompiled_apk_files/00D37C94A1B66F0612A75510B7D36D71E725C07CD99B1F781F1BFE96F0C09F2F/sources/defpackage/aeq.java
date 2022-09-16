package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
/* compiled from: PG */
/* renamed from: aeq  reason: default package */
/* loaded from: classes.dex */
public final class aeq {
    public final Intent a;
    public final aem b;
    public Bundle c;

    public aeq() {
        this.a = new Intent("android.intent.action.VIEW");
        this.b = new aem();
    }

    private final void b(IBinder iBinder) {
        Bundle bundle = new Bundle();
        bundle.putBinder("android.support.customtabs.extra.SESSION", iBinder);
        this.a.putExtras(bundle);
    }

    public final aer a() {
        if (!this.a.hasExtra("android.support.customtabs.extra.SESSION")) {
            b(null);
        }
        this.a.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
        Intent intent = this.a;
        Integer num = this.b.a;
        Bundle bundle = new Bundle();
        if (num != null) {
            bundle.putInt("android.support.customtabs.extra.TOOLBAR_COLOR", num.intValue());
        }
        intent.putExtras(bundle);
        this.a.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
        return new aer(this.a, this.c);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [ck, android.os.IBinder] */
    public aeq(aet aetVar) {
        Intent intent = new Intent("android.intent.action.VIEW");
        this.a = intent;
        this.b = new aem();
        intent.setPackage(aetVar.b.getPackageName());
        b(aetVar.a);
    }
}
