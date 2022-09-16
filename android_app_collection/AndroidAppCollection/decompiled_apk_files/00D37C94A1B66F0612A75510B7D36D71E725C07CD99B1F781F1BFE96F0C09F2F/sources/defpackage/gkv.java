package defpackage;
/* compiled from: PG */
/* renamed from: gkv  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gkv implements azqb {
    public final /* synthetic */ aaxb a;
    private final /* synthetic */ int b;

    public /* synthetic */ gkv(aaxb aaxbVar, int i) {
        this.b = i;
        this.a = aaxbVar;
    }

    @Override // defpackage.azqb
    public final Object get() {
        int i = this.b;
        if (i == 0) {
            aaxb aaxbVar = this.a;
            return new aaxc(aaxbVar.e, aaxbVar.a.c());
        } else if (i == 1) {
            aaxb aaxbVar2 = this.a;
            return new aawy(aaxbVar2.e, aaxbVar2.a.c());
        } else {
            aaxb aaxbVar3 = this.a;
            return new aaxd(aaxbVar3.e, aaxbVar3.a.c());
        }
    }
}
