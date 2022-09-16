package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.List;
/* compiled from: PG */
/* renamed from: alfy  reason: default package */
/* loaded from: classes2.dex */
public abstract class alfy {
    final akvz a;
    final Resources b;
    final boolean c;
    final akuh d;
    final akuh e;
    final List<akuh> f = dchl.a();

    public alfy(akvz akvzVar, Resources resources, boolean z) {
        this.a = akvzVar;
        this.b = resources;
        this.c = z;
        dmqt dmqtVar = (dmqt) dmqx.e.bZ();
        dmoo dmooVar = (dmoo) dmop.h.bZ();
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar = (dmop) dmooVar.b;
        dmopVar.a |= 1;
        dmopVar.b = 0;
        dmpq bZ = dmpv.s.bZ();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar = (dmpv) bZ.b;
        dmpvVar.a |= 1;
        dmpvVar.b = -16777216;
        dmoa bZ2 = dmob.g.bZ();
        if (bZ2.c) {
            bZ2.bF();
            bZ2.c = false;
        }
        dmob dmobVar = (dmob) bZ2.b;
        int i = dmobVar.a | 4;
        dmobVar.a = i;
        dmobVar.d = 100;
        dmobVar.a = i | 1;
        dmobVar.b = 16;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dmpv dmpvVar2 = (dmpv) bZ.b;
        dmob bK = bZ2.bK();
        bK.getClass();
        dmpvVar2.e = bK;
        dmpvVar2.a |= 4;
        if (dmooVar.c) {
            dmooVar.bF();
            dmooVar.c = false;
        }
        dmop dmopVar2 = (dmop) dmooVar.b;
        dmpv bK2 = bZ.bK();
        bK2.getClass();
        dmopVar2.d = bK2;
        dmopVar2.a |= 4;
        dmqtVar.a(dmooVar);
        this.d = akvzVar.c((dmqx) dmqtVar.bK());
        dmqt dmqtVar2 = (dmqt) dmqx.e.bZ();
        dmoo dmooVar2 = (dmoo) dmop.h.bZ();
        if (dmooVar2.c) {
            dmooVar2.bF();
            dmooVar2.c = false;
        }
        dmop dmopVar3 = (dmop) dmooVar2.b;
        dmopVar3.a |= 1;
        dmopVar3.b = 0;
        dmpq bZ3 = dmpv.s.bZ();
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmpv dmpvVar3 = (dmpv) bZ3.b;
        dmpvVar3.a |= 1;
        dmpvVar3.b = -16777216;
        dmoa bZ4 = dmob.g.bZ();
        if (bZ4.c) {
            bZ4.bF();
            bZ4.c = false;
        }
        dmob dmobVar2 = (dmob) bZ4.b;
        int i2 = dmobVar2.a | 4;
        dmobVar2.a = i2;
        dmobVar2.d = 100;
        dmobVar2.a = i2 | 1;
        dmobVar2.b = 16;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        dmpv dmpvVar4 = (dmpv) bZ3.b;
        dmob bK3 = bZ4.bK();
        bK3.getClass();
        dmpvVar4.e = bK3;
        dmpvVar4.a |= 4;
        if (dmooVar2.c) {
            dmooVar2.bF();
            dmooVar2.c = false;
        }
        dmop dmopVar4 = (dmop) dmooVar2.b;
        dmpv bK4 = bZ3.bK();
        bK4.getClass();
        dmopVar4.d = bK4;
        dmopVar4.a |= 4;
        dmqtVar2.a(dmooVar2);
        this.e = akvzVar.c((dmqx) dmqtVar2.bK());
    }

    @dzsi
    public abstract akuh a(boolean z);

    @dzsi
    public abstract akuh b(boolean z);

    public abstract akuh c(amuo amuoVar);

    public final void d() {
        dcdc r;
        this.a.j(this.d);
        this.a.j(this.e);
        synchronized (this) {
            r = dcdc.r(this.f);
            this.f.clear();
        }
        int size = r.size();
        for (int i = 0; i < size; i++) {
            this.a.j((akuh) r.get(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final akuh e(amuo amuoVar, int i) {
        Drawable g;
        if (this.c) {
            g = vrv.i(amuoVar, this.b.getColor(i));
        } else {
            g = vrv.g(amuoVar, this.b.getColor(i));
        }
        int round = Math.round(this.b.getDisplayMetrics().density * 22.0f);
        akuh d = this.a.d(bvlf.c(g, round, round, Bitmap.Config.ARGB_8888));
        synchronized (this) {
            this.f.add(d);
        }
        return d;
    }
}
