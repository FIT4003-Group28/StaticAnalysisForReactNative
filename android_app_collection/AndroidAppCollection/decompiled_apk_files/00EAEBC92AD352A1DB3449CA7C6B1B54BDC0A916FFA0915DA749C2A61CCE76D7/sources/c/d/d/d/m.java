package c.d.d.d;
/* loaded from: classes.dex */
public class m {

    /* loaded from: classes.dex */
    static class a implements l<T> {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Object f2815a;

        a(Object obj) {
            this.f2815a = obj;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [T, java.lang.Object] */
        @Override // c.d.d.d.l
        /* renamed from: get */
        public T mo139get() {
            return this.f2815a;
        }
    }

    /* loaded from: classes.dex */
    static class b implements l<Boolean> {
        b() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // c.d.d.d.l
        /* renamed from: get */
        public Boolean mo139get() {
            return true;
        }
    }

    /* loaded from: classes.dex */
    static class c implements l<Boolean> {
        c() {
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // c.d.d.d.l
        /* renamed from: get */
        public Boolean mo139get() {
            return false;
        }
    }

    static {
        new b();
        new c();
    }

    public static <T> l<T> a(T t) {
        return new a(t);
    }
}
