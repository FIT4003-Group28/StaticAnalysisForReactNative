package defpackage;
/* compiled from: PG */
/* renamed from: tvd  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class tvd implements anir {
    public final /* synthetic */ tve a;
    public final /* synthetic */ tqy b;
    public final /* synthetic */ tqz c;
    private final /* synthetic */ int d;

    public /* synthetic */ tvd(tve tveVar, tqy tqyVar, tqz tqzVar) {
        this.a = tveVar;
        this.b = tqyVar;
        this.c = tqzVar;
    }

    public /* synthetic */ tvd(tve tveVar, tqy tqyVar, tqz tqzVar, int i) {
        this.d = i;
        this.a = tveVar;
        this.b = tqyVar;
        this.c = tqzVar;
    }

    @Override // defpackage.anir
    public final ankt a(Object obj) {
        if (this.d == 0) {
            tve tveVar = this.a;
            return anii.i(tveVar.b(tveVar.c.g(this.b, this.c)), new tuw(tveVar, (tzb) obj, 3), tveVar.d);
        }
        tve tveVar2 = this.a;
        return anii.h(tveVar2.c.g(this.b, this.c), new liw((Boolean) obj, 6), tveVar2.d);
    }
}
