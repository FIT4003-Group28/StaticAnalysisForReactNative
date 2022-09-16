package ezvcard.a;
/* compiled from: ParseWarning.java */
/* loaded from: classes.dex */
public class d {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f5506a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f5507b;

    /* renamed from: c  reason: collision with root package name */
    private final String f5508c;

    /* renamed from: d  reason: collision with root package name */
    private final String f5509d;

    private d(Integer num, String str, Integer num2, String str2) {
        this.f5507b = num;
        this.f5508c = str;
        this.f5506a = num2;
        this.f5509d = str2;
    }

    public String toString() {
        int i;
        String str = this.f5509d;
        if (this.f5506a != null) {
            str = "(" + this.f5506a + ") " + str;
        }
        if (this.f5507b == null && this.f5508c == null) {
            return str;
        }
        if (this.f5507b != null || this.f5508c == null) {
            i = (this.f5507b == null || this.f5508c != null) ? 36 : 37;
        } else {
            i = 35;
        }
        return ezvcard.b.INSTANCE.b(i, this.f5507b, this.f5508c, str);
    }

    /* compiled from: ParseWarning.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f5510a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f5511b;

        /* renamed from: c  reason: collision with root package name */
        private String f5512c;

        /* renamed from: d  reason: collision with root package name */
        private String f5513d;

        public a() {
        }

        public a(c cVar) {
            a(cVar.b());
            a(cVar.c());
        }

        public a a(String str) {
            this.f5512c = str;
            return this;
        }

        public a a(Integer num) {
            this.f5510a = num;
            return this;
        }

        public a a(int i, Object... objArr) {
            this.f5511b = Integer.valueOf(i);
            this.f5513d = ezvcard.b.INSTANCE.b(i, objArr);
            return this;
        }

        public a a(ezvcard.a.a aVar) {
            return a(aVar.a().intValue(), aVar.b());
        }

        public d a() {
            return new d(this.f5510a, this.f5512c, this.f5511b, this.f5513d);
        }
    }
}
