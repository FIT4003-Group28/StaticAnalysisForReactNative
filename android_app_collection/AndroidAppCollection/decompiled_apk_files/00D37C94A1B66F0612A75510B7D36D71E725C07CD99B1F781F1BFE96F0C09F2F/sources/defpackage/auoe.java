package defpackage;
/* compiled from: PG */
/* renamed from: auoe  reason: default package */
/* loaded from: classes2.dex */
public final class auoe extends abga {
    public final aopa a;

    private auoe() {
        auoh auohVar = auoh.a;
        throw null;
    }

    public auoe(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.abga
    public final /* bridge */ /* synthetic */ aajj a(aajl aajlVar) {
        return c();
    }

    public final void b() {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        auoh auohVar = auoh.a;
        ((auoh) aopaVar.instance).d = aopi.emptyProtobufList();
    }

    public final auog c() {
        return new auog((auoh) this.a.mo39build());
    }
}
