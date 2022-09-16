package defpackage;

import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import java.util.List;
/* compiled from: PG */
/* renamed from: akns  reason: default package */
/* loaded from: classes.dex */
final class akns implements Runnable {
    final /* synthetic */ PackageManager a;
    final /* synthetic */ aknt b;

    public akns(aknt akntVar, PackageManager packageManager) {
        this.b = akntVar;
        this.a = packageManager;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ylr.b();
        List<ResolveInfo> F = zgt.F(this.a);
        synchronized (this.b) {
            for (ResolveInfo resolveInfo : F) {
                this.b.a.add(resolveInfo.activityInfo.applicationInfo.packageName);
            }
        }
    }
}
