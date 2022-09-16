package defpackage;
/* compiled from: PG */
/* renamed from: xiv  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xiv implements ayqb {
    public final /* synthetic */ xiw a;
    private final /* synthetic */ int b;

    public /* synthetic */ xiv(xiw xiwVar) {
        this.a = xiwVar;
    }

    public /* synthetic */ xiv(xiw xiwVar, int i) {
        this.b = i;
        this.a = xiwVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        if (i == 0) {
            xiw xiwVar = this.a;
            ylr.c();
            aika aikaVar = aika.NEW;
            if (((ahhw) obj).c().ordinal() != 0) {
                return;
            }
            ylr.c();
            xiwVar.a();
            xiwVar.c = null;
            xiwVar.a.clear();
            xiwVar.b.clear();
        } else if (i == 1) {
            xiw xiwVar2 = this.a;
            afkn afknVar = (afkn) obj;
            ylr.c();
            if (xiwVar2.d == null || !afknVar.n()) {
                return;
            }
            xiwVar2.d.o(afknVar);
        } else if (i == 2) {
            this.a.s((ahhx) obj, false);
        } else if (i == 3) {
            this.a.s((ahhx) obj, true);
        } else {
            xiw xiwVar3 = this.a;
            ahia ahiaVar = (ahia) obj;
            ylr.c();
            if (xiwVar3.d != null) {
                xiwVar3.d.B(ahiaVar);
            }
            int a = ahiaVar.a();
            if (a == 2) {
                xiwVar3.r();
            } else if (a == 3) {
                ylr.c();
                if (xiwVar3.d == null) {
                    return;
                }
                xiwVar3.d.r();
            } else if (a == 4) {
                ylr.c();
                if (xiwVar3.d == null) {
                    return;
                }
                xiwVar3.d.v();
            } else if (a != 7) {
            } else {
                ylr.c();
                if (xiwVar3.d == null) {
                    return;
                }
                xiwVar3.d.p();
            }
        }
    }
}
