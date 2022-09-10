package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: dudd  reason: default package */
/* loaded from: classes6.dex */
public abstract class dudd<RpcRequestT, RpcResponseT extends dssj> {
    public static <RpcRequestT, RpcResponseT extends dssj> dudc<RpcRequestT, RpcResponseT> e() {
        return new ducy();
    }

    @dzsi
    public abstract dhgn<RpcRequestT> a();

    @dzsi
    public abstract ducv<? super RpcRequestT> b();

    public abstract dspy<dtrw, RpcResponseT> c();

    public abstract String d();
}
