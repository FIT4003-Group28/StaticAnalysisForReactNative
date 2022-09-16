package defpackage;

import defpackage.dssj;
/* compiled from: PG */
/* renamed from: ducz  reason: default package */
/* loaded from: classes6.dex */
final class ducz<RpcRequestT, RpcResponseT extends dssj> extends dudd<RpcRequestT, RpcResponseT> {
    private final dhgn<RpcRequestT> a;
    private final ducv<? super RpcRequestT> b;
    private final dspy<dtrw, RpcResponseT> c;
    private final String d;

    public ducz(@dzsi dhgn<RpcRequestT> dhgnVar, @dzsi ducv<? super RpcRequestT> ducvVar, dspy<dtrw, RpcResponseT> dspyVar, String str) {
        this.a = dhgnVar;
        this.b = ducvVar;
        this.c = dspyVar;
        this.d = str;
    }

    @Override // defpackage.dudd
    @dzsi
    public final dhgn<RpcRequestT> a() {
        return this.a;
    }

    @Override // defpackage.dudd
    @dzsi
    public final ducv<? super RpcRequestT> b() {
        return this.b;
    }

    @Override // defpackage.dudd
    public final dspy<dtrw, RpcResponseT> c() {
        return this.c;
    }

    @Override // defpackage.dudd
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof dudd) {
            dudd duddVar = (dudd) obj;
            dhgn<RpcRequestT> dhgnVar = this.a;
            if (dhgnVar != null ? dhgnVar.equals(duddVar.a()) : duddVar.a() == null) {
                ducv<? super RpcRequestT> ducvVar = this.b;
                if (ducvVar != null ? ducvVar.equals(duddVar.b()) : duddVar.b() == null) {
                    if (this.c.equals(duddVar.c()) && this.d.equals(duddVar.d())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        dhgn<RpcRequestT> dhgnVar = this.a;
        int i = 0;
        int hashCode = ((dhgnVar == null ? 0 : dhgnVar.hashCode()) ^ 1000003) * 1000003;
        ducv<? super RpcRequestT> ducvVar = this.b;
        if (ducvVar != null) {
            i = ducvVar.hashCode();
        }
        return ((((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        String str = this.d;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 91 + length2 + String.valueOf(valueOf3).length() + String.valueOf(str).length());
        sb.append("InfiniteDataLookupConfig{requestMarshaller=");
        sb.append(valueOf);
        sb.append(", spannerKeyType=");
        sb.append(valueOf2);
        sb.append(", responseExtension=");
        sb.append(valueOf3);
        sb.append(", tableId=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }
}
