package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jxc  reason: default package */
/* loaded from: classes3.dex */
public final class jxc extends jxh implements feg {
    public final Rect a;
    public int b;
    public int c;
    private final ajmy i;
    private final fgc j;
    private final jwo k;
    private final aypf l;
    private final int m;
    private final aadd n;
    private ViewGroup o;
    private ProgressBar p;
    private ImageView q;
    private View r;
    private View s;
    private View t;
    private View u;
    private boolean v;
    private auaz w;
    private boolean x;

    public jxc(Context context, ajmy ajmyVar, aadd aaddVar, fgc fgcVar, feh fehVar, jwo jwoVar) {
        super(context);
        ajmyVar.getClass();
        this.i = ajmyVar;
        this.n = aaddVar;
        fgcVar.getClass();
        this.j = fgcVar;
        jwoVar.getClass();
        this.k = jwoVar;
        this.a = new Rect();
        this.l = new aypf();
        fehVar.a(this);
        this.m = context.getResources().getDimensionPixelSize(R.dimen.autonav_top_bar_background_height);
    }

    private final void o() {
        auaz auazVar;
        if (this.v || this.q.getVisibility() != 0 || (auazVar = this.w) == null) {
            return;
        }
        ajmy ajmyVar = this.i;
        ImageView imageView = this.q;
        avhn avhnVar = auazVar.j;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        this.v = true;
    }

    private final void p() {
        zgd.t(this.u, zgd.h(this.k.a() + this.a.bottom), ViewGroup.LayoutParams.class);
    }

    @Override // defpackage.ahyl
    public final View a(Context context) {
        boolean z = false;
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.lite_autonav_overlay, (ViewGroup) null, false);
        this.o = (ViewGroup) viewGroup.findViewById(R.id.core_container);
        this.p = (ProgressBar) viewGroup.findViewById(R.id.pip_countdown);
        this.q = (ImageView) viewGroup.findViewById(R.id.mini_thumbnail);
        this.r = viewGroup.findViewById(R.id.pip_background);
        this.s = viewGroup.findViewById(R.id.background);
        this.t = viewGroup.findViewById(R.id.top_bar_background);
        this.u = viewGroup.findViewById(R.id.bottom_bar_background);
        this.k.b(this, this.o);
        this.k.f(this.x);
        View view = this.u;
        if (this.k.a() > 0) {
            z = true;
        }
        zag.o(view, z);
        p();
        this.o.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: jxa
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                jxc jxcVar = jxc.this;
                int i9 = i4 - i2;
                int i10 = i3 - i;
                if (i9 == jxcVar.b && i10 == jxcVar.c) {
                    return;
                }
                jxcVar.b = i9;
                jxcVar.c = i10;
                jxcVar.Y(22);
            }
        });
        return viewGroup;
    }

    @Override // defpackage.jxh, defpackage.aizf
    public final ViewGroup.LayoutParams c() {
        return new aizh(-1, -1, false);
    }

    @Override // defpackage.jxh, defpackage.ahyl
    public final void d(Context context, View view) {
        boolean z = true;
        if (aa(1)) {
            auaz auazVar = this.e;
            boolean z2 = this.f;
            if (this.x != z2) {
                this.x = z2;
                this.k.f(z2);
            }
            if (!akzj.f(this.w, auazVar)) {
                this.w = auazVar;
                this.k.g(auazVar);
                this.v = false;
                o();
            }
        }
        if (aa(2)) {
            long j = this.g;
            long j2 = this.h;
            if (this.p.getVisibility() == 0) {
                this.p.setMax((int) j2);
                this.p.setProgress((int) j);
            }
            this.k.e(j, j2);
        }
        if (aa(4)) {
            ezx ezxVar = this.d;
            this.k.d(ezxVar);
            p();
            boolean k = ezxVar.k();
            boolean e = ezxVar.e();
            boolean z3 = k || e;
            zag.o(this.r, e);
            zag.o(this.p, e);
            zag.o(this.q, z3);
            o();
            boolean z4 = !z3;
            zag.o(this.s, z4);
            zag.o(this.o, z4);
            zag.o(this.t, z4);
            View view2 = this.u;
            if (this.k.a() <= 0 || z3) {
                z = false;
            }
            zag.o(view2, z);
        }
        if (aa(8)) {
            this.o.setPadding(this.a.left, this.a.top, this.a.right, this.a.bottom);
            zgd.t(this.t, zgd.h(this.m + this.a.top), ViewGroup.LayoutParams.class);
            p();
        }
        if (aa(22)) {
            this.k.c(this.c, this.b);
        }
    }

    @Override // defpackage.feg
    public final void kF() {
        this.l.c();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.jxh, defpackage.ahyf
    public final ahyk kS(Context context) {
        ahyk kS = super.kS(context);
        kS.e = true;
        kS.b = 0;
        return kS;
    }

    @Override // defpackage.jxh, defpackage.fgd
    public final boolean mY(ezx ezxVar) {
        if (!ezxVar.h() || ezxVar.e() || ezxVar == ezx.WATCH_WHILE_SLIDING_MINIMIZED_DISMISSED || ezxVar == ezx.WATCH_WHILE_SLIDING_FULLSCREEN_DISMISSED) {
            return ezxVar.e() && eog.l(this.n) > 0;
        }
        return true;
    }

    @Override // defpackage.feg
    public final void nr() {
        this.l.d(this.j.a.Z(new ayqb() { // from class: jxb
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                jxc jxcVar = jxc.this;
                Rect rect = (Rect) obj;
                if (jxcVar.a.equals(rect)) {
                    return;
                }
                jxcVar.a.set(rect);
                jxcVar.Y(8);
            }
        }));
    }
}
