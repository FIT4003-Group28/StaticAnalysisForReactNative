package defpackage;
/* compiled from: PG */
/* renamed from: skv  reason: default package */
/* loaded from: classes4.dex */
public final class skv {
    public final anvy a;
    public final int b;

    public skv(anvy anvyVar, int i) {
        if (anvyVar != null) {
            this.a = anvyVar;
            this.b = i;
            return;
        }
        throw new NullPointerException("Null experienceRequestProto");
    }

    public final boolean a() {
        anvx anvxVar;
        anvy anvyVar = this.a;
        if (anvyVar.e == 5) {
            anvxVar = (anvx) anvyVar.f;
        } else {
            anvxVar = anvx.a;
        }
        awfh awfhVar = anvxVar.d;
        if (awfhVar == null) {
            awfhVar = awfh.a;
        }
        awgf awgfVar = awfhVar.d;
        if (awgfVar == null) {
            awgfVar = awgf.a;
        }
        return awgfVar.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof skv) {
            skv skvVar = (skv) obj;
            if (this.a.equals(skvVar.a) && this.b == skvVar.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String str = this.b != 1 ? "DARK" : "LIGHT";
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 48 + str.length());
        sb.append("FaceViewerModel{experienceRequestProto=");
        sb.append(valueOf);
        sb.append(", theme=");
        sb.append(str);
        sb.append("}");
        return sb.toString();
    }

    public skv() {
    }
}
