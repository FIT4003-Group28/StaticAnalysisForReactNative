package defpackage;
/* compiled from: PG */
/* renamed from: tvc  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tvc implements anir {
    public final /* synthetic */ tve a;
    public final /* synthetic */ tqy b;
    private final /* synthetic */ int c;

    public /* synthetic */ tvc(tve tveVar, tqy tqyVar) {
        this.a = tveVar;
        this.b = tqyVar;
    }

    public /* synthetic */ tvc(tve tveVar, tqy tqyVar, int i) {
        this.c = i;
        this.a = tveVar;
        this.b = tqyVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.c == 0) {
            tve tveVar = this.a;
            return anii.i(tveVar.b(tveVar.c.f(this.b)), new tuw(tveVar, (tzb) obj, 2), tveVar.d);
        }
        tve tveVar2 = this.a;
        return anii.i(tveVar2.b(tveVar2.c.e(this.b)), new tuw(tveVar2, (tzb) obj), tveVar2.d);
    }
}
