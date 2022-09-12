package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import dagger.internal.Factory;
/* compiled from: PG */
/* renamed from: cwwv  reason: default package */
/* loaded from: classes5.dex */
public final class cwwv implements Factory<String> {
    private final dzsj<Context> a;

    public cwwv(dzsj<Context> dzsjVar) {
        this.a = dzsjVar;
    }

    @Override // defpackage.dzsj
    @dzsi
    public final /* bridge */ /* synthetic */ Object a() {
        Context context = (Context) ((dxjd) this.a).a;
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
