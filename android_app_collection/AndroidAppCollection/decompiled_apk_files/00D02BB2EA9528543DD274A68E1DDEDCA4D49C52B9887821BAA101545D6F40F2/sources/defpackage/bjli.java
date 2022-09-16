package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bjli  reason: default package */
/* loaded from: classes3.dex */
public final class bjli extends bjml {
    private final ilo a;
    private final bjfs b;
    private final btlu c;
    private final boolean d;
    private final bjfz e;

    public bjli(ilo iloVar, bjfs bjfsVar, btlu btluVar, boolean z, bjfz bjfzVar) {
        this.a = iloVar;
        this.b = bjfsVar;
        this.c = btluVar;
        this.d = z;
        this.e = bjfzVar;
    }

    @Override // defpackage.bjml
    public final ilo a() {
        return this.a;
    }

    @Override // defpackage.bjml
    public final bjfs b() {
        return this.b;
    }

    @Override // defpackage.bjml
    public final btlu c() {
        return this.c;
    }

    @Override // defpackage.bjml
    public final boolean d() {
        return this.d;
    }

    @Override // defpackage.bjml
    public final bjfz e() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bjml) {
            bjml bjmlVar = (bjml) obj;
            if (this.a.equals(bjmlVar.a()) && this.b.equals(bjmlVar.b()) && this.c.equals(bjmlVar.c()) && this.d == bjmlVar.d() && this.e.equals(bjmlVar.e())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.a.hashCode() ^ 1000003) * 1000003;
        bjfs bjfsVar = this.b;
        int i = bjfsVar.bC;
        if (i == 0) {
            i = dsst.a.b(bjfsVar).c(bjfsVar);
            bjfsVar.bC = i;
        }
        int hashCode2 = (((((hashCode ^ i) * 1000003) ^ this.c.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003;
        bjfz bjfzVar = this.e;
        int i2 = bjfzVar.bC;
        if (i2 == 0) {
            i2 = dsst.a.b(bjfzVar).c(bjfzVar);
            bjfzVar.bC = i2;
        }
        return hashCode2 ^ i2;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        String valueOf2 = String.valueOf(this.b);
        String valueOf3 = String.valueOf(this.c);
        boolean z = this.d;
        String valueOf4 = String.valueOf(this.e);
        int length = String.valueOf(valueOf).length();
        int length2 = String.valueOf(valueOf2).length();
        StringBuilder sb = new StringBuilder(length + 98 + length2 + String.valueOf(valueOf3).length() + String.valueOf(valueOf4).length());
        sb.append("SingleQuestionPageState{placemark=");
        sb.append(valueOf);
        sb.append(", questionBundle=");
        sb.append(valueOf2);
        sb.append(", gmmAccount=");
        sb.append(valueOf3);
        sb.append(", isReadyToRender=");
        sb.append(z);
        sb.append(", options=");
        sb.append(valueOf4);
        sb.append("}");
        return sb.toString();
    }
}
