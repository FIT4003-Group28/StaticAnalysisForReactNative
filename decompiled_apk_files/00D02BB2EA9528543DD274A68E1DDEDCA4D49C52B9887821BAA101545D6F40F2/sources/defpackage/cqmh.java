package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqmh  reason: default package */
/* loaded from: classes.dex */
public final class cqmh<T extends cqkp> extends cqmj<T> {
    public final Class<? extends View> a;

    @SafeVarargs
    public cqmh(Class<? extends View> cls, cqmp<T>... cqmpVarArr) {
        super(cqmpVarArr);
        this.a = cls;
    }

    @Override // defpackage.cqmj
    public final View a(cqkd cqkdVar, int i, int i2, @dzsi Integer num, @dzsi ViewGroup viewGroup, boolean z) {
        return cqkdVar.b(this.a, i, i2, num, viewGroup, z);
    }
}
