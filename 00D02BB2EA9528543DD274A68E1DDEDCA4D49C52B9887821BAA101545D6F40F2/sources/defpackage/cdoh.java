package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: cdoh  reason: default package */
/* loaded from: classes4.dex */
public class cdoh extends cdom {
    public final bvrt<drfq> a;
    private final String b;
    private final boolean c;

    public cdoh(String str, boolean z, bvrt<drfq> bvrtVar) {
        if (str != null) {
            this.b = str;
            this.c = z;
            this.a = bvrtVar;
            return;
        }
        throw new NullPointerException("Null chipText");
    }

    @Override // defpackage.cdom
    public final String a() {
        return this.b;
    }

    @Override // defpackage.cdom
    public final boolean b() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cdom
    public final bvrt<drfq> c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdom) {
            cdom cdomVar = (cdom) obj;
            if (this.b.equals(cdomVar.a()) && this.c == cdomVar.b() && this.a.equals(cdomVar.c())) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() ^ 1000003) * 1000003) ^ (true != this.c ? 1237 : 1231)) * 1000003) ^ this.a.hashCode();
    }

    public final String toString() {
        String str = this.b;
        boolean z = this.c;
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(str.length() + 60 + String.valueOf(valueOf).length());
        sb.append("EditorChip{chipText=");
        sb.append(str);
        sb.append(", selected=");
        sb.append(z);
        sb.append(", serializableOptionId=");
        sb.append(valueOf);
        sb.append("}");
        return sb.toString();
    }
}
