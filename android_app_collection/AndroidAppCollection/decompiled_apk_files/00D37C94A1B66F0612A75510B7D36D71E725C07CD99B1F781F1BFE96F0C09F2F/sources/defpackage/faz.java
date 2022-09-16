package defpackage;
/* compiled from: PG */
/* renamed from: faz  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class faz implements ayqe {
    public final /* synthetic */ int a;
    private final /* synthetic */ int b;

    public /* synthetic */ faz(int i) {
        this.a = i;
    }

    public /* synthetic */ faz(int i, int i2) {
        this.b = i2;
        this.a = i;
    }

    @Override // defpackage.ayqe
    public final Object a(Object obj) {
        int i = this.b;
        boolean z = false;
        if (i == 0) {
            int i2 = this.a;
            amuk amukVar = (amuk) obj;
            int size = amukVar.size();
            if (i2 != -1) {
                amukVar = amukVar.subList(0, Math.min(i2, amukVar.size()));
            }
            return fav.a(size, amukVar);
        } else if (i == 1) {
            return elt.f(this.a, ((elq) obj).a());
        } else {
            if (i == 2) {
                int i3 = this.a;
                int i4 = jki.b;
                return Integer.valueOf(i3 - ((amvn) obj).size());
            } else if (i == 3) {
                if (((Integer) obj).intValue() == this.a) {
                    z = true;
                }
                return Boolean.valueOf(z);
            } else {
                return Integer.valueOf(((Integer) obj).intValue() - this.a);
            }
        }
    }
}
