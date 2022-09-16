package defpackage;
/* compiled from: PG */
/* renamed from: aqog  reason: default package */
/* loaded from: classes2.dex */
public final class aqog extends abga {
    public final aopa a;

    private aqog() {
        aqoj aqojVar = aqoj.a;
        throw null;
    }

    public aqog(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.abga
    /* renamed from: b */
    public final aqoi a(aajl aajlVar) {
        return new aqoi((aqoj) this.a.mo39build(), aajlVar);
    }

    public final void c(Float f) {
        aopa aopaVar = this.a;
        float floatValue = f.floatValue();
        aopaVar.copyOnWrite();
        aqoj aqojVar = (aqoj) aopaVar.instance;
        aqoj aqojVar2 = aqoj.a;
        aqojVar.c |= 4;
        aqojVar.f = floatValue;
    }

    public final void d(avyq avyqVar) {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        aqoj aqojVar = (aqoj) aopaVar.instance;
        aqoj aqojVar2 = aqoj.a;
        aqojVar.e = avyqVar.i;
        aqojVar.c |= 2;
    }

    public final void j(String str) {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        aqoj aqojVar = (aqoj) aopaVar.instance;
        aqoj aqojVar2 = aqoj.a;
        str.getClass();
        aqojVar.c |= 16;
        aqojVar.h = str;
    }

    public final void k(Boolean bool) {
        aopa aopaVar = this.a;
        boolean booleanValue = bool.booleanValue();
        aopaVar.copyOnWrite();
        aqoj aqojVar = (aqoj) aopaVar.instance;
        aqoj aqojVar2 = aqoj.a;
        aqojVar.c |= 128;
        aqojVar.k = booleanValue;
    }

    public final void l(Boolean bool) {
        aopa aopaVar = this.a;
        boolean booleanValue = bool.booleanValue();
        aopaVar.copyOnWrite();
        aqoj aqojVar = (aqoj) aopaVar.instance;
        aqoj aqojVar2 = aqoj.a;
        aqojVar.c |= 32;
        aqojVar.i = booleanValue;
    }

    public final void m(Float f) {
        aopa aopaVar = this.a;
        float floatValue = f.floatValue();
        aopaVar.copyOnWrite();
        aqoj aqojVar = (aqoj) aopaVar.instance;
        aqoj aqojVar2 = aqoj.a;
        aqojVar.c |= 8;
        aqojVar.g = floatValue;
    }
}
