package defpackage;

import android.util.Base64;
/* renamed from: ddj  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class ddj implements dbrn {
    static final dbrn a = new ddj();

    private ddj() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return dcdn.k("Calibrator Settings", Base64.encodeToString(((ddx) obj).bS(), 0));
    }
}
