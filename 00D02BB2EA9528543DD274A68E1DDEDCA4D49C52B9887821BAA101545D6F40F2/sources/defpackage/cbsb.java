package defpackage;
/* compiled from: PG */
/* renamed from: cbsb  reason: default package */
/* loaded from: classes4.dex */
public final class cbsb extends cbss {
    public final crzm<cbuf> a;
    public final crzm<cbto> b;
    public final crzm<cbtv> c;

    public cbsb(crzm<cbuf> crzmVar, crzm<cbto> crzmVar2, crzm<cbtv> crzmVar3) {
        this.a = crzmVar;
        this.b = crzmVar2;
        this.c = crzmVar3;
    }

    @Override // defpackage.cbss
    public final crzm<cbuf> a() {
        return this.a;
    }

    @Override // defpackage.cbss
    public final crzm<cbto> b() {
        return this.b;
    }

    @Override // defpackage.cbss
    public final crzm<cbtv> c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cbss) {
            cbss cbssVar = (cbss) obj;
            if (this.a.equals(cbssVar.a()) && this.b.equals(cbssVar.b()) && this.c.equals(cbssVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        int length = String.valueOf(valueOf).length();
        StringBuilder sb = new StringBuilder(length + 39 + String.valueOf(valueOf2).length() + String.valueOf(valueOf3).length());
        sb.append("States{taskType=");
        sb.append(valueOf);
        sb.append(", placeTopic=");
        sb.append(valueOf2);
        sb.append(", review=");
        sb.append(valueOf3);
        sb.append("}");
        return sb.toString();
    }
}
