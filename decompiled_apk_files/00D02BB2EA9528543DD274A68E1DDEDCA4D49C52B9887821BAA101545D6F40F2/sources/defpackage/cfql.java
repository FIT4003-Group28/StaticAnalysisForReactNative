package defpackage;

import android.net.NetworkInfo;
/* renamed from: cfql  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class cfql implements dbrn {
    static final dbrn a = new cfql();

    private cfql() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        return Boolean.valueOf(((NetworkInfo) obj).isConnected());
    }
}
