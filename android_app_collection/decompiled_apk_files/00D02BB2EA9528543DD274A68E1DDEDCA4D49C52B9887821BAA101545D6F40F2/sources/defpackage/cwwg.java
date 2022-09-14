package defpackage;
/* compiled from: PG */
/* renamed from: cwwg  reason: default package */
/* loaded from: classes5.dex */
final class cwwg extends cwwj {
    private final String a;
    private final boolean b;
    private final eacd c;
    private final dzze d;
    private final String e;

    public cwwg(@dzsi String str, boolean z, eacd eacdVar, @dzsi dzze dzzeVar, @dzsi String str2) {
        this.a = str;
        this.b = z;
        this.c = eacdVar;
        this.d = dzzeVar;
        this.e = str2;
    }

    @Override // defpackage.cwwj
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cwwj
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.cwwj
    public final eacd c() {
        return this.c;
    }

    @Override // defpackage.cwwj
    @dzsi
    public final dzze d() {
        return this.d;
    }

    @Override // defpackage.cwwj
    @dzsi
    public final String e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        dzze dzzeVar;
        String str;
        if (obj == this) {
            return true;
        }
        if (obj instanceof cwwj) {
            cwwj cwwjVar = (cwwj) obj;
            String str2 = this.a;
            if (str2 != null ? str2.equals(cwwjVar.a()) : cwwjVar.a() == null) {
                if (this.b == cwwjVar.b() && this.c.equals(cwwjVar.c()) && ((dzzeVar = this.d) != null ? dzzeVar.equals(cwwjVar.d()) : cwwjVar.d() == null) && ((str = this.e) != null ? str.equals(cwwjVar.e()) : cwwjVar.e() == null)) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i;
        String str = this.a;
        int i2 = 0;
        int hashCode = ((((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231)) * 1000003;
        eacd eacdVar = this.c;
        int i3 = eacdVar.bC;
        if (i3 == 0) {
            i3 = dsst.a.b(eacdVar).c(eacdVar);
            eacdVar.bC = i3;
        }
        int i4 = (hashCode ^ i3) * 1000003;
        dzze dzzeVar = this.d;
        if (dzzeVar == null) {
            i = 0;
        } else {
            i = dzzeVar.bC;
            if (i == 0) {
                i = dsst.a.b(dzzeVar).c(dzzeVar);
                dzzeVar.bC = i;
            }
        }
        int i5 = (i4 ^ i) * 1000003;
        String str2 = this.e;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return i5 ^ i2;
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        String valueOf = String.valueOf(this.c);
        String valueOf2 = String.valueOf(this.d);
        String str2 = this.e;
        int length = String.valueOf(str).length();
        int length2 = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 105 + length2 + String.valueOf(valueOf2).length() + String.valueOf(str2).length());
        sb.append("Metric{customEventName=");
        sb.append(str);
        sb.append(", isEventNameConstant=");
        sb.append(z);
        sb.append(", metric=");
        sb.append(valueOf);
        sb.append(", metricExtension=");
        sb.append(valueOf2);
        sb.append(", accountableComponentName=");
        sb.append(str2);
        sb.append("}");
        return sb.toString();
    }
}
