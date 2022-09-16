package defpackage;

import java.io.InputStream;
/* compiled from: PG */
/* renamed from: vnl  reason: default package */
/* loaded from: classes4.dex */
public final class vnl {
    public final aoqu a;
    private final aoos b;

    public vnl(aoqu aoquVar, aoos aoosVar) {
        if (aoquVar != null) {
            this.a = aoquVar;
            if (aoosVar != null) {
                this.b = aoosVar;
                return;
            }
            throw new NullPointerException("Null extensionRegistryLite");
        }
        throw new NullPointerException("Null defaultValue");
    }

    public static vnl a(aoqu aoquVar, aoos aoosVar) {
        return new vnl(aoquVar, aoosVar);
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Object, aoqu] */
    public final aoqu b(InputStream inputStream) {
        return this.a.getParserForType().m(inputStream, this.b);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vnl) {
            vnl vnlVar = (vnl) obj;
            if (this.a.equals(vnlVar.a) && this.b.equals(vnlVar.b)) {
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
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 54 + String.valueOf(valueOf2).length());
        sb.append("ProtoSerializer{defaultValue=");
        sb.append(valueOf);
        sb.append(", extensionRegistryLite=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }

    public vnl() {
    }
}
