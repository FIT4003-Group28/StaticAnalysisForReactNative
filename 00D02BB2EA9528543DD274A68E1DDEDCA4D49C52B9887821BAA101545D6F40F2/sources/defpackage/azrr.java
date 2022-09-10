package defpackage;

import java.util.Arrays;
/* compiled from: PG */
/* renamed from: azrr  reason: default package */
/* loaded from: classes3.dex */
final class azrr extends azsg {
    private final dndr b;
    private final ddho c;
    private final String d;
    private final byte[] e;
    private final boolean f;
    private final boolean g;

    public azrr(dndr dndrVar, @dzsi ddho ddhoVar, @dzsi String str, @dzsi byte[] bArr, boolean z, boolean z2) {
        this.b = dndrVar;
        this.c = ddhoVar;
        this.d = str;
        this.e = bArr;
        this.f = z;
        this.g = z2;
    }

    @Override // defpackage.azsg
    public final dndr a() {
        return this.b;
    }

    @Override // defpackage.azsg
    @dzsi
    public final ddho b() {
        return this.c;
    }

    @Override // defpackage.azsg
    @dzsi
    public final String c() {
        return this.d;
    }

    @Override // defpackage.azsg
    @dzsi
    protected final byte[] d() {
        return this.e;
    }

    @Override // defpackage.azsg
    public final boolean e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        ddho ddhoVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof azsg) {
            azsg azsgVar = (azsg) obj;
            if (this.b.equals(azsgVar.a()) && ((ddhoVar = this.c) != null ? ddhoVar.equals(azsgVar.b()) : azsgVar.b() == null) && ((str = this.d) != null ? str.equals(azsgVar.c()) : azsgVar.c() == null)) {
                if (Arrays.equals(this.e, azsgVar instanceof azrr ? ((azrr) azsgVar).e : azsgVar.d()) && this.f == azsgVar.e() && this.g == azsgVar.f()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.azsg
    public final boolean f() {
        return this.g;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() ^ 1000003) * 1000003;
        ddho ddhoVar = this.c;
        int i = 0;
        int hashCode2 = (hashCode ^ (ddhoVar == null ? 0 : ddhoVar.hashCode())) * 1000003;
        String str = this.d;
        if (str != null) {
            i = str.hashCode();
        }
        int hashCode3 = (((hashCode2 ^ i) * 1000003) ^ Arrays.hashCode(this.e)) * 1000003;
        int i2 = 1237;
        int i3 = (hashCode3 ^ (true != this.f ? 1237 : 1231)) * 1000003;
        if (true == this.g) {
            i2 = 1231;
        }
        return i3 ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String str = this.d;
        String arrays = Arrays.toString(this.e);
        boolean z = this.f;
        boolean z2 = this.g;
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 152 + length2 + String.valueOf(str).length() + String.valueOf(arrays).length());
        sb.append("EditAliasMapPointPickerFragmentParameters{aliasType=");
        sb.append(valueOf);
        sb.append(", veType=");
        sb.append(valueOf2);
        sb.append(", aliasEditToken=");
        sb.append(str);
        sb.append(", aliasFlowDataBytes=");
        sb.append(arrays);
        sb.append(", popBackStackOnSuccess=");
        sb.append(z);
        sb.append(", showGdprMessage=");
        sb.append(z2);
        sb.append("}");
        return sb.toString();
    }
}
