package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
/* compiled from: PG */
/* renamed from: cnhr  reason: default package */
/* loaded from: classes.dex */
public final class cnhr extends ContextWrapper {
    private final Context a;

    public cnhr(Context context) {
        super(context);
        this.a = this;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Context getApplicationContext() {
        return this.a;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final ClassLoader getClassLoader() {
        return cnht.class.getClassLoader();
    }
}
