package defpackage;

import android.net.NetworkInfo;
/* renamed from: aosr  reason: default package */
/* loaded from: classes2.dex */
final /* synthetic */ class aosr implements dbrn {
    static final dbrn a = new aosr();

    private aosr() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Boolean.valueOf(((NetworkInfo) obj).isConnected());
    }
}
