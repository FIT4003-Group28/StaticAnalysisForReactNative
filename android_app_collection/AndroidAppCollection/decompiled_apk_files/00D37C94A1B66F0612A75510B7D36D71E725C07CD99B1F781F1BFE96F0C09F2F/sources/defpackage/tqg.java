package defpackage;
/* compiled from: PG */
/* renamed from: tqg  reason: default package */
/* loaded from: classes4.dex */
public final class tqg {
    public final boolean a;
    public final boolean b;
    public final ampq c;
    private final ampq d;
    private final ampq e;

    public tqg() {
    }

    public tqg(boolean z, boolean z2, ampq ampqVar, ampq ampqVar2, ampq ampqVar3) {
        this.a = z;
        this.b = z2;
        this.c = ampqVar;
        this.d = ampqVar2;
        this.e = ampqVar3;
    }

    public static tqf a() {
        tqf tqfVar = new tqf(null);
        tqfVar.b(false);
        tqfVar.a = false;
        return tqfVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof tqg) {
            tqg tqgVar = (tqg) obj;
            if (this.a == tqgVar.a && this.b == tqgVar.b && this.c.equals(tqgVar.c) && this.d.equals(tqgVar.d) && this.e.equals(tqgVar.e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 1237;
        int i2 = ((true != this.a ? 1237 : 1231) ^ 1000003) * 1000003;
        if (true == this.b) {
            i = 1231;
        }
        return ((((((i2 ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String valueOf3 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 137 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("GetFileGroupsByFilterRequest{includeAllGroups=");
        sb.append(z);
        sb.append(", groupWithNoAccountOnly=");
        sb.append(z2);
        sb.append(", groupNameOptional=");
        sb.append(valueOf);
        sb.append(", accountOptional=");
        sb.append(valueOf2);
        sb.append(", sourceOptional=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
