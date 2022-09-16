package defpackage;

import java.io.Serializable;
/* compiled from: PG */
/* renamed from: rca  reason: default package */
/* loaded from: classes7.dex */
public abstract class rca implements Serializable {
    @dzsi
    public abstract amvh a();

    public abstract dcdc<amvh> b();

    public abstract dqvj c();

    public abstract bvrt<dwao> d();

    public abstract long e();

    @dzsi
    public abstract amte f();

    @dzsi
    public abstract dqek g();

    public final dwao h() {
        dwao dwaoVar = dwao.R;
        dwao e = d().e((dssr) dwao.R.cu(7), dwaoVar);
        dbsk.l(!e.equals(dwaoVar));
        return e;
    }

    public final boolean i() {
        return b().size() == 1 && (c() == dqvj.DRIVE || c() == dqvj.TWO_WHEELER);
    }
}
