package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: apzl  reason: default package */
/* loaded from: classes2.dex */
public final class apzl extends apzp {
    public final boolean a;

    public apzl(boolean z) {
        this.a = z;
    }

    @Override // defpackage.apzp
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.apzp
    public final apzo b() {
        return new apzk(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof apzp) && this.a == ((apzp) obj).a();
    }

    public final int hashCode() {
        return (true != this.a ? 1237 : 1231) ^ 1000003;
    }

    public final String toString() {
        boolean z = this.a;
        StringBuilder sb = new StringBuilder(48);
        sb.append("ConsumerMessagingData{readReceiptsEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
