package com.google.android.datatransport.runtime.backends;

import com.google.android.datatransport.runtime.backends.f;
import java.util.Arrays;
/* loaded from: classes.dex */
final class a extends f {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<c.e.a.a.i.h> f6687a;

    /* renamed from: b  reason: collision with root package name */
    private final byte[] f6688b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends f.a {

        /* renamed from: a  reason: collision with root package name */
        private Iterable<c.e.a.a.i.h> f6689a;

        /* renamed from: b  reason: collision with root package name */
        private byte[] f6690b;

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f.a a(Iterable<c.e.a.a.i.h> iterable) {
            if (iterable != null) {
                this.f6689a = iterable;
                return this;
            }
            throw new NullPointerException("Null events");
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f.a a(byte[] bArr) {
            this.f6690b = bArr;
            return this;
        }

        @Override // com.google.android.datatransport.runtime.backends.f.a
        public f a() {
            String str = "";
            if (this.f6689a == null) {
                str = str + " events";
            }
            if (str.isEmpty()) {
                return new a(this.f6689a, this.f6690b);
            }
            throw new IllegalStateException("Missing required properties:" + str);
        }
    }

    private a(Iterable<c.e.a.a.i.h> iterable, byte[] bArr) {
        this.f6687a = iterable;
        this.f6688b = bArr;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public Iterable<c.e.a.a.i.h> a() {
        return this.f6687a;
    }

    @Override // com.google.android.datatransport.runtime.backends.f
    public byte[] b() {
        return this.f6688b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f6687a.equals(fVar.a())) {
            if (Arrays.equals(this.f6688b, fVar instanceof a ? ((a) fVar).f6688b : fVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f6687a.hashCode() ^ 1000003) * 1000003) ^ Arrays.hashCode(this.f6688b);
    }

    public String toString() {
        return "BackendRequest{events=" + this.f6687a + ", extras=" + Arrays.toString(this.f6688b) + "}";
    }
}
