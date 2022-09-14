package defpackage;
/* compiled from: PG */
/* renamed from: aout  reason: default package */
/* loaded from: classes2.dex */
public final class aout<T> extends btrh<T> {
    private final int d;

    private aout(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    public static void b(btrm btrmVar, aous aousVar) {
        dceq a = dcet.a();
        a.b(gds.class, new aout(0, gds.class, aousVar));
        a.b(azqv.class, new aout(1, azqv.class, aousVar));
        a.b(btav.class, new aout(2, btav.class, aousVar));
        btrmVar.g(aousVar, a.a());
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        int i = this.d;
        if (i == 0) {
            aous aousVar = (aous) this.a;
            gds gdsVar = (gds) obj;
            if (!dbsd.a(aousVar.b, gdsVar)) {
                aousVar.a.b();
            }
            aousVar.b = gdsVar;
        } else if (i != 1) {
            aous aousVar2 = (aous) this.a;
            btav btavVar = (btav) obj;
            if (!btavVar.a() && !btavVar.b()) {
                return;
            }
            aousVar2.a.b();
        } else {
            azqv azqvVar = (azqv) obj;
            ((aous) this.a).a.b();
        }
    }
}
