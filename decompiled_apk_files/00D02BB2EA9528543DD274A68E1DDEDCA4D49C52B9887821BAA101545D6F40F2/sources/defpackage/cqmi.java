package defpackage;

import android.view.View;
import android.view.ViewGroup;
import defpackage.cqkp;
/* compiled from: PG */
/* renamed from: cqmi  reason: default package */
/* loaded from: classes.dex */
public final class cqmi<T extends cqkp> extends cqmj<T> {
    private final int a;

    @SafeVarargs
    public cqmi(int i, cqmp<T>... cqmpVarArr) {
        super(cqmpVarArr);
        this.a = i;
    }

    @Override // defpackage.cqmj
    public final View a(cqkd cqkdVar, int i, int i2, @dzsi Integer num, @dzsi ViewGroup viewGroup, boolean z) {
        return cqkdVar.c(this.a, viewGroup, z);
    }

    @Override // defpackage.cqmj
    public final int b() {
        return this.a;
    }
}
