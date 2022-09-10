package defpackage;

import android.graphics.Rect;
import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bgqg  reason: default package */
/* loaded from: classes3.dex */
public final class bgqg implements View.OnAttachStateChangeListener {
    public final Rect a = new Rect();
    @dzsi
    public View b;
    @dzsi
    apnr c;
    @dzsi
    bgpw d;
    final /* synthetic */ bgqj e;
    private boolean f;

    public bgqg(bgqj bgqjVar) {
        this.e = bgqjVar;
    }

    public final void a() {
        if (!this.e.QP().booleanValue()) {
            apnr apnrVar = this.c;
            if (apnrVar == null) {
                return;
            }
            this.f = false;
            apnrVar.b(this.e);
            this.e.c.d();
            return;
        }
        apnr apnrVar2 = this.c;
        if (apnrVar2 == null || this.f) {
            return;
        }
        this.f = true;
        apnrVar2.a(this.e);
        bgpw bgpwVar = this.d;
        if (bgpwVar == null) {
            return;
        }
        bgpwVar.b(true);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.b = view;
        if (this.d == null) {
            bgqj bgqjVar = this.e;
            bgpx bgpxVar = bgqjVar.e;
            fd K = bgqjVar.d.K();
            dbsk.s(K);
            this.d = bgpxVar.a(K, null, view, bgmz.a);
        }
        bgqj bgqjVar2 = this.e;
        bgqjVar2.g.add(bgqjVar2);
        a();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.b = null;
        bgqj bgqjVar = this.e;
        bgqjVar.g.remove(bgqjVar);
        a();
    }
}
