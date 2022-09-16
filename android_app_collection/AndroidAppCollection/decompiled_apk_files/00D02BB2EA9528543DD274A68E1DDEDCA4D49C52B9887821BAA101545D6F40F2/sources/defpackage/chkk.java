package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: chkk  reason: default package */
/* loaded from: classes4.dex */
public class chkk implements chmo {
    final /* synthetic */ chkn a;

    public chkk(chkn chknVar) {
        this.a = chknVar;
    }

    @Override // defpackage.chmo
    public String a() {
        int z = this.a.z();
        if (z == 0) {
            return this.a.h.getString(R.string.TODO_PHOTO_PLACE_CARD_POST_ZERO_PHOTOS);
        }
        return this.a.h.getQuantityString(R.plurals.TODO_PHOTO_PLACE_CARD_POST_N_PHOTOS, z, Integer.valueOf(z));
    }

    @Override // defpackage.chmo
    public cqkl b(cjqm cjqmVar) {
        if (!c().booleanValue()) {
            return cqkl.a;
        }
        final chkm chkmVar = new chkm(this.a);
        chkn chknVar = this.a;
        chknVar.n = chkmVar;
        ily ilyVar = new ily();
        ilyVar.k(((dvyw) chknVar.m.b).g);
        ilo d = ilyVar.d();
        dcdd a = dcde.a();
        for (chkf chkfVar : chknVar.l) {
            if (chkfVar.f().booleanValue()) {
                try {
                    dwfl dwflVar = chkfVar.a().b;
                    if (dwflVar == null) {
                        dwflVar = dwfl.w;
                    }
                    a.b(d, bbtn.d(decs.b(dwflVar.d), dwflVar.g));
                } catch (NumberFormatException unused) {
                    bvoo.h("Photo id parsing failure in supposedly validated photo", new Object[0]);
                }
            }
        }
        dcde a2 = a.a();
        chkn chknVar2 = this.a;
        buqs buqsVar = chknVar2.f;
        int l = a2.l();
        djgx bZ = djhq.j.bZ();
        dhpj dhpjVar = dhpj.THANKS_PAGE;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djhq djhqVar = (djhq) bZ.b;
        djhqVar.c = dhpjVar.d;
        djhqVar.a |= 2;
        djgw a3 = chiw.a();
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djhq djhqVar2 = (djhq) bZ.b;
        a3.getClass();
        djhqVar2.b = a3;
        djhqVar2.a |= 1;
        djhi bZ2 = djhj.d.bZ();
        djha bZ3 = djhd.e.bZ();
        String str = ((dvyw) chknVar2.m.b).g;
        if (bZ3.c) {
            bZ3.bF();
            bZ3.c = false;
        }
        djhd djhdVar = (djhd) bZ3.b;
        str.getClass();
        int i = djhdVar.a | 1;
        djhdVar.a = i;
        djhdVar.b = str;
        djhdVar.a = i | 2;
        djhdVar.c = l;
        bZ2.a(bZ3);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        djhq djhqVar3 = (djhq) bZ.b;
        djhj bK = bZ2.bK();
        bK.getClass();
        djhqVar3.e = bK;
        djhqVar3.a |= 8;
        buqsVar.b(bZ.bK(), chkmVar, this.a.e);
        this.a.i.j(a2, dcax.a, dwyd.PUBLISH_PRIVATE_PHOTO_IN_THANKS_PAGE, this.a.l.size() - a2.l(), cjqmVar, chkmVar);
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable(chkmVar) { // from class: chkj
            private final chkm a;

            {
                this.a = chkmVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                chkm chkmVar2 = this.a;
                chkmVar2.a = true;
                chkmVar2.c();
            }
        }, 500L);
        cqkx.p(this.a);
        return cqkl.a;
    }

    @Override // defpackage.chmo
    public Boolean c() {
        chkn chknVar = this.a;
        boolean z = false;
        if (!((chif) chknVar.k.b).c && chknVar.n == null && chknVar.z() > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.chmo
    public String d() {
        int z = this.a.z();
        if (z == 0) {
            chkn chknVar = this.a;
            return chknVar.h.getString(R.string.TODO_PHOTO_ACCESSIBILITY_PLACE_CARD_POST_ZERO_PHOTOS, ((dvyw) chknVar.m.b).i);
        }
        return this.a.h.getQuantityString(R.plurals.TODO_PHOTO_ACCESSIBILITY_PLACE_CARD_POST_N_PHOTOS_FOR_PLACE, z, Integer.valueOf(z), ((dvyw) this.a.m.b).i);
    }

    @Override // defpackage.chmo
    public cjtd e() {
        cjta b = cjtd.b();
        b.g(this.a.b.d());
        b.d = dtyc.A;
        return b.a();
    }
}
