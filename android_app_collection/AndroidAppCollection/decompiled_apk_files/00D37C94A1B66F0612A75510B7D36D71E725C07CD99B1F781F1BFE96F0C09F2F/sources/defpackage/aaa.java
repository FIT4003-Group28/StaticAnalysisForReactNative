package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Resources;
/* compiled from: PG */
/* renamed from: aaa  reason: default package */
/* loaded from: classes.dex */
public final class aaa extends ContextWrapper {
    public static void a(Context context) {
        if ((context instanceof aaa) || (context.getResources() instanceof aac)) {
            return;
        }
        context.getResources();
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final AssetManager getAssets() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final Resources.Theme getTheme() {
        throw null;
    }

    @Override // android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        throw null;
    }
}
