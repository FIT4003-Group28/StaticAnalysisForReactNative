package defpackage;

import android.content.Context;
import android.view.View;
import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqjf  reason: default package */
/* loaded from: classes.dex */
public final class cqjf<V extends cqkp> extends cqiy<V> {
    V a;
    @dzsi
    cqkf<V> b;

    public cqjf(View view, cqho cqhoVar, cqja<V> cqjaVar, cqjg cqjgVar, cqiw<V> cqiwVar, int i, boolean z) {
        super(view, cqhoVar, cqjaVar, cqjgVar, cqiwVar, z);
    }

    @Override // defpackage.cqjz
    @dzsi
    public final V a(@dzsi cqkp cqkpVar, Context context) {
        if (cqkpVar == null) {
            return null;
        }
        return this.a;
    }

    @Override // defpackage.cqjz
    public final void d(@dzsi V v) {
        this.a = v;
    }

    @Override // defpackage.cqjz
    @dzsi
    public final cqkf<V> e() {
        return this.b;
    }

    @Override // defpackage.cqjz
    @dzsi
    public final void f(@dzsi cqkf<V> cqkfVar) {
        this.b = cqkfVar;
    }
}
