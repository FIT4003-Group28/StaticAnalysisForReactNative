package defpackage;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: szj  reason: default package */
/* loaded from: classes4.dex */
public final class szj implements View.OnAttachStateChangeListener, ya {
    public szg a;
    public szh b;
    private final RecyclerView c;
    private boolean d = false;
    private final dle e;

    public szj(RecyclerView recyclerView, dle dleVar) {
        this.c = recyclerView;
        this.e = dleVar;
    }

    public final int a() {
        xo xoVar = this.c.m;
        if (xoVar != null) {
            return xoVar.b();
        }
        return 0;
    }

    public final void b(int i, boolean z) {
        xw xwVar;
        int i2;
        yk djcVar;
        if (c()) {
            if (!this.d) {
                this.c.v(this);
                this.c.addOnAttachStateChangeListener(this);
                this.d = true;
            }
            dle dleVar = this.e;
            if (dleVar == null) {
                if (z) {
                    this.c.al(i);
                    return;
                } else {
                    this.c.ab(i);
                    return;
                }
            }
            RecyclerView a = dleVar.a();
            if (a == null || (xwVar = a.n) == null || a.isLayoutSuppressed()) {
                return;
            }
            if (!z) {
                dleVar.c(i, false);
            } else if (dleVar.b != Integer.MIN_VALUE) {
                Context context = a.getContext();
                int i3 = dleVar.b;
                if (i3 == -1) {
                    i2 = 6;
                } else if (i3 != 1) {
                    if (i3 != Integer.MAX_VALUE) {
                        switch (i3) {
                            case 2147483646:
                                break;
                            default:
                                i2 = 2;
                                break;
                        }
                    }
                    i2 = 1;
                } else {
                    i2 = 8;
                }
                if (i2 == 6 || i2 == 8) {
                    djcVar = new djc(context, i2 - 7);
                } else if (i2 == 1) {
                    djcVar = new diu(context);
                } else {
                    djcVar = new yk(context);
                }
                djcVar.b = i;
                xwVar.bd(djcVar);
            } else {
                dleVar.c(i, true);
            }
        }
    }

    public final boolean c() {
        return this.c.r;
    }

    @Override // defpackage.ya
    public final void g(boolean z) {
    }

    @Override // defpackage.ya
    public final boolean m(RecyclerView recyclerView, MotionEvent motionEvent) {
        szg szgVar = this.a;
        if (szgVar == null || !szgVar.d.get()) {
            return false;
        }
        szgVar.a();
        return false;
    }

    @Override // defpackage.ya
    public final void n(MotionEvent motionEvent) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        szh szhVar = this.b;
        if (szhVar != null) {
            szg szgVar = szhVar.a;
            RecyclerView recyclerView = szhVar.b;
            Map map = szk.a;
            szgVar.a();
            szk.b.remove(recyclerView);
        }
        this.c.Z(this);
        this.c.removeOnAttachStateChangeListener(this);
        this.d = false;
    }
}
