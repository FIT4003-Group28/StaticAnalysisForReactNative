package defpackage;

import android.app.Activity;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: azed  reason: default package */
/* loaded from: classes3.dex */
public final class azed {
    public final Activity a;
    public final bvsx b;

    public azed(Activity activity) {
        this.a = activity;
        this.b = new bvsx(activity.getResources());
    }

    public static int a(drcs drcsVar) {
        baac baacVar = baac.PRIVATE;
        drcs drcsVar2 = drcs.UNKNOWN_SHARING_STATE;
        int ordinal = drcsVar.ordinal();
        if (ordinal == 0) {
            String valueOf = String.valueOf(drcsVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Illegal sharing state - ");
            sb.append(valueOf);
            throw new IllegalArgumentException(sb.toString());
        } else if (ordinal == 1) {
            return R.string.LIST_PRIVATE;
        } else {
            if (ordinal == 2) {
                return R.string.LIST_SHARED;
            }
            if (ordinal == 3) {
                return R.string.LIST_PUBLIC;
            }
            if (ordinal != 4) {
                throw new AssertionError(drcsVar);
            }
            return R.string.LIST_SHARED;
        }
    }
}
