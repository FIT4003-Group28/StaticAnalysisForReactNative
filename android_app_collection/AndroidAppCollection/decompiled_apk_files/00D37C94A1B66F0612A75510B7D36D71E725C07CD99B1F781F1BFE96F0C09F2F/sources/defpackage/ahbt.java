package defpackage;
/* compiled from: PG */
/* renamed from: ahbt  reason: default package */
/* loaded from: classes.dex */
public final class ahbt {
    public final boolean a;
    private final int b;

    public ahbt() {
    }

    public ahbt(boolean z, int i) {
        this.a = z;
        this.b = i;
    }

    public static ahbt a(boolean z) {
        ahbs ahbsVar = new ahbs();
        ahbsVar.a = Boolean.valueOf(z);
        ahbsVar.b = 0;
        Boolean bool = ahbsVar.a;
        if (bool == null || ahbsVar.b == null) {
            StringBuilder sb = new StringBuilder();
            if (ahbsVar.a == null) {
                sb.append(" shouldShow");
            }
            if (ahbsVar.b == null) {
                sb.append(" removeActionType");
            }
            String valueOf = String.valueOf(sb);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(valueOf);
            throw new IllegalStateException(sb2.toString());
        }
        return new ahbt(bool.booleanValue(), ahbsVar.b.intValue());
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ahbt) {
            ahbt ahbtVar = (ahbt) obj;
            if (this.a == ahbtVar.a && this.b == ahbtVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        boolean z = this.a;
        int i = this.b;
        StringBuilder sb = new StringBuilder(73);
        sb.append("OfflineActionDialogConfig{shouldShow=");
        sb.append(z);
        sb.append(", removeActionType=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
