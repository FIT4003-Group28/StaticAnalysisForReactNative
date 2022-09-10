package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: quc  reason: default package */
/* loaded from: classes7.dex */
public final class quc {
    public static ges a(qup qupVar, quy quyVar, boolean z, boolean z2) {
        Bundle bundle = new Bundle();
        bundle.putSerializable("commute_hub_state", quyVar);
        bundle.putBundle("commute_hub_directive", qupVar.h());
        if (z) {
            bundle.putBoolean("use_error_layout", true);
        }
        if (z2) {
            bundle.putBoolean("dismiss_option", true);
        }
        que queVar = new que();
        queVar.B(bundle);
        return queVar;
    }
}
