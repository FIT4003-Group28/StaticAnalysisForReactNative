package defpackage;
/* compiled from: PG */
/* renamed from: cdoi  reason: default package */
/* loaded from: classes4.dex */
public class cdoi extends cdop {
    public final dcdc<cdom> a;
    public final bvrt<drfq> b;
    private final String c;
    private final boolean d;

    public cdoi(String str, dcdc<cdom> dcdcVar, boolean z, bvrt<drfq> bvrtVar) {
        if (str != null) {
            this.c = str;
            if (dcdcVar != null) {
                this.a = dcdcVar;
                this.d = z;
                this.b = bvrtVar;
                return;
            }
            throw new NullPointerException("Null getChips");
        }
        throw new NullPointerException("Null getHeaderText");
    }

    @Override // defpackage.cdop
    public final String a() {
        return this.c;
    }

    @Override // defpackage.cdop
    public final dcdc<cdom> b() {
        return this.a;
    }

    @Override // defpackage.cdop
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.cdop
    protected final bvrt<drfq> d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdop) {
            cdop cdopVar = (cdop) obj;
            if (this.c.equals(cdopVar.a()) && dchl.m(this.a, cdopVar.b()) && this.d == cdopVar.c() && this.b.equals(cdopVar.d())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.c.hashCode() ^ 1000003) * 1000003) ^ this.a.hashCode()) * 1000003) ^ (true != this.d ? 1237 : 1231)) * 1000003) ^ this.b.hashCode();
    }

    public final String toString() {
        String str = this.c;
        String valueOf = String.valueOf(this.a);
        boolean z = this.d;
        String valueOf2 = String.valueOf(this.b);
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 99 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("EditorChipsComponent{getHeaderText=");
        sb.append(str);
        sb.append(", getChips=");
        sb.append(valueOf);
        sb.append(", allowMultiSelect=");
        sb.append(z);
        sb.append(", getSerializableQuestionId=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
