package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Handler;
import android.util.DisplayMetrics;
import android.view.ViewGroup;
import com.google.android.youtube.R;
import java.util.Iterator;
/* compiled from: PG */
/* renamed from: abja  reason: default package */
/* loaded from: classes.dex */
public final class abja implements abjd, abqa, ynl {
    public final azqb a;
    public final azqb b;
    public final abks c;
    public assn d;
    public abjb e;
    public abqb f;
    private final abje g;
    private final azqb h;
    private final azqb i;
    private final azqb j;
    private final abky k;
    private final azqb l;

    public abja(Context context, abje abjeVar, abks abksVar, abky abkyVar, yni yniVar, azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, azqb azqbVar5, azqb azqbVar6) {
        this.g = abjeVar;
        this.a = azqbVar;
        abjeVar.a(this);
        this.b = azqbVar3;
        this.h = azqbVar4;
        this.i = azqbVar5;
        this.j = azqbVar6;
        this.c = abksVar;
        this.k = abkyVar;
        this.l = azqbVar2;
        ajvv.b(context);
        yniVar.g(this);
        new abqc(this, azqbVar, abjeVar);
    }

    public final void a() {
        abiq abiqVar;
        if (this.e == null || !abse.d(this.d)) {
            return;
        }
        abiq abiqVar2 = (abiq) this.a.get();
        abiqVar2.C();
        if (this.e.b() != null) {
            this.e.b().s();
        }
        abiqVar2.w(this.e.b());
        abjb abjbVar = this.e;
        if (abjbVar.f == null) {
            abqe abqeVar = abjbVar.a;
            ViewGroup viewGroup = abjbVar.d;
            abkw abkwVar = (abkw) abqeVar.a.get();
            abkwVar.getClass();
            abjbVar.f = new abqd(abkwVar, viewGroup);
        }
        abqd abqdVar = abjbVar.f;
        abis abisVar = (abis) this.j.get();
        if (abiqVar2 != null) {
            abisVar.a = abiqVar2;
            abiqVar2.E(abisVar);
        }
        abisVar.b = abqdVar;
        abiqVar2.b.lT(abisVar);
        abko a = this.e.a();
        ((abhz) this.b.get()).c(a);
        abic abicVar = (abic) this.l.get();
        abjb abjbVar2 = this.e;
        if (abjbVar2.g == null) {
            abjbVar2.g = abjbVar2.b.a(abjbVar2.d);
        }
        abicVar.b(abjbVar2.g);
        abiy abiyVar = (abiy) this.h.get();
        abjb abjbVar3 = this.e;
        if (abjbVar3.h == null) {
            abqr abqrVar = abjbVar3.c;
            ViewGroup viewGroup2 = abjbVar3.d;
            acti actiVar = abjbVar3.e;
            Context context = (Context) abqrVar.a.get();
            context.getClass();
            ajxz ajxzVar = (ajxz) abqrVar.b.get();
            ajxzVar.getClass();
            ajmy ajmyVar = (ajmy) abqrVar.c.get();
            ajmyVar.getClass();
            aafo aafoVar = (aafo) abqrVar.d.get();
            aafoVar.getClass();
            Handler handler = (Handler) abqrVar.e.get();
            handler.getClass();
            abgz abgzVar = (abgz) abqrVar.f.get();
            abgzVar.getClass();
            ajsk ajskVar = (ajsk) abqrVar.g.get();
            ajskVar.getClass();
            abky abkyVar = (abky) abqrVar.h.get();
            abkyVar.getClass();
            aagi aagiVar = (aagi) abqrVar.i.get();
            aagiVar.getClass();
            abha abhaVar = (abha) abqrVar.j.get();
            abhaVar.getClass();
            abiqVar = abiqVar2;
            abjbVar3.h = new abqq(context, ajxzVar, ajmyVar, aafoVar, handler, abgzVar, ajskVar, abkyVar, aagiVar, abhaVar, viewGroup2, actiVar);
        } else {
            abiqVar = abiqVar2;
        }
        abiyVar.a = abjbVar3.h;
        ((abop) a).v = new abiz(this);
        abiq abiqVar3 = abiqVar;
        ((abie) this.i.get()).a = abiqVar3;
        abiqVar3.B(this.d);
        abqb abqbVar = this.f;
        if (abqbVar == null) {
            return;
        }
        b(abqbVar);
    }

    @Override // defpackage.abqa
    public final void b(abqb abqbVar) {
        int i;
        int i2;
        if (abqbVar == null) {
            return;
        }
        Context context = abqbVar.getContext();
        Resources resources = context.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        boolean y = zew.y(context);
        if (this.c.c) {
            i2 = Math.min(Math.min(displayMetrics.heightPixels, displayMetrics.widthPixels), resources.getDimensionPixelOffset(R.dimen.live_chat_overlay_purchase_dialog_container_max_width));
            i = 1;
        } else if (y) {
            i2 = abqbVar.getWidth();
            i = 8388693;
        } else {
            i = 87;
            i2 = -1;
        }
        abks abksVar = this.c;
        abksVar.a = i2;
        abksVar.b = i;
        for (abkr abkrVar : abksVar.d) {
            abkrVar.d();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, ajsa] */
    public final void c() {
        this.d = null;
        if (this.e == null) {
            return;
        }
        abhz abhzVar = (abhz) this.b.get();
        abhzVar.b();
        abhzVar.a.clear();
        abhzVar.b = null;
        abic abicVar = (abic) this.l.get();
        Iterator it = abicVar.a.iterator();
        while (it.hasNext()) {
            abow abowVar = (abow) it.next();
            abowVar.f();
            abowVar.m = null;
            abowVar.r = false;
            apzg apzgVar = abowVar.u;
            if (apzgVar != null) {
                abowVar.h.c(apzgVar, null);
            }
            abowVar.n = null;
            abowVar.p = null;
            ajru ajruVar = abowVar.o;
            if (ajruVar != 0) {
                ajruVar.qZ(abowVar.i.get());
                abowVar.o = null;
            }
            abowVar.e.setVisibility(0);
        }
        abicVar.a.clear();
        abicVar.b.clear();
        abicVar.c = null;
        abicVar.d = null;
        abicVar.e = false;
        abqq abqqVar = ((abiy) this.h.get()).a;
        if (abqqVar != null && abqqVar.t) {
            abqqVar.e(false, true, false);
        }
        abky abkyVar = this.k;
        abkyVar.a = null;
        abkyVar.d.clear();
        abkyVar.c.clear();
        abkyVar.b.clear();
        abis abisVar = (abis) this.j.get();
        abisVar.b = null;
        abiq abiqVar = (abiq) this.a.get();
        abiqVar.b.pl(abisVar);
        abiqVar.C();
        abiqVar.w(null);
    }

    @Override // defpackage.abjd
    public final void d(boolean z) {
    }

    public final void e(assn assnVar) {
        if (akzj.f(assnVar, this.d)) {
            return;
        }
        this.d = assnVar;
        a();
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        boolean z = false;
        if (i != -1) {
            if (i == 0) {
                ahgn ahgnVar = (ahgn) obj;
                if (ahgnVar.d() != aijs.FULLSCREEN && ahgnVar.d() != aijs.DEFAULT) {
                    return null;
                }
                abks abksVar = this.c;
                if (ahgnVar.d() == aijs.FULLSCREEN) {
                    z = true;
                }
                abksVar.c = z;
                b(this.f);
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{ahgn.class};
    }
}
