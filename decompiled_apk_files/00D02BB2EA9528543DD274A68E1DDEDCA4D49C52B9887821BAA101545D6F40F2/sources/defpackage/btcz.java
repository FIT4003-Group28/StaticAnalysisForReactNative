package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: btcz  reason: default package */
/* loaded from: classes4.dex */
public final class btcz extends btdd {
    private final String a;
    private final cqtd b;

    public btcz(String str, cqtd cqtdVar) {
        this.a = str;
        if (cqtdVar != null) {
            this.b = cqtdVar;
            return;
        }
        throw new NullPointerException("Null ripple");
    }

    @Override // defpackage.btdd, defpackage.btdc
    public String a() {
        return this.a;
    }

    @Override // defpackage.btdd, defpackage.btdc
    public cqtd b() {
        return this.b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof btdd) {
            btdd btddVar = (btdd) obj;
            if (this.a.equals(btddVar.a()) && this.b.equals(btddVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode();
    }

    public String toString() {
        String str = this.a;
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(str.length() + 46 + String.valueOf(valueOf).length());
        sb.append("MiscRippleViewModelImpl{rippleLabel=");
        sb.append(str);
        sb.append(", ripple=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
