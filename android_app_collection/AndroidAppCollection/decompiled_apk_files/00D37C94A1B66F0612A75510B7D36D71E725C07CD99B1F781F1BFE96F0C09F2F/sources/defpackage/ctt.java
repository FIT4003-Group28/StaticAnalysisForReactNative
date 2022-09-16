package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: ctt  reason: default package */
/* loaded from: classes3.dex */
public final class ctt implements ctz {
    protected final View a;
    private final cts b;

    public ctt(View view) {
        hy.N(view);
        this.a = view;
        this.b = new cts(view);
    }

    @Override // defpackage.ctz
    public final void a(Drawable drawable) {
        this.b.c();
    }

    @Override // defpackage.ctz
    public final void b(Object obj, cug cugVar) {
    }

    @Override // defpackage.ctz
    public final cth c() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof cth) {
                return (cth) tag;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // defpackage.ctz
    public final void d(cty ctyVar) {
        cts ctsVar = this.b;
        int b = ctsVar.b();
        int a = ctsVar.a();
        if (cts.d(b, a)) {
            ctyVar.g(b, a);
            return;
        }
        if (!ctsVar.c.contains(ctyVar)) {
            ctsVar.c.add(ctyVar);
        }
        if (ctsVar.d != null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = ctsVar.b.getViewTreeObserver();
        ctsVar.d = new cua(ctsVar, 1);
        viewTreeObserver.addOnPreDrawListener(ctsVar.d);
    }

    @Override // defpackage.ctz
    public final void e(Drawable drawable) {
    }

    @Override // defpackage.ctz
    public final void f(Drawable drawable) {
    }

    @Override // defpackage.ctz
    public final void g(cty ctyVar) {
        this.b.c.remove(ctyVar);
    }

    @Override // defpackage.ctz
    public final void h(cth cthVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, cthVar);
    }

    @Override // defpackage.cse
    public final void k() {
    }

    @Override // defpackage.cse
    public final void l() {
    }

    @Override // defpackage.cse
    public final void m() {
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Target for: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
