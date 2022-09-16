package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cnlx  reason: default package */
/* loaded from: classes5.dex */
final class cnlx extends cnly<Void> {
    public cnlx(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // defpackage.cnly
    public final boolean a() {
        return true;
    }

    @Override // defpackage.cnly
    public final void b(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            c(null);
        } else {
            d(new cnlz("Invalid response to one way request"));
        }
    }
}
