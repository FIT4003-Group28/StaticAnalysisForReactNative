package b.a.a.a.a.b;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: AdvertisingInfo.java */
/* loaded from: classes.dex */
public class b {

    /* renamed from: a  reason: collision with root package name */
    public final String f1052a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f1053b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public b(String str, boolean z) {
        this.f1052a = str;
        this.f1053b = z;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        if (this.f1053b != bVar.f1053b) {
            return false;
        }
        return this.f1052a == null ? bVar.f1052a == null : this.f1052a.equals(bVar.f1052a);
    }

    public int hashCode() {
        return ((this.f1052a != null ? this.f1052a.hashCode() : 0) * 31) + (this.f1053b ? 1 : 0);
    }
}
