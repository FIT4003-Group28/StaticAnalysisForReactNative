package com.google.firebase.crashlytics.c.j;

import com.google.firebase.crashlytics.c.j.v;
import java.util.Arrays;
/* loaded from: classes.dex */
final class e extends v.c.b {

    /* renamed from: a  reason: collision with root package name */
    private final String f8871a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f8872b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends v.c.b.a {

        /* renamed from: a  reason: collision with root package name */
        private String f8873a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f8874b;

        @Override // com.google.firebase.crashlytics.c.j.v.c.b.a
        public v.c.b.a a(String str) {
            if (str != null) {
                this.f8873a = str;
                return this;
            }
            throw new NullPointerException("Null filename");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.c.b.a
        public v.c.b.a a(byte[] bArr) {
            if (bArr != null) {
                this.f8874b = bArr;
                return this;
            }
            throw new NullPointerException("Null contents");
        }

        @Override // com.google.firebase.crashlytics.c.j.v.c.b.a
        public v.c.b a() {
            String str = "";
            if (this.f8873a == null) {
                str = str + " filename";
            }
            if (this.f8874b == null) {
                str = str + " contents";
            }
            if (str.isEmpty()) {
                return new e(this.f8873a, this.f8874b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private e(String str, byte[] bArr) {
        this.f8871a = str;
        this.f8872b = bArr;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.c.b
    public byte[] a() {
        return this.f8872b;
    }

    @Override // com.google.firebase.crashlytics.c.j.v.c.b
    public String b() {
        return this.f8871a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof v.c.b)) {
            return false;
        }
        v.c.b bVar = (v.c.b) obj;
        if (this.f8871a.equals(bVar.b())) {
            if (Arrays.equals(this.f8872b, bVar instanceof e ? ((e) bVar).f8872b : bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f8871a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f8872b);
    }

    public String toString() {
        return "File{filename=" + this.f8871a + ", contents=" + Arrays.toString(this.f8872b) + "}";
    }
}
