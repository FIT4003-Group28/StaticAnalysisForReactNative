package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aljx  reason: default package */
/* loaded from: classes2.dex */
public final class aljx extends alqf {
    public final amxf a;
    public final boolean b;

    public aljx(amxf amxfVar, boolean z) {
        this.a = amxfVar;
        this.b = z;
    }

    @Override // defpackage.alqf
    public final amxf a() {
        return this.a;
    }

    @Override // defpackage.alqf
    public final boolean b() {
        return this.b;
    }

    @Override // defpackage.alqf
    public final alqe c() {
        return new aljw(this);
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof alqf) {
            alqf alqfVar = (alqf) obj;
            if (this.a.equals(alqfVar.a()) && this.b == alqfVar.b()) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a.hashCode() ^ 1000003) * 1000003) ^ (true != this.b ? 1237 : 1231);
    }

    public final String toString() {
        String valueOf = String.valueOf(this.a);
        boolean z = this.b;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 49);
        sb.append("DrawingConfig{drawMode=");
        sb.append(valueOf);
        sb.append(", isDarkModeEnabled=");
        sb.append(z);
        sb.append("}");
        return sb.toString();
    }
}
