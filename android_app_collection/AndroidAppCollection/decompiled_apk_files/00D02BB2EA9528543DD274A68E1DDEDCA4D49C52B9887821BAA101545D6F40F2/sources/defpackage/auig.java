package defpackage;
/* compiled from: PG */
/* renamed from: auig  reason: default package */
/* loaded from: classes.dex */
final class auig extends auit {
    private final String a;

    public auig(String str) {
        if (str != null) {
            this.a = str;
            return;
        }
        throw new NullPointerException("Null oldChannelId");
    }

    @Override // defpackage.auit
    public final String a() {
        return this.a;
    }

    @Override // defpackage.auit
    public final int b() {
        return 2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof auit) {
            auit auitVar = (auit) obj;
            if (this.a.equals(auitVar.a()) && auitVar.b() == 2) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ 2;
    }

    public final String toString() {
        String str = this.a;
        StringBuilder sb = new StringBuilder(str.length() + 57);
        sb.append("ReplacedChannel{oldChannelId=");
        sb.append(str);
        sb.append(", oldImportance=");
        sb.append(2);
        sb.append("}");
        return sb.toString();
    }
}
