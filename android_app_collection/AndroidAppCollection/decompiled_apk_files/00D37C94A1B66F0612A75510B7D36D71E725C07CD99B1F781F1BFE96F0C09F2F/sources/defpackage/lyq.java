package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: lyq  reason: default package */
/* loaded from: classes3.dex */
public final class lyq extends lud {
    private boolean c;
    private int d;
    private final axnm e;
    private fsk f;

    public lyq(axnm axnmVar, Activity activity, axnm axnmVar2, axxi axxiVar, ayor ayorVar, ypf ypfVar) {
        super(activity, axnmVar2);
        this.e = axnmVar;
        this.d = 1;
        ypfVar.g(new lyp(axxiVar, ayorVar, ((ViewGroup) axnmVar.get()).findViewById(R.id.feed_filter_bar_separator)));
    }

    private final void k(int i) {
        alii aliiVar;
        if (this.d == i) {
            return;
        }
        this.d = i;
        g();
        if (!j() || (aliiVar = (alii) ((ViewGroup) this.e.get()).getLayoutParams()) == null) {
            return;
        }
        int i2 = 0;
        if (this.d != 5 && d().getChildCount() > 0) {
            i2 = ((alii) d().getChildAt(0).getLayoutParams()).a;
        }
        if (i2 == aliiVar.a) {
            return;
        }
        aliiVar.a = i2;
    }

    @Override // defpackage.lud
    protected final int b() {
        return 1;
    }

    @Override // defpackage.lud
    protected final ViewGroup c() {
        return (ViewGroup) this.e.get();
    }

    @Override // defpackage.lud
    protected final void f() {
        ViewGroup viewGroup = (ViewGroup) ((ViewGroup) this.e.get()).getParent();
        if (viewGroup == d()) {
            viewGroup.removeView((View) this.e.get());
        }
    }

    @Override // defpackage.lud
    public final void h(fsx fsxVar) {
        fsk fskVar = fsxVar.c;
        if (fskVar == null) {
            k(1);
            this.f = null;
            return;
        }
        fsk fskVar2 = this.f;
        if (fskVar2 == null || fskVar2.b != fskVar.b) {
            this.c = false;
        }
        this.f = fskVar;
        k(true != fskVar.c ? 4 : 5);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lud
    public final void i() {
        super.i();
        if (this.c) {
            return;
        }
        this.c = true;
        fsi fsiVar = this.f.b;
        if (fsiVar == null) {
            return;
        }
        fsiVar.a();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.lud
    public final boolean j() {
        return this.d != 1;
    }
}
