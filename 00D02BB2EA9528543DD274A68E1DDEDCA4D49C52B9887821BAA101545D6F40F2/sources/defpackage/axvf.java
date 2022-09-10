package defpackage;
/* compiled from: PG */
/* renamed from: axvf  reason: default package */
/* loaded from: classes3.dex */
final class axvf extends axvh {
    private final CharSequence a;
    private final cjtd b;
    private final axvg c;

    public axvf(CharSequence charSequence, cjtd cjtdVar, axvg axvgVar) {
        if (charSequence != null) {
            this.a = charSequence;
            this.b = cjtdVar;
            if (axvgVar != null) {
                this.c = axvgVar;
                return;
            }
            throw new NullPointerException("Null clickHandler");
        }
        throw new NullPointerException("Null text");
    }

    @Override // defpackage.axvh
    protected final CharSequence b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof axvh) {
            axvh axvhVar = (axvh) obj;
            if (this.a.equals(axvhVar.b()) && this.b.equals(axvhVar.j()) && this.c.equals(axvhVar.k())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode();
    }

    @Override // defpackage.axvh
    protected final cjtd j() {
        return this.b;
    }

    @Override // defpackage.axvh
    protected final axvg k() {
        return this.c;
    }

    public String toString() {
        CharSequence charSequence = this.a;
        String valueOf = String.valueOf(this.b);
        String valueOf2 = String.valueOf(this.c);
        String str = (String) charSequence;
        int length = str.length();
        StringBuilder sb = new StringBuilder(length + 59 + String.valueOf(valueOf).length() + String.valueOf(valueOf2).length());
        sb.append("CustomButtonViewModelImpl{text=");
        sb.append(str);
        sb.append(", ue3Params=");
        sb.append(valueOf);
        sb.append(", clickHandler=");
        sb.append(valueOf2);
        sb.append("}");
        return sb.toString();
    }
}
