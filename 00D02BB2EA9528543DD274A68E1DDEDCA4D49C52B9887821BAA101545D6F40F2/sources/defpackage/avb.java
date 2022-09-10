package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
/* compiled from: PG */
/* renamed from: avb  reason: default package */
/* loaded from: classes2.dex */
public final class avb {
    public SharedPreferences a;
    public auf b;
    public boolean c;
    public PreferenceScreen d;
    public ava e;
    public auy f;
    public auz g;
    private final Context h;
    private long i = 0;
    private SharedPreferences.Editor j;
    private String k;

    public avb(Context context) {
        this.h = context;
        d(context.getPackageName() + "_preferences");
    }

    private final void h(boolean z) {
        SharedPreferences.Editor editor;
        if (!z && (editor = this.j) != null) {
            editor.apply();
        }
        this.c = z;
    }

    public final PreferenceScreen a(Context context, int i, PreferenceScreen preferenceScreen) {
        h(true);
        aux auxVar = new aux(context, this);
        XmlResourceParser xml = auxVar.a.getResources().getXml(i);
        try {
            Preference a = auxVar.a(xml, preferenceScreen);
            xml.close();
            PreferenceScreen preferenceScreen2 = (PreferenceScreen) a;
            preferenceScreen2.M(this);
            h(false);
            return preferenceScreen2;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    public final PreferenceScreen b(Context context) {
        PreferenceScreen preferenceScreen = new PreferenceScreen(context, null);
        preferenceScreen.M(this);
        return preferenceScreen;
    }

    public final long c() {
        long j;
        synchronized (this) {
            j = this.i;
            this.i = 1 + j;
        }
        return j;
    }

    public final void d(String str) {
        this.k = str;
        this.a = null;
    }

    public final SharedPreferences e() {
        if (this.b != null) {
            return null;
        }
        if (this.a == null) {
            this.a = this.h.getSharedPreferences(this.k, 0);
        }
        return this.a;
    }

    public final <T extends Preference> T f(CharSequence charSequence) {
        PreferenceScreen preferenceScreen = this.d;
        if (preferenceScreen == null) {
            return null;
        }
        return (T) preferenceScreen.ah(charSequence);
    }

    public final SharedPreferences.Editor g() {
        if (this.b != null) {
            return null;
        }
        if (!this.c) {
            return e().edit();
        }
        if (this.j == null) {
            this.j = e().edit();
        }
        return this.j;
    }
}
