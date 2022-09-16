package defpackage;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
/* compiled from: PG */
/* renamed from: ahlp  reason: default package */
/* loaded from: classes.dex */
public final class ahlp extends ahmr {
    public final ViewGroup i;
    public final Handler j;
    public ahlo k;

    public ahlp(final Context context, final ViewGroup viewGroup, final float f, final float f2, ahoo ahooVar, azqb azqbVar) {
        super(f, f2, ahon.a(1.0f, 1.0f, ahmr.m), ahooVar, azqbVar);
        this.i = viewGroup;
        rT(f, f2, 0.0f);
        Handler handler = new Handler(Looper.getMainLooper());
        this.j = handler;
        handler.post(new Runnable() { // from class: ahlm
            @Override // java.lang.Runnable
            public final void run() {
                ahlp ahlpVar = ahlp.this;
                Context context2 = context;
                float f3 = f;
                float f4 = f2;
                ViewGroup viewGroup2 = viewGroup;
                ahlpVar.k = new ahlo(context2, ahlpVar);
                ahlpVar.k.setOrientation(0);
                ahlpVar.k.setLayoutParams(new FrameLayout.LayoutParams(ahlp.s(f3), ahlp.s(f4)));
                viewGroup2.addView(ahlpVar.k);
            }
        });
    }

    @Override // defpackage.ahmr, defpackage.ahjj, defpackage.ahmf
    public final void i() {
        if (this.k != null) {
            this.j.post(new Runnable() { // from class: ahll
                @Override // java.lang.Runnable
                public final void run() {
                    ahlp ahlpVar = ahlp.this;
                    ahlpVar.i.removeView(ahlpVar.k);
                }
            });
        }
        super.i();
    }

    @Override // defpackage.ahmh, defpackage.ahmf
    public final void qS(final boolean z) {
        this.l = z;
        if (this.k != null) {
            this.j.post(new Runnable() { // from class: ahln
                @Override // java.lang.Runnable
                public final void run() {
                    ahlp.this.k.setVisibility(true != z ? 0 : 8);
                }
            });
        }
    }
}
