package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Build;
import java.util.Set;
/* compiled from: PG */
/* renamed from: ambj  reason: default package */
/* loaded from: classes.dex */
public final class ambj {
    public static final amzy a = amzy.l("com/google/apps/tiktok/account/api/controller/Config");
    public final boolean b;
    public final amuk c;

    public ambj() {
    }

    public ambj(boolean z, amuk amukVar) {
        this.b = z;
        this.c = amukVar;
    }

    public static ambi a() {
        ambi ambiVar = new ambi();
        ambiVar.c(false);
        ambiVar.b(amdu.class);
        return ambiVar;
    }

    public static ambi b(Activity activity) {
        if (!c()) {
            Intent intent = activity.getIntent();
            Set<String> categories = intent.getCategories();
            ComponentName callingActivity = activity.getCallingActivity();
            if ((categories == null || categories.isEmpty()) && ((callingActivity == null || activity.getPackageName().equals(callingActivity.getPackageName())) && (intent.getFlags() & 268435456) == 0 && intent.getData() == null && intent.getClipData() == null && intent.getType() == null)) {
                ((amzw) ((amzw) a.g()).i("com/google/apps/tiktok/account/api/controller/Config", "forExternalActivity", 84, "Config.java")).s("External config used on invalid activity: %s", activity.getClass());
            }
        }
        ambi a2 = a();
        a2.c(true);
        return a2;
    }

    public static boolean c() {
        return "robolectric".equals(Build.FINGERPRINT);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ambj) {
            ambj ambjVar = (ambj) obj;
            if (this.b == ambjVar.b && amxp.v(this.c, ambjVar.c)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((true != this.b ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.c.hashCode()) * 1000003;
    }

    public final String toString() {
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 73 + "null".length());
        sb.append("Config{canSwitchAccounts=");
        sb.append(z);
        sb.append(", initialSelectors=");
        sb.append(valueOf);
        sb.append(", overrideRequirements=");
        sb.append("null");
        sb.append("}");
        return sb.toString();
    }
}
