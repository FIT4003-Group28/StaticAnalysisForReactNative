package c.e.a.a.i;

import c.e.a.a.i.m;
import java.util.Arrays;
/* loaded from: classes.dex */
final class c extends m {

    /* renamed from: a  reason: collision with root package name */
    private final String f3697a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f3698b;

    /* renamed from: c  reason: collision with root package name */
    private final c.e.a.a.d f3699c;

    /* loaded from: classes.dex */
    static final class b extends m.a {

        /* renamed from: a  reason: collision with root package name */
        private String f3700a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f3701b;

        /* renamed from: c  reason: collision with root package name */
        private c.e.a.a.d f3702c;

        @Override // c.e.a.a.i.m.a
        public m.a a(c.e.a.a.d dVar) {
            if (dVar != null) {
                this.f3702c = dVar;
                return this;
            }
            throw new NullPointerException("Null priority");
        }

        @Override // c.e.a.a.i.m.a
        public m.a a(String str) {
            if (str != null) {
                this.f3700a = str;
                return this;
            }
            throw new NullPointerException("Null backendName");
        }

        @Override // c.e.a.a.i.m.a
        public m.a a(byte[] bArr) {
            this.f3701b = bArr;
            return this;
        }

        @Override // c.e.a.a.i.m.a
        public m a() {
            String str = "";
            if (this.f3700a == null) {
                str = str + " backendName";
            }
            if (this.f3702c == null) {
                str = str + " priority";
            }
            if (str.isEmpty()) {
                return new c(this.f3700a, this.f3701b, this.f3702c);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private c(String str, byte[] bArr, c.e.a.a.d dVar) {
        this.f3697a = str;
        this.f3698b = bArr;
        this.f3699c = dVar;
    }

    @Override // c.e.a.a.i.m
    public String a() {
        return this.f3697a;
    }

    @Override // c.e.a.a.i.m
    public byte[] b() {
        return this.f3698b;
    }

    @Override // c.e.a.a.i.m
    public c.e.a.a.d c() {
        return this.f3699c;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        if (this.f3697a.equals(mVar.a())) {
            if (Arrays.equals(this.f3698b, mVar instanceof c ? ((c) mVar).f3698b : mVar.b()) && this.f3699c.equals(mVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f3697a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f3698b)) * 1000003) ^ this.f3699c.hashCode();
    }
}
