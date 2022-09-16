package defpackage;
/* compiled from: PG */
/* renamed from: aqom  reason: default package */
/* loaded from: classes2.dex */
public final class aqom extends abga {
    private final aopa a;

    private aqom() {
        aqop aqopVar = aqop.a;
        throw null;
    }

    public aqom(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.abga
    public final /* bridge */ /* synthetic */ aajj a(aajl aajlVar) {
        return l();
    }

    public final void b(String str) {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        aqop aqopVar = (aqop) aopaVar.instance;
        aqop aqopVar2 = aqop.a;
        aqopVar.c |= 16;
        aqopVar.h = str;
    }

    public final void c(String str) {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        aqop aqopVar = (aqop) aopaVar.instance;
        aqop aqopVar2 = aqop.a;
        str.getClass();
        aqopVar.c |= 8;
        aqopVar.g = str;
    }

    public final void d(Integer num) {
        aopa aopaVar = this.a;
        int intValue = num.intValue();
        aopaVar.copyOnWrite();
        aqop aqopVar = (aqop) aopaVar.instance;
        aqop aqopVar2 = aqop.a;
        aqopVar.c |= 32;
        aqopVar.i = intValue;
    }

    public final void j(String str) {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        aqop aqopVar = (aqop) aopaVar.instance;
        aqop aqopVar2 = aqop.a;
        str.getClass();
        aqopVar.c |= 2;
        aqopVar.e = str;
    }

    public final void k(Integer num) {
        aopa aopaVar = this.a;
        int intValue = num.intValue();
        aopaVar.copyOnWrite();
        aqop aqopVar = (aqop) aopaVar.instance;
        aqop aqopVar2 = aqop.a;
        aqopVar.c |= 4;
        aqopVar.f = intValue;
    }

    public final aqoo l() {
        return new aqoo((aqop) this.a.mo39build());
    }
}
