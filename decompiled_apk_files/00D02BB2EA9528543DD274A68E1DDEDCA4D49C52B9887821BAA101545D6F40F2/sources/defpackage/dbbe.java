package defpackage;

import android.content.pm.PackageInstaller;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dbbe  reason: default package */
/* loaded from: classes5.dex */
public final class dbbe extends PackageInstaller.SessionCallback {
    final Map<Integer, PackageInstaller.SessionInfo> a = new HashMap();
    final /* synthetic */ dbbk b;
    final /* synthetic */ dbay c;

    public dbbe(dbbk dbbkVar, dbay dbayVar) {
        this.b = dbbkVar;
        this.c = dbayVar;
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onActiveChanged(int i, boolean z) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onBadgingChanged(int i) {
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onCreated(int i) {
        this.a.put(Integer.valueOf(i), this.b.c.getSessionInfo(i));
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onFinished(int i, boolean z) {
        PackageInstaller.SessionInfo remove = this.a.remove(Integer.valueOf(i));
        if (remove == null || !"com.google.ar.core".equals(remove.getAppPackageName())) {
            return;
        }
        this.c.a(dbaz.COMPLETED);
    }

    @Override // android.content.pm.PackageInstaller.SessionCallback
    public final void onProgressChanged(int i, float f) {
    }
}
