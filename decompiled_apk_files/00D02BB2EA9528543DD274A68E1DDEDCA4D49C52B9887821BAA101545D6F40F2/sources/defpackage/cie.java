package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cie  reason: default package */
/* loaded from: classes4.dex */
public abstract class cie<T extends View, Z> implements cij<Z> {
    protected final T a;
    private final cid b;

    public cie(T t) {
        cjn.b(t);
        this.a = t;
        this.b = new cid(t);
    }

    @Override // defpackage.cij
    public final void c(Drawable drawable) {
        this.b.a();
    }

    @Override // defpackage.cgp
    public final void d() {
    }

    @Override // defpackage.cgp
    public final void e() {
    }

    @Override // defpackage.cgp
    public final void f() {
    }

    @Override // defpackage.cij
    public final void g(cii ciiVar) {
        cid cidVar = this.b;
        int c = cidVar.c();
        int b = cidVar.b();
        if (cid.d(c, b)) {
            ciiVar.j(c, b);
            return;
        }
        if (!cidVar.c.contains(ciiVar)) {
            cidVar.c.add(ciiVar);
        }
        if (cidVar.d != null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = cidVar.b.getViewTreeObserver();
        cidVar.d = new cic(cidVar);
        viewTreeObserver.addOnPreDrawListener(cidVar.d);
    }

    @Override // defpackage.cij
    public final void h(cii ciiVar) {
        this.b.c.remove(ciiVar);
    }

    @Override // defpackage.cij
    public final void i(chs chsVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, chsVar);
    }

    @Override // defpackage.cij
    public final chs j() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof chs) {
                return (chs) tag;
            }
            throw new IllegalArgumentException("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // defpackage.cij
    public final void k(Drawable drawable) {
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Target for: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
