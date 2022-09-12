package defpackage;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: cord  reason: default package */
/* loaded from: classes5.dex */
public final class cord {
    public static Intent a(@dzsi Account account) {
        Intent intent = new Intent("com.google.android.gms.location.settings.LOCATION_HISTORY");
        if (account != null) {
            intent.putExtra("account", account);
        }
        if (dxzj.a.a().a()) {
            intent.setClassName("com.google.android.gms", "com.google.android.location.settings.LocationHistorySettingsActivity");
        }
        return intent;
    }

    public static void b(Context context) {
        Intent intent = new Intent("com.google.android.gms.location.settings.GOOGLE_LOCATION_SETTINGS");
        intent.setFlags(268435456);
        intent.setPackage("com.google.android.gms");
        try {
            context.startActivity(intent);
        } catch (ActivityNotFoundException unused) {
            String valueOf = String.valueOf(intent);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 40);
            sb.append("Problem while starting settings activity");
            sb.append(valueOf);
            sb.toString();
        }
    }
}
