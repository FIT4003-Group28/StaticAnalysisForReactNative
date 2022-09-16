package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: bd  reason: default package */
/* loaded from: classes2.dex */
public final class bd {
    @Deprecated
    public final bc a;
    @Deprecated
    public final bc b;

    @Deprecated
    public bd(bc bcVar, bc bcVar2) {
        if (bcVar.b == bcVar2.b) {
            this.a = bcVar;
            this.b = bcVar2;
            return;
        }
        String valueOf = String.valueOf(bcVar);
        String valueOf2 = String.valueOf(bcVar2);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 55 + String.valueOf(valueOf2).length());
        sb.append("Ranges must have the same number of visible decimals: ");
        sb.append(valueOf);
        sb.append("~");
        sb.append(valueOf2);
        throw new IllegalArgumentException(sb.toString());
    }

    @Deprecated
    public final String toString() {
        String sb;
        String valueOf = String.valueOf(this.a);
        bc bcVar = this.b;
        if (bcVar == this.a) {
            sb = "";
        } else {
            String valueOf2 = String.valueOf(bcVar);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 1);
            sb2.append("~");
            sb2.append(valueOf2);
            sb = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + String.valueOf(sb).length());
        sb3.append(valueOf);
        sb3.append(sb);
        return sb3.toString();
    }
}
