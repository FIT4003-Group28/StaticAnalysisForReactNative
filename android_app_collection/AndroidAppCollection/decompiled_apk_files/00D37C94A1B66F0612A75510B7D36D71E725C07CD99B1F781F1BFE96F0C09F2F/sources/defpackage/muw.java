package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: muw  reason: default package */
/* loaded from: classes3.dex */
public final class muw implements Comparable {
    public final String a;
    public final String b;
    public final int c;

    public muw(String str, String str2, int i) {
        if (str != null) {
            this.a = str;
            if (str2 != null) {
                this.b = str2;
                this.c = i;
                return;
            }
            throw new NullPointerException("Null regionCode");
        }
        throw new NullPointerException("Null regionName");
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        return this.a.compareTo(((muw) obj).a);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof muw) {
            muw muwVar = (muw) obj;
            if (this.a.equals(muwVar.a) && this.b.equals(muwVar.b) && this.c == muwVar.c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        int i = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 62 + str2.length());
        sb.append("RegionEntry{regionName=");
        sb.append(str);
        sb.append(", regionCode=");
        sb.append(str2);
        sb.append(", callingCode=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }

    public muw() {
    }
}
