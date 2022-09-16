package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: arzp  reason: default package */
/* loaded from: classes2.dex */
public final class arzp<T> extends btrh<T> {
    public arzp(Class<?> cls, T t, bvrj bvrjVar) {
        super(cls, t, bvrjVar);
    }

    @Override // defpackage.btrs
    public final void a(Object obj) {
        Drawable a;
        arzm arzmVar = (arzm) this.a;
        crqw crqwVar = ((cria) obj).a;
        if (crqwVar == null) {
            arzmVar.a.b.a();
            return;
        }
        arzn arznVar = arzmVar.a;
        if (arznVar.f) {
            return;
        }
        arzs arzsVar = arznVar.b;
        Context applicationContext = arzsVar.c.getApplicationContext();
        atxz a2 = arzsVar.f.a(crqwVar, new arzq(arzsVar), true);
        if (a2 == null) {
            arzsVar.a();
            return;
        }
        ib ibVar = new ib(arzsVar.c.getApplicationContext());
        ibVar.l(a2.x());
        ibVar.t(2131231735);
        ibVar.C = 1;
        ibVar.g = arzsVar.n;
        ibVar.y(arzs.b);
        ibVar.k = 1;
        ibVar.w = true;
        if (a2.D() != null) {
            CharSequence D = a2.D();
            if (D == null) {
                D = null;
            } else {
                int indexOf = TextUtils.indexOf(D, '\n');
                if (indexOf >= 0) {
                    D = D.subSequence(0, indexOf);
                }
            }
            ibVar.k(D);
            ia iaVar = new ia();
            iaVar.e(a2.D());
            ibVar.v(iaVar);
        }
        if (a2 instanceof atxq) {
            atxq atxqVar = (atxq) a2;
            atxw k = atxqVar.k();
            atxw T = atxqVar.T();
            if (k != null && T != null) {
                ibVar.e(2131231591, T.g().a(applicationContext).toString(), arzsVar.i);
                ibVar.e(2131231589, k.g().a(applicationContext).toString(), arzsVar.h);
            }
        }
        cqtd F = a2.F();
        if (F != null && (a = F.a(applicationContext)) != null) {
            int e = arzw.a.e(arzsVar.d.b);
            ibVar.o(bvlf.d(a, e, e, Bitmap.Config.ARGB_8888));
        }
        arzsVar.g.c(dpyv.NAVIGATION_PROMPTS.dm, ibVar, null);
        arzsVar.p = a2;
        if (ako.a()) {
            arzsVar.k.a(false);
            aujb e2 = arzsVar.l.e(dpyv.NAVIGATION_PROMPTS.dm);
            if (e2 == null) {
                return;
            }
            String b = e2.a().b(1);
            if (b != null) {
                ibVar.G = b;
            } else {
                bvoo.h("ChannelId for the prompt notification type should be non null.", new Object[0]);
                ibVar.G = "OtherChannel";
            }
        }
        arzsVar.e.d(dpyv.NAVIGATION_PROMPTS.dm, ibVar.b());
        a2.Oa();
    }
}
