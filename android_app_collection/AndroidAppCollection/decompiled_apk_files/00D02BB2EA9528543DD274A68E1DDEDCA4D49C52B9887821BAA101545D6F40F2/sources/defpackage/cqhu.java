package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: cqhu  reason: default package */
/* loaded from: classes.dex */
public class cqhu {
    @dzsi
    public static final View a(View view, cqjg cqjgVar) {
        return cqkx.e(view, cqjgVar, View.class);
    }

    @dzsi
    public static final cqjz<?> b(View view, cqjg cqjgVar) {
        return cqjz.q(view, cqjz.t(cqjgVar));
    }

    public static final <V extends View> dcdc<V> c(View view, cqjg cqjgVar, Class<V> cls) {
        final dccx F = dcdc.F();
        F.getClass();
        cqkx.h(view, cqjgVar, cls, new dbrn(F) { // from class: cqht
            private final dccx a;

            {
                this.a = F;
            }

            @Override // defpackage.dbrn
            public final Object a(Object obj) {
                dccx dccxVar = this.a;
                dccxVar.g((View) obj);
                return dccxVar;
            }
        });
        return F.f();
    }

    public static final void d(View view, cqjg cqjgVar, dbrn<? super View, ?> dbrnVar) {
        cqkx.h(view, cqjgVar, View.class, dbrnVar);
    }

    public static final dcdc<View> e(View view, cqjg cqjgVar) {
        return c(view, cqjgVar, View.class);
    }
}
