package defpackage;

import android.view.View;
import android.view.WindowInsets;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: oa  reason: default package */
/* loaded from: classes7.dex */
public class oa {
    public static ow a(View view) {
        WindowInsets rootWindowInsets = view.getRootWindowInsets();
        if (rootWindowInsets == null) {
            return null;
        }
        ow a = ow.a(rootWindowInsets);
        a.r(a);
        a.s(view.getRootView());
        return a;
    }
}
