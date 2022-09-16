package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* renamed from: ynt  reason: default package */
/* loaded from: classes4.dex */
final class ynt extends ContextWrapper {
    private final ynw a;

    public ynt(Context context, ynw ynwVar) {
        super(context);
        this.a = ynwVar;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final PackageManager getPackageManager() {
        return this.a;
    }
}
