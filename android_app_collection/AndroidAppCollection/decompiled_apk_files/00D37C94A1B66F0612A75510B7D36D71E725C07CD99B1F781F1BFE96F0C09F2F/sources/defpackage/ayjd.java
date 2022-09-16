package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ayjd  reason: default package */
/* loaded from: classes2.dex */
public final class ayjd extends ayfr {
    final axyx c;
    final ayax d;
    final axyd e;
    final /* synthetic */ ayje f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ayjd(ayje ayjeVar, axyx axyxVar, ayax ayaxVar, axyd axydVar) {
        super(ayjeVar.c.d(axydVar), ayjeVar.c.k, axydVar.b);
        this.f = ayjeVar;
        this.c = axyxVar;
        this.d = ayaxVar;
        this.e = axydVar;
    }

    @Override // defpackage.ayfr
    protected final void f() {
        this.f.c.o.execute(new ayjc(this));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void j() {
        this.f.c.d(this.e).execute(new ayjc(this, 1));
    }
}
