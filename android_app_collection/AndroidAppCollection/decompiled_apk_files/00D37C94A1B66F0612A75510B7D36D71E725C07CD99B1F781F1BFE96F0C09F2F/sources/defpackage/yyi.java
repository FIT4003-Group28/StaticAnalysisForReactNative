package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yyi  reason: default package */
/* loaded from: classes4.dex */
public final class yyi extends zab {
    private final String a;
    private final aumx b;
    private final apzg c;
    private final int d;

    public yyi(String str, aumx aumxVar, apzg apzgVar, int i) {
        if (str != null) {
            this.a = str;
            if (aumxVar != null) {
                this.b = aumxVar;
                this.c = apzgVar;
                this.d = i;
                return;
            }
            throw new NullPointerException("Null reloadContinuationData");
        }
        throw new NullPointerException("Null targetId");
    }

    @Override // defpackage.zab
    public int a() {
        return this.d;
    }

    @Override // defpackage.zab
    public apzg b() {
        return this.c;
    }

    @Override // defpackage.zab
    public aumx c() {
        return this.b;
    }

    @Override // defpackage.zab
    public String d() {
        return this.a;
    }

    public boolean equals(Object obj) {
        apzg apzgVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zab) {
            zab zabVar = (zab) obj;
            if (this.a.equals(zabVar.d()) && this.b.equals(zabVar.c()) && ((apzgVar = this.c) != null ? apzgVar.equals(zabVar.b()) : zabVar.b() == null) && this.d == zabVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int hashCode = (((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003;
        apzg apzgVar = this.c;
        return ((hashCode ^ (apzgVar == null ? 0 : apzgVar.hashCode())) * 1000003) ^ this.d;
    }

    public String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        int length = String.valueOf(str).length();
        StringBuilder sb = new StringBuilder(length + 90 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("ReloadSectionListEvent{targetId=");
        sb.append(str);
        sb.append(", reloadContinuationData=");
        sb.append(valueOf);
        sb.append(", command=");
        sb.append(valueOf2);
        sb.append(", pageType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
