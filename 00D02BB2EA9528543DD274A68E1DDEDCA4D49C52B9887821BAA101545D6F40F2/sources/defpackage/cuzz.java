package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: cuzz  reason: default package */
/* loaded from: classes5.dex */
final class cuzz extends cvah {
    private final cufp a;
    private final int b;
    private final dbsg<cugu> c;
    private final List<cufj> d;

    public cuzz(cufp cufpVar, int i, dbsg<cugu> dbsgVar, List<cufj> list) {
        this.a = cufpVar;
        this.b = i;
        this.c = dbsgVar;
        this.d = list;
    }

    @Override // defpackage.cvah
    public final cufp a() {
        return this.a;
    }

    @Override // defpackage.cvah
    public final int b() {
        return this.b;
    }

    @Override // defpackage.cvah
    public final dbsg<cugu> c() {
        return this.c;
    }

    @Override // defpackage.cvah
    public final List<cufj> d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvah) {
            cvah cvahVar = (cvah) obj;
            if (this.a.equals(cvahVar.a()) && this.b == cvahVar.b() && this.c.equals(cvahVar.c()) && this.d.equals(cvahVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003) ^ this.c.hashCode()) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        int i = this.b;
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 96 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("ConversationCellViewModel{conversation=");
        sb.append(valueOf);
        sb.append(", unreadCount=");
        sb.append(i);
        sb.append(", latestMessage=");
        sb.append(valueOf2);
        sb.append(", participants=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
