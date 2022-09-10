package defpackage;
/* compiled from: PG */
/* renamed from: ajft  reason: default package */
/* loaded from: classes2.dex */
public final class ajft {
    public static final ajhx a(fd fdVar, String str, ahvk ahvkVar, cqkj cqkjVar) {
        gn R = fdVar.R();
        gz b = R.b();
        ajfu ajfuVar = (ajfu) R.H("CREATE_JOURNEY_SHARES_FLOW_FRAGMENT_TAG");
        if (ajfuVar == null) {
            dbsk.s(ahvkVar);
            ajfuVar = ajfu.d(str, ahvkVar);
            b.y(ajfuVar, "CREATE_JOURNEY_SHARES_FLOW_FRAGMENT_TAG");
        }
        if (!b.q()) {
            b.g();
        }
        ajfuVar.h(cqkjVar);
        return ajfuVar;
    }

    public static final ajhx b(gn gnVar, String str, ahvk ahvkVar, cqkj cqkjVar) {
        gz b = gnVar.b();
        ajfu ajfuVar = (ajfu) gnVar.H("CREATE_JOURNEY_SHARES_FLOW_FRAGMENT_TAG");
        if (ajfuVar != null) {
            ajfuVar.i();
            b.u(ajfuVar);
            b.g();
        }
        gz b2 = gnVar.b();
        dbsk.s(str);
        ajfu d = ajfu.d(str, ahvkVar);
        d.h(cqkjVar);
        b2.y(d, "CREATE_JOURNEY_SHARES_FLOW_FRAGMENT_TAG");
        b2.g();
        return d;
    }
}
