package c.e.a.b.a.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import com.google.android.gms.common.i;
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    private SharedPreferences f3844a;

    public c(Context context) {
        try {
            Context b2 = i.b(context);
            this.f3844a = b2 == null ? null : b2.getSharedPreferences("google_ads_flags", 0);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while getting SharedPreferences ", th);
            this.f3844a = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final float a(String str, float f2) {
        try {
            if (this.f3844a != null) {
                return this.f3844a.getFloat(str, 0.0f);
            }
            return 0.0f;
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return 0.0f;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final String a(String str, String str2) {
        try {
            return this.f3844a == null ? str2 : this.f3844a.getString(str, str2);
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return str2;
        }
    }

    public final boolean a(String str, boolean z) {
        try {
            if (this.f3844a != null) {
                return this.f3844a.getBoolean(str, false);
            }
            return false;
        } catch (Throwable th) {
            Log.w("GmscoreFlag", "Error while reading from SharedPreferences ", th);
            return false;
        }
    }
}
