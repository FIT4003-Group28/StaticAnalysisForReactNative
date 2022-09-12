package defpackage;
/* compiled from: PG */
/* renamed from: cdol  reason: default package */
/* loaded from: classes4.dex */
public final class cdol extends cdoq {
    private final String a;
    private final boolean b;

    public cdol(String str, boolean z) {
        if (str != null) {
            this.a = str;
            this.b = z;
            return;
        }
        throw new NullPointerException("Null promptText");
    }

    @Override // defpackage.cdoq
    public final String a() {
        return this.a;
    }

    @Override // defpackage.cdoq
    public final boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof cdoq) {
            cdoq cdoqVar = (cdoq) obj;
            if (this.a.equals(cdoqVar.a()) && this.b == cdoqVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String str = this.a;
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(str.length() + 46);
        sb.append("EditorPromptComponent{promptText=");
        sb.append(str);
        sb.append(", beta=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
