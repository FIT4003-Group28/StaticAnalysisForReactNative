package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: ducw  reason: default package */
/* loaded from: classes6.dex */
public final class ducw<RpcRequestT extends dssj, RpcResponseT extends dssj> extends duda<RpcRequestT, RpcResponseT> {
    private final dspy<dtry, RpcRequestT> a;
    private final dspy<dtrw, RpcResponseT> b;
    private final String c;

    public ducw(dspy<dtry, RpcRequestT> dspyVar, dspy<dtrw, RpcResponseT> dspyVar2) {
        if (dspyVar != null) {
            this.a = dspyVar;
            if (dspyVar2 != null) {
                this.b = dspyVar2;
                this.c = "echo-test";
                return;
            }
            throw new NullPointerException("Null responseExtension");
        }
        throw new NullPointerException("Null requestExtension");
    }

    @Override // defpackage.duda
    public final dspy<dtry, RpcRequestT> a() {
        return this.a;
    }

    @Override // defpackage.duda
    public final dspy<dtrw, RpcResponseT> b() {
        return this.b;
    }

    @Override // defpackage.duda
    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof duda) {
            duda dudaVar = (duda) obj;
            if (this.a.equals(dudaVar.a()) && this.b.equals(dudaVar.b()) && this.c.equals(dudaVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String str = this.c;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 78 + String.valueOf(valueOf2).length() + str.length());
        sb.append("GaiaRequestResponseLookupConfig{requestExtension=");
        sb.append(valueOf);
        sb.append(", responseExtension=");
        sb.append(valueOf2);
        sb.append(", rpcId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
