package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
/* compiled from: PG */
/* renamed from: mcl  reason: default package */
/* loaded from: classes3.dex */
public final class mcl extends fyo implements fze {
    private final azqb e;
    private final Handler f = new mck(this, Looper.getMainLooper());
    public fyp d = fyp.a;

    public mcl(azqb azqbVar) {
        this.e = azqbVar;
    }

    public static void a(View view, int i) {
        if (view != null) {
            view.animate().cancel();
            view.setAlpha(i);
        }
    }

    public static boolean b(fzq fzqVar) {
        return (fzqVar == null || fzqVar.j() == null) ? false : true;
    }

    private final void c(fyp fypVar) {
        fypVar.c(false);
        if (!b(fypVar.b())) {
            ((zao) this.e.get()).c(null);
            a(fypVar.a(), 1);
        }
    }

    @Override // defpackage.fyo, defpackage.fzf
    public final void h(fyp fypVar) {
        c(fypVar);
    }

    @Override // defpackage.fyo
    protected final boolean j(fyp fypVar, int i) {
        if (i == 0) {
            c(fypVar);
            return true;
        }
        return true;
    }

    @Override // defpackage.fze
    public final void lh(fyp fypVar, int i) {
        if (i == 0) {
            this.d = fyp.a;
            this.f.removeMessages(0);
        } else if (i == 1) {
            fypVar.c(true);
            this.d = fypVar;
        } else if (i != 2) {
        } else {
            fzq b = fypVar.b();
            if (b(b)) {
                fin finVar = (fin) b.j().d.get();
                if (finVar != null) {
                    finVar.a(true);
                }
            } else {
                ((zao) this.e.get()).c(fypVar.a());
            }
            this.f.sendEmptyMessage(0);
        }
    }
}
