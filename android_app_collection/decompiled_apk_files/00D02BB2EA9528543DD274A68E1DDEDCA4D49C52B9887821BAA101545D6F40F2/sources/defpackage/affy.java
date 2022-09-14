package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: affy  reason: default package */
/* loaded from: classes.dex */
public final class affy implements afgx {
    private static final dcdc<afid> a = dcdc.t(afid.values());
    private static final dcep<afid> b = dcep.G(afid.RESET_ACTIVITY, afid.APP_SEARCH_ACTION, afid.ENROUTE, afid.VOICE_ACTION, afid.RESUME_NAVIGATION, afid.GMM_SETTINGS, afid.REPLAY, afid.EXTERNAL_INVOCATION, afid.DIRECTIONS_ACTION, afid.SEARCH_ACTION);
    private final asik c;
    private final Map<afid, afic> d;

    public affy(asik asikVar, Map<afid, afic> map) {
        this.c = asikVar;
        this.d = map;
    }

    @Override // defpackage.afgx
    public final Iterable<afid> a() {
        if (((asio) this.c).b) {
            dcdc<afid> dcdcVar = a;
            final dcep<afid> dcepVar = b;
            dcepVar.getClass();
            return dcft.i(dcdcVar, new dbsl(dcepVar) { // from class: affx
                private final dcep a;

                {
                    this.a = dcepVar;
                }

                @Override // defpackage.dbsl
                public final boolean a(Object obj) {
                    return this.a.contains((afid) obj);
                }
            });
        }
        return a;
    }

    @Override // defpackage.afgx
    @dzsi
    public final dbsl<afga> b(afid afidVar) {
        if (this.d.get(afidVar) != null) {
            return this.d.get(afidVar).a;
        }
        return null;
    }

    @Override // defpackage.afgx
    @dzsi
    public final afhy c(afid afidVar) {
        if (this.d.get(afidVar) != null) {
            return this.d.get(afidVar).b;
        }
        return null;
    }
}
