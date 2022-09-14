package defpackage;
/* compiled from: PG */
/* renamed from: asan  reason: default package */
/* loaded from: classes2.dex */
public final class asan<T> extends btrh<T> {
    private final int d;

    public asan(int i, Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        daqq daqqVar;
        boolean z;
        int i = this.d;
        if (i == 0) {
            crih crihVar = (crih) obj;
            ((asal) this.a).a.f();
        } else if (i != 1) {
            if (i != 2) {
                crid cridVar = (crid) obj;
                ((asal) this.a).a.i.h = true;
                return;
            }
            crie crieVar = (crie) obj;
            ((asal) this.a).a.i.h = true;
        } else {
            asal asalVar = (asal) this.a;
            brcp brcpVar = (brcp) obj;
            asam asamVar = asalVar.a;
            if (asamVar.j || (daqqVar = brcpVar.a) == null || (z = daqqVar.d) == asamVar.l) {
                return;
            }
            boolean z2 = false;
            if (z && !asamVar.h.a()) {
                z2 = true;
            }
            if (z2) {
                asam asamVar2 = asalVar.a;
                if (!asamVar2.l) {
                    asamVar2.c();
                }
            }
            if (!z2) {
                asam asamVar3 = asalVar.a;
                if (asamVar3.l) {
                    dehu dehuVar = asamVar3.m;
                    if (dehuVar != null) {
                        dehuVar.cancel(true);
                    }
                    if (asalVar.a.b.a().a() == 3 || asalVar.a.b.a().a() == 2) {
                        asalVar.a.b.a().j(asalVar.a.c);
                    }
                }
            }
            asalVar.a.l = z2;
        }
    }
}
