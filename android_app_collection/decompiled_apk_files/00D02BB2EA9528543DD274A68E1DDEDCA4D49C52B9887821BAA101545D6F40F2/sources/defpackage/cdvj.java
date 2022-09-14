package defpackage;
/* compiled from: PG */
/* renamed from: cdvj  reason: default package */
/* loaded from: classes4.dex */
final class cdvj extends cdyl {
    public final int a;
    public final int b;
    public final cdvi c;
    public final ddho d;

    public cdvj(int i, int i2, cdvi cdviVar, ddho ddhoVar) {
        dzvx.c(cdviVar, "action");
        this.a = i;
        this.b = i2;
        this.c = cdviVar;
        this.d = ddhoVar;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof cdvj)) {
                return false;
            }
            cdvj cdvjVar = (cdvj) obj;
            return this.a == cdvjVar.a && this.b == cdvjVar.b && dzvx.d(this.c, cdvjVar.c) && dzvx.d(this.d, cdvjVar.d);
        }
        return true;
    }

    public final int hashCode() {
        int i = ((this.a * 31) + this.b) * 31;
        cdvi cdviVar = this.c;
        return ((i + (cdviVar != null ? cdviVar.hashCode() : 0)) * 31) + this.d.hashCode();
    }

    public final String toString() {
        return "GalleryButton(icon=" + this.a + ", text=" + this.b + ", action=" + this.c + ", visualElement=" + this.d + ")";
    }
}
