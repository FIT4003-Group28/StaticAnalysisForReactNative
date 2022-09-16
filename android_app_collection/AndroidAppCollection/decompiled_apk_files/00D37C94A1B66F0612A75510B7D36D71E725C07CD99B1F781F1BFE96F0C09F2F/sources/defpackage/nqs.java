package defpackage;
/* compiled from: PG */
/* renamed from: nqs  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class nqs implements ayol {
    private final /* synthetic */ int d;
    public static final /* synthetic */ nqs c = new nqs(2);
    public static final /* synthetic */ nqs b = new nqs(1);
    public static final /* synthetic */ nqs a = new nqs();

    private /* synthetic */ nqs() {
    }

    private /* synthetic */ nqs(int i) {
        this.d = i;
    }

    @Override // defpackage.ayol
    public final ayok a(ayoi ayoiVar) {
        int i = this.d;
        if (i != 0) {
            if (i == 1) {
                return ntr.c(ayoiVar);
            }
            return ayoiVar.I(zwb.b).V(yps.j);
        }
        return ntr.c(ayoiVar);
    }
}
