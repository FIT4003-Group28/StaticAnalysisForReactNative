package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bwji  reason: default package */
/* loaded from: classes4.dex */
public final class bwji<T> extends btrh<T> {
    public bwji(Class<?> cls, T t) {
        super(cls, t);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        final bwjh bwjhVar = (bwjh) this.a;
        final bwka bwkaVar = (bwka) obj;
        bwjhVar.c.execute(new Runnable(bwjhVar, bwkaVar) { // from class: bwjg
            private final bwjh a;
            private final bwka b;

            {
                this.a = bwjhVar;
                this.b = bwkaVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bwjh bwjhVar2 = this.a;
                bwka bwkaVar2 = this.b;
                if (bwjhVar2.a().b().c) {
                    bwjhVar2.b.b();
                } else {
                    bwjhVar2.b.c();
                }
                ilo iloVar = bwkaVar2.a;
                if (iloVar == null) {
                    String str = bwkaVar2.b;
                    if (str == null) {
                        return;
                    }
                    bwjhVar2.b.e(str, bwkaVar2.c);
                    return;
                }
                int i = bwkaVar2.d;
                if (i == 2) {
                    bwjhVar2.b.f(iloVar, bwkaVar2.c);
                } else if (i == 4) {
                    bwjhVar2.b.g(iloVar, bwkaVar2.c);
                } else if (i != 6) {
                    bwjhVar2.b.d(iloVar, bwkaVar2.c);
                } else {
                    bwjhVar2.b.h(iloVar, bwkaVar2.c, bwjhVar2.d.getResources().getColor(R.color.qu_white_alpha_54));
                }
            }
        });
    }
}
