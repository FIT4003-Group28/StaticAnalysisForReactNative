package defpackage;
/* compiled from: PG */
/* renamed from: asyg  reason: default package */
/* loaded from: classes2.dex */
public final class asyg extends abga {
    private final aopa a;

    private asyg() {
        asyj asyjVar = asyj.a;
        throw null;
    }

    public asyg(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.abga
    public final /* bridge */ /* synthetic */ aajj a(aajl aajlVar) {
        return new asyi((asyj) this.a.mo39build());
    }

    public final void b(asyf asyfVar) {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        asyj asyjVar = (asyj) aopaVar.instance;
        asyj asyjVar2 = asyj.a;
        asyjVar.e = asyfVar.c;
        asyjVar.c |= 2;
    }
}
