package defpackage;

import defpackage.dssj;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aigg  reason: default package */
/* loaded from: classes2.dex */
public final class aigg<M extends dssj> extends aihk<M> {
    public final eapd a;
    private final M b;

    public aigg(M m, eapd eapdVar) {
        if (m != null) {
            this.b = m;
            this.a = eapdVar;
            return;
        }
        throw new NullPointerException("Null getSnapshot");
    }

    @Override // defpackage.aihk
    public final M a() {
        return this.b;
    }

    @Override // defpackage.aihk
    public final eapd b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aihk) {
            aihk aihkVar = (aihk) obj;
            if (this.b.equals(aihkVar.a()) && this.a.equals(aihkVar.b())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 38 + String.valueOf(valueOf2).length());
        sb.append("BaseSnapshot{getSnapshot=");
        sb.append(valueOf);
        sb.append(", timestamp=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
