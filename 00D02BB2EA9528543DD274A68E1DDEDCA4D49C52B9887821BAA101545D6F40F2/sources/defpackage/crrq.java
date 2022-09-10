package defpackage;
/* compiled from: PG */
/* renamed from: crrq  reason: default package */
/* loaded from: classes5.dex */
public final class crrq<T> extends btrh<T> {
    private final int d;

    public crrq(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            crmi crmiVar = (crmi) obj;
            ((crro) this.a).i();
        } else if (i == 1) {
            crro crroVar = (crro) this.a;
            cray b = ((crmj) obj).b.b();
            if (b == null || !crroVar.b.contains(b.a.h)) {
                return;
            }
            amub amubVar = b.a;
            String str = crroVar.c;
            crroVar.e = amubVar;
            crroVar.a.c(crroVar.e);
            crroVar.h(20000L);
            crroVar.g(b);
        } else if (i == 2) {
            crml crmlVar = (crml) obj;
            ((crro) this.a).i();
        } else if (i == 3) {
            ((crro) this.a).g(((crmn) obj).b.b());
        } else if (i != 4) {
            crmk crmkVar = (crmk) obj;
            ((crro) this.a).i();
        } else {
            crro crroVar2 = (crro) this.a;
            cray b2 = ((crmh) obj).b.b();
            if (b2.b == null || crroVar2.g - b2.e < 30000) {
                return;
            }
            crroVar2.g(b2);
        }
    }
}
