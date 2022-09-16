package defpackage;
/* compiled from: PG */
/* renamed from: aivs  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aivs implements ayqb {
    public final /* synthetic */ aivt a;
    private final /* synthetic */ int b;

    public /* synthetic */ aivs(aivt aivtVar) {
        this.a = aivtVar;
    }

    public /* synthetic */ aivs(aivt aivtVar, int i) {
        this.b = i;
        this.a = aivtVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            aivt aivtVar = this.a;
            ahgn ahgnVar = (ahgn) obj;
            aivtVar.c = ahgnVar;
            for (afiz afizVar : aivtVar.b.values()) {
                aivt.w(afizVar, ahgnVar);
            }
        } else if (i == 1) {
            ahgh ahghVar = (ahgh) obj;
            for (afiz afizVar2 : this.a.b.values()) {
                afizVar2.j(ahghVar.a());
            }
        } else if (i == 2) {
            aivt aivtVar2 = this.a;
            ahho ahhoVar = (ahho) obj;
            String d = ahhoVar.d();
            if (d == null || !aivtVar2.b.containsKey(d)) {
                return;
            }
            ((afiz) aivtVar2.b.get(d)).p(ahhoVar.b(), ahhoVar.i(), ahhoVar.j(), ahhoVar.e(), ahhoVar.f(), ahhoVar.g(), ahhoVar.h());
        } else if (i == 3) {
            atyc atycVar = (atyc) obj;
            for (afiz afizVar3 : this.a.b.values()) {
                afizVar3.H(atycVar.n);
            }
        } else {
            aivt aivtVar3 = this.a;
            int intValue = ((Integer) obj).intValue();
            for (afiz afizVar4 : aivtVar3.b.values()) {
                afizVar4.i(intValue);
            }
        }
    }
}
