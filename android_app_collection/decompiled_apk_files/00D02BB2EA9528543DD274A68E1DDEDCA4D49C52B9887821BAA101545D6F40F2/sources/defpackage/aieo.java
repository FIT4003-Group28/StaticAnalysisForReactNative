package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aieo  reason: default package */
/* loaded from: classes2.dex */
final class aieo extends aifj {
    private final List<akuh> a;
    private final akvx b;

    public aieo(List<akuh> list, akvx akvxVar) {
        if (list != null) {
            this.a = list;
            if (akvxVar != null) {
                this.b = akvxVar;
                return;
            }
            throw new NullPointerException("Null styleNamespace");
        }
        throw new NullPointerException("Null styles");
    }

    @Override // defpackage.aifj
    public final List<akuh> a() {
        return this.a;
    }

    @Override // defpackage.aifj
    public final akvx b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof aifj) {
            aifj aifjVar = (aifj) obj;
            if (this.a.equals(aifjVar.a()) && this.b.equals(aifjVar.b())) {
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
        sb.append("StylesToDestroy{styles=");
        sb.append(valueOf);
        sb.append(", styleNamespace=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
