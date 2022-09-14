package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: fzg  reason: default package */
/* loaded from: classes6.dex */
public final class fzg extends ImageView {
    @dzsi
    public fze a;
    private final cjqy b;

    public fzg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = null;
        this.b = ((cjqz) btsr.a(cjqz.class)).tr();
    }

    @SafeVarargs
    public static <T extends cqkp> cqmj<T> a(cqmp<T>... cqmpVarArr) {
        return new cqmh(fzg.class, cqmpVarArr);
    }

    @dzsi
    public final fzj b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof fzj) {
                return (fzj) parent;
            }
        }
        return null;
    }

    @dzsi
    public final cjqm c(dead deadVar) {
        cjql e = cjqg.e(this);
        cjtd k = cjqg.k(this);
        if (e == null || k == null) {
            return null;
        }
        return this.b.n(e, new cjte(deaf.DRAG, deadVar), k);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.a = fze.a;
        setAccessibilityDelegate(new fzf(this));
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setAccessibilityDelegate(null);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 0) {
            return super.onTouchEvent(motionEvent);
        }
        fzj b = b();
        if (b == null) {
            return super.onTouchEvent(motionEvent);
        }
        acl X = b.X(this);
        if (X == null) {
            return super.onTouchEvent(motionEvent);
        }
        aga agaVar = b.U;
        if (agaVar.j.e(agaVar.m, X) && X.a.getParent() == agaVar.m) {
            agaVar.i();
            agaVar.f = 0.0f;
            agaVar.e = 0.0f;
            agaVar.f(X, 2);
        }
        fzh fzhVar = b.W;
        if (fzhVar == null) {
            return true;
        }
        fzhVar.b(X.e());
        cjql e = cjqg.e(X.a);
        cjtd k = cjqg.k(X.a);
        if (e == null || k == null) {
            return true;
        }
        b.V.j(e, k);
        return true;
    }
}
