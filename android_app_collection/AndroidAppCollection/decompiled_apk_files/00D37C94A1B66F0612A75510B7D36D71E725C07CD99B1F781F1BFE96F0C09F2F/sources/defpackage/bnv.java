package defpackage;

import android.os.Build;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: bnv  reason: default package */
/* loaded from: classes2.dex */
final class bnv {
    private static boolean a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            b(viewGroup, z);
        }
    }

    private static void b(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
