package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.media.AudioManager;
import android.os.PowerManager;
/* compiled from: PG */
/* renamed from: cvsw  reason: default package */
/* loaded from: classes5.dex */
public final class cvsw implements cvsg {
    public final Context a;
    private final dbty<dbsg<Boolean>> b = cvsl.b(new dbty(this) { // from class: cvst
        private final cvsw a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cvsw cvswVar = this.a;
            if (!dxxh.a.a().l()) {
                cvlw.a("UserActivityStateImpl", "Interactive unknown (Phenotype disabled).", new Object[0]);
                return dbpy.a;
            }
            PowerManager powerManager = (PowerManager) cvswVar.a.getSystemService("power");
            if (powerManager == null) {
                cvlw.a("UserActivityStateImpl", "Interactive unknown (PowerManager missing).", new Object[0]);
                return dbpy.a;
            }
            Boolean valueOf = Boolean.valueOf(powerManager.isInteractive());
            cvlw.a("UserActivityStateImpl", "Interactive is %s (SDK >= K).", valueOf);
            return dbsg.i(valueOf);
        }
    });
    private final dbty<dbsg<Boolean>> c = cvsl.b(new dbty(this) { // from class: cvsu
        private final cvsw a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cvsw cvswVar = this.a;
            if (!dxxh.a.a().b()) {
                cvlw.a("UserActivityStateImpl", "App in foreground unknown (Phenotype disabled).", new Object[0]);
                return dbpy.a;
            }
            ActivityManager activityManager = (ActivityManager) cvswVar.a.getSystemService("activity");
            if (activityManager == null) {
                cvlw.a("UserActivityStateImpl", "App in foreground unknown (ActivityManager missing).", new Object[0]);
                return dbpy.a;
            }
            for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                if (runningAppProcessInfo.importance == 100 && runningAppProcessInfo.processName.equals(cvswVar.a.getPackageName())) {
                    cvlw.a("UserActivityStateImpl", "App in foreground is true.", new Object[0]);
                    return dbsg.i(true);
                }
            }
            cvlw.a("UserActivityStateImpl", "App in foreground is false.", new Object[0]);
            return dbsg.i(false);
        }
    });
    private final dbty<dbsg<Boolean>> d = cvsl.b(new dbty(this) { // from class: cvsv
        private final cvsw a;

        {
            this.a = this;
        }

        @Override // defpackage.dbty
        public final Object a() {
            cvsw cvswVar = this.a;
            if (!dxxh.a.a().k()) {
                cvlw.a("UserActivityStateImpl", "In call unknown (Phenotype disabled).", new Object[0]);
                return dbpy.a;
            }
            AudioManager audioManager = (AudioManager) cvswVar.a.getSystemService("audio");
            if (audioManager == null) {
                cvlw.a("UserActivityStateImpl", "In call unknown (AudioManager missing).", new Object[0]);
                return dbpy.a;
            }
            int mode = audioManager.getMode();
            Boolean valueOf = Boolean.valueOf(audioManager.getMode() == 2);
            cvlw.a("UserActivityStateImpl", "In call is %s (mode == %s).", valueOf, Integer.valueOf(mode));
            return dbsg.i(valueOf);
        }
    });

    public cvsw(Context context) {
        this.a = context;
    }

    @Override // defpackage.cvsg
    public final dbsg<Boolean> a() {
        return this.b.a();
    }

    @Override // defpackage.cvsg
    public final dbsg<Boolean> b() {
        return this.c.a();
    }

    @Override // defpackage.cvsg
    public final dbsg<Boolean> c() {
        return this.d.a();
    }
}
