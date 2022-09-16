package defpackage;

import android.app.Activity;
import com.google.android.apps.youtube.app.settings.SettingsDataAccess;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lgm  reason: default package */
/* loaded from: classes3.dex */
public final class lgm {
    private final Activity a;
    private final fcl b;
    private final SettingsDataAccess c;

    public lgm(Activity activity, fcl fclVar, SettingsDataAccess settingsDataAccess) {
        this.a = activity;
        this.b = fclVar;
        this.c = settingsDataAccess;
    }

    public final abcp a() {
        if (d()) {
            for (Object obj : this.c.i()) {
                if (obj instanceof abcp) {
                    return (abcp) obj;
                }
            }
            return null;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String b() {
        boolean e = e();
        boolean c = c();
        if (!e || !c) {
            if (e) {
                return this.a.getString(R.string.pref_offline_category);
            }
            if (!c) {
                return null;
            }
            return this.a.getString(R.string.pref_background_category);
        }
        return this.a.getString(R.string.pref_background_and_offline_category);
    }

    public final boolean c() {
        return hve.l(this.c.i(), abci.class);
    }

    public final boolean d() {
        return hve.l(this.c.i(), abcp.class);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean e() {
        return d() || this.b.h();
    }
}
