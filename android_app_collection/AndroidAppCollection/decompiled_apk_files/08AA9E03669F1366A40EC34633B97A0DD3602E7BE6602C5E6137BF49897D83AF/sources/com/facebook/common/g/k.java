package com.facebook.common.g;

import java.io.InputStream;
import java.io.OutputStream;
/* compiled from: PooledByteStreams.java */
/* loaded from: classes.dex */
public class k {

    /* renamed from: a  reason: collision with root package name */
    private final int f2289a;

    /* renamed from: b  reason: collision with root package name */
    private final a f2290b;

    public k(a aVar) {
        this(aVar, 16384);
    }

    public k(a aVar, int i) {
        com.facebook.common.d.i.a(i > 0);
        this.f2289a = i;
        this.f2290b = aVar;
    }

    public long a(InputStream inputStream, OutputStream outputStream) {
        byte[] a2 = this.f2290b.a(this.f2289a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(a2, 0, this.f2289a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(a2, 0, read);
                j += read;
            } finally {
                this.f2290b.a((a) a2);
            }
        }
    }
}
