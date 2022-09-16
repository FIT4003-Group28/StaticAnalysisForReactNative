package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: vbs  reason: default package */
/* loaded from: classes4.dex */
final class vbs {
    public final Context a;
    public final amqo b;

    public vbs(Context context, amqo amqoVar) {
        if (context != null) {
            this.a = context;
            this.b = amqoVar;
            return;
        }
        throw new NullPointerException("Null context");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vbs) {
            vbs vbsVar = (vbs) obj;
            if (this.a.equals(vbsVar.a)) {
                amqo amqoVar = this.b;
                amqo amqoVar2 = vbsVar.b;
                if (amqoVar != null ? amqoVar.equals(amqoVar2) : amqoVar2 == null) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        amqo amqoVar = this.b;
        return hashCode ^ (amqoVar == null ? 0 : amqoVar.hashCode());
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 46 + String.valueOf(valueOf2).length());
        sb.append("FlagsContext{context=");
        sb.append(valueOf);
        sb.append(", hermeticFileOverrides=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public vbs() {
    }
}
