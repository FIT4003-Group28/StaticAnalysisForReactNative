package defpackage;

import android.os.BadParcelableException;
import android.os.Bundle;
/* compiled from: PG */
/* renamed from: mm  reason: default package */
/* loaded from: classes7.dex */
public final class mm {
    public static void a(Bundle bundle) {
        if (bundle != null) {
            bundle.setClassLoader(mm.class.getClassLoader());
        }
    }

    public static Bundle b(Bundle bundle) {
        a(bundle);
        try {
            bundle.isEmpty();
            return bundle;
        } catch (BadParcelableException unused) {
            return null;
        }
    }
}
