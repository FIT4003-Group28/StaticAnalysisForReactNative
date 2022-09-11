package com.google.android.exoplayer2.upstream;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class RawResourceDataSource extends cmka {
    private final Resources a;
    private final String b;
    private Uri c;
    private AssetFileDescriptor d;
    private InputStream e;
    private long f;
    private boolean g;

    public RawResourceDataSource(Context context) {
        super(false);
        this.a = context.getResources();
        this.b = context.getPackageName();
    }

    public static Uri buildRawResourceUri(int i) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("rawresource:///");
        sb.append(i);
        return Uri.parse(sb.toString());
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.f;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new cmlj(e);
            }
        }
        InputStream inputStream = this.e;
        int i3 = cmny.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.f != -1) {
                throw new cmlj(new EOFException());
            }
            return -1;
        }
        long j2 = this.f;
        if (j2 != -1) {
            this.f = j2 - read;
        }
        h(read);
        return read;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0034, code lost:
        if (r1.matches("\\d+") != false) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0105  */
    @Override // defpackage.cmkg
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long c(defpackage.cmkj r8) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.upstream.RawResourceDataSource.c(cmkj):long");
    }

    @Override // defpackage.cmkg
    public final Uri d() {
        return this.c;
    }

    @Override // defpackage.cmkg
    public final void f() {
        this.c = null;
        try {
            try {
                InputStream inputStream = this.e;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.e = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.d;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.d = null;
                        if (this.g) {
                            this.g = false;
                            i();
                        }
                    }
                } catch (IOException e) {
                    throw new cmlj(e);
                }
            } catch (IOException e2) {
                throw new cmlj(e2);
            }
        } catch (Throwable th) {
            this.e = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.d;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.d = null;
                    if (this.g) {
                        this.g = false;
                        i();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new cmlj(e3);
                }
            } catch (Throwable th2) {
                this.d = null;
                if (this.g) {
                    this.g = false;
                    i();
                }
                throw th2;
            }
        }
    }
}