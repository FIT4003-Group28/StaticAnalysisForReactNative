package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.firebase.messaging.FirebaseMessaging;
/* compiled from: PG */
/* renamed from: aoby  reason: default package */
/* loaded from: classes.dex */
public final class aoby {
    final /* synthetic */ FirebaseMessaging a;
    private final anzh b;
    private boolean c;
    private anzf d;
    private Boolean e;

    public aoby(FirebaseMessaging firebaseMessaging, anzh anzhVar) {
        this.a = firebaseMessaging;
        this.b = anzhVar;
    }

    final synchronized void a() {
        ApplicationInfo applicationInfo;
        if (!this.c) {
            Context a = this.a.c.a();
            SharedPreferences sharedPreferences = a.getSharedPreferences("com.google.firebase.messaging", 0);
            Boolean bool = null;
            if (sharedPreferences.contains("auto_init")) {
                bool = Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            } else {
                try {
                    PackageManager packageManager = a.getPackageManager();
                    if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(a.getPackageName(), 128)) != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_messaging_auto_init_enabled")) {
                        bool = Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            this.e = bool;
            if (bool == null) {
                anzf anzfVar = new anzf() { // from class: aobx
                    @Override // defpackage.anzf
                    public final void a(anze anzeVar) {
                        aoby aobyVar = aoby.this;
                        if (aobyVar.b()) {
                            aobyVar.a.h();
                        }
                    }
                };
                this.d = anzfVar;
                this.b.b(anvz.class, anzfVar);
            }
            this.c = true;
        }
    }

    public final synchronized boolean b() {
        boolean j;
        a();
        Boolean bool = this.e;
        if (bool != null) {
            j = bool.booleanValue();
        } else {
            j = this.a.c.j();
        }
        return j;
    }
}
