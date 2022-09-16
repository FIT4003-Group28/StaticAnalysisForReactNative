package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: rdg  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class rdg implements ruz {
    public final /* synthetic */ rvh a;
    private final /* synthetic */ int b;

    public /* synthetic */ rdg(rvh rvhVar, int i) {
        this.b = i;
        this.a = rvhVar;
    }

    @Override // defpackage.ruz
    public final void d(Object obj) {
        if (this.b == 0) {
            this.a.d((rde) obj);
            return;
        }
        rvh rvhVar = this.a;
        Bundle bundle = (Bundle) obj;
        int i = 2;
        if (bundle != null) {
            i = Integer.valueOf(bundle.getInt("com.google.android.gms.cast.BUNDLE_KEY_CAST_ENABLED_STATUS", 2));
        }
        rvhVar.b(i);
    }
}
