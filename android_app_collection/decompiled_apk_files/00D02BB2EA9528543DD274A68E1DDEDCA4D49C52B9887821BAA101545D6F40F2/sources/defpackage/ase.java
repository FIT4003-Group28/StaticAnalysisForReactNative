package defpackage;

import android.media.MediaRouter;
/* compiled from: PG */
/* renamed from: ase  reason: default package */
/* loaded from: classes2.dex */
final class ase {
    public static void a(Object obj, Object obj2) {
        ((MediaRouter) obj).removeCallback((MediaRouter.Callback) obj2);
    }

    public static Object b(Object obj) {
        return ((MediaRouter) obj).getSelectedRoute(8388611);
    }
}
