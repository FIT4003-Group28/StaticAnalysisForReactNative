package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cjxw  reason: default package */
/* loaded from: classes4.dex */
abstract class cjxw extends cjxx implements View.OnAttachStateChangeListener {
    private cjyb a;
    private View d;

    public cjxw(View view, cjyb cjybVar) {
        this.a = cjybVar;
        this.d = view;
    }

    @Override // defpackage.cjxx
    public final boolean a() {
        if (this.d.getWindowToken() == null) {
            this.d.addOnAttachStateChangeListener(this);
            return false;
        }
        return true;
    }

    @Override // defpackage.cjxx
    public final void b() {
        this.d.removeOnAttachStateChangeListener(this);
        super.b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cjxx
    public final void c() {
        this.d.removeOnAttachStateChangeListener(this);
        this.a = null;
        this.d = null;
        super.c();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        boolean z = true;
        dbsk.l(!d());
        dbsk.l(!this.c);
        this.a.a(this);
        if (!this.c && !d()) {
            z = false;
        }
        dbsk.l(z);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        dbsk.l(d());
        dbsk.l(!this.c);
        super.b();
        dbsk.l(!d());
    }
}
