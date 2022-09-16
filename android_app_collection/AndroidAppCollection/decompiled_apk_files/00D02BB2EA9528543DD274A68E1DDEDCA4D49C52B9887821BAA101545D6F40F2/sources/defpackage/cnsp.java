package defpackage;

import defpackage.cnnq;
/* compiled from: PG */
/* renamed from: cnsp  reason: default package */
/* loaded from: classes.dex */
public final class cnsp<A extends cnnq, L> {
    public cnsr<A, cpct<Void>> a;
    public cnsr<A, cpct<Boolean>> b;
    public cnsd<L> c;
    public int d;
    private final Runnable e = cnsm.a;
    private final boolean f = true;

    public final cnsq<A, L> a() {
        boolean z = false;
        cnwc.e(this.a != null, "Must set register function");
        cnwc.e(this.b != null, "Must set unregister function");
        if (this.c != null) {
            z = true;
        }
        cnwc.e(z, "Must set holder");
        cnsb<L> cnsbVar = this.c.b;
        cnwc.n(cnsbVar, "Key must not be null");
        return new cnsq<>(new cnsn(this, this.c, true, this.d), new cnso(this, cnsbVar), this.e);
    }
}
