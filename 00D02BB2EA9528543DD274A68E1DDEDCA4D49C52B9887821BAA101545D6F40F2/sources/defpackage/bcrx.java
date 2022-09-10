package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.cqkp;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: bcrx  reason: default package */
/* loaded from: classes3.dex */
public final class bcrx<M extends cqkp> extends bas {
    public static final dcqe a = dcqe.c("bcrx");
    public final bcrw<M> b;
    private final cqkj c;
    private final cqiw<M> d;
    private final Map<M, View> e = new HashMap();

    public bcrx(cqkj cqkjVar, cqiw<M> cqiwVar, bcrw<M> bcrwVar) {
        this.c = cqkjVar;
        this.d = cqiwVar;
        this.b = bcrwVar;
    }

    public static <M extends cqkp, T extends bcrw<M>> cqmt<T> a(cqiw<M> cqiwVar) {
        return new bcrv(cqiwVar);
    }

    @Override // defpackage.bas
    public final int OV() {
        return this.b.h();
    }

    @Override // defpackage.bas
    public final boolean OW(View view, Object obj) {
        return this.e.get((cqkp) obj) == view;
    }

    @Override // defpackage.bas
    public final int OX(Object obj) {
        return -2;
    }

    @Override // defpackage.bas
    public final Object c(ViewGroup viewGroup, int i) {
        M v = this.b.v(i);
        if (v == null) {
            bvoo.h("Item view model at position %d was null", Integer.valueOf(i));
        }
        cqkf c = this.c.c(this.d, null);
        viewGroup.addView(c.c());
        c.e(v);
        this.e.put(v, c.c());
        return v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.bas
    public final void d(ViewGroup viewGroup, int i, Object obj) {
        cqkp cqkpVar = (cqkp) obj;
        View view = this.e.get(cqkpVar);
        if (view != null) {
            viewGroup.removeView(view);
            this.e.remove(cqkpVar);
            this.b.u(i, cqkpVar);
            cqkf<?> a2 = cqke.a(view);
            if (a2 == null) {
                return;
            }
            a2.i();
        }
    }
}
