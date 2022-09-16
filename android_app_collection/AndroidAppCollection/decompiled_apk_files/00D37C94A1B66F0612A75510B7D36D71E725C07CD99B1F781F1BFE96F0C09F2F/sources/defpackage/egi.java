package defpackage;

import android.content.Context;
import android.content.Intent;
import android.util.SparseBooleanArray;
import com.google.android.apps.youtube.app.application.upgrade.NewVersionAvailableActivity;
/* compiled from: PG */
/* renamed from: egi  reason: default package */
/* loaded from: classes3.dex */
public final class egi {
    private final Context a;
    private final zgu b;
    private final esp c;
    private final aacz d;

    public egi(Context context, zgu zguVar, esp espVar, aacz aaczVar) {
        this.a = context;
        this.b = zguVar;
        this.c = espVar;
        this.d = aaczVar;
    }

    public static boolean a(Intent intent) {
        return intent.getBooleanExtra("show_force_upgrade", false);
    }

    public final Intent b(Intent intent) {
        zgu zguVar = this.b;
        aacz aaczVar = this.d;
        asfs asfsVar = aadf.a;
        atfw atfwVar = aaczVar.b().k;
        if (atfwVar == null) {
            atfwVar = atfw.a;
        }
        avtk avtkVar = atfwVar.e;
        if (avtkVar == null) {
            avtkVar = avtk.a;
        }
        if (zguVar.compareTo(new zgu((avtkVar.b & 16) != 0 ? avtkVar.c : null)) >= 0) {
            int a = zfm.a(this.a);
            int a2 = this.c.a.a("min_app_version", 0);
            String b = this.c.a.b("denylisted_app_versions", "");
            SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
            for (String str : b.split(",")) {
                try {
                    sparseBooleanArray.put(Integer.parseInt(str), true);
                } catch (NumberFormatException unused) {
                }
            }
            if (a >= a2 && !sparseBooleanArray.get(a)) {
                return null;
            }
        }
        Intent intent2 = new Intent(this.a, NewVersionAvailableActivity.class);
        intent2.setFlags(268435456);
        intent2.putExtra("show_force_upgrade", true);
        if (intent != null) {
            intent2.putExtra("forward_intent", intent);
        }
        return intent2;
    }
}
