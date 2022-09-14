package defpackage;

import android.app.Application;
/* compiled from: PG */
/* renamed from: ckpx  reason: default package */
/* loaded from: classes4.dex */
public final class ckpx {
    private final Application.ActivityLifecycleCallbacks a;
    private final gh b;

    public ckpx(Application application, gga ggaVar) {
        ckpv ckpvVar = new ckpv();
        this.a = ckpvVar;
        ckpw ckpwVar = new ckpw();
        this.b = ckpwVar;
        application.registerActivityLifecycleCallbacks(ckpvVar);
        ggaVar.g().am(ckpwVar, false);
    }
}
