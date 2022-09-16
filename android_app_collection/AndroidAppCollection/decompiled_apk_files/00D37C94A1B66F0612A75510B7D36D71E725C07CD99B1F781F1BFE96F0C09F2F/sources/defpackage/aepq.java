package defpackage;

import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: aepq  reason: default package */
/* loaded from: classes.dex */
public final class aepq {
    public final apmv a;
    public final ByteBuffer b;

    public aepq(apmv apmvVar, ByteBuffer byteBuffer) {
        if (apmvVar != null) {
            this.a = apmvVar;
            if (byteBuffer != null) {
                this.b = byteBuffer;
                return;
            }
            throw new NullPointerException("Null tfliteModel");
        }
        throw new NullPointerException("Null bandwidthModelConfig");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aepq) {
            aepq aepqVar = (aepq) obj;
            if (this.a.equals(aepqVar.a) && this.b.equals(aepqVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49 + String.valueOf(valueOf2).length());
        sb.append("ModelConfigs{bandwidthModelConfig=");
        sb.append(valueOf);
        sb.append(", tfliteModel=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public aepq() {
    }
}
