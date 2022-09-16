package defpackage;
/* compiled from: PG */
/* renamed from: ahra  reason: default package */
/* loaded from: classes.dex */
public final class ahra<T> extends btrh<T> {
    public ahra(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        ahlb ahlbVar = (ahlb) obj;
        ahqz ahqzVar = ((ahqy) this.a).a;
        bvrj.UI_THREAD.c();
        ahqzVar.i = ahlbVar.c();
        ahqzVar.e = ahlbVar.a();
        ahqzVar.f = ahlbVar.b();
        int i = ahqzVar.g;
        ahqzVar.g = ahkk.a((int) Math.ceil(ahqzVar.f));
        if (ahqzVar.f <= 25.0f) {
            ahqzVar.g = 4;
        }
        ahqzVar.i(true);
        if (i != ahqzVar.g) {
            int i2 = ahqzVar.g;
            if (ahqzVar.h) {
                synchronized (ahqzVar.c) {
                    for (ahkh ahkhVar : ahqzVar.d.keySet()) {
                        ahkhVar.a(i2);
                    }
                }
            }
        }
        float f = ahqzVar.e;
        if (ahqzVar.h) {
            synchronized (ahqzVar.c) {
                for (ahkh ahkhVar2 : ahqzVar.d.keySet()) {
                    ahkhVar2.b(f, -1000.0f, -1.0f);
                }
            }
        }
        ahqzVar.h();
    }
}
