package defpackage;

import android.net.Uri;
/* renamed from: bzua  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class bzua implements dbrn {
    public static final dbrn a = new bzua();

    private bzua() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        String str = bzud.a;
        return dbsg.j(((Uri) obj).getLastPathSegment());
    }
}
