package defpackage;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: PG */
/* renamed from: elj  reason: default package */
/* loaded from: classes3.dex */
public final class elj extends ajsl {
    public final Context a;
    public final View b;
    public final GradientDrawable c;
    public final aafo d;
    public final yrj e;
    public final aagi f;
    public final asjj g;
    public final asjj h;
    public ajrm i;
    public acti j;
    public apst k;
    eli l;
    private final ajmy m;
    private final akfb n;
    private final ajmu o;
    private final View p;
    private final ImageView q;
    private final TextView r;
    private final axnm s;
    private final View t;
    private aypg u;

    public elj(Context context, ajmy ajmyVar, aafo aafoVar, akfb akfbVar, yrj yrjVar, aagi aagiVar, akem akemVar, axnm axnmVar) {
        this.a = context;
        ajmyVar.getClass();
        this.m = ajmyVar;
        akfbVar.getClass();
        this.n = akfbVar;
        this.d = aafoVar;
        this.e = yrjVar;
        this.f = aagiVar;
        axnmVar.getClass();
        this.s = axnmVar;
        aafoVar.getClass();
        View inflate = LayoutInflater.from(context).inflate(R.layout.channel_list_sub_menu_avatar, (ViewGroup) null);
        this.p = inflate;
        this.r = (TextView) inflate.findViewById(R.id.channel_avatar_title);
        this.q = (ImageView) inflate.findViewById(R.id.channel_avatar);
        View findViewById = inflate.findViewById(R.id.channel_status);
        this.b = findViewById;
        this.c = (GradientDrawable) findViewById.getBackground();
        this.t = inflate.findViewById(R.id.channel_info);
        ajmt a = ajmu.a();
        a.b(2131232143);
        this.o = a.a();
        this.l = eli.DEFAULT;
        this.g = k(2);
        this.h = k(3);
        akemVar.b(inflate, akemVar.a(inflate, null));
    }

    private final void g() {
        apst apstVar = this.k;
        if (apstVar != null && (apstVar.b & 1024) != 0) {
            ((akfw) this.s.get()).g(this.k.k);
        }
        this.j = null;
        this.k = null;
        aypg aypgVar = this.u;
        if (aypgVar != null) {
            ayqi.c((AtomicReference) aypgVar);
            this.u = null;
        }
    }

    private static boolean h(apst apstVar) {
        int h;
        return apstVar.qn(apsr.b) && (h = apwt.h(((apsu) apstVar.qm(apsr.b)).b)) != 0 && h == 3;
    }

    private static boolean j(apst apstVar) {
        int h;
        return apstVar.qn(apsr.b) && (h = apwt.h(((apsu) apstVar.qm(apsr.b)).b)) != 0 && h == 4;
    }

    private static asjj k(int i) {
        aopa createBuilder = asjj.a.createBuilder();
        aopa createBuilder2 = asja.a.createBuilder();
        createBuilder2.copyOnWrite();
        asja asjaVar = (asja) createBuilder2.instance;
        asjaVar.c = i - 1;
        asjaVar.b |= 1;
        createBuilder.copyOnWrite();
        asjj asjjVar = (asjj) createBuilder.instance;
        asja asjaVar2 = (asja) createBuilder2.mo39build();
        asjaVar2.getClass();
        asjjVar.m = asjaVar2;
        asjjVar.b |= 32768;
        return (asjj) createBuilder.mo39build();
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.p;
    }

    @Override // defpackage.ajsl
    public final /* bridge */ /* synthetic */ void d(final ajrs ajrsVar, Object obj) {
        int dimensionPixelSize;
        int dimensionPixelSize2;
        int i;
        int i2;
        final apsx apsxVar;
        argj argjVar;
        arag aragVar;
        final apst apstVar = (apst) obj;
        g();
        this.k = apstVar;
        this.j = ajrsVar.a;
        View view = this.p;
        if (j(apstVar)) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_larger_width);
        } else if (h(apstVar)) {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_large_width);
        } else {
            dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_small_width);
        }
        zgd.v(view, dimensionPixelSize, -2);
        boolean j = j(apstVar);
        if (j(apstVar)) {
            dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_larger_avatar_size);
        } else if (h(apstVar)) {
            dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_large_avatar_size);
        } else {
            dimensionPixelSize2 = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_small_avatar_size);
        }
        int i3 = 0;
        zgd.t(this.q, zgd.b(zgd.s(dimensionPixelSize2, dimensionPixelSize2), zgd.p(j ? this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_larger_avatar_top_margin) : 0)), ViewGroup.MarginLayoutParams.class);
        if (j) {
            i = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_larger_status_margin);
            i2 = this.a.getResources().getDimensionPixelSize(R.dimen.channel_list_sub_menu_container_larger_status_margin);
        } else {
            i = 0;
            i2 = 0;
        }
        zgd.t(this.b, zgd.b(zgd.k(i), zgd.e(i2)), ViewGroup.MarginLayoutParams.class);
        TextView textView = this.r;
        if (true != j) {
            i3 = 8;
        }
        textView.setVisibility(i3);
        String str = null;
        String str2 = "";
        if (j(apstVar)) {
            TextView textView2 = this.r;
            if ((apstVar.b & 256) != 0) {
                aragVar = apstVar.j;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView2.setText(ajgl.b(aragVar));
        } else {
            this.r.setText(str2);
        }
        ajmy ajmyVar = this.m;
        ImageView imageView = this.q;
        avhn avhnVar = apstVar.e;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.k(imageView, avhnVar, this.o);
        ImageView imageView2 = this.q;
        aovs aovsVar = apstVar.h;
        if (aovsVar == null) {
            aovsVar = aovs.a;
        }
        aovr aovrVar = aovsVar.c;
        if (aovrVar == null) {
            aovrVar = aovr.a;
        }
        if ((aovrVar.b & 2) != 0) {
            aovs aovsVar2 = apstVar.h;
            if (aovsVar2 == null) {
                aovsVar2 = aovs.a;
            }
            aovr aovrVar2 = aovsVar2.c;
            if (aovrVar2 == null) {
                aovrVar2 = aovr.a;
            }
            str = aovrVar2.c;
        }
        imageView2.setContentDescription(str);
        if (!(apstVar.c == 10 ? (String) apstVar.d : str2).isEmpty()) {
            aagh c = this.f.c();
            if (apstVar.c == 10) {
                str2 = (String) apstVar.d;
            }
            apjw apjwVar = (apjw) c.f(str2).g(apjw.class).W();
            if (apjwVar == null) {
                apsxVar = apsx.CHANNEL_STATUS_UNKNOWN;
            } else {
                apsxVar = apjwVar.getStatus();
            }
        } else {
            apsxVar = apsx.CHANNEL_STATUS_UNKNOWN;
        }
        elk.a(this.b, this.c, apsxVar, this.a.getResources());
        if ((apstVar.b & 128) != 0) {
            akfb akfbVar = this.n;
            apss apssVar = apstVar.i;
            if (apssVar == null) {
                apssVar = apss.a;
            }
            if (apssVar.b == 102716411) {
                argjVar = (argj) apssVar.c;
            } else {
                argjVar = argj.a;
            }
            akfbVar.b(argjVar, this.p, apstVar, ajrsVar.a);
        }
        if ((apstVar.b & 1024) != 0) {
            ((akfw) this.s.get()).d(apstVar.k, this.p);
        }
        this.i = (ajrm) ajrsVar.c("CHANNEL_LIST_SUB_MENU_AVATAR_ON_CLICK_INTERCEPT_KEY");
        this.p.setOnClickListener(new View.OnClickListener() { // from class: elg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                elj eljVar = elj.this;
                apst apstVar2 = apstVar;
                apsx apsxVar2 = apsxVar;
                ajrs ajrsVar2 = ajrsVar;
                ajrm ajrmVar = eljVar.i;
                if ((ajrmVar == null || !ajrmVar.h(view2)) && (apstVar2.b & 8) != 0) {
                    if (apsxVar2 == apsx.CHANNEL_STATUS_UNREAD && eljVar.e.o()) {
                        apsx apsxVar3 = apsx.CHANNEL_STATUS_UNKNOWN;
                        aagh c2 = eljVar.f.c();
                        apjw apjwVar2 = (apjw) c2.b(apstVar2.c == 10 ? (String) apstVar2.d : "");
                        if (apjwVar2 != null) {
                            aahb c3 = ((aagu) c2).c();
                            apjv e = apjwVar2.e();
                            aopa aopaVar = e.a;
                            aopaVar.copyOnWrite();
                            apjx apjxVar = (apjx) aopaVar.instance;
                            apjx apjxVar2 = apjx.a;
                            apjxVar.d = apsxVar3.d;
                            apjxVar.b |= 2;
                            c3.j(e);
                            c3.b();
                        }
                        elk.a(eljVar.b, eljVar.c, apsx.CHANNEL_STATUS_UNKNOWN, eljVar.a.getResources());
                    }
                    HashMap hashMap = new HashMap(1);
                    hashMap.put("sectionListController", ajrsVar2.c("sectionListController"));
                    aafo aafoVar = eljVar.d;
                    apzg apzgVar = apstVar2.f;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    aafoVar.c(apzgVar, hashMap);
                }
            }
        });
        f((eli) ajrsVar.d("CHANNEL_LIST_SUB_MENU_AVATAR_CURRENT_STATE_KEY", eli.DEFAULT));
        ayoi ayoiVar = (ayoi) ajrsVar.c("CHANNEL_LIST_SUB_MENU_AVATAR_STATE_CHANGED_OBSERVABLE_KEY");
        if (ayoiVar != null) {
            this.u = ayoiVar.at(new ayqb() { // from class: elh
                @Override // defpackage.ayqb
                public final void a(Object obj2) {
                    apst apstVar2;
                    elj eljVar = elj.this;
                    eli eliVar = (eli) obj2;
                    eli eliVar2 = eljVar.l;
                    if (!eljVar.f(eliVar) || eljVar.j == null || (apstVar2 = eljVar.k) == null || (apstVar2.b & 32) == 0) {
                        return;
                    }
                    if (eliVar2 != eli.SELECTED && eliVar != eli.SELECTED) {
                        return;
                    }
                    eljVar.j.w(new acte(eljVar.k.g.I()), eljVar.l == eli.SELECTED ? eljVar.g : eljVar.h);
                }
            }, dzq.e);
        }
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((apst) obj).g.I();
    }

    public final boolean f(eli eliVar) {
        if (eliVar == this.l) {
            return false;
        }
        eli eliVar2 = eli.DEFAULT;
        int ordinal = eliVar.ordinal();
        if (ordinal == 0) {
            this.t.setAlpha(1.0f);
            this.t.setBackground(null);
        } else if (ordinal == 1) {
            this.t.setAlpha(1.0f);
            this.t.setBackgroundColor(akeq.a(this.a, avgg.THEME_ATTRIBUTE_SUGGESTED_ACTION, 0));
        } else if (ordinal == 2) {
            this.t.setAlpha(0.3f);
            this.t.setBackground(null);
        }
        this.l = eliVar;
        return true;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        g();
    }
}
