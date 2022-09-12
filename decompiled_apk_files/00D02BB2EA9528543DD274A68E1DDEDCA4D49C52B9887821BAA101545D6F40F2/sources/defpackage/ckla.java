package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
/* compiled from: PG */
/* renamed from: ckla  reason: default package */
/* loaded from: classes.dex */
public final class ckla extends ContextWrapper {
    private final ckkz a;

    public ckla(Context context, ckkz ckkzVar) {
        super(context);
        this.a = ckkzVar;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final PackageManager getPackageManager() {
        return this.a;
    }
}
