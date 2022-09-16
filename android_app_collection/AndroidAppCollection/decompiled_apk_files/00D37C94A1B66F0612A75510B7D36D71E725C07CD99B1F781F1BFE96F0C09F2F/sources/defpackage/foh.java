package defpackage;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: foh  reason: default package */
/* loaded from: classes3.dex */
public final class foh implements akbi, fnt, fan {
    public final yrj a;
    public final TextView b;
    public avbh c;
    public acti d;
    private final dt e;
    private final gga f;
    private final akfb g;
    private final ajsk h;
    private final agbd i;
    private final Map j;
    private final aggb k;
    private final aagi l;
    private final boolean m;
    private final Map n;
    private avbi o;
    private avbi p;
    private aypg q;

    public foh(dt dtVar, ggb ggbVar, akfb akfbVar, yrj yrjVar, ajsk ajskVar, agbd agbdVar, aggb aggbVar, aagi aagiVar, aacz aaczVar, TextView textView) {
        this.e = dtVar;
        this.g = akfbVar;
        this.b = textView;
        this.a = yrjVar;
        this.h = ajskVar;
        this.i = agbdVar;
        this.k = aggbVar;
        this.l = aagiVar;
        gga a = ggbVar.a(textView);
        this.f = a;
        a.f();
        a.d = this;
        a.e(R.dimen.text_button_icon_padding);
        a.e = new akbh() { // from class: fof
            @Override // defpackage.akbh
            public final Map a() {
                foh fohVar = foh.this;
                HashMap hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", fohVar.d);
                return hashMap;
            }
        };
        asxj asxjVar = aaczVar.b().e;
        this.m = (asxjVar == null ? asxj.a : asxjVar).bt;
        this.n = new HashMap();
        this.j = amup.k("com.google.android.libraries.youtube.innertube.endpoint.tag", this);
    }

    private final void i() {
        f();
        this.c = null;
        this.n.clear();
        this.o = null;
        this.p = null;
        this.f.b(null, null);
        j();
    }

    private final void j() {
        aypg aypgVar = this.q;
        if (aypgVar != null && !aypgVar.e()) {
            ayqi.c((AtomicReference) this.q);
        }
        this.q = null;
    }

    @Override // defpackage.fan
    public final void b(agbc agbcVar) {
        if (!agbcVar.a || !agbcVar.b || !agbcVar.c) {
            if (this.n.containsKey(Integer.valueOf(this.c.e))) {
                g(this.c.e);
                return;
            }
        }
        g(this.c.d);
    }

    @Override // defpackage.fnt
    public final void c() {
        avbi avbiVar = this.p;
        if (avbiVar != null) {
            g(avbiVar.c);
            this.p = null;
        }
    }

    @Override // defpackage.fnt
    public final void d() {
        this.p = null;
    }

    public final void e() {
        dt dtVar = this.e;
        ylx.n(dtVar, this.i.b(dtVar), etg.d, new zdt() { // from class: foe
            @Override // defpackage.zdt
            public final void a(Object obj) {
                foh.this.b((agbc) obj);
            }
        });
    }

    public final void f() {
        this.b.setVisibility(8);
    }

    public final void g(int i) {
        apoj apojVar;
        if (this.p == null) {
            this.p = this.o;
        }
        avbi avbiVar = (avbi) this.n.get(Integer.valueOf(i));
        this.o = avbiVar;
        if (avbiVar != null && (avbiVar.b & 4) != 0) {
            avbj avbjVar = avbiVar.e;
            if (avbjVar == null) {
                avbjVar = avbj.a;
            }
            if (avbjVar.b == 65153809) {
                gga ggaVar = this.f;
                avbj avbjVar2 = this.o.e;
                if (avbjVar2 == null) {
                    avbjVar2 = avbj.a;
                }
                if (avbjVar2.b == 65153809) {
                    apojVar = (apoj) avbjVar2.c;
                } else {
                    apojVar = apoj.a;
                }
                ggaVar.a(apojVar, this.d, this.j);
                return;
            }
        }
        i();
    }

    public final void h(avbh avbhVar, acti actiVar) {
        argj argjVar;
        this.c = avbhVar;
        this.d = actiVar;
        if (avbhVar == null) {
            i();
            return;
        }
        if (actiVar != null) {
            if (this.m) {
                actiVar.D(new acte(avbhVar.i));
            }
            actiVar.u(new acte(avbhVar.i), null);
        }
        this.o = null;
        this.p = null;
        this.n.clear();
        for (avbi avbiVar : this.c.c) {
            this.n.put(Integer.valueOf(avbiVar.c), avbiVar);
        }
        j();
        if (this.c.f.size() > 0) {
            ArrayList arrayList = new ArrayList();
            for (String str : this.c.f) {
                arrayList.add(this.l.c().h(str, true));
            }
            this.q = ayoi.Q(arrayList).J(ayrb.a).X(aypa.a()).I(efx.l).V(dzy.t).k(avbe.class).as(new ayqb() { // from class: fog
                @Override // defpackage.ayqb
                public final void a(Object obj) {
                    foh fohVar = foh.this;
                    if (((avbe) obj).getState() == avbg.SUBSCRIPTION_NOTIFICATION_SETTING_STATE_DISABLED) {
                        fohVar.g(fohVar.c.e);
                    } else {
                        fohVar.e();
                    }
                }
            });
        }
        e();
        argl arglVar = avbhVar.g;
        if (arglVar == null) {
            arglVar = argl.a;
        }
        if (arglVar.b == 102716411) {
            akfb akfbVar = this.g;
            argl arglVar2 = avbhVar.g;
            if (arglVar2 == null) {
                arglVar2 = argl.a;
            }
            if (arglVar2.b == 102716411) {
                argjVar = (argj) arglVar2.c;
            } else {
                argjVar = argj.a;
            }
            akfbVar.b(argjVar, this.b, avbhVar, actiVar);
        }
        this.h.a(avbhVar, this.b);
    }

    @Override // defpackage.akbi
    public final void oL(aopc aopcVar) {
        avbh avbhVar;
        int i;
        int i2;
        ji jiVar;
        arag aragVar;
        ViewGroup viewGroup;
        avbh avbhVar2;
        acti actiVar = this.d;
        ViewGroup viewGroup2 = null;
        if (actiVar != null && (avbhVar2 = this.c) != null && (avbhVar2.b & 128) != 0) {
            actiVar.H(3, new acte(avbhVar2.i), null);
        }
        if (this.o == null || !this.a.o()) {
            return;
        }
        g(this.o.d);
        final aggb aggbVar = this.k;
        avbh avbhVar3 = this.c;
        int i3 = this.o.c;
        final TextView textView = this.b;
        ji jiVar2 = new ji() { // from class: fod
            @Override // defpackage.ji
            public final void accept(Object obj) {
                apoj apojVar;
                apoj apojVar2;
                foh fohVar = foh.this;
                avbi avbiVar = (avbi) obj;
                if (fohVar.d != null && (avbiVar.b & 4) != 0) {
                    avbj avbjVar = avbiVar.e;
                    if (avbjVar == null) {
                        avbjVar = avbj.a;
                    }
                    if (avbjVar.b == 65153809) {
                        avbj avbjVar2 = avbiVar.e;
                        if (avbjVar2 == null) {
                            avbjVar2 = avbj.a;
                        }
                        if (avbjVar2.b == 65153809) {
                            apojVar = (apoj) avbjVar2.c;
                        } else {
                            apojVar = apoj.a;
                        }
                        if ((apojVar.b & 1048576) != 0) {
                            acti actiVar2 = fohVar.d;
                            avbj avbjVar3 = avbiVar.e;
                            if (avbjVar3 == null) {
                                avbjVar3 = avbj.a;
                            }
                            if (avbjVar3.b == 65153809) {
                                apojVar2 = (apoj) avbjVar3.c;
                            } else {
                                apojVar2 = apoj.a;
                            }
                            actiVar2.H(3, new acte(apojVar2.t), null);
                        }
                    }
                }
                if (fohVar.a.o()) {
                    fohVar.g(avbiVar.c);
                }
            }
        };
        final acti actiVar2 = this.d;
        int ax = akel.ax(avbhVar3.h);
        if (ax == 0 || ax != 3) {
            return;
        }
        aggbVar.a();
        final ViewGroup viewGroup3 = (ViewGroup) View.inflate(aggbVar.a, R.layout.notification_bell_inline_menu, null);
        int i4 = -1;
        int i5 = 0;
        while (i5 < avbhVar3.c.size()) {
            final avbi avbiVar = (avbi) avbhVar3.c.get(i5);
            aunb aunbVar = avbiVar.f;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            if (!aunbVar.qn(ButtonRendererOuterClass.buttonRenderer)) {
                viewGroup = viewGroup2;
                i = i5;
                avbhVar = avbhVar3;
                i2 = i3;
                jiVar = jiVar2;
            } else {
                aunb aunbVar2 = avbiVar.f;
                if (aunbVar2 == null) {
                    aunbVar2 = aunb.a;
                }
                apoj apojVar = (apoj) aunbVar2.qm(ButtonRendererOuterClass.buttonRenderer);
                final View inflate = View.inflate(aggbVar.a, R.layout.notification_bell_inline_menu_item, viewGroup2);
                boolean z = avbiVar.c == i3;
                akbj a = aggbVar.c.a(inflate);
                a.b(apojVar, actiVar2);
                a.e = new akbh() { // from class: agfw
                    @Override // defpackage.akbh
                    public final Map a() {
                        acti actiVar3 = acti.this;
                        HashMap hashMap = new HashMap();
                        hashMap.put("com.google.android.libraries.youtube.logging.interaction_logger", actiVar3);
                        return hashMap;
                    }
                };
                avbhVar = avbhVar3;
                int i6 = i4;
                i = i5;
                final boolean z2 = z;
                final ji jiVar3 = jiVar2;
                i2 = i3;
                jiVar = jiVar2;
                a.d = new akbi() { // from class: agfx
                    @Override // defpackage.akbi
                    public final void oL(aopc aopcVar2) {
                        final aggb aggbVar2 = aggb.this;
                        View view = inflate;
                        ViewGroup viewGroup4 = viewGroup3;
                        final boolean z3 = z2;
                        final ji jiVar4 = jiVar3;
                        final avbi avbiVar2 = avbiVar;
                        if (aggbVar2.g) {
                            return;
                        }
                        aggbVar2.g = true;
                        int intValue = ((Integer) view.getTag()).intValue();
                        for (int i7 = 0; i7 < viewGroup4.getChildCount(); i7++) {
                            View childAt = viewGroup4.getChildAt(i7);
                            aggbVar2.b(childAt, ((Integer) childAt.getTag()).intValue() == intValue);
                        }
                        viewGroup4.postDelayed(new Runnable() { // from class: agga
                            @Override // java.lang.Runnable
                            public final void run() {
                                aggb aggbVar3 = aggb.this;
                                boolean z4 = z3;
                                ji jiVar5 = jiVar4;
                                avbi avbiVar3 = avbiVar2;
                                aggbVar3.a();
                                if (!z4) {
                                    jiVar5.accept(avbiVar3);
                                }
                            }
                        }, 500L);
                    }
                };
                TextView textView2 = (TextView) inflate.findViewById(R.id.text);
                if ((apojVar.b & 256) != 0) {
                    aragVar = apojVar.i;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                textView2.setText(ajgl.b(aragVar));
                arhs arhsVar = apojVar.g;
                if (arhsVar == null) {
                    arhsVar = arhs.a;
                }
                if ((arhsVar.b & 1) != 0) {
                    ajxz ajxzVar = aggbVar.b;
                    arhs arhsVar2 = apojVar.g;
                    if (arhsVar2 == null) {
                        arhsVar2 = arhs.a;
                    }
                    arhr b = arhr.b(arhsVar2.c);
                    if (b == null) {
                        b = arhr.UNKNOWN;
                    }
                    int a2 = ajxzVar.a(b);
                    if (a2 != 0) {
                        ((ImageView) inflate.findViewById(R.id.icon)).setImageResource(a2);
                    }
                }
                if (z) {
                    i4 = viewGroup3.getChildCount();
                    aggbVar.b(inflate, true);
                } else {
                    i4 = i6;
                }
                viewGroup3.addView(inflate);
                inflate.setTag(Integer.valueOf(avbiVar.c));
                viewGroup = null;
                actiVar2.u(new acte(apojVar.t), null);
            }
            i5 = i + 1;
            avbhVar3 = avbhVar;
            viewGroup2 = viewGroup;
            jiVar2 = jiVar;
            i3 = i2;
        }
        ViewGroup viewGroup4 = viewGroup2;
        if (i4 == -1) {
            zep.b("Could not find the index of the selected state in the model!");
            return;
        }
        viewGroup3.measure(View.MeasureSpec.makeMeasureSpec(zew.l(aggbVar.a), CellularSignalStrengthError.ERROR_NOT_SUPPORTED), View.MeasureSpec.makeMeasureSpec(zew.j(aggbVar.a), CellularSignalStrengthError.ERROR_NOT_SUPPORTED));
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            i7 += viewGroup3.getChildAt(i8).getMeasuredHeight();
        }
        aggbVar.f = new PopupWindow((View) viewGroup3, -2, -2, true);
        aggbVar.f.setElevation(zew.i(aggbVar.a.getResources().getDisplayMetrics(), 4));
        aggbVar.f.setBackgroundDrawable(new ColorDrawable(zhn.d(aggbVar.a, R.attr.ytBrandBackgroundSolid)));
        aggbVar.f.setOutsideTouchable(true);
        aggbVar.f.setAnimationStyle(16973826);
        int[] iArr = new int[2];
        textView.getLocationOnScreen(iArr);
        Point point = new Point(iArr[0], iArr[1]);
        int i9 = point.x;
        int measuredWidth = viewGroup3.getMeasuredWidth();
        int width = textView.getWidth();
        int paddingEnd = textView.getPaddingEnd();
        int paddingEnd2 = viewGroup3.getChildAt(0).getPaddingEnd();
        final int height = (point.y - i7) + ((textView.getHeight() - viewGroup3.getChildAt(0).getMeasuredHeight()) / 2);
        final int measuredHeight = viewGroup3.getMeasuredHeight();
        final int i10 = (((i9 - measuredWidth) + width) - paddingEnd) + paddingEnd2;
        final ji jiVar4 = new ji() { // from class: agfv
            @Override // defpackage.ji
            public final void accept(Object obj) {
                aggb aggbVar2 = aggb.this;
                View view = textView;
                int i11 = i10;
                Integer num = (Integer) obj;
                PopupWindow popupWindow = aggbVar2.f;
                if (popupWindow == null) {
                    return;
                }
                popupWindow.showAtLocation(view, 0, i11, num.intValue());
            }
        };
        Window window = ((Activity) aggbVar.a).getWindow();
        final ViewGroup decorView = window != null ? window.getDecorView() : viewGroup4;
        if (decorView == null) {
            aggbVar.e.execute(new agfy(jiVar4, height, 1));
        } else {
            aggbVar.d.execute(new Runnable() { // from class: agfz
                @Override // java.lang.Runnable
                public final void run() {
                    aggb aggbVar2 = aggb.this;
                    View view = decorView;
                    int i11 = height;
                    int i12 = measuredHeight;
                    ji jiVar5 = jiVar4;
                    Rect rect = new Rect();
                    view.getWindowVisibleDisplayFrame(rect);
                    int i13 = rect.top;
                    if (i11 < i13) {
                        i11 = i13;
                    }
                    if (i11 + i12 > rect.bottom) {
                        i11 = rect.bottom - i12;
                    }
                    aggbVar2.e.execute(new agfy(jiVar5, i11));
                }
            });
        }
    }
}
