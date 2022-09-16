package defpackage;

import android.view.View;
import android.view.ViewGroup;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vcu  reason: default package */
/* loaded from: classes7.dex */
public final class vcu implements zxm {
    final /* synthetic */ cqiw a;

    public vcu(cqiw cqiwVar) {
        this.a = cqiwVar;
    }

    @Override // defpackage.zxm
    public final void a(View view) {
        vjc.f(view);
    }

    @Override // defpackage.zxm
    public final int b(View view, zxn zxnVar) {
        View d;
        int intValue;
        int measuredHeight;
        boolean z = false;
        if (zxnVar instanceof zbu) {
            zbu zbuVar = (zbu) zxnVar;
            zbv d2 = zbuVar.d();
            zfm j = d2.j();
            zbz i = d2.i();
            zdv k = d2.k();
            zcn l = d2.l();
            zcm m = d2.m();
            View rootView = view.getRootView();
            View view2 = null;
            View a = rootView == null ? null : cqhu.a(rootView, zei.a);
            if (j != null) {
                View findViewById = view.findViewById(j.a().V().intValue());
                if (findViewById != null) {
                    amub n = d2.n();
                    if (n != null && (vxx.f(n.h) || n.h == dqvj.BIKESHARING)) {
                        z = true;
                    }
                    if (zbuVar.i().booleanValue() || !z || a == null) {
                        return findViewById.getMeasuredHeight();
                    }
                    intValue = findViewById.getMeasuredHeight();
                    measuredHeight = a.getMeasuredHeight();
                    return intValue + measuredHeight;
                }
            } else if (i != null && i.a().isEmpty()) {
                View d3 = cqkx.d(view, vei.a);
                if (d3 != null) {
                    ViewGroup viewGroup = (ViewGroup) cqkx.e(d3, jkn.n, ViewGroup.class);
                    if (viewGroup != null) {
                        view2 = viewGroup.getChildAt(0);
                    }
                    if (view2 != null) {
                        return view2.getMeasuredHeight();
                    }
                }
            } else if (k != null) {
                View d4 = cqkx.d(view, zdv.a);
                if (d4 != null) {
                    return k.f(d4);
                }
            } else if (l != null) {
                if (!l.d().booleanValue()) {
                    View d5 = cqkx.d(view, zcn.b);
                    View findViewById2 = view.findViewById(l.a().a().V().intValue());
                    if (findViewById2 != null && d5 != null) {
                        intValue = findViewById2.getMeasuredHeight() + d5.getMeasuredHeight();
                        if (zbuVar.i().booleanValue() || a == null) {
                            return intValue;
                        }
                        measuredHeight = a.getMeasuredHeight();
                        return intValue + measuredHeight;
                    }
                } else {
                    View d6 = cqkx.d(view, zcn.a);
                    if (d6 != null) {
                        return d6.getMeasuredHeight();
                    }
                }
            } else if (m != null && (d = cqkx.d(view, zcm.a)) != null) {
                intValue = m.a(d).intValue();
                if (zbuVar.i().booleanValue() || a == null) {
                    return intValue;
                }
                measuredHeight = a.getMeasuredHeight();
                return intValue + measuredHeight;
            }
        }
        return 0;
    }

    @Override // defpackage.zxm
    public final View c(cqkj cqkjVar) {
        return cqkjVar.e(this.a).c();
    }
}
