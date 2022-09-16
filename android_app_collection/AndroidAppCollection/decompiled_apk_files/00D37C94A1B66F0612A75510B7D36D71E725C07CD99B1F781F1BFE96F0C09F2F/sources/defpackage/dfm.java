package defpackage;
/* compiled from: PG */
/* renamed from: dfm  reason: default package */
/* loaded from: classes3.dex */
public final class dfm {
    public final dfn a;
    public final float b;

    public dfm(dfn dfnVar, float f) {
        this.a = dfnVar;
        this.b = f;
    }

    public final def a() {
        return this.a.a;
    }

    public final dfe b() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            dfm dfmVar = (dfm) obj;
            if (Float.compare(dfmVar.b, this.b) == 0 && this.a.equals(dfmVar.a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        float f = this.b;
        return hashCode + (f != 0.0f ? Float.floatToIntBits(f) : 0);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        float f = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 64);
        sb.append("PropertyAnimation{ PropertyHandle=");
        sb.append(valueOf);
        sb.append(", TargetValue=");
        sb.append(f);
        sb.append("}");
        return sb.toString();
    }
}
