package defpackage;

import java.util.AbstractMap;
/* renamed from: crlj  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class crlj implements dbrn {
    static final dbrn a = new crlj();

    private crlj() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dkxj dkxjVar = (dkxj) obj;
        doyd b = doyd.b(dkxjVar.a);
        if (b == null) {
            b = doyd.INCIDENT_ROAD_CLOSED;
        }
        return new AbstractMap.SimpleImmutableEntry(b, Integer.valueOf(dkxjVar.b));
    }
}
