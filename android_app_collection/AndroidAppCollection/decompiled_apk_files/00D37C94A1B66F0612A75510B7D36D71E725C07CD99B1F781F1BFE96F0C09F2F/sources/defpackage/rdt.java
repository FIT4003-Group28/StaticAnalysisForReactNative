package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.gmscompliance.ui.UncertifiedDeviceActivity;
/* compiled from: PG */
/* renamed from: rdt  reason: default package */
/* loaded from: classes4.dex */
public final class rdt {
    public String a;
    public Intent b;
    private final Context c;

    public rdt(Context context) {
        this.c = context;
    }

    public final Intent a() {
        Context context = this.c;
        String str = this.a;
        Intent intent = this.b;
        Intent intent2 = new Intent(context, UncertifiedDeviceActivity.class);
        if (!TextUtils.isEmpty(str) && intent != null) {
            intent2 = intent2.putExtra("customCtaText", str).putExtra("ctaIntent", intent);
        }
        if (!TextUtils.isEmpty(null)) {
            intent2 = intent2.putExtra("customBodyText", (String) null);
        }
        intent2.putExtra("overrideNavBarColor", false);
        return intent2;
    }
}
