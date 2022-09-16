package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.maps.R;
/* compiled from: PG */
@Deprecated
/* renamed from: cim  reason: default package */
/* loaded from: classes.dex */
public abstract class cim<T extends View, Z> extends chz<Z> {
    protected final T a;
    public final cil b;

    public cim(T t) {
        cjn.b(t);
        this.a = t;
        this.b = new cil(t);
    }

    @Override // defpackage.cij
    public final void g(cii ciiVar) {
        cil cilVar = this.b;
        int c = cilVar.c();
        int b = cilVar.b();
        if (cil.d(c, b)) {
            ciiVar.j(c, b);
            return;
        }
        if (!cilVar.c.contains(ciiVar)) {
            cilVar.c.add(ciiVar);
        }
        if (cilVar.d != null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = cilVar.b.getViewTreeObserver();
        cilVar.d = new cik(cilVar);
        viewTreeObserver.addOnPreDrawListener(cilVar.d);
    }

    @Override // defpackage.cij
    public final void h(cii ciiVar) {
        this.b.c.remove(ciiVar);
    }

    @Override // defpackage.chz, defpackage.cij
    public final void i(chs chsVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, chsVar);
    }

    @Override // defpackage.chz, defpackage.cij
    public final chs j() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof chs) {
                return (chs) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Target for: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
