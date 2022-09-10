package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: astc  reason: default package */
/* loaded from: classes2.dex */
public abstract class astc {
    public final boolean a;
    @dzsi
    public final crqw b;
    public final aslf c;
    @dzsi
    public final astg d;
    @dzsi
    public final aste e;
    protected final dbsg<Long> f;
    public final astb g;
    @dzsi
    public final aryr h;
    @dzsi
    public final List<aryr> i;
    public final boolean j;
    public final boolean k;

    /* JADX INFO: Access modifiers changed from: protected */
    public astc(asta<?, ?> astaVar) {
        this.a = astaVar.a;
        this.b = astaVar.b;
        this.c = astaVar.c;
        this.d = astaVar.d;
        this.e = astaVar.e;
        this.f = astaVar.f;
        this.g = astaVar.g;
        this.h = astaVar.h;
        this.i = astaVar.i;
        this.j = astaVar.j;
        this.k = astaVar.k;
    }

    public final boolean a() {
        crqw crqwVar = this.b;
        if (crqwVar == null || crqwVar.g()) {
            return (this.c.a == asld.FOLLOWING && this.c.a() == null) ? false : true;
        }
        return false;
    }

    public boolean b() {
        throw null;
    }

    public boolean c() {
        return false;
    }

    public final dbsg<Long> d() {
        if (this.f.a()) {
            return this.f;
        }
        aste asteVar = this.e;
        return asteVar == null ? dbpy.a : asteVar.o();
    }

    @dzsi
    public abstract dqvj e();

    /* JADX INFO: Access modifiers changed from: protected */
    public final dbsb f() {
        dbsb b = dbsc.b(this);
        b.h("uiIsRestricted", this.a);
        b.b("prompt", this.b);
        b.b("cameraParameters", this.c);
        b.b("polylineOverride", this.d);
        b.b("searchQuery", this.e);
        b.b("searchState", this.g);
        b.b("selectedSearchResult", this.h);
        b.b("visibleSearchResults", this.i);
        b.h("shouldRefreshSearch", this.j);
        b.h("inMiniMode", this.k);
        return b;
    }
}
