package defpackage;

import java.util.AbstractMap;
/* renamed from: crll  reason: default package */
/* loaded from: classes5.dex */
final /* synthetic */ class crll implements dbrn {
    static final dbrn a = new crll();

    private crll() {
    }

    @Override // defpackage.dbrn
    public final Object a(Object obj) {
        dveg dvegVar = (dveg) obj;
        doyd b = doyd.b(dvegVar.a);
        if (b == null) {
            b = doyd.INCIDENT_ROAD_CLOSED;
        }
        return new AbstractMap.SimpleImmutableEntry(b, Integer.valueOf(dvegVar.b));
    }
}
