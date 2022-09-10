package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: bnon  reason: default package */
/* loaded from: classes3.dex */
public final class bnon extends bnop {
    private final String a;
    private final long b;
    private final dggg c;

    public bnon(@dzsi String str, long j, dggg dgggVar) {
        this.a = str;
        this.b = j;
        if (dgggVar != null) {
            this.c = dgggVar;
            return;
        }
        throw new NullPointerException("Null imageKey");
    }

    @Override // defpackage.bnop
    @dzsi
    public final String a() {
        return this.a;
    }

    @Override // defpackage.bnop
    public final long b() {
        return this.b;
    }

    @Override // defpackage.bnop
    public final dggg c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof bnop) {
            bnop bnopVar = (bnop) obj;
            String str = this.a;
            if (str != null ? str.equals(bnopVar.a()) : bnopVar.a() == null) {
                if (this.b == bnopVar.b() && this.c.equals(bnopVar.c())) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = str == null ? 0 : str.hashCode();
        long j = this.b;
        int i = (((hashCode ^ 1000003) * 1000003) ^ ((int) (j ^ (j >>> 32)))) * 1000003;
        dggg dgggVar = this.c;
        int i2 = dgggVar.bC;
        if (i2 == 0) {
            i2 = dsst.a.b(dgggVar).c(dgggVar);
            dgggVar.bC = i2;
        }
        return i ^ i2;
    }

    public final String toString() {
        String str = this.a;
        long j = this.b;
        String valueOf = String.valueOf(this.c);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 58 + String.valueOf(valueOf).length());
        sb.append("Key{gmmAccountId=");
        sb.append(str);
        sb.append(", fprint=");
        sb.append(j);
        sb.append(", imageKey=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
