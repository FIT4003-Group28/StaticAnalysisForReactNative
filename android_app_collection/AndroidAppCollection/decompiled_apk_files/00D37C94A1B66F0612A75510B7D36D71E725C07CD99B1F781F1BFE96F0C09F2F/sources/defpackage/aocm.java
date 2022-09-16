package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: aocm  reason: default package */
/* loaded from: classes.dex */
public final class aocm {
    public final SharedPreferences a;

    public aocm(SharedPreferences sharedPreferences) {
        ylr.c();
        this.a = sharedPreferences;
    }

    private static final String e(String str, String str2) {
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 5 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("|T|");
        sb.append(str2);
        sb.append("|*");
        return sb.toString();
    }

    public final synchronized aocl a(String str, String str2) {
        return aocl.a(this.a.getString(e(str, str2), null));
    }

    public final synchronized void b() {
        this.a.edit().clear().commit();
    }

    public final synchronized void c(String str, String str2, String str3, String str4) {
        String b = aocl.b(str3, str4, System.currentTimeMillis());
        if (b == null) {
            return;
        }
        SharedPreferences.Editor edit = this.a.edit();
        edit.putString(e(str, str2), b);
        edit.commit();
    }

    public final synchronized boolean d() {
        return this.a.getAll().isEmpty();
    }

    public aocm(Context context) {
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(akf.b(context), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (!file.createNewFile() || d()) {
                    return;
                }
                b();
            } catch (IOException unused) {
            }
        }
    }
}
