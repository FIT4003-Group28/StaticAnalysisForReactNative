package defpackage;
/* compiled from: PG */
/* renamed from: awou  reason: default package */
/* loaded from: classes3.dex */
public final class awou<T> extends btrh<T> {
    private final int d;

    public awou(int i, Class<?> cls, T t) {
        super(cls, t);
        this.d = i;
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        if (this.d != 0) {
            awos awosVar = (awos) this.a;
            alhx alhxVar = (alhx) obj;
            synchronized (awosVar.b.h) {
                if (awosVar.b.g.b() || awosVar.b.g.a()) {
                    awot awotVar = awosVar.b;
                    awotVar.i = true;
                    awotVar.e.d(true);
                }
            }
            return;
        }
        awos awosVar2 = (awos) this.a;
        alhw alhwVar = (alhw) obj;
        if (!awosVar2.b.g.b() && !awosVar2.b.g.a()) {
            return;
        }
        if (alhwVar.a == alje.FIRST_FINGER_DOWN) {
            alad n = awosVar2.b.d.n();
            synchronized (awosVar2.b.h) {
                awosVar2.a = n.m;
                if (awosVar2.b.g.a()) {
                    awosVar2.b.f.b(false);
                }
            }
        } else if (alhwVar.a != alje.LAST_FINGER_UP) {
        } else {
            alad n2 = awosVar2.b.d.n();
            synchronized (awosVar2.b.h) {
                if (awosVar2.b.g.a() && Math.abs(bvop.c(n2.m - awosVar2.a)) >= 15.0f) {
                    awosVar2.b.j = true;
                }
                awosVar2.a = n2.m;
            }
        }
    }
}
