package defpackage;

import android.os.Build;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: azc  reason: default package */
/* loaded from: classes3.dex */
final class azc {
    private static boolean a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            viewGroup.suppressLayout(z);
        } else {
            c(viewGroup, z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static azb b(ViewGroup viewGroup) {
        return new azb(viewGroup);
    }

    private static void c(ViewGroup viewGroup, boolean z) {
        if (a) {
            try {
                viewGroup.suppressLayout(z);
            } catch (NoSuchMethodError unused) {
                a = false;
            }
        }
    }
}
