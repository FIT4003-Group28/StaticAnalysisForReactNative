package defpackage;
/* compiled from: PG */
/* renamed from: bxxw  reason: default package */
/* loaded from: classes4.dex */
final class bxxw extends bxyn {
    private final int a;
    private final dpte b;
    private final dbsz<dpte> c;
    private final bxym d;

    public bxxw(int i, dpte dpteVar, @dzsi dbsz<dpte> dbszVar, bxym bxymVar) {
        this.a = i;
        this.b = dpteVar;
        this.c = dbszVar;
        this.d = bxymVar;
    }

    @Override // defpackage.bxyn
    public final int a() {
        return this.a;
    }

    @Override // defpackage.bxyn
    public final dpte b() {
        return this.b;
    }

    @Override // defpackage.bxyn
    @dzsi
    public final dbsz<dpte> c() {
        return this.c;
    }

    @Override // defpackage.bxyn
    public final bxym d() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        dbsz<dpte> dbszVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof bxyn) {
            bxyn bxynVar = (bxyn) obj;
            if (this.a == bxynVar.a() && this.b.equals(bxynVar.b()) && ((dbszVar = this.c) != null ? dbszVar.equals(bxynVar.c()) : bxynVar.c() == null) && this.d.equals(bxynVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (this.a ^ 1000003) * 1000003;
        dpte dpteVar = this.b;
        int i2 = dpteVar.bC;
        if (i2 == 0) {
            i2 = dsst.a.b(dpteVar).c(dpteVar);
            dpteVar.bC = i2;
        }
        int i3 = (i ^ i2) * 1000003;
        dbsz<dpte> dbszVar = this.c;
        return ((i3 ^ (dbszVar == null ? 0 : dbszVar.hashCode())) * 1000003) ^ this.d.hashCode();
    }

    public final String toString() {
        int i = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String valueOf3 = String.valueOf(this.d);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 85 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("RecentHistoryItemConfig{index=");
        sb.append(i);
        sb.append(", historyItem=");
        sb.append(valueOf);
        sb.append(", deletionHandler=");
        sb.append(valueOf2);
        sb.append(", pageType=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
