package com.google.android.datatransport.cct.b;

import com.google.android.datatransport.cct.b.a;
/* loaded from: classes.dex */
final class c extends com.google.android.datatransport.cct.b.a {

    /* renamed from: a  reason: collision with root package name */
    private final Integer f6596a;

    /* renamed from: b  reason: collision with root package name */
    private final String f6597b;

    /* renamed from: c  reason: collision with root package name */
    private final String f6598c;

    /* renamed from: d  reason: collision with root package name */
    private final String f6599d;

    /* renamed from: e  reason: collision with root package name */
    private final String f6600e;

    /* renamed from: f  reason: collision with root package name */
    private final String f6601f;

    /* renamed from: g  reason: collision with root package name */
    private final String f6602g;

    /* renamed from: h  reason: collision with root package name */
    private final String f6603h;

    /* loaded from: classes.dex */
    static final class b extends a.AbstractC0141a {

        /* renamed from: a  reason: collision with root package name */
        private Integer f6604a;

        /* renamed from: b  reason: collision with root package name */
        private String f6605b;

        /* renamed from: c  reason: collision with root package name */
        private String f6606c;

        /* renamed from: d  reason: collision with root package name */
        private String f6607d;

        /* renamed from: e  reason: collision with root package name */
        private String f6608e;

        /* renamed from: f  reason: collision with root package name */
        private String f6609f;

        /* renamed from: g  reason: collision with root package name */
        private String f6610g;

        /* renamed from: h  reason: collision with root package name */
        private String f6611h;

        @Override // com.google.android.datatransport.cct.b.a.AbstractC0141a
        public a.AbstractC0141a a(Integer num) {
            this.f6604a = num;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.a.AbstractC0141a
        public a.AbstractC0141a a(String str) {
            this.f6607d = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.a.AbstractC0141a
        public com.google.android.datatransport.cct.b.a a() {
            return new c(this.f6604a, this.f6605b, this.f6606c, this.f6607d, this.f6608e, this.f6609f, this.f6610g, this.f6611h, null);
        }

        @Override // com.google.android.datatransport.cct.b.a.AbstractC0141a
        public a.AbstractC0141a b(String str) {
            this.f6611h = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.a.AbstractC0141a
        public a.AbstractC0141a c(String str) {
            this.f6606c = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.a.AbstractC0141a
        public a.AbstractC0141a d(String str) {
            this.f6610g = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.a.AbstractC0141a
        public a.AbstractC0141a e(String str) {
            this.f6605b = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.a.AbstractC0141a
        public a.AbstractC0141a f(String str) {
            this.f6609f = str;
            return this;
        }

        @Override // com.google.android.datatransport.cct.b.a.AbstractC0141a
        public a.AbstractC0141a g(String str) {
            this.f6608e = str;
            return this;
        }
    }

    /* synthetic */ c(Integer num, String str, String str2, String str3, String str4, String str5, String str6, String str7, a aVar) {
        this.f6596a = num;
        this.f6597b = str;
        this.f6598c = str2;
        this.f6599d = str3;
        this.f6600e = str4;
        this.f6601f = str5;
        this.f6602g = str6;
        this.f6603h = str7;
    }

    @Override // com.google.android.datatransport.cct.b.a
    public String a() {
        return this.f6599d;
    }

    @Override // com.google.android.datatransport.cct.b.a
    public String b() {
        return this.f6603h;
    }

    @Override // com.google.android.datatransport.cct.b.a
    public String c() {
        return this.f6598c;
    }

    @Override // com.google.android.datatransport.cct.b.a
    public String d() {
        return this.f6602g;
    }

    @Override // com.google.android.datatransport.cct.b.a
    public String e() {
        return this.f6597b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.datatransport.cct.b.a)) {
            return false;
        }
        Integer num = this.f6596a;
        if (num != null ? num.equals(((c) obj).f6596a) : ((c) obj).f6596a == null) {
            String str = this.f6597b;
            if (str != null ? str.equals(((c) obj).f6597b) : ((c) obj).f6597b == null) {
                String str2 = this.f6598c;
                if (str2 != null ? str2.equals(((c) obj).f6598c) : ((c) obj).f6598c == null) {
                    String str3 = this.f6599d;
                    if (str3 != null ? str3.equals(((c) obj).f6599d) : ((c) obj).f6599d == null) {
                        String str4 = this.f6600e;
                        if (str4 != null ? str4.equals(((c) obj).f6600e) : ((c) obj).f6600e == null) {
                            String str5 = this.f6601f;
                            if (str5 != null ? str5.equals(((c) obj).f6601f) : ((c) obj).f6601f == null) {
                                String str6 = this.f6602g;
                                if (str6 != null ? str6.equals(((c) obj).f6602g) : ((c) obj).f6602g == null) {
                                    String str7 = this.f6603h;
                                    String str8 = ((c) obj).f6603h;
                                    if (str7 == null) {
                                        if (str8 == null) {
                                            return true;
                                        }
                                    } else if (str7.equals(str8)) {
                                        return true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.datatransport.cct.b.a
    public String f() {
        return this.f6601f;
    }

    @Override // com.google.android.datatransport.cct.b.a
    public String g() {
        return this.f6600e;
    }

    @Override // com.google.android.datatransport.cct.b.a
    public Integer h() {
        return this.f6596a;
    }

    public int hashCode() {
        Integer num = this.f6596a;
        int i = 0;
        int hashCode = ((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003;
        String str = this.f6597b;
        int hashCode2 = (hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003;
        String str2 = this.f6598c;
        int hashCode3 = (hashCode2 ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        String str3 = this.f6599d;
        int hashCode4 = (hashCode3 ^ (str3 == null ? 0 : str3.hashCode())) * 1000003;
        String str4 = this.f6600e;
        int hashCode5 = (hashCode4 ^ (str4 == null ? 0 : str4.hashCode())) * 1000003;
        String str5 = this.f6601f;
        int hashCode6 = (hashCode5 ^ (str5 == null ? 0 : str5.hashCode())) * 1000003;
        String str6 = this.f6602g;
        int hashCode7 = (hashCode6 ^ (str6 == null ? 0 : str6.hashCode())) * 1000003;
        String str7 = this.f6603h;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return hashCode7 ^ i;
    }

    public String toString() {
        return "AndroidClientInfo{sdkVersion=" + this.f6596a + ", model=" + this.f6597b + ", hardware=" + this.f6598c + ", device=" + this.f6599d + ", product=" + this.f6600e + ", osBuild=" + this.f6601f + ", manufacturer=" + this.f6602g + ", fingerprint=" + this.f6603h + "}";
    }
}
