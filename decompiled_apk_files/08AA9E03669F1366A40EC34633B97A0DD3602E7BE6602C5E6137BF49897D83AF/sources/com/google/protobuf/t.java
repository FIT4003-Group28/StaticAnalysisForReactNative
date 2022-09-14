package com.google.protobuf;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.List;
import java.util.RandomAccess;
import org.spongycastle.i18n.LocalizedMessage;
/* compiled from: Internal.java */
/* loaded from: classes.dex */
public final class t {

    /* renamed from: a  reason: collision with root package name */
    static final Charset f4752a = Charset.forName("UTF-8");

    /* renamed from: b  reason: collision with root package name */
    static final Charset f4753b = Charset.forName(LocalizedMessage.DEFAULT_ENCODING);

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f4754c = new byte[0];

    /* renamed from: d  reason: collision with root package name */
    public static final ByteBuffer f4755d = ByteBuffer.wrap(f4754c);
    public static final g e = g.a(f4754c);

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface a {
        int a();
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public interface b<T extends a> {
    }

    /* loaded from: classes.dex */
    public interface d extends List, RandomAccess {
    }

    public static int a(long j) {
        return (int) (j ^ (j >>> 32));
    }

    public static int a(boolean z) {
        return z ? 1231 : 1237;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(T t) {
        if (t == null) {
            throw new NullPointerException();
        }
        return t;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> T a(T t, String str) {
        if (t == null) {
            throw new NullPointerException(str);
        }
        return t;
    }

    public static boolean a(byte[] bArr) {
        return ax.a(bArr);
    }

    public static String b(byte[] bArr) {
        return new String(bArr, f4752a);
    }

    public static int a(a aVar) {
        return aVar.a();
    }

    public static int a(List<? extends a> list) {
        int i = 1;
        for (a aVar : list) {
            i = (i * 31) + a(aVar);
        }
        return i;
    }

    public static int c(byte[] bArr) {
        return a(bArr, 0, bArr.length);
    }

    static int a(byte[] bArr, int i, int i2) {
        int a2 = a(i2, bArr, i, i2);
        if (a2 == 0) {
            return 1;
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static int a(int i, byte[] bArr, int i2, int i3) {
        int i4 = i;
        for (int i5 = i2; i5 < i2 + i3; i5++) {
            i4 = (i4 * 31) + bArr[i5];
        }
        return i4;
    }

    /* compiled from: Internal.java */
    /* loaded from: classes.dex */
    public static class c<F, T> extends AbstractList<T> {

        /* renamed from: a  reason: collision with root package name */
        private final List<F> f4756a;

        /* renamed from: b  reason: collision with root package name */
        private final a<F, T> f4757b;

        /* compiled from: Internal.java */
        /* loaded from: classes.dex */
        public interface a<F, T> {
            T a(F f);
        }

        public c(List<F> list, a<F, T> aVar) {
            this.f4756a = list;
            this.f4757b = aVar;
        }

        @Override // java.util.AbstractList, java.util.List
        public T get(int i) {
            return this.f4757b.a(this.f4756a.get(i));
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f4756a.size();
        }
    }
}
