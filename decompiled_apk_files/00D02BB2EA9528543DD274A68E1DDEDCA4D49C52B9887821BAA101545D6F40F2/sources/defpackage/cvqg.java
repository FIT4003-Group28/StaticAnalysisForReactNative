package defpackage;
/* compiled from: PG */
/* renamed from: cvqg  reason: default package */
/* loaded from: classes5.dex */
public final class cvqg extends cvqh {
    public final String a;
    public final Long b;
    public final dsfr c;

    public cvqg(String str, Long l, dsfr dsfrVar) {
        this.a = str;
        this.b = l;
        this.c = dsfrVar;
    }

    @Override // defpackage.cvqh
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cvqh
    public final Long b() {
        return this.b;
    }

    @Override // defpackage.cvqh
    public final dsfr c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cvqh) {
            cvqh cvqhVar = (cvqh) obj;
            if (this.a.equals(cvqhVar.a()) && this.b.equals(cvqhVar.b()) && this.c.equals(cvqhVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        dsfr dsfrVar = this.c;
        int i = dsfrVar.bC;
        if (i == 0) {
            i = dsst.a.b(dsfrVar).c(dsfrVar);
            dsfrVar.bC = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 52 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("OptimizedThread{id=");
        sb.append(str);
        sb.append(", lastUpdatedVersion=");
        sb.append(valueOf);
        sb.append(", schedule=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
