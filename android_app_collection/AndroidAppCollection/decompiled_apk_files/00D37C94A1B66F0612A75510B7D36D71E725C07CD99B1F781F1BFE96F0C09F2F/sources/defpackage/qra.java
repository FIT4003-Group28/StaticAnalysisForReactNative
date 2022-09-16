package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: qra  reason: default package */
/* loaded from: classes4.dex */
final class qra extends qrb {
    public qra(int i, Bundle bundle) {
        super(i, 2, bundle);
    }

    @Override // defpackage.qrb
    public final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new qrc("Invalid response to one way request"));
        }
    }

    @Override // defpackage.qrb
    public final boolean b() {
        return true;
    }
}
