package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: bmie  reason: default package */
/* loaded from: classes3.dex */
class bmie implements bmid {
    private final eeu a;
    private final dxio<qbt> b;
    @dzsi
    private final CharSequence c;
    @dzsi
    private final jhk d;
    private final dool e;
    private final List<zef> f;
    private final dopk g;
    private final long h;

    public bmie(eeu eeuVar, dxio<qbt> dxioVar, @dzsi CharSequence charSequence, @dzsi jhk jhkVar, dool doolVar, List<zef> list, dopk dopkVar, long j) {
        this.a = eeuVar;
        this.b = dxioVar;
        this.c = charSequence;
        this.d = jhkVar;
        this.e = doolVar;
        this.f = list;
        this.g = dopkVar;
        this.h = j;
    }

    @Override // defpackage.zcq
    public List<zef> a() {
        return this.f;
    }

    @Override // defpackage.bmid
    @dzsi
    public CharSequence b() {
        return this.c;
    }

    @Override // defpackage.bmid
    public dool c() {
        return this.e;
    }

    @Override // defpackage.bmid
    @dzsi
    public jhk d() {
        return this.d;
    }

    @Override // defpackage.bmid
    public cqkl e() {
        if (((efh) this.a).b) {
            dopk dopkVar = this.g;
            Long valueOf = Long.valueOf(this.h);
            qdf o = qdg.o();
            qaw qawVar = (qaw) o;
            qawVar.a = dopkVar.b;
            qawVar.b = dopkVar.d;
            qawVar.e = valueOf;
            o.f(false);
            this.b.a().t(o.h());
        }
        return cqkl.a;
    }
}
