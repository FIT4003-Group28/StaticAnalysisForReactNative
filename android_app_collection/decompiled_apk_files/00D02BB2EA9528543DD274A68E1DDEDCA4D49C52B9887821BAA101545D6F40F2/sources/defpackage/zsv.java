package defpackage;
/* compiled from: PG */
/* renamed from: zsv  reason: default package */
/* loaded from: classes7.dex */
final class zsv extends zws {
    private final boolean a;
    private final boolean b;
    private final String c;
    private final String d;

    public zsv(boolean z, boolean z2, @dzsi String str, @dzsi String str2) {
        this.a = z;
        this.b = z2;
        this.c = str;
        this.d = str2;
    }

    @Override // defpackage.zws
    public final boolean a() {
        return this.a;
    }

    @Override // defpackage.zws
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.zws
    @dzsi
    public final String c() {
        return this.c;
    }

    @Override // defpackage.zws
    @dzsi
    public final String d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zws) {
            zws zwsVar = (zws) obj;
            if (this.a == zwsVar.a() && this.b == zwsVar.b() && ((str = this.c) != null ? str.equals(zwsVar.c()) : zwsVar.c() == null) && ((str2 = this.d) != null ? str2.equals(zwsVar.d()) : zwsVar.d() == null)) {
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
        int i3 = (i2 ^ i) * 1000003;
        String str = this.c;
        int i4 = 0;
        int hashCode = (i3 ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.d;
        if (str2 != null) {
            i4 = str2.hashCode();
        }
        return hashCode ^ i4;
    }

    public final String toString() {
        boolean z = this.a;
        boolean z2 = this.b;
        String str = this.c;
        String str2 = this.d;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 74 + String.valueOf(str2).length());
        sb.append("TrainCarSpec{recommendedCar=");
        sb.append(z);
        sb.append(", headCar=");
        sb.append(z2);
        sb.append(", label=");
        sb.append(str);
        sb.append(", alternateLabel=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
