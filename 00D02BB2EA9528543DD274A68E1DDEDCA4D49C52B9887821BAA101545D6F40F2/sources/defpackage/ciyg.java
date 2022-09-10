package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: ciyg  reason: default package */
/* loaded from: classes4.dex */
final class ciyg {
    public static final int a = View.MeasureSpec.makeMeasureSpec(0, 0);
    public final Context b;
    public final bvrb c;
    private final ciyl d;

    public ciyg(ciyl ciylVar, Context context, bvrb bvrbVar) {
        this.d = ciylVar;
        this.b = context;
        this.c = bvrbVar;
    }

    public static void a(View view, View view2) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = -2;
        layoutParams.width = -2;
        view.setLayoutParams(layoutParams);
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        layoutParams2.height = -2;
        layoutParams2.width = -2;
        view2.setLayoutParams(layoutParams2);
    }

    @dzsi
    private final View e() {
        return cqkx.o(this.d);
    }

    @dzsi
    public final View b() {
        View e = e();
        if (e == null) {
            return null;
        }
        return cqhu.a(e, ciyk.b);
    }

    @dzsi
    public final View c() {
        View e = e();
        if (e == null) {
            return null;
        }
        return cqhu.a(e, ciyk.a);
    }

    @dzsi
    public final View d() {
        View e = e();
        if (e == null) {
            return null;
        }
        return cqhu.a(e, ciyk.c);
    }
}
