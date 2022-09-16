package androidx.lifecycle;
/* loaded from: classes.dex */
public class t {

    /* renamed from: a  reason: collision with root package name */
    private final a f1877a;

    /* renamed from: b  reason: collision with root package name */
    private final u f1878b;

    /* loaded from: classes.dex */
    public interface a {
        <T extends s> T a(Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static abstract class b extends c implements a {
        b() {
        }

        @Override // androidx.lifecycle.t.a
        public <T extends s> T a(Class<T> cls) {
            throw new UnsupportedOperationException("create(String, Class<?>) must be called on implementaions of KeyedFactory");
        }

        public abstract <T extends s> T a(String str, Class<T> cls);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class c {
        c() {
        }

        void a(s sVar) {
        }
    }

    public t(u uVar, a aVar) {
        this.f1877a = aVar;
        this.f1878b = uVar;
    }

    public <T extends s> T a(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) a("androidx.lifecycle.ViewModelProvider.DefaultKey:" + canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public <T extends s> T a(String str, Class<T> cls) {
        T t = (T) this.f1878b.a(str);
        if (cls.isInstance(t)) {
            a aVar = this.f1877a;
            if (aVar instanceof c) {
                ((c) aVar).a(t);
            }
            return t;
        }
        a aVar2 = this.f1877a;
        T t2 = aVar2 instanceof b ? (T) ((b) aVar2).a(str, cls) : (T) aVar2.a(cls);
        this.f1878b.a(str, t2);
        return t2;
    }
}
