package defpackage;
/* compiled from: PG */
/* renamed from: bmry  reason: default package */
/* loaded from: classes3.dex */
public final class bmry extends bmsg {
    public final eapd a;
    private final String b;
    private final dtcc c;

    public bmry(String str, eapd eapdVar, dtcc dtccVar) {
        if (str != null) {
            this.b = str;
            if (eapdVar != null) {
                this.a = eapdVar;
                if (dtccVar != null) {
                    this.c = dtccVar;
                    return;
                }
                throw new NullPointerException("Null locationSurvey");
            }
            throw new NullPointerException("Null userActionTime");
        }
        throw new NullPointerException("Null accountId");
    }

    @Override // defpackage.bmsg
    public final String a() {
        return this.b;
    }

    @Override // defpackage.bmsg
    public final eapd b() {
        return this.a;
    }

    @Override // defpackage.bmsg
    public final dtcc c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bmsg) {
            bmsg bmsgVar = (bmsg) obj;
            if (this.b.equals(bmsgVar.a()) && this.a.equals(bmsgVar.b()) && this.c.equals(bmsgVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((this.b.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003;
        dtcc dtccVar = this.c;
        int i = dtccVar.bC;
        if (i == 0) {
            i = dsst.a.b(dtccVar).c(dtccVar);
            dtccVar.bC = i;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.b;
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.c);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 65 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("OwnedLocationSurvey{accountId=");
        sb.append(str);
        sb.append(", userActionTime=");
        sb.append(valueOf);
        sb.append(", locationSurvey=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
