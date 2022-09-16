package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: doe  reason: default package */
/* loaded from: classes3.dex */
final class doe extends ContextWrapper {
    public final dof a;
    public final dog b;

    public doe(Context context) {
        super(context);
        this.a = new dof(context);
        this.b = new dog(context.getResources());
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final PackageManager getPackageManager() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        return this.b;
    }
}
