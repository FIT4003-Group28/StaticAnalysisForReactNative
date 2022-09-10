package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: qba  reason: default package */
/* loaded from: classes7.dex */
public final class qba extends qdp {
    public Boolean a;
    public dnqh b;
    public dhkd c;
    public Integer d;
    public int e;
    private akqi f;
    private List<akqi> g;
    private List<String> h;
    private List<dooj> i;
    private List<doos> j;
    private int k;
    private int l;
    private int m;
    private int n;
    private int o;

    @Override // defpackage.qdp
    public final void b(List<dooj> list) {
        if (list != null) {
            this.i = list;
            return;
        }
        throw new NullPointerException("Null allowedDisplayTypes");
    }

    @Override // defpackage.qdp
    public final void c(List<akqi> list) {
        if (list != null) {
            this.g = list;
            return;
        }
        throw new NullPointerException("Null lineFeatureIds");
    }

    @Override // defpackage.qdp
    public final void d(List<String> list) {
        if (list != null) {
            this.h = list;
            return;
        }
        throw new NullPointerException("Null queryTokens");
    }

    @Override // defpackage.qdp
    public final void e(List<doos> list) {
        if (list != null) {
            this.j = list;
            return;
        }
        throw new NullPointerException("Null schematicMapSupportedFormats");
    }

    @Override // defpackage.qdp
    public final void f(akqi akqiVar) {
        if (akqiVar != null) {
            this.f = akqiVar;
            return;
        }
        throw new NullPointerException("Null stationFeatureId");
    }

    @Override // defpackage.qdp
    public final void g(int i) {
        this.m = i;
    }

    @Override // defpackage.qdp
    public final void h(int i) {
        this.l = i;
    }

    @Override // defpackage.qdp
    public final void i(int i) {
        this.o = i;
    }

    @Override // defpackage.qdp
    public final void j(int i) {
        this.k = i;
    }

    @Override // defpackage.qdp
    public final void k(int i) {
        this.n = i;
    }

    @Override // defpackage.qdp
    public final qdq a() {
        String str = this.f == null ? " stationFeatureId" : "";
        if (this.g == null) {
            str = str.concat(" lineFeatureIds");
        }
        if (this.h == null) {
            str = String.valueOf(str).concat(" queryTokens");
        }
        if (this.k == 0) {
            str = String.valueOf(str).concat(" scheduleDetails");
        }
        if (this.e == 0) {
            str = String.valueOf(str).concat(" departureTimeStrategy");
        }
        if (this.a == null) {
            str = String.valueOf(str).concat(" includeDepartureBoardMetadata");
        }
        if (this.i == null) {
            str = String.valueOf(str).concat(" allowedDisplayTypes");
        }
        if (this.j == null) {
            str = String.valueOf(str).concat(" schematicMapSupportedFormats");
        }
        if (this.l == 0) {
            str = String.valueOf(str).concat(" outgoingTransfers");
        }
        if (this.m == 0) {
            str = String.valueOf(str).concat(" leadingPolylinePolicy");
        }
        if (this.n == 0) {
            str = String.valueOf(str).concat(" trailingPolylinePolicy");
        }
        if (this.o == 0) {
            str = String.valueOf(str).concat(" returnedPolylineFormat");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new qbb(this.f, this.g, this.h, this.k, this.e, this.a, this.i, this.b, this.j, this.c, this.d, this.l, this.m, this.n, this.o);
    }
}
