package defpackage;
/* compiled from: PG */
/* renamed from: asox  reason: default package */
/* loaded from: classes2.dex */
public final class asox extends abga {
    private final aopa a;

    private asox() {
        aspa aspaVar = aspa.a;
        throw null;
    }

    public asox(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.abga
    public final /* bridge */ /* synthetic */ aajj a(aajl aajlVar) {
        return new asoz((aspa) this.a.mo39build());
    }

    public final void b(aspb aspbVar) {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        aspa aspaVar = (aspa) aopaVar.instance;
        aspa aspaVar2 = aspa.a;
        aspaVar.d = aspbVar.e;
        aspaVar.b |= 2;
    }
}
