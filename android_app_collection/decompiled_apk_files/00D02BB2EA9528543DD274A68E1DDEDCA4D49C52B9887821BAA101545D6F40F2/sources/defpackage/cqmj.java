package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.cqkp;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqmj  reason: default package */
/* loaded from: classes.dex */
public abstract class cqmj<T extends cqkp> extends cqml<T> {
    private cqjg a;

    @SafeVarargs
    public cqmj(cqmp<T>... cqmpVarArr) {
        super(cqmpVarArr);
    }

    public abstract View a(cqkd cqkdVar, int i, int i2, @dzsi Integer num, @dzsi ViewGroup viewGroup, boolean z);

    public int b() {
        return 0;
    }

    public final cqjg c() {
        cqjg i = cqml.i(this.c, this.d);
        if (i != null) {
            return i;
        }
        if (this.a == null) {
            this.a = d();
        }
        return this.a;
    }

    protected cqjg d() {
        return cqjg.a();
    }

    public final void e(List<? extends cqmp<T>> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        h((cqmp[]) list.toArray(new cqmp[0]));
    }

    @SafeVarargs
    public final void f(cqmp<T>... cqmpVarArr) {
        super.h(cqmpVarArr);
    }

    public final void g(cqmp<T> cqmpVar) {
        super.j(cqmpVar);
    }

    @Override // defpackage.cqml
    @SafeVarargs
    public final /* bridge */ /* synthetic */ void h(cqmp[] cqmpVarArr) {
        super.h(cqmpVarArr);
    }
}
