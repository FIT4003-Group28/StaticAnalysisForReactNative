package defpackage;
/* compiled from: PG */
/* renamed from: aozp  reason: default package */
/* loaded from: classes.dex */
public final class aozp extends abga {
    private final aopa a;

    private aozp() {
        aozr aozrVar = aozr.a;
        throw null;
    }

    public aozp(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.abga
    public final /* bridge */ /* synthetic */ aajj a(aajl aajlVar) {
        return c();
    }

    public final void b(Boolean bool) {
        aopa aopaVar = this.a;
        boolean booleanValue = bool.booleanValue();
        aopaVar.copyOnWrite();
        aozr aozrVar = (aozr) aopaVar.instance;
        aozr aozrVar2 = aozr.a;
        aozrVar.b |= 2;
        aozrVar.d = booleanValue;
    }

    public final aozq c() {
        return new aozq((aozr) this.a.mo39build());
    }
}
