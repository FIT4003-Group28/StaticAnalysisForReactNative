package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cter  reason: default package */
/* loaded from: classes5.dex */
public final class cter extends ctfp {
    private final List<ctrg> a;
    private final List<String> b;
    private final boolean c;

    public cter(List<ctrg> list, List<String> list2, boolean z) {
        this.a = list;
        this.b = list2;
        this.c = z;
    }

    @Override // defpackage.ctfp
    public final List<ctrg> a() {
        return this.a;
    }

    @Override // defpackage.ctfp
    public final List<String> b() {
        return this.b;
    }

    @Override // defpackage.ctfp
    public final boolean c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ctfp) {
            ctfp ctfpVar = (ctfp) obj;
            if (this.a.equals(ctfpVar.a()) && this.b.equals(ctfpVar.b()) && this.c == ctfpVar.c()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ (true != this.c ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        boolean z = this.c;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 62 + String.valueOf(valueOf2).length());
        sb.append("PullMessagesResult{tachyonMessages=");
        sb.append(valueOf);
        sb.append(", ackIds=");
        sb.append(valueOf2);
        sb.append(", pulledAll=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
