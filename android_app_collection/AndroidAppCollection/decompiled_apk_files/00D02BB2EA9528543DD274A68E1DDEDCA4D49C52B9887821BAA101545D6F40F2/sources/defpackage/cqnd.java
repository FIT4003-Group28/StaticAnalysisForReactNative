package defpackage;

import android.content.Context;
import defpackage.cqkp;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cqnd  reason: default package */
/* loaded from: classes.dex */
public final class cqnd<V extends cqkp, T> implements cqjb<V, T> {
    private final cqnx<V, T> a;

    public cqnd(cqnx<V, T> cqnxVar) {
        this.a = cqnxVar;
    }

    @Override // defpackage.cqjb
    public final T a(V v, Context context) {
        return this.a.a(v, new Object[0]);
    }
}
