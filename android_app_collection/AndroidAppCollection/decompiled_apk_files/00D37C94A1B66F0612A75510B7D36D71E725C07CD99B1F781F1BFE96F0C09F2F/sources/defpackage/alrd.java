package defpackage;
/* compiled from: PG */
/* renamed from: alrd  reason: default package */
/* loaded from: classes.dex */
public final class alrd {
    public final int a;
    public final boolean b;

    public alrd() {
    }

    public alrd(int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public static alrd a(int i) {
        alrc alrcVar = new alrc();
        alrcVar.a = Integer.valueOf(i);
        alrcVar.b = false;
        Integer num = alrcVar.a;
        if (num == null || alrcVar.b == null) {
            StringBuilder sb = new StringBuilder();
            if (alrcVar.a == null) {
                sb.append(" appUpdateType");
            }
            if (alrcVar.b == null) {
                sb.append(" allowAssetPackDeletion");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new alrd(num.intValue(), alrcVar.b.booleanValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alrd) {
            alrd alrdVar = (alrd) obj;
            if (this.a == alrdVar.a && this.b == alrdVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        int i = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("AppUpdateOptions{appUpdateType=");
        sb.append(i);
        sb.append(", allowAssetPackDeletion=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
