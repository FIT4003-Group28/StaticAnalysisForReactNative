package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.l;
import java.util.Arrays;
/* loaded from: classes.dex */
final class f extends l {

    /* renamed from: a  reason: collision with root package name */
    private final long f6617a;

    /* renamed from: b  reason: collision with root package name */
    private final Integer f6618b;

    /* renamed from: c  reason: collision with root package name */
    private final long f6619c;

    /* renamed from: d  reason: collision with root package name */
    private final byte[] f6620d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6621e;

    /* renamed from: f  reason: collision with root package name */
    private final long f6622f;

    /* renamed from: g  reason: collision with root package name */
    private final o f6623g;

    /* loaded from: classes.dex */
    static final class b extends l.a {

        /* renamed from: a  reason: collision with root package name */
        private Long f6624a;

        /* renamed from: b  reason: collision with root package name */
        private Integer f6625b;

        /* renamed from: c  reason: collision with root package name */
        private Long f6626c;

        /* renamed from: d  reason: collision with root package name */
        private byte[] f6627d;

        /* renamed from: e  reason: collision with root package name */
        private String f6628e;

        /* renamed from: f  reason: collision with root package name */
        private Long f6629f;

        /* renamed from: g  reason: collision with root package name */
        private o f6630g;

        @Override // com.google.android.datatransport.cct.b.l.a
        public l.a a(long j) {
            this.f6624a = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.l.a
        public l.a a(o oVar) {
            this.f6630g = oVar;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.l.a
        public l.a a(Integer num) {
            this.f6625b = num;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public l.a a(String str) {
            this.f6628e = str;
            return this;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public l.a a(byte[] bArr) {
            this.f6627d = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.l.a
        public l a() {
            String str = "";
            if (this.f6624a == null) {
                str = str + " eventTimeMs";
            }
            if (this.f6626c == null) {
                str = str + " eventUptimeMs";
            }
            if (this.f6629f == null) {
                str = str + " timezoneOffsetSeconds";
            }
            if (str.isEmpty()) {
                return new f(this.f6624a.longValue(), this.f6625b, this.f6626c.longValue(), this.f6627d, this.f6628e, this.f6629f.longValue(), this.f6630g, null);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }

        @Override // com.google.android.datatransport.cct.b.l.a
        public l.a b(long j) {
            this.f6626c = Long.valueOf(j);
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.l.a
        public l.a c(long j) {
            this.f6629f = Long.valueOf(j);
            return this;
        }
    }

    /* synthetic */ f(long j, Integer num, long j2, byte[] bArr, String str, long j3, o oVar, a aVar) {
        this.f6617a = j;
        this.f6618b = num;
        this.f6619c = j2;
        this.f6620d = bArr;
        this.f6621e = str;
        this.f6622f = j3;
        this.f6623g = oVar;
    }

    @Override // com.google.android.datatransport.cct.b.l
    public Integer a() {
        return this.f6618b;
    }

    @Override // com.google.android.datatransport.cct.b.l
    public long b() {
        return this.f6617a;
    }

    @Override // com.google.android.datatransport.cct.b.l
    public long c() {
        return this.f6619c;
    }

    @Override // com.google.android.datatransport.cct.b.l
    public o d() {
        return this.f6623g;
    }

    @Override // com.google.android.datatransport.cct.b.l
    public byte[] e() {
        return this.f6620d;
    }

    public boolean equals(Object obj) {
        Integer num;
        String str;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        if (this.f6617a == lVar.b() && ((num = this.f6618b) != null ? num.equals(((f) lVar).f6618b) : ((f) lVar).f6618b == null) && this.f6619c == lVar.c()) {
            if (Arrays.equals(this.f6620d, lVar instanceof f ? ((f) lVar).f6620d : lVar.e()) && ((str = this.f6621e) != null ? str.equals(((f) lVar).f6621e) : ((f) lVar).f6621e == null) && this.f6622f == lVar.g()) {
                o oVar = this.f6623g;
                o oVar2 = ((f) lVar).f6623g;
                if (oVar == null) {
                    if (oVar2 == null) {
                        return true;
                    }
                } else if (oVar.equals(oVar2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.b.l
    public String f() {
        return this.f6621e;
    }

    @Override // com.google.android.datatransport.cct.b.l
    public long g() {
        return this.f6622f;
    }

    public int hashCode() {
        long j = this.f6617a;
        int i = (((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003;
        Integer num = this.f6618b;
        int i2 = 0;
        int hashCode = num == null ? 0 : num.hashCode();
        long j2 = this.f6619c;
        int hashCode2 = (((((i ^ hashCode) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ Arrays.hashCode(this.f6620d)) * 1000003;
        String str = this.f6621e;
        int hashCode3 = str == null ? 0 : str.hashCode();
        long j3 = this.f6622f;
        int i3 = (((hashCode2 ^ hashCode3) * 1000003) ^ ((int) ((j3 >>> 32) ^ j3))) * 1000003;
        o oVar = this.f6623g;
        if (oVar != null) {
            i2 = oVar.hashCode();
        }
        return i3 ^ i2;
    }

    public String toString() {
        return "LogEvent{eventTimeMs=" + this.f6617a + ", eventCode=" + this.f6618b + ", eventUptimeMs=" + this.f6619c + ", sourceExtension=" + Arrays.toString(this.f6620d) + ", sourceExtensionJsonProto3=" + this.f6621e + ", timezoneOffsetSeconds=" + this.f6622f + ", networkConnectionInfo=" + this.f6623g + "}";
    }
}
