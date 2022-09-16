package defpackage;

import android.view.Window;
import android.view.WindowInsets;
/* compiled from: PG */
/* renamed from: bjj  reason: default package */
/* loaded from: classes2.dex */
public final class bjj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(Window window) {
        window.getDecorView().getWindowInsetsController().show(WindowInsets.Type.ime());
    }
}
