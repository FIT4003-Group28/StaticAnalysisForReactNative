package defpackage;
/* compiled from: PG */
/* renamed from: hrb  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hrb implements hvg {
    public final /* synthetic */ hrd a;
    private final /* synthetic */ int b;

    public /* synthetic */ hrb(hrd hrdVar) {
        this.a = hrdVar;
    }

    public /* synthetic */ hrb(hrd hrdVar, int i) {
        this.b = i;
        this.a = hrdVar;
    }

    @Override // defpackage.hvg
    public final void a(axbl axblVar) {
        axcg axcgVar;
        if (this.b == 0) {
            this.a.b.aH(axblVar);
            return;
        }
        hrd hrdVar = this.a;
        hrdVar.b.aH(axblVar);
        axbk i = ((axbm) axblVar.instance).i();
        if (i.c == 7) {
            axcgVar = (axcg) i.d;
        } else {
            axcgVar = axcg.a;
        }
        axch axchVar = axcgVar.e;
        if (axchVar == null) {
            axchVar = axch.a;
        }
        if (axchVar.d.size() <= 1) {
            return;
        }
        hrdVar.e.d(axblVar);
    }
}
