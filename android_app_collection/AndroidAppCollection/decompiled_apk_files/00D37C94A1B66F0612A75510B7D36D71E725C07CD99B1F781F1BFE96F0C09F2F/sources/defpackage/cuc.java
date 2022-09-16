package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.youtube.R;
/* compiled from: PG */
@Deprecated
/* renamed from: cuc  reason: default package */
/* loaded from: classes3.dex */
public abstract class cuc extends ctq {
    public final View a;
    public final cub b;

    public cuc(View view) {
        hy.N(view);
        this.a = view;
        this.b = new cub(view);
    }

    @Override // defpackage.ctq, defpackage.ctz
    public final cth c() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof cth) {
                return (cth) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // defpackage.ctz
    public void d(cty ctyVar) {
        cub cubVar = this.b;
        int b = cubVar.b();
        int a = cubVar.a();
        if (cub.d(b, a)) {
            ctyVar.g(b, a);
            return;
        }
        if (!cubVar.c.contains(ctyVar)) {
            cubVar.c.add(ctyVar);
        }
        if (cubVar.d != null) {
            return;
        }
        ViewTreeObserver viewTreeObserver = cubVar.b.getViewTreeObserver();
        cubVar.d = new cua(cubVar);
        viewTreeObserver.addOnPreDrawListener(cubVar.d);
    }

    @Override // defpackage.ctz
    public final void g(cty ctyVar) {
        this.b.c.remove(ctyVar);
    }

    @Override // defpackage.ctq, defpackage.ctz
    public final void h(cth cthVar) {
        o(cthVar);
    }

    public final View n() {
        return this.a;
    }

    public final void o(Object obj) {
        this.a.setTag(R.id.glide_custom_view_target_tag, obj);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 12);
        sb.append("Target for: ");
        sb.append(valueOf);
        return sb.toString();
    }
}
