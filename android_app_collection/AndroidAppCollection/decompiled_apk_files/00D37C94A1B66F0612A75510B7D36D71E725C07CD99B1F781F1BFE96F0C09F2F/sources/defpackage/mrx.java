package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.rendering.ui.widget.loadingframe.LoadingFrameLayout;
import com.google.android.youtube.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: mrx  reason: default package */
/* loaded from: classes3.dex */
public final class mrx implements fqb {
    private GridLayoutManager A;
    private akbm B;
    private akbm C;
    private RecyclerView D;
    private ajsa E;
    public final ezh a;
    public final yzj b;
    public int c;
    public boolean d = false;
    public boolean e = false;
    public LoadingFrameLayout f;
    public View g;
    public final Set h;
    final Map i;
    public final Map j;
    public mrq k;
    private final Activity l;
    private final azqb m;
    private final azqb n;
    private final mrr o;
    private final fyy p;
    private final int q;
    private final int r;
    private final int s;
    private final ajsg t;
    private mrw u;
    private mrw v;
    private int w;
    private boolean x;
    private ViewGroup y;
    private ajsm z;

    public mrx(Activity activity, fqd fqdVar, azqb azqbVar, azqb azqbVar2, ezh ezhVar, mrr mrrVar, ajsg ajsgVar, fyy fyyVar, yzj yzjVar) {
        this.l = activity;
        this.m = azqbVar;
        this.n = azqbVar2;
        ezhVar.getClass();
        this.a = ezhVar;
        this.o = mrrVar;
        this.t = ajsgVar;
        fyyVar.getClass();
        this.p = fyyVar;
        yzjVar.getClass();
        this.b = yzjVar;
        fqdVar.f(this);
        this.h = new HashSet();
        this.i = new HashMap();
        this.j = new HashMap();
        fqdVar.f(this);
        this.q = activity.getResources().getDimensionPixelSize(R.dimen.topic_picker_gap_between_buttons);
        this.r = activity.getResources().getDimensionPixelSize(R.dimen.topic_picker_empty_space);
        this.s = activity.getResources().getDimensionPixelSize(R.dimen.topic_picker_after_button_gap_width);
    }

    public static final boolean k(avjp avjpVar) {
        return avjpVar == null || avjpVar.e.size() == 0;
    }

    private final void l(int i) {
        mrw mrwVar;
        int integer = this.l.getResources().getInteger(R.integer.topic_picker_row_span);
        this.w = this.l.getResources().getInteger(R.integer.topic_picker_max_number_of_topics_to_expand);
        this.x = this.l.getResources().getBoolean(R.bool.topic_picker_maintain_complete_rows_on_expansion);
        if (this.A == null) {
            this.A = new GridLayoutManager(integer, null);
        }
        if (i == 2) {
            if (this.v == null) {
                this.v = new mrw(integer);
            }
            mrwVar = this.v;
        } else {
            if (this.u == null) {
                this.u = new mrw(integer);
            }
            mrwVar = this.u;
        }
        this.A.q(integer);
        this.A.g = mrwVar;
    }

    private static final avjo m(avjm avjmVar) {
        if (avjmVar == null || avjmVar.b != 46637760) {
            return null;
        }
        return (avjo) avjmVar.c;
    }

    private static final void n(akbm akbmVar, apok apokVar, acti actiVar) {
        apoj apojVar;
        if (apokVar == null) {
            return;
        }
        if ((apokVar.b & 1) != 0) {
            apojVar = apokVar.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
        } else {
            apojVar = null;
        }
        akbmVar.b(apojVar, actiVar);
    }

    public final void a() {
        this.k = null;
        this.y.removeView(this.g);
        this.g.setVisibility(8);
        this.y.setVisibility(8);
        this.p.m(4);
    }

    public final void b() {
        this.y = zdk.b(this.l);
        View inflate = LayoutInflater.from(this.l).inflate(R.layout.topic_picker, this.y, false);
        this.g = inflate;
        inflate.setVisibility(8);
        this.f = (LoadingFrameLayout) this.g.findViewById(R.id.topic_picker_loading_layout);
        ggb ggbVar = (ggb) this.m.get();
        gga a = ggbVar.a((TextView) this.g.findViewById(R.id.finish_button));
        this.B = a;
        a.d = new mrt(this);
        gga a2 = ggbVar.a((TextView) this.g.findViewById(R.id.dismiss_button));
        this.C = a2;
        a2.d = new mrt(this, 1);
        ajqw ajqwVar = new ajqw();
        this.E = ajqwVar;
        ajqwVar.f(mry.class, (ajry) this.n.get());
        this.E.f(mru.class, mrs.a);
        this.D = (RecyclerView) this.g.findViewById(R.id.topic_container);
        l(this.l.getResources().getConfiguration().orientation);
        this.D.ag(this.A);
    }

    public final void c(String str, List list) {
        int i;
        int min;
        mry mryVar = (mry) this.i.get(str);
        int indexOf = this.z.indexOf(mryVar);
        if (indexOf < 0) {
            zep.b("Topic not found, could not complete expansion");
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (true) {
            i = 0;
            boolean z = false;
            if (!it.hasNext()) {
                break;
            }
            mry mryVar2 = (mry) it.next();
            mry mryVar3 = (mry) this.i.get(mryVar2.a());
            if (mryVar3 == null || !mryVar3.b) {
                if (mryVar3 != null) {
                    z = true;
                }
                mryVar2.e = z;
                arrayList.add(mryVar2);
            }
        }
        int i2 = this.A.b;
        int i3 = mryVar.f;
        int size = arrayList.size();
        if (this.x) {
            int i4 = this.w;
            min = Math.min(size - (size % i2), i4 - (i4 % i2));
        } else {
            min = Math.min(size, this.w);
        }
        List<mry> subList = arrayList.subList(0, min);
        int min2 = this.x ? Math.min(((((indexOf - 1) / i2) + 1) * i2) + 1, this.z.size()) : indexOf + 1;
        int i5 = i3 + 1;
        for (mry mryVar4 : subList) {
            String a = mryVar4.a();
            if (mryVar4.e) {
                this.z.remove(this.i.get(a));
                this.i.remove(a);
            }
            mryVar4.f = i5;
            this.z.add(min2 + i, mryVar4);
            this.i.put(a, mryVar4);
            i++;
        }
        int size2 = (min2 + subList.size()) - 1;
        if (this.A.K() < size2) {
            this.D.ab(size2);
        }
        mryVar.c = true;
    }

    public final void d(List list) {
        if (list.isEmpty()) {
            return;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            avjn avjnVar = (avjn) it.next();
            ArrayList arrayList = new ArrayList();
            for (avjm avjmVar : avjnVar.d) {
                avjo m = m(avjmVar);
                if (m != null) {
                    arrayList.add(new mry(m));
                }
            }
            mry mryVar = (mry) this.i.get(avjnVar.b);
            boolean z = avjnVar.c;
            if (z && mryVar == null) {
                return;
            }
            if (!z || !mryVar.g) {
                this.j.put(avjnVar.b, arrayList);
            } else {
                c(avjnVar.b, arrayList);
            }
        }
    }

    public final void e() {
        this.f.b(this.l.getApplicationContext().getString(R.string.common_error_generic), false);
    }

    public final void f(avjp avjpVar, acti actiVar) {
        arag aragVar;
        arag aragVar2;
        apok apokVar;
        this.i.clear();
        this.h.clear();
        this.j.clear();
        ajsf a = this.t.a(this.E);
        a.h(new ajsm());
        a.rZ(new lyv(actiVar, 2));
        this.z = (ajsm) a.f;
        this.D.ad(a);
        ajsm ajsmVar = this.z;
        apok apokVar2 = null;
        if ((avjpVar.b & 1) != 0) {
            aragVar = avjpVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        Spanned b = ajgl.b(aragVar);
        if ((avjpVar.b & 2) != 0) {
            aragVar2 = avjpVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        ajsmVar.add(new mru(b, ajgl.b(aragVar2)));
        for (avjm avjmVar : avjpVar.e) {
            avjo m = m(avjmVar);
            if (m != null) {
                mry mryVar = new mry(m);
                this.z.add(mryVar);
                this.i.put(mryVar.a(), mryVar);
            }
        }
        this.c = avjpVar.k;
        this.d = avjpVar.l;
        d(avjpVar.h);
        aath aathVar = (aath) this.o.a.get();
        aathVar.getClass();
        actiVar.getClass();
        this.k = new mrq(aathVar, actiVar, this);
        actiVar.D(new acte(avjpVar.i));
        actiVar.u(new acte(avjpVar.i), null);
        akbm akbmVar = this.B;
        if ((avjpVar.b & 8) != 0) {
            apokVar = avjpVar.g;
            if (apokVar == null) {
                apokVar = apok.a;
            }
        } else {
            apokVar = null;
        }
        n(akbmVar, apokVar, actiVar);
        akbm akbmVar2 = this.C;
        if ((avjpVar.b & 4) != 0 && (apokVar2 = avjpVar.f) == null) {
            apokVar2 = apok.a;
        }
        n(akbmVar2, apokVar2, actiVar);
        i();
        boolean z = avjpVar.j;
        boolean z2 = this.B.h;
        View findViewById = this.g.findViewById(R.id.topic_container_space_before_buttons);
        View findViewById2 = this.g.findViewById(R.id.topic_container_space_between_buttons);
        zgd.t(this.g.findViewById(R.id.topic_container_space_after_buttons), zgd.s(z2 ? this.r : this.s, -2), ViewGroup.LayoutParams.class);
        zfx[] zfxVarArr = new zfx[2];
        zfxVarArr[0] = zgd.s(this.r, -2);
        float f = 0.0f;
        zfxVarArr[1] = zgd.q(true != z ? 0.0f : 1.0f);
        zgd.t(findViewById, zgd.b(zfxVarArr), LinearLayout.LayoutParams.class);
        zfx[] zfxVarArr2 = new zfx[2];
        zfxVarArr2[0] = zgd.s(z ? this.q : this.r, -2);
        if (true == z) {
            f = 1.0f;
        }
        zfxVarArr2[1] = zgd.q(f);
        zgd.t(findViewById2, zgd.b(zfxVarArr2), LinearLayout.LayoutParams.class);
        if (!j()) {
            h();
        }
        this.f.a();
    }

    @Override // defpackage.fqb
    public final void g(Configuration configuration) {
        l(configuration.orientation);
    }

    public final void h() {
        if (this.g == null || this.y == null) {
            return;
        }
        this.p.h(4);
        this.g.bringToFront();
        this.g.setVisibility(0);
        this.y.setVisibility(0);
        this.y.addView(this.g);
    }

    public final void i() {
        this.B.d(!this.h.isEmpty());
    }

    public final boolean j() {
        View view = this.g;
        return view != null && view.getVisibility() == 0 && this.y.getVisibility() == 0 && this.g.getParent() == this.y;
    }
}
