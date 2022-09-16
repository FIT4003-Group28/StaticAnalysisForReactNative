package c.e.b.m;
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public enum a {
        NONE(0),
        SDK(1),
        GLOBAL(2),
        COMBINED(3);
        

        /* renamed from: b  reason: collision with root package name */
        private final int f4873b;

        a(int i) {
            this.f4873b = i;
        }

        public int a() {
            return this.f4873b;
        }
    }

    a a(String str);
}
