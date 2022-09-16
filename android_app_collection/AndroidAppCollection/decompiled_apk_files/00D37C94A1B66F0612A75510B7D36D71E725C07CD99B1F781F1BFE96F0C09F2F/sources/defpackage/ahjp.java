package defpackage;

import android.content.Context;
import android.os.Handler;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ahjp  reason: default package */
/* loaded from: classes.dex */
public final class ahjp extends ahmr {
    public final ViewGroup i;
    public final Handler j;
    public ahjo k;

    public ahjp(final ViewGroup viewGroup, final Context context, Handler handler, ahoo ahooVar, azqb azqbVar, final float f, final boolean z) {
        super(f, f, ahon.a(f, f, ahmr.m), ahooVar, azqbVar);
        this.i = viewGroup;
        this.j = handler;
        handler.post(new Runnable() { // from class: ahjn
            @Override // java.lang.Runnable
            public final void run() {
                ahjp ahjpVar = ahjp.this;
                boolean z2 = z;
                Context context2 = context;
                float f2 = f;
                ViewGroup viewGroup2 = viewGroup;
                ahjpVar.k = new ahjo(context2, ahjpVar, ahom.b(f2), z2, true != z2 ? 16842872 : 16842871);
                viewGroup2.addView(ahjpVar.k);
                ahjpVar.k.invalidate();
            }
        });
    }

    @Override // defpackage.ahmr, defpackage.ahjj, defpackage.ahmf
    public final void i() {
        this.j.post(new Runnable() { // from class: ahjk
            @Override // java.lang.Runnable
            public final void run() {
                ahjp ahjpVar = ahjp.this;
                ahjpVar.i.removeView(ahjpVar.k);
            }
        });
        super.i();
    }

    @Override // defpackage.ahjj, defpackage.ahmf
    public final void j(ahjy ahjyVar) {
    }

    @Override // defpackage.ahmh, defpackage.ahmf
    public final void qS(final boolean z) {
        this.l = z;
        this.j.post(new Runnable() { // from class: ahjm
            @Override // java.lang.Runnable
            public final void run() {
                ahjp ahjpVar = ahjp.this;
                boolean z2 = z;
                ahjo ahjoVar = ahjpVar.k;
                if (ahjoVar != null) {
                    int i = 0;
                    if (!z2) {
                        ahjoVar.setProgress(0);
                    }
                    ahjo ahjoVar2 = ahjpVar.k;
                    if (true == z2) {
                        i = 8;
                    }
                    ahjoVar2.setVisibility(i);
                }
            }
        });
    }
}
