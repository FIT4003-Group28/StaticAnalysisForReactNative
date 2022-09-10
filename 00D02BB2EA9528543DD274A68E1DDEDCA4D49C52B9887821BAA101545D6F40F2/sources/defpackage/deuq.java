package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.firebase.messaging.FirebaseMessaging;
/* compiled from: PG */
/* renamed from: deuq  reason: default package */
/* loaded from: classes6.dex */
public final class deuq {
    final /* synthetic */ FirebaseMessaging a;
    private final dera b;
    private boolean c;
    private deqy<dekt> d;
    private Boolean e;

    public deuq(FirebaseMessaging firebaseMessaging, dera deraVar) {
        this.a = firebaseMessaging;
        this.b = deraVar;
    }

    final synchronized void a() {
        ApplicationInfo applicationInfo;
        if (!this.c) {
            Context a = this.a.a.a();
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
                deqy<dekt> deqyVar = new deqy(this) { // from class: deuo
                    private final deuq a;

                    {
                        this.a = this;
                    }

                    @Override // defpackage.deqy
                    public final void a() {
                        final deuq deuqVar = this.a;
                        if (deuqVar.b()) {
                            deuqVar.a.d.execute(new Runnable(deuqVar) { // from class: deup
                                private final deuq a;

                                {
                                    this.a = deuqVar;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.a.b.n();
                                }
                            });
                        }
                    }
                };
                this.d = deqyVar;
                this.b.b(dekt.class, deqyVar);
            }
            this.c = true;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized boolean b() {
        boolean e;
        a();
        Boolean bool = this.e;
        if (bool != null) {
            e = bool.booleanValue();
        } else {
            e = this.a.a.e();
        }
        return e;
    }
}
