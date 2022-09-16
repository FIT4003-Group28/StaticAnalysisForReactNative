package defpackage;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import com.google.protos.youtube.api.innertube.AppIsInstalledCommandOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gmk  reason: default package */
/* loaded from: classes3.dex */
public final class gmk implements aafl {
    private final aafo a;
    private final Executor b;
    private final PackageManager c;

    public gmk(aafo aafoVar, Executor executor, Context context) {
        this.a = aafoVar;
        this.b = executor;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        this.c = packageManager;
    }

    public final void b(aphk aphkVar, Map map) {
        ApplicationInfo applicationInfo;
        try {
            applicationInfo = this.c.getApplicationInfo(aphkVar.c, 0);
        } catch (PackageManager.NameNotFoundException unused) {
            applicationInfo = null;
        }
        if (applicationInfo == null || (aphkVar.e && !applicationInfo.enabled)) {
            if ((aphkVar.b & 16) != 0) {
                aafo aafoVar = this.a;
                apzg apzgVar = aphkVar.g;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, map);
            }
        } else if ((aphkVar.b & 8) != 0) {
            aafo aafoVar2 = this.a;
            apzg apzgVar2 = aphkVar.f;
            if (apzgVar2 == null) {
                apzgVar2 = apzg.a;
            }
            aafoVar2.c(apzgVar2, map);
        }
        if ((aphkVar.b & 32) != 0) {
            aafo aafoVar3 = this.a;
            apzg apzgVar3 = aphkVar.h;
            if (apzgVar3 == null) {
                apzgVar3 = apzg.a;
            }
            aafoVar3.c(apzgVar3, map);
        }
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, final Map map) {
        if (!apzgVar.qn(AppIsInstalledCommandOuterClass.appIsInstalledCommand)) {
            return;
        }
        final aphk aphkVar = (aphk) apzgVar.qm(AppIsInstalledCommandOuterClass.appIsInstalledCommand);
        if (aphkVar.c.isEmpty()) {
            return;
        }
        if (aphkVar.d) {
            b(aphkVar, map);
            return;
        }
        this.b.execute(new Runnable() { // from class: gmj
            @Override // java.lang.Runnable
            public final void run() {
                gmk.this.b(aphkVar, map);
            }
        });
    }
}
