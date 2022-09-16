package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: ahnh  reason: default package */
/* loaded from: classes.dex */
public final class ahnh extends ahmr implements View.OnLayoutChangeListener {
    public final ViewGroup i;
    public ahnf j;
    private final Handler k;
    private final float o;
    private final float p;
    private final ArrayList q;
    private float r;
    private float s;
    private boolean t;

    public ahnh(final ViewGroup viewGroup, final Context context, Handler handler, azqb azqbVar, ahoo ahooVar, final float f, final float f2) {
        super(f, f2, ahon.a(1.0f, 1.0f, ahmr.m), ahooVar, azqbVar);
        this.k = handler;
        this.i = viewGroup;
        this.o = f;
        this.p = f2;
        this.s = f2;
        this.r = f;
        rT(f, f2, 0.0f);
        this.q = new ArrayList();
        handler.post(new Runnable() { // from class: ahmw
            @Override // java.lang.Runnable
            public final void run() {
                ahnh ahnhVar = ahnh.this;
                Context context2 = context;
                ViewGroup viewGroup2 = viewGroup;
                float f3 = f;
                float f4 = f2;
                ahnhVar.j = new ahnf(context2, ahnhVar);
                ahnhVar.j.addOnLayoutChangeListener(ahnhVar);
                ahnhVar.j.setVisibility(0);
                viewGroup2.addView(ahnhVar.j, ahnh.s(f3), ahnh.s(f4));
                ahnhVar.j.setTextColor(-1);
                ahnhVar.j.setTextSize(5.0f);
                ahnhVar.j.setTypeface(null, 1);
                ahnhVar.j.invalidate();
            }
        });
    }

    public final void A(float f) {
        this.k.post(new ahna(this, f));
    }

    public final void g(ahng ahngVar) {
        this.q.add(ahngVar);
    }

    public final void h(int i) {
        this.k.post(new ahnb(this, i));
    }

    @Override // defpackage.ahmr, defpackage.ahjj, defpackage.ahmf
    public final void i() {
        this.k.post(new ahnc(this));
        super.i();
    }

    @Override // defpackage.ahjj, defpackage.ahmf
    public final void j(ahjy ahjyVar) {
    }

    @Override // defpackage.ahmr, defpackage.ahjj, defpackage.ahmf
    public final void m(ahjy ahjyVar) {
        super.m(ahjyVar);
        if (this.t) {
            this.t = false;
            ArrayList arrayList = this.q;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((ahng) arrayList.get(i)).a(this.r, this.s);
            }
            w(this.r, this.s);
            this.k.post(new ahnc(this, 1));
            rT(this.r, this.s, 0.0f);
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        this.s = ahom.a(this.j.getHeight());
        this.r = ahom.a(this.j.getWidth());
        this.t = true;
    }

    @Override // defpackage.ahmh, defpackage.ahmf
    public final void qS(boolean z) {
        this.l = z;
        this.k.post(new ahnd(this, z));
    }

    public final void y(String str) {
        this.k.post(new ahmz(this, str));
    }

    public final void z(int i) {
        this.k.post(new ahnb(this, i, 1));
    }

    public final void B(boolean z, boolean z2) {
        int i = -2;
        int s = z ? -2 : s(this.o);
        if (!z2) {
            i = s(this.p);
        }
        this.k.post(new ahmy(this, new FrameLayout.LayoutParams(s, i)));
    }
}
