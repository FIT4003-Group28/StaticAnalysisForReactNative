package c.a.a.w;
/* loaded from: classes.dex */
public enum a {
    JSON(".json"),
    ZIP(".zip");
    

    /* renamed from: b  reason: collision with root package name */
    public final String f2613b;

    a(String str) {
        this.f2613b = str;
    }

    public String a() {
        return ".temp" + this.f2613b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f2613b;
    }
}
