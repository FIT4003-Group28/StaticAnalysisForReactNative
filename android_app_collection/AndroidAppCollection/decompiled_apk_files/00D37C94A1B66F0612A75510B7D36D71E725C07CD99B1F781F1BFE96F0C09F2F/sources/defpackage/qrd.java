package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: qrd  reason: default package */
/* loaded from: classes4.dex */
final class qrd extends qrb {
    public qrd(int i, Bundle bundle) {
        super(i, 1, bundle);
    }

    @Override // defpackage.qrb
    public final void a(Bundle bundle) {
        Bundle bundle2 = bundle.getBundle("data");
        if (bundle2 == null) {
            bundle2 = Bundle.EMPTY;
        }
        d(bundle2);
    }

    @Override // defpackage.qrb
    public final boolean b() {
        return false;
    }
}
