package defpackage;
/* compiled from: PG */
/* renamed from: aahr  reason: default package */
/* loaded from: classes.dex */
final class aahr extends aahw {
    private final amup a;
    private final aajj b;
    private final aajk c;
    private final aorw d;
    private final aajb e;
    private final snc f;
    private final String g;

    public aahr(aajb aajbVar, amup amupVar, aajj aajjVar, aajk aajkVar, aorw aorwVar, snc sncVar, String str) {
        boolean z = true;
        if (aajjVar == null && aajkVar == null) {
            z = false;
        }
        aqxo.z(z, "entity and metadata cannot both be null");
        this.e = aajbVar;
        this.a = amupVar;
        this.b = aajjVar;
        this.c = aajkVar;
        this.d = aorwVar;
        this.f = sncVar;
        this.g = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aahr a(aajb aajbVar, amup amupVar, aajj aajjVar, aorw aorwVar, snc sncVar) {
        return new aahr(aajbVar, amupVar, aajjVar, null, aorwVar, sncVar, aajjVar.d());
    }

    @Override // defpackage.aahw
    public final void b(aaip aaipVar, vox voxVar, amuf amufVar) {
        aakd c = this.e.c(voxVar, this.g);
        if (aajz.d(c.d, this.d)) {
            aajj aajjVar = c.b;
            aajk aajkVar = c.c;
            aajj aajjVar2 = this.b;
            boolean z = false;
            if (aajjVar2 != null && !akzj.f(aajjVar2, aajjVar)) {
                z = true;
            }
            aajk aajkVar2 = this.c;
            if (aajkVar2 == null) {
                aajkVar2 = aajkVar;
            }
            boolean z2 = !akzj.f(aajkVar2, aajkVar);
            aorw c2 = aajz.c(this.d, c.d);
            if (this.b != null || aajjVar != null) {
                aakc a = aakd.a();
                aajj aajjVar3 = this.b;
                a.a = aajjVar3 != null ? aajz.b(this.a, aajjVar, aajjVar3) : aajjVar;
                aajk aajkVar3 = this.c;
                if (aajkVar3 == null) {
                    aajkVar3 = aajkVar;
                }
                a.c(aajkVar3);
                a.b(c2);
                aakd a2 = a.a();
                if (amufVar != null && (z || z2)) {
                    aajn a3 = aajp.a();
                    a3.c(this.g);
                    a3.a = aajjVar;
                    a3.b = a2.b;
                    a3.d(aajkVar);
                    a3.b(a2.c);
                    amufVar.h(a3.a());
                }
                c(aaipVar, voxVar, a2, this.f.c(), c2);
                return;
            }
            throw aahd.a(new Exception("Cannot commit metadata without an existing entity"), 4);
        }
    }
}
