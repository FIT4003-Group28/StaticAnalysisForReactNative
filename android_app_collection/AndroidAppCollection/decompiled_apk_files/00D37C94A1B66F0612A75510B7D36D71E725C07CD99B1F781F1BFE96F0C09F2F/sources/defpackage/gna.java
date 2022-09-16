package defpackage;
/* compiled from: PG */
/* renamed from: gna  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class gna implements ayqe {
    public final /* synthetic */ aajl a;
    private final /* synthetic */ int b;

    public /* synthetic */ gna(aajl aajlVar) {
        this.a = aajlVar;
    }

    public /* synthetic */ gna(aajl aajlVar, int i) {
        this.b = i;
        this.a = aajlVar;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        int i = this.b;
        if (i == 0) {
            aajl aajlVar = this.a;
            aozq aozqVar = (aozq) obj;
            int i2 = gnb.b;
            if (aozqVar == null) {
                afus.b(2, 1, "Ad player fullscreen state entity is null in onSuccess on enter");
                return aynr.f();
            }
            aajs c = aajlVar.c();
            aozp e = aozqVar.e();
            e.b(true);
            c.d(e.c());
            return c.b();
        } else if (i == 1) {
            return this.a.f((String) obj);
        } else {
            if (i == 2) {
                return this.a.f((String) obj).g(awkp.class);
            }
            if (i == 3) {
                return this.a.f((String) obj).g(awjr.class);
            }
            if (i == 4) {
                aahb c2 = ((aagu) this.a).c();
                auoe e2 = ((auog) obj).e();
                e2.b();
                c2.j(e2);
                return c2.b();
            }
            aahb c3 = ((aagu) this.a).c();
            auoe e3 = ((auog) obj).e();
            e3.b();
            c3.j(e3);
            return c3.b();
        }
    }
}
