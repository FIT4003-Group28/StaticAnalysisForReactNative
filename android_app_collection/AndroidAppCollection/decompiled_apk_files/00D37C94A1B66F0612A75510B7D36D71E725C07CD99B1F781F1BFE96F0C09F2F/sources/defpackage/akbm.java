package defpackage;

import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akbm  reason: default package */
/* loaded from: classes.dex */
public class akbm extends akbj {
    public final TextView f;
    public final boolean g;
    public boolean h;
    public boolean i;
    public int j;
    private final ajxz k;
    private int l;
    private final int m;
    private final int n;
    private final int o;
    private final int p;
    private final int q;
    private int r;
    private boolean s;
    private final int t;

    public akbm(aafo aafoVar, ajxz ajxzVar, ajsk ajskVar, aacz aaczVar, TextView textView) {
        super(aafoVar, ajskVar, textView);
        boolean z;
        this.k = ajxzVar;
        this.f = textView;
        if (textView.getLayoutParams() != null) {
            this.l = textView.getLayoutParams().height;
        }
        this.m = textView.getGravity();
        this.n = textView.getPaddingTop();
        this.o = textView.getPaddingStart();
        this.p = textView.getResources().getDimensionPixelSize(R.dimen.button_corner_radius);
        this.q = textView.getResources().getDimensionPixelSize(R.dimen.button_outline_width);
        apyy b = aaczVar.b();
        if (b != null && (b.b & 16) != 0) {
            asxj asxjVar = b.e;
            if ((asxjVar == null ? asxj.a : asxjVar).aw) {
                z = true;
                this.g = z;
                this.j = 0;
                this.r = -1;
                this.t = -1;
                this.s = false;
            }
        }
        z = false;
        this.g = z;
        this.j = 0;
        this.r = -1;
        this.t = -1;
        this.s = false;
    }

    public static void c(TextView textView, Drawable drawable, boolean z) {
        if (z) {
            if (drawable != null) {
                zav.c(textView, drawable);
            }
            textView.setOnTouchListener(akef.c());
            return;
        }
        int orElse = zhn.j(textView.getContext(), R.attr.ytTouchResponse).orElse(0);
        if (drawable == null) {
            drawable = textView.getBackground();
        }
        akef.d(textView, orElse, 0, drawable);
    }

    private final int h(int i) {
        return gw.a(this.f.getResources(), i, this.f.getContext().getTheme());
    }

    private final int i(int i, int i2) {
        return zhn.j(this.f.getContext(), i).orElse(h(i2));
    }

    private final Drawable j(int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(h(i));
        gradientDrawable.setShape(0);
        return gradientDrawable;
    }

    private final Drawable k(int i) {
        return po.b(this.f.getContext(), i);
    }

    private final GradientDrawable l(int i) {
        return m(i, true);
    }

    private final GradientDrawable m(int i, boolean z) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(i);
        gradientDrawable.setShape(0);
        if (z) {
            gradientDrawable.setCornerRadius(this.p);
        }
        return gradientDrawable;
    }

    private final GradientDrawable n(int i, boolean z) {
        return m(zhn.j(this.f.getContext(), i).orElse(0), z);
    }

    private final GradientDrawable o(int i) {
        GradientDrawable l = l(0);
        l.setStroke(this.q, i);
        return l;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0401  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x0407  */
    @Override // defpackage.akbj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(defpackage.apoj r17, defpackage.acti r18, java.util.Map r19) {
        /*
            Method dump skipped, instructions count: 1306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.akbm.a(apoj, acti, java.util.Map):void");
    }

    public final void d(boolean z) {
        apoj apojVar = this.c;
        if (apojVar != null) {
            aopc aopcVar = (aopc) apojVar.mo52toBuilder();
            aopcVar.copyOnWrite();
            apoj apojVar2 = (apoj) aopcVar.instance;
            apojVar2.b |= 64;
            apojVar2.h = !z;
            this.c = (apoj) aopcVar.mo39build();
            this.b.setEnabled(z);
            this.b.setClickable(z);
        }
        this.f.setAlpha(true != z ? 0.5f : 1.0f);
    }

    public final void e(int i) {
        this.r = this.f.getResources().getDimensionPixelOffset(i);
    }

    public final void f() {
        this.j = 1;
    }

    public final void g() {
        this.s = true;
    }
}
