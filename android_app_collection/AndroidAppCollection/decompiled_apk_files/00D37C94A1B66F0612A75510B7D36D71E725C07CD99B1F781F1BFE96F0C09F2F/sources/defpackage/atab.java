package defpackage;
/* compiled from: PG */
/* renamed from: atab  reason: default package */
/* loaded from: classes2.dex */
public final class atab extends abga {
    public final aopa a;

    private atab() {
        ataf atafVar = ataf.a;
        throw null;
    }

    public atab(aopa aopaVar) {
        this.a = aopaVar;
    }

    @Override // defpackage.abga
    public final /* bridge */ /* synthetic */ aajj a(aajl aajlVar) {
        return c();
    }

    public final void b(atag atagVar) {
        aopa aopaVar = this.a;
        aopaVar.copyOnWrite();
        ataf atafVar = (ataf) aopaVar.instance;
        ataf atafVar2 = ataf.a;
        atafVar.i = atagVar.d;
        atafVar.c |= 64;
    }

    public final atad c() {
        return new atad((ataf) this.a.mo39build());
    }
}
