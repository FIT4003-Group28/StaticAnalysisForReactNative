package defpackage;

import android.content.Context;
import android.view.WindowManager;
/* compiled from: PG */
/* renamed from: akvi  reason: default package */
/* loaded from: classes.dex */
public final class akvi {
    public final WindowManager a;
    public final Thread b;

    public akvi(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        windowManager.getClass();
        this.a = windowManager;
        this.b = context.getMainLooper().getThread();
    }
}
