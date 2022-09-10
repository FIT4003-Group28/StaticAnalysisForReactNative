package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: atlk  reason: default package */
/* loaded from: classes2.dex */
public final class atlk {
    private static final dcqe a = dcqe.c("atlk");

    public static boolean a(crqf crqfVar) {
        return crqfVar.i || crqfVar.b() || crqfVar.c() || c(crqfVar);
    }

    public static int b(crqf crqfVar) {
        if (crqfVar.b()) {
            return (crqfVar.c || !crqfVar.f) ? R.string.DA_REROUTING : R.string.DA_DATA_CONNECTION_LOST;
        } else if (crqfVar.c()) {
            return R.string.DA_OFF_ROUTE;
        } else {
            if (c(crqfVar)) {
                return R.string.LOCATION_NOT_YET_AVAILABLE;
            }
            if (crqfVar.i) {
                return R.string.DA_REROUTING;
            }
            bvoo.h("Calling getMessageId() when there is no message to display", new Object[0]);
            return -1;
        }
    }

    private static boolean c(crqf crqfVar) {
        if (crqfVar.d || !crqfVar.g().a.j) {
            return !crqfVar.j && crqfVar.g().b == null && !crqfVar.g;
        }
        return true;
    }
}
