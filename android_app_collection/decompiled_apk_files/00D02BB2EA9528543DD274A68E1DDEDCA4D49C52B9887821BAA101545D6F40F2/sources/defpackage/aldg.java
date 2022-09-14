package defpackage;

import android.content.res.Resources;
import android.graphics.BitmapFactory;
import java.util.List;
/* compiled from: PG */
/* renamed from: aldg  reason: default package */
/* loaded from: classes2.dex */
public final class aldg {
    public static dehn<akuh> a(final akuh akuhVar) {
        final deig d = deig.d();
        akuhVar.c(new Runnable(d, akuhVar) { // from class: aldf
            private final deig a;
            private final akuh b;

            {
                this.a = d;
                this.b = akuhVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.j(this.b);
            }
        });
        return d;
    }

    public static akuh b(Resources resources, int i, akvz akvzVar, bntp bntpVar, int i2) {
        String a = ckqa.a(BitmapFactory.decodeResource(resources, i));
        List<albt> e = albu.e(albu.b, albu.a);
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        for (albt albtVar : e) {
            dmqj bZ = dmqk.j.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmqk dmqkVar = (dmqk) bZ.b;
            dmqkVar.a |= 1024;
            dmqkVar.i = 1;
            dmsk bZ2 = dmsl.l.bZ();
            int a2 = (albtVar.a() * 8) / i2;
            if (bZ2.c) {
                bZ2.bF();
                bZ2.c = false;
            }
            dmsl dmslVar = (dmsl) bZ2.b;
            int i3 = dmslVar.a | 4;
            dmslVar.a = i3;
            dmslVar.d = a2;
            int i4 = i3 | 128;
            dmslVar.a = i4;
            dmslVar.h = 16 / i2;
            a.getClass();
            dmslVar.a = i4 | 32;
            dmslVar.g = a;
            bZ.a(bZ2);
            int i5 = bntpVar.k;
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dmqk dmqkVar2 = (dmqk) bZ.b;
            dmqkVar2.a |= 4;
            dmqkVar2.c = i5;
            dmqk bK = bZ.bK();
            dmoo dmooVar = (dmoo) dmop.h.bZ();
            int b = albtVar.b();
            if (dmooVar.c) {
                dmooVar.bF();
                dmooVar.c = false;
            }
            dmop dmopVar = (dmop) dmooVar.b;
            int i6 = 1 | dmopVar.a;
            dmopVar.a = i6;
            dmopVar.b = b;
            bK.getClass();
            dmopVar.e = bK;
            dmopVar.a = i6 | 8;
            dmqtVar.a(dmooVar);
        }
        return akvzVar.c((dmqx) dmqtVar.bK());
    }
}
