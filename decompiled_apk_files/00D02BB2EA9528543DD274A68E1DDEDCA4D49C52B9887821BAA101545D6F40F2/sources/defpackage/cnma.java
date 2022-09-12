package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cnma  reason: default package */
/* loaded from: classes5.dex */
public final class cnma extends cnly<Bundle> {
    public cnma(int i, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // defpackage.cnly
    public final boolean a() {
        return false;
    }

    @Override // defpackage.cnly
    public final void b(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        c(bundle2);
    }
}
