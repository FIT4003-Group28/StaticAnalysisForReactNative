package defpackage;

import java.util.List;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: yyn  reason: default package */
/* loaded from: classes7.dex */
public final class yyn extends zaw {
    private final dooa a;
    private final String b;
    private final List<dpce> c;
    private final int d;

    public yyn(dooa dooaVar, @dzsi String str, List<dpce> list, int i) {
        if (dooaVar != null) {
            this.a = dooaVar;
            this.b = str;
            if (list != null) {
                this.c = list;
                this.d = i;
                return;
            }
            throw new NullPointerException("Null renderables");
        }
        throw new NullPointerException("Null departure");
    }

    @Override // defpackage.zaw
    public final dooa a() {
        return this.a;
    }

    @Override // defpackage.zaw
    @dzsi
    public final String b() {
        return this.b;
    }

    @Override // defpackage.zaw
    public final List<dpce> c() {
        return this.c;
    }

    @Override // defpackage.zaw
    public final int d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof zaw) {
            zaw zawVar = (zaw) obj;
            if (this.a.equals(zawVar.a()) && ((str = this.b) != null ? str.equals(zawVar.b()) : zawVar.b() == null) && this.c.equals(zawVar.c()) && this.d == zawVar.d()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        dooa dooaVar = this.a;
        int i = dooaVar.bC;
        if (i == 0) {
            i = dsst.a.b(dooaVar).c(dooaVar);
            dooaVar.bC = i;
        }
        int i2 = (i ^ 1000003) * 1000003;
        String str = this.b;
        return this.d ^ ((((i2 ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b;
        String valueOf2 = String.valueOf(this.c);
        int i = this.d;
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 87 + String.valueOf(str).length() + String.valueOf(valueOf2).length());
        sb.append("StationDeparture{departure=");
        sb.append(valueOf);
        sb.append(", headsign=");
        sb.append(str);
        sb.append(", renderables=");
        sb.append(valueOf2);
        sb.append(", leadingPolylineIndex=");
        sb.append(i);
        sb.append("}");
        return sb.toString();
    }
}
