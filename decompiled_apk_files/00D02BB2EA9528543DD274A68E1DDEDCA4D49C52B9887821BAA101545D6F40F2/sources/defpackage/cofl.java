package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import java.io.File;
import java.io.IOException;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cofl  reason: default package */
/* loaded from: classes5.dex */
public final class cofl {
    final SharedPreferences a;
    final Context b;
    public final Map<String, Object> c = new aif();

    public cofl(Context context) {
        this.b = context;
        this.a = context.getSharedPreferences("com.google.android.gms.appid", 0);
        File file = new File(context.getNoBackupFilesDir(), "com.google.android.gms.appid-no-backup");
        if (!file.exists()) {
            try {
                if (!file.createNewFile() || a()) {
                    return;
                }
                c();
                Intent intent = new Intent("com.google.android.gms.iid.InstanceID");
                intent.putExtra("CMD", "RST");
                intent.setClassName(context, "com.google.android.gms.gcm.GcmReceiver");
                context.sendBroadcast(intent);
            } catch (IOException unused) {
            }
        }
    }

    public final boolean a() {
        return this.a.getAll().isEmpty();
    }

    public final synchronized void b(String str) {
        SharedPreferences.Editor edit = this.a.edit();
        for (String str2 : this.a.getAll().keySet()) {
            if (str2.startsWith(str)) {
                edit.remove(str2);
            }
        }
        edit.commit();
    }

    public final synchronized void c() {
        File[] listFiles;
        this.c.clear();
        for (File file : cofj.a(this.b).listFiles()) {
            if (file.getName().startsWith("com.google.InstanceId")) {
                file.delete();
            }
        }
        this.a.edit().clear().commit();
    }
}
