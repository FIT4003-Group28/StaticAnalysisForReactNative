package defpackage;
/* compiled from: PG */
/* renamed from: adhp  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class adhp implements ayqb {
    public final /* synthetic */ adhq a;
    private final /* synthetic */ int b;

    public /* synthetic */ adhp(adhq adhqVar) {
        this.a = adhqVar;
    }

    public /* synthetic */ adhp(adhq adhqVar, int i) {
        this.b = i;
        this.a = adhqVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        if (this.b == 0) {
            adhq adhqVar = this.a;
            ahia ahiaVar = (ahia) obj;
            if (((adoa) adhqVar.a.j.get()).e() == null) {
                return;
            }
            int a = ahiaVar.a();
            if (a != 2 && a != 3 && a != 5 && a != 6 && a != 7 && a != 8) {
                return;
            }
            adhqVar.a.b();
            return;
        }
        adhq adhqVar2 = this.a;
        ahhw ahhwVar = (ahhw) obj;
        if (((adoa) adhqVar2.a.j.get()).e() == null) {
            adhqVar2.a.m = false;
            return;
        }
        if (!ahhwVar.c().h()) {
            adhqVar2.a.m = false;
        }
        adhqVar2.a.b();
    }
}
