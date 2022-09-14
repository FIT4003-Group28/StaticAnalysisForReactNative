package c.e.b.p;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final String f4881a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4882b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public a(String str, String str2) {
        if (str != null) {
            this.f4881a = str;
            if (str2 == null) {
                throw new NullPointerException("Null version");
            }
            this.f4882b = str2;
            return;
        }
        throw new NullPointerException("Null libraryName");
    }

    @Override // c.e.b.p.f
    public String a() {
        return this.f4881a;
    }

    @Override // c.e.b.p.f
    public String b() {
        return this.f4882b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f4881a.equals(fVar.a()) && this.f4882b.equals(fVar.b());
    }

    public int hashCode() {
        return ((this.f4881a.hashCode() ^ 1000003) * 1000003) ^ this.f4882b.hashCode();
    }

    public String toString() {
        return "LibraryVersion{libraryName=" + this.f4881a + ", version=" + this.f4882b + "}";
    }
}
