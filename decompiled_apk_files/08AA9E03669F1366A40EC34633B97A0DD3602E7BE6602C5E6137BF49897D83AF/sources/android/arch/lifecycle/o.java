package android.arch.lifecycle;
/* compiled from: ViewModelProvider.java */
/* loaded from: classes.dex */
public class o {

    /* renamed from: a  reason: collision with root package name */
    private final a f102a;

    /* renamed from: b  reason: collision with root package name */
    private final p f103b;

    /* compiled from: ViewModelProvider.java */
    /* loaded from: classes.dex */
    public interface a {
        <T extends n> T a(Class<T> cls);
    }

    public o(p pVar, a aVar) {
        this.f102a = aVar;
        this.f103b = pVar;
    }

    public <T extends n> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return (T) a("android.arch.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
    }

    public <T extends n> T a(String str, Class<T> cls) {
        T t = (T) this.f103b.a(str);
        if (cls.isInstance(t)) {
            return t;
        }
        T t2 = (T) this.f102a.a(cls);
        this.f103b.a(str, t2);
        return t2;
    }
}
