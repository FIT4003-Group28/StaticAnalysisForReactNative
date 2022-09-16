package defpackage;
/* compiled from: PG */
/* renamed from: ehy  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ehy implements ayqb {
    public final /* synthetic */ ehz a;
    private final /* synthetic */ int b;

    public /* synthetic */ ehy(ehz ehzVar) {
        this.a = ehzVar;
    }

    public /* synthetic */ ehy(ehz ehzVar, int i) {
        this.b = i;
        this.a = ehzVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        int i = this.b;
        boolean z = true;
        if (i != 0) {
            if (i == 1) {
                this.a.f((egw) obj);
                return;
            } else if (i == 2) {
                Boolean bool = (Boolean) obj;
                this.a.g();
                return;
            } else {
                ehz ehzVar = this.a;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                (booleanValue ? ehzVar.d() : aynr.f()).c(ehzVar.b.d(booleanValue));
                return;
            }
        }
        ehz ehzVar2 = this.a;
        if (((eik) obj) == eik.NOT_SUPPORTED) {
            z = false;
        }
        if (z != ehzVar2.c) {
            if (ehzVar2.d != null && ehzVar2.f.isShowing()) {
                ehzVar2.f.hide();
            }
            if (ehzVar2.e != null && ehzVar2.g.isShowing()) {
                ehzVar2.g.hide();
            }
        }
        ehzVar2.c = z;
    }
}
