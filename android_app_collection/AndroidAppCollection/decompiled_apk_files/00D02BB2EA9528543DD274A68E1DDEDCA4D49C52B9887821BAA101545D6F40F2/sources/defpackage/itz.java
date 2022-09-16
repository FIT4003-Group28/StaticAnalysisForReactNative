package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: itz  reason: default package */
/* loaded from: classes6.dex */
public final class itz implements View.OnLongClickListener {
    final /* synthetic */ Object a;
    final /* synthetic */ cqjz b;
    final /* synthetic */ iub c;

    public itz(iub iubVar, Object obj, cqjz cqjzVar) {
        this.c = iubVar;
        this.a = obj;
        this.b = cqjzVar;
    }

    @Override // android.view.View.OnLongClickListener
    public final boolean onLongClick(View view) {
        cjtd k = cjqg.k(view);
        cjqm cjqmVar = cjqm.a;
        if (k != null && !k.equals(cjtd.c)) {
            cjql e = cjqg.e(view);
            cjqmVar = e != null ? this.c.a.n(e, new cjte(deaf.LONG_PRESS), k) : this.c.a.m(new cjte(deaf.LONG_PRESS), k);
        }
        Object obj = this.a;
        if (obj instanceof View.OnLongClickListener) {
            ((View.OnLongClickListener) obj).onLongClick(view);
            return true;
        } else if (!(obj instanceof cqnx)) {
            return false;
        } else {
            V v = this.b.j;
            if (v != 0) {
                ((cqnx) obj).a(v, cjqmVar);
            }
            return true;
        }
    }
}
