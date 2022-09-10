package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: ducy  reason: default package */
/* loaded from: classes6.dex */
public final class ducy<RpcRequestT, RpcResponseT extends dssj> extends dudc<RpcRequestT, RpcResponseT> {
    public dhgn<RpcRequestT> a;
    public ducv<? super RpcRequestT> b;
    public String c;
    private dspy<dtrw, RpcResponseT> d;

    @Override // defpackage.dudc
    public final void b(dspy<dtrw, RpcResponseT> dspyVar) {
        if (dspyVar != null) {
            this.d = dspyVar;
            return;
        }
        throw new NullPointerException("Null responseExtension");
    }

    @Override // defpackage.dudc
    public final void a() {
        String str = this.d == null ? " responseExtension" : "";
        if (this.c == null) {
            str = str.concat(" tableId");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        } else {
            new ducz(this.a, this.b, this.d, this.c);
        }
    }
}
