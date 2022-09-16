package defpackage;

import java.io.Closeable;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: dxdy  reason: default package */
/* loaded from: classes6.dex */
public final class dxdy implements Closeable {
    private final InputStream[] a;

    public dxdy(InputStream[] inputStreamArr) {
        this.a = inputStreamArr;
    }

    public final InputStream a() {
        return this.a[0];
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        InputStream[] inputStreamArr = this.a;
        int length = inputStreamArr.length;
        for (int i = 0; i < length; i = 1) {
            dxec.c(inputStreamArr[0]);
        }
    }
}
