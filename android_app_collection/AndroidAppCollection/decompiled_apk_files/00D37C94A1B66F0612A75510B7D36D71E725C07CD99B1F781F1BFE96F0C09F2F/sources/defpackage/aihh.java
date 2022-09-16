package defpackage;

import android.graphics.Bitmap;
import android.view.ViewStub;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimeBar;
/* compiled from: PG */
/* renamed from: aihh  reason: default package */
/* loaded from: classes.dex */
public abstract class aihh implements aiby, aihq {
    private final aihr a;
    public ViewStub d;
    public aihj e;
    public boolean f;

    public aihh(ViewStub viewStub, aihr aihrVar) {
        viewStub.getClass();
        this.d = viewStub;
        aihrVar.getClass();
        this.a = aihrVar;
        aihrVar.b(this);
    }

    private final void a(aiht aihtVar) {
        if (this.f) {
            aihj d = d();
            if (!d.d) {
                if (d.c.isStarted()) {
                    d.c.reverse();
                } else {
                    d.c.start();
                }
                d.d = true;
            }
            d.a.setImageBitmap(aihtVar != null ? aihtVar.a : null);
            return;
        }
        aihj d2 = d();
        if (!d2.d) {
            return;
        }
        d2.c.reverse();
        d2.d = false;
    }

    private final void b(long j) {
        this.a.k(j, -1);
        d().b.setText(TimeBar.I(j));
        e(d());
    }

    protected aihj d() {
        throw null;
    }

    protected abstract void e(aihj aihjVar);

    public final void f(boolean z) {
        aiht a;
        if (this.f == z) {
            return;
        }
        this.f = z;
        aihr aihrVar = this.a;
        synchronized (aihrVar.i) {
            Bitmap bitmap = aihrVar.f;
            a = bitmap != null ? aiht.a(bitmap) : null;
        }
        a(a);
    }

    public final boolean g() {
        return this.a.l();
    }

    @Override // defpackage.aiby
    public final void nt(int i, long j) {
        if (!g()) {
            return;
        }
        if (i == 1) {
            b(j);
            f(true);
        } else if (i == 2) {
            b(j);
        } else if (i != 3 && i != 4) {
        } else {
            f(false);
        }
    }

    @Override // defpackage.aihq
    public final /* synthetic */ void x(int i, int i2) {
    }

    @Override // defpackage.aihq
    public final void y(aiht aihtVar, int i) {
        a(aihtVar);
    }
}
