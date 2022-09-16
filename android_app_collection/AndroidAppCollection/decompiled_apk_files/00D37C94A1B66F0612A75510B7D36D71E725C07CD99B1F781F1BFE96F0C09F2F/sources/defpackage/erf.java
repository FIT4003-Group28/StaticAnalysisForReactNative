package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: erf  reason: default package */
/* loaded from: classes3.dex */
public final class erf extends erh {
    private final String a;
    private final aumx b;

    public erf(String str, aumx aumxVar) {
        if (str != null) {
            this.a = str;
            if (aumxVar != null) {
                this.b = aumxVar;
                return;
            }
            throw new NullPointerException("Null reloadContinuationData");
        }
        throw new NullPointerException("Null sectionId");
    }

    @Override // defpackage.erh
    public aumx a() {
        return this.b;
    }

    @Override // defpackage.erh
    public String b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof erh) {
            erh erhVar = (erh) obj;
            if (this.a.equals(erhVar.b()) && this.b.equals(erhVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 55 + String.valueOf(valueOf).length());
        sb.append("SectionReloadEvent{sectionId=");
        sb.append(str);
        sb.append(", reloadContinuationData=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
