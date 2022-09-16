package defpackage;

import android.os.Bundle;
import android.view.View;
/* compiled from: PG */
/* renamed from: cnje  reason: default package */
/* loaded from: classes5.dex */
public final class cnje {
    public final int a;

    public cnje(int i) {
        this.a = i;
    }

    public cnje(Bundle bundle) {
        this.a = bundle.getInt("force_field_behavior");
    }

    public static cnje a(View view) {
        Object tag = view.getTag();
        if (!(tag instanceof Bundle)) {
            return null;
        }
        Bundle bundle = (Bundle) tag;
        if (bundle.getBoolean("is_focus_cluster", false)) {
            return new cnje(bundle);
        }
        return null;
    }

    public static void b(View view, cnje cnjeVar) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_focus_cluster", true);
        bundle.putInt("force_field_behavior", cnjeVar.a);
        view.setTag(bundle);
    }

    public static boolean c(View view) {
        Object tag = view.getTag();
        if (!(tag instanceof Bundle)) {
            return false;
        }
        return ((Bundle) tag).getBoolean("is_focus_cluster", false);
    }

    public static int d(View view) {
        cnje a = a(view);
        if (a == null) {
            return 0;
        }
        return a.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && getClass() == obj.getClass() && this.a == ((cnje) obj).a;
    }

    public final int hashCode() {
        return this.a;
    }
}
