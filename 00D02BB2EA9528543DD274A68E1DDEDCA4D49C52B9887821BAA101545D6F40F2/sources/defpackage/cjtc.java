package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: cjtc  reason: default package */
/* loaded from: classes.dex */
public abstract class cjtc implements Serializable {
    public static cjtb g() {
        cjrv cjrvVar = new cjrv();
        cjrvVar.c(ddhj.VISIBILITY_VISIBLE);
        cjrvVar.b(-1);
        return cjrvVar;
    }

    public abstract ddhj a();

    public abstract int b();

    @dzsi
    public abstract bvrt<dddg> c();

    @dzsi
    public abstract bvrt<ddzg> d();

    @dzsi
    public abstract bvrt<ddgy> e();

    @dzsi
    public abstract bvrt<ddet> f();

    public final String toString() {
        dbsb d = dbsc.d("ImpressionParams");
        d.c();
        d.b("visibility", a().name());
        d.f("elementIndex", b());
        d.b("geoUgcData", c());
        d.b("mapsData", d());
        d.b("tronData", e());
        d.b("mapsImpressionData", f());
        return d.toString();
    }
}
