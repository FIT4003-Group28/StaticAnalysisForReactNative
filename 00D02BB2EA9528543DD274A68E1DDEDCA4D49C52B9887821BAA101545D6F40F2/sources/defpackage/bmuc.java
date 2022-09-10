package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bmuc  reason: default package */
/* loaded from: classes3.dex */
public final class bmuc extends bmvh {
    private final eapd a;
    private final ango b;

    public bmuc(eapd eapdVar, ango angoVar) {
        this.a = eapdVar;
        if (angoVar != null) {
            this.b = angoVar;
            return;
        }
        throw new NullPointerException("Null listener");
    }

    @Override // defpackage.bmvh
    public final eapd a() {
        return this.a;
    }

    @Override // defpackage.bmvh
    public final ango b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmvh) {
            bmvh bmvhVar = (bmvh) obj;
            if (this.a.equals(bmvhVar.a()) && this.b.equals(bmvhVar.b())) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 41 + String.valueOf(valueOf2).length());
        sb.append("NotHereEditDetails{startTime=");
        sb.append(valueOf);
        sb.append(", listener=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
