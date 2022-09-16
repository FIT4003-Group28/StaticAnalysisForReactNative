package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kcb  reason: default package */
/* loaded from: classes3.dex */
public final class kcb implements ffu, ahwy {
    private CharSequence A;
    public final acti a;
    public final Resources b;
    public final Rect c;
    public final aafo d;
    public boolean e;
    public boolean f;
    public CharSequence g;
    public CharSequence h;
    public CharSequence i;
    public final yye j;
    public final yye k;
    public final yye l;
    public final yye m;
    public final yye n;
    private final aypf o = new aypf();
    private final int p;
    private final ahwz q;
    private final boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private int v;
    private boolean w;
    private CharSequence x;
    private boolean y;
    private StringBuilder z;

    public kcb(yye yyeVar, yye yyeVar2, yye yyeVar3, yye yyeVar4, yye yyeVar5, ahwz ahwzVar, final kbd kbdVar, final acti actiVar, aafo aafoVar, axxu axxuVar) {
        this.j = yyeVar3;
        this.k = yyeVar;
        this.l = yyeVar2;
        this.m = yyeVar4;
        this.n = yyeVar5;
        this.a = actiVar;
        this.d = aafoVar;
        Resources resources = ((TextView) yyeVar.b).getResources();
        this.b = resources;
        this.c = new Rect();
        this.q = ahwzVar;
        this.p = resources.getDimensionPixelSize(R.dimen.player_live_video_current_time_right_margin);
        this.r = axxuVar.a().booleanValue();
        this.s = true;
        this.v = 0;
        yyeVar3.a(this.u, false);
        lj.M(yyeVar4.b, new kca(this));
        yyeVar4.b.setOnClickListener(new View.OnClickListener() { // from class: kbx
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kcb kcbVar = kcb.this;
                kbd kbdVar2 = kbdVar;
                acti actiVar2 = actiVar;
                kcbVar.f = !kcbVar.f;
                kcbVar.h();
                kbdVar2.g();
                aopa createBuilder = asjj.a.createBuilder();
                aopa createBuilder2 = asjq.a.createBuilder();
                boolean z = kcbVar.f;
                createBuilder2.copyOnWrite();
                asjq asjqVar = (asjq) createBuilder2.instance;
                asjqVar.b |= 1;
                asjqVar.c = z;
                createBuilder.copyOnWrite();
                asjj asjjVar = (asjj) createBuilder.instance;
                asjq asjqVar2 = (asjq) createBuilder2.mo39build();
                asjqVar2.getClass();
                asjjVar.v = asjqVar2;
                asjjVar.c |= 4096;
                actiVar2.H(3, new acte(actj.PLAYER_CONTROLS_CURRENT_TIME_TOGGLE_BUTTON), (asjj) createBuilder.mo39build());
            }
        });
        ahwzVar.i(aicb.CHAPTER, this);
        m(ahwzVar.a(aicb.CHAPTER));
    }

    private final void l() {
        if (p()) {
            ((TextView) this.k.b).setText((CharSequence) null);
        }
    }

    private final void m(TimelineMarker timelineMarker) {
        TimelineMarker[] m = this.q.m(aicb.CHAPTER);
        CharSequence charSequence = null;
        if (m != null && m.length > 0) {
            charSequence = this.b.getString(R.string.open_chapters_list);
        }
        if (timelineMarker != null) {
            charSequence = timelineMarker.e;
        }
        if (!TextUtils.equals(charSequence, this.A)) {
            this.A = charSequence;
            o(true);
        }
    }

    private final void n(boolean z, boolean z2) {
        if (this.s == z) {
            return;
        }
        this.s = z;
        yye yyeVar = this.j;
        boolean z3 = false;
        if (z && this.u) {
            z3 = true;
        }
        yyeVar.a(z3, z2);
        j(z2);
    }

    private final void o(boolean z) {
        boolean isEmpty = TextUtils.isEmpty(this.A);
        boolean z2 = false;
        if (!this.e && this.s && this.t && !isEmpty) {
            z2 = true;
        }
        if (z2 || isEmpty) {
            ((TextView) this.n.b).setText(this.A);
        }
        this.n.a(z2, z);
    }

    private final boolean p() {
        return this.u && this.v == 1;
    }

    private static boolean q(CharSequence charSequence, CharSequence charSequence2) {
        return TextUtils.equals(charSequence, charSequence2) || (TextUtils.isEmpty(charSequence) && TextUtils.isEmpty(charSequence2));
    }

    @Override // defpackage.ffu
    public final void a(boolean z) {
        n(false, z);
    }

    @Override // defpackage.ffu
    public final void b(boolean z) {
        if (this.w == z) {
            return;
        }
        this.w = z;
        ((TextView) this.j.b).setClickable(z);
    }

    @Override // defpackage.ahwy
    public final void c(aicb aicbVar, boolean z) {
        if (aicbVar != aicb.CHAPTER) {
            return;
        }
        m(this.q.a(aicb.CHAPTER));
    }

    @Override // defpackage.ffu
    public final void d(boolean z) {
        if (this.t == z) {
            return;
        }
        this.t = z;
        j(false);
    }

    @Override // defpackage.ffu
    public final void e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        if (!TextUtils.equals(this.x, charSequence3) || this.y != this.u) {
            this.x = charSequence3;
            this.y = this.u;
            if (this.z == null) {
                this.z = new StringBuilder();
            }
            StringBuilder sb = this.z;
            sb.delete(0, sb.length());
            if (this.y) {
                this.z.append('-');
            }
            this.z.append(charSequence3);
            TextView textView = (TextView) this.l.b;
            textView.setText(this.z);
            textView.setMinimumWidth(0);
            textView.measure(0, 0);
            ((TextView) this.l.b).setMinimumWidth(textView.getMeasuredWidth());
        }
        this.g = charSequence;
        this.h = charSequence2;
        this.i = charSequence3;
        h();
        String string = this.b.getString(R.string.total_time, charSequence3);
        if (!q(string, ((TextView) this.l.b).getText())) {
            ((TextView) this.l.b).setText(string);
        }
    }

    @Override // defpackage.ffu
    public final void f(boolean z) {
        n(true, z);
    }

    @Override // defpackage.ffu
    public final void g(boolean z) {
        int i = ((!p() || this.w) && true != z) ? 2 : 1;
        if (this.v == i) {
            return;
        }
        this.v = i;
        TextView textView = (TextView) this.j.b;
        kz.u(textView, akf.a(textView.getContext(), this.v == 1 ? R.drawable.player_live_dot : R.drawable.player_notlive_dot), null, null);
        l();
        int i2 = 0;
        int i3 = p() ? 0 : this.p;
        if (true == this.u) {
            i2 = i3;
        }
        zgd.t(this.k.b, zgd.o(i2), ViewGroup.MarginLayoutParams.class);
    }

    public final void h() {
        CharSequence charSequence;
        if (p()) {
            charSequence = null;
        } else if (this.f) {
            charSequence = this.b.getString(R.string.remaining_time, this.h);
        } else {
            charSequence = this.g;
        }
        if (!q(charSequence, ((TextView) this.k.b).getText())) {
            ((TextView) this.k.b).setText(charSequence);
        }
    }

    public final void i(ayoi ayoiVar) {
        this.o.c();
        this.o.d(ayoiVar.as(new kja(this, 1)));
    }

    public final void j(boolean z) {
        boolean z2 = this.s;
        boolean z3 = false;
        boolean z4 = z2 && this.t;
        boolean z5 = z2 && this.t && !this.u;
        boolean z6 = z2 && this.u;
        if ((z4 || z6) && k()) {
            z3 = true;
        }
        this.m.a(z3, z);
        this.a.n(new acte(actj.PLAYER_CONTROLS_CURRENT_TIME_TOGGLE_BUTTON));
        this.l.k(true != this.u ? 4 : 8);
        this.k.a(z4, z);
        this.l.a(z5, z);
        o(z);
    }

    public final boolean k() {
        return !this.e || !this.r;
    }

    @Override // defpackage.ahwy
    public final void nD(TimelineMarker timelineMarker, TimelineMarker timelineMarker2, aicb aicbVar, int i) {
        if (aicbVar != aicb.CHAPTER) {
            return;
        }
        m(timelineMarker2);
    }

    @Override // defpackage.ffu
    public final void nE(boolean z) {
        if (this.u == z) {
            return;
        }
        this.u = z;
        this.j.k(true != z ? 8 : 4);
        this.j.a(this.s && this.u, false);
        j(false);
        l();
        this.m.b.setClickable(!this.u);
        if (this.u) {
            return;
        }
        zgd.t(this.k.b, zgd.o(0), ViewGroup.MarginLayoutParams.class);
    }

    @Override // defpackage.ahwy
    public final /* synthetic */ void nw(aicb aicbVar) {
    }
}
