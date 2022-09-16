package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: xti  reason: default package */
/* loaded from: classes4.dex */
public final class xti implements ajru, xmg {
    private final xth a;
    private final yni b;
    private final View c;
    private final LinearLayout d;
    private final xmh e;
    private final xyb f;
    private final xyd g;
    private xmd h;
    private aqbw i;
    private ajrs j;
    private final ImageView k;
    private View l;
    private View m;
    private final aacz n;

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, ajsa] */
    public xti(Context context, yni yniVar, ajmy ajmyVar, ajyi ajyiVar, xmh xmhVar, xyb xybVar, xyd xydVar, aacz aaczVar) {
        context.getClass();
        yniVar.getClass();
        this.b = yniVar;
        ajmyVar.getClass();
        this.a = new xth(context, ajyiVar.get());
        xmhVar.getClass();
        this.e = xmhVar;
        xybVar.getClass();
        this.f = xybVar;
        xydVar.getClass();
        this.g = xydVar;
        this.n = aaczVar;
        View inflate = View.inflate(context, R.layout.comment_thread, null);
        this.c = inflate;
        inflate.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        this.d = (LinearLayout) inflate.findViewById(R.id.comment_thread);
        this.k = (ImageView) inflate.findViewById(R.id.comment_divider);
    }

    private final void d(ajrs ajrsVar) {
        xth xthVar = this.a;
        xmd xmdVar = this.h;
        ajrs d = xthVar.d(ajrsVar);
        d.f("commentThreadMutator", xmdVar);
        aqbo aqboVar = ((xni) xmdVar).b.f;
        if (aqboVar == null) {
            aqboVar = aqbo.a;
        }
        aqbm aqbmVar = aqboVar.c;
        if (aqbmVar == null) {
            aqbmVar = aqbm.a;
        }
        View c = xthVar.c(d, aqbmVar);
        this.m = ((ViewGroup) c).getChildAt(0);
        this.d.addView(c);
    }

    private final void e() {
        Iterator it = this.e.a.entrySet().iterator();
        while (it.hasNext()) {
            Set set = (Set) ((Map.Entry) it.next()).getValue();
            if (set != null) {
                set.remove(this);
                if (set.isEmpty()) {
                    it.remove();
                }
            }
        }
    }

    private final void f(ajrs ajrsVar) {
        aqav aqavVar;
        View view = this.l;
        int indexOfChild = view != null ? this.d.indexOfChild(view) : -1;
        if (indexOfChild >= 0) {
            this.d.removeViewAt(indexOfChild);
        }
        xth xthVar = this.a;
        xmd xmdVar = this.h;
        aqax aqaxVar = ((xni) xmdVar).b.c;
        if (aqaxVar == null) {
            aqaxVar = aqax.a;
        }
        if (aqaxVar.b == 62285947) {
            aqax aqaxVar2 = ((xni) this.h).b.c;
            if (aqaxVar2 == null) {
                aqaxVar2 = aqax.a;
            }
            if (aqaxVar2.b == 62285947) {
                aqavVar = (aqav) aqaxVar2.c;
            } else {
                aqavVar = aqav.a;
            }
        } else {
            aqavVar = null;
        }
        ajrs d = xthVar.d(ajrsVar);
        d.f("commentThreadMutator", xmdVar);
        View c = xthVar.c(d, aqavVar);
        this.l = c;
        this.d.addView(c, indexOfChild);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.xmg
    public final void k(aqav aqavVar) {
        View view = this.m;
        if (view != null) {
            ((xtf) akel.g(view)).g(aqavVar);
        } else {
            d(this.j);
        }
    }

    @Override // defpackage.xmg
    public final void l(aqav aqavVar) {
        View view = this.m;
        if (view != null) {
            xtf xtfVar = (xtf) akel.g(view);
            int f = xtfVar.f(aqavVar);
            if (f >= 0) {
                xtfVar.c.removeViewAt(f);
            }
            xtfVar.h();
        }
    }

    @Override // defpackage.xmg
    public final void m() {
        this.b.d(aabm.b(((xni) this.h).b));
    }

    @Override // defpackage.xmg
    public final void n(aqav aqavVar, aqav aqavVar2) {
        f(this.j);
    }

    @Override // defpackage.xmg
    public final void o(aqav aqavVar, aqav aqavVar2) {
        xtf xtfVar;
        int f;
        View view = this.m;
        if (view == null || (f = (xtfVar = (xtf) akel.g(view)).f(aqavVar)) < 0) {
            return;
        }
        xtfVar.c.removeViewAt(f);
        xtfVar.c.addView(xtfVar.b.b(xtfVar.d, aqavVar2, f), f);
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        aqbw aqbwVar = (aqbw) obj;
        aqbwVar.getClass();
        this.i = aqbwVar;
        ajrsVar.getClass();
        this.j = ajrsVar;
        apzt apztVar = this.n.b().z;
        if (apztVar == null) {
            apztVar = apzt.a;
        }
        if (apztVar.b) {
            e();
        }
        aqax aqaxVar = aqbwVar.c;
        if (aqaxVar == null) {
            aqaxVar = aqax.a;
        }
        if (aqaxVar.b != 62285947) {
            this.c.setVisibility(8);
            return;
        }
        boolean z = false;
        this.c.setVisibility(0);
        if (aqbwVar.j) {
            this.k.setVisibility(8);
        }
        if (!aqbwVar.l) {
            ajrsVar.a.G(aqbwVar, aqbwVar.h, this.c);
        } else {
            ajrsVar.a.u(new acte(aqbwVar.h), null);
        }
        this.h = new xni(this.e, (ajyj) ajrsVar.c("sectionController"), aqbwVar, this.f, this.g, this.n);
        if (!aqbwVar.j) {
            this.k.setVisibility(0);
        }
        if ((aqbwVar.b & 32) != 0) {
            z = true;
        }
        ajrsVar.f("com.google.android.libraries.youtube.comment.comment_thread_has_replies_key", Boolean.valueOf(z));
        f(ajrsVar);
        aqbo aqboVar = aqbwVar.f;
        if (aqboVar == null) {
            aqboVar = aqbo.a;
        }
        if ((aqboVar.b & 1) != 0) {
            d(ajrsVar);
        }
        this.e.a(aqbwVar, this);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        aqbw aqbwVar = this.i;
        if (aqbwVar != null && aqbwVar.l) {
            this.j.a.q(new acte(aqbwVar.h), null);
        }
        apzt apztVar = this.n.b().z;
        if (apztVar == null) {
            apztVar = apzt.a;
        }
        if (apztVar.b) {
            e();
        } else {
            this.e.b(this.i, this);
        }
        this.a.e(this.d);
        this.d.removeAllViews();
        this.l = null;
        this.m = null;
        this.j = null;
    }
}
