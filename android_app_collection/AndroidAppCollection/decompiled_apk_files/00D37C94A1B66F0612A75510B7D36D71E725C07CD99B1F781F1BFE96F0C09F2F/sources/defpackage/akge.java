package defpackage;

import android.graphics.Rect;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: akge  reason: default package */
/* loaded from: classes.dex */
public final class akge implements akfo, zan, zam {
    private static final int e = (int) TimeUnit.SECONDS.toMillis(12);
    private static final int f = (int) TimeUnit.SECONDS.toMillis(6);
    public zao c;
    public akfq d;
    private final akft g;
    private final akgg h;
    private View k;
    private boolean l;
    private akgc m;
    private final Rect i = new Rect();
    private final int[] j = new int[2];
    private boolean n = false;
    public final Set a = new CopyOnWriteArraySet();
    public final zgy b = new zgy(Looper.myLooper(), this);

    public akge(akft akftVar, aafo aafoVar, acth acthVar) {
        this.g = akftVar;
        this.h = new akgg(this, aafoVar, acthVar);
    }

    private final Rect l(Rect rect) {
        this.i.set(rect);
        this.k.getLocationInWindow(this.j);
        Rect rect2 = this.i;
        int[] iArr = this.j;
        rect2.offset(iArr[0], iArr[1]);
        return this.i;
    }

    private static boolean m(akfq akfqVar) {
        View view = akfqVar != null ? akfqVar.c : null;
        return view != null && view.isShown();
    }

    @Override // defpackage.akfo
    public final /* bridge */ /* synthetic */ akfp a() {
        return akfq.a();
    }

    @Override // defpackage.akfo
    public final void b(akfq akfqVar) {
        if (akfqVar == null || akfqVar != this.d) {
            return;
        }
        f();
    }

    @Override // defpackage.akfo
    public final void c(final akfq akfqVar) {
        View view = akfqVar != null ? akfqVar.c : null;
        if (view == null || zdg.e(view.getContext()) || this.d != null || i()) {
            return;
        }
        this.d = akfqVar;
        akft akftVar = this.g;
        akfp a = akfq.a();
        a.a = akfqVar.c;
        a.b = akfqVar.d;
        a.c = akfqVar.e;
        a.j(akfqVar.h);
        a.k(akfqVar.i);
        a.h(akfqVar.j);
        a.c(akfqVar.k);
        a.g(akfqVar.l);
        a.b(akfqVar.n);
        a.d(akfqVar.m);
        apoj apojVar = akfqVar.f;
        if (apojVar != null) {
            a.d = apojVar;
        } else {
            a.d = null;
        }
        apoj apojVar2 = akfqVar.g;
        if (apojVar2 != null) {
            a.e = apojVar2;
        } else {
            a.e = null;
        }
        a.h = new akfz() { // from class: akgd
            @Override // defpackage.akfz
            public final void a(int i) {
                akge akgeVar = akge.this;
                akfq akfqVar2 = akfqVar;
                akgeVar.c.d();
                akev akevVar = akfqVar2.o;
                if (akevVar != null) {
                    akevVar.le(akfqVar2, i);
                }
                akgeVar.b.a();
                for (akev akevVar2 : akgeVar.a) {
                    akevVar2.le(akfqVar2, i);
                }
            }
        };
        final akfq a2 = a.a();
        View view2 = a2.c;
        View inflate = View.inflate(view2.getContext(), R.layout.tooltip_content_view, null);
        TextView textView = (TextView) inflate.findViewById(R.id.tooltip_title);
        TextView textView2 = (TextView) inflate.findViewById(R.id.tooltip_description);
        zag.m(textView, a2.d);
        zag.m(textView2, a2.e);
        boolean z = false;
        if (textView.getVisibility() == 8) {
            zgd.t(textView2, zgd.p(0), ViewGroup.MarginLayoutParams.class);
        }
        TextView textView3 = (TextView) inflate.findViewById(R.id.action_button);
        TextView textView4 = (TextView) inflate.findViewById(R.id.dismiss_button);
        akft.a(textView3, a2.f);
        akft.a(textView4, a2.g);
        final akgc akgcVar = new akgc(inflate, view2, a2.j, a2.k, a2.i);
        akgcVar.a.f = ((Boolean) a2.n.e(false)).booleanValue();
        akftVar.b(textView3, akgcVar, a2.f, 1);
        akftVar.b(textView4, akgcVar, a2.g, 2);
        float f2 = a2.l;
        akgb akgbVar = akgcVar.a;
        akgbVar.k = f2;
        if (akgbVar.isShown()) {
            akgbVar.requestLayout();
        }
        if (a2.m.h()) {
            akgcVar.a.d(((Integer) a2.m.c()).intValue());
        }
        if (a2.h == 1) {
            z = true;
        }
        akgcVar.d(z);
        akgcVar.f(a2.q);
        akgcVar.e(new View.OnClickListener() { // from class: akfr
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                akfq akfqVar2 = akfq.this;
                akgc akgcVar2 = akgcVar;
                View.OnClickListener onClickListener = akfqVar2.p;
                if (onClickListener != null) {
                    onClickListener.onClick(view3);
                }
                akgcVar2.b(0);
            }
        });
        this.m = akgcVar;
        this.c.c(view);
    }

    public final void d(akgc akgcVar, int i) {
        if (i()) {
            akgcVar.b(i);
            if (akgcVar == this.m) {
                h();
            }
        }
        if (this.n) {
            h();
        }
    }

    @Override // defpackage.zam
    public final void e(View view) {
        if (view == null) {
            f();
        }
    }

    public final void f() {
        d(this.m, 0);
    }

    public final void g(View view) {
        if (this.l) {
            return;
        }
        this.l = true;
        this.k = view;
        zao zaoVar = new zao(view);
        this.c = zaoVar;
        zaoVar.c = this;
        zaoVar.b = this;
    }

    public final void h() {
        this.m = null;
        this.d = null;
        this.n = false;
    }

    public final boolean i() {
        akgc akgcVar = this.m;
        return akgcVar != null && akgcVar.i();
    }

    public final boolean j() {
        return this.m != null && m(this.d);
    }

    /* JADX WARN: Code restructure failed: missing block: B:124:0x015c, code lost:
        if ((r2.b & 8) == 0) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0162, code lost:
        if ((r11.b & 8192) == 0) goto L109;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.akfp k(defpackage.avjf r11) {
        /*
            Method dump skipped, instructions count: 382
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akge.k(avjf):akfp");
    }

    @Override // defpackage.zan
    public final void sa(zaj zajVar) {
        if (this.m == null) {
            return;
        }
        if (!zajVar.e() || !m(this.d)) {
            f();
        } else if (!this.m.i()) {
            akfq akfqVar = this.d;
            Rect l = l(zajVar.a);
            akev akevVar = akfqVar.o;
            if (akfqVar.a) {
                if (akevVar != null) {
                    akevVar.lf(akfqVar);
                    akevVar.le(akfqVar, 3);
                }
                for (akev akevVar2 : this.a) {
                    akevVar2.lf(akfqVar);
                    akevVar2.le(akfqVar, 3);
                }
                h();
                return;
            }
            this.m.g(l);
            int i = akfqVar.b;
            if (i != -2) {
                if (i == -1) {
                    i = f;
                } else if (i == 0) {
                    i = e;
                }
                zgy zgyVar = this.b;
                zgyVar.sendMessageDelayed(zgyVar.obtainMessage(1, this.m), i);
            }
            if (akevVar != null) {
                akevVar.lf(akfqVar);
            }
            for (akev akevVar3 : this.a) {
                akevVar3.lf(akfqVar);
            }
            this.n = true;
        } else {
            akgc akgcVar = this.m;
            akgcVar.a.c(l(zajVar.a));
            akgcVar.a.requestLayout();
            akgcVar.a.invalidate();
        }
    }
}
