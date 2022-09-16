package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: PG */
/* renamed from: axo  reason: default package */
/* loaded from: classes2.dex */
public final class axo extends ass {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;

    public axo() {
        super(false);
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.c;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            int i3 = pxi.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.c -= read;
                c(read);
            }
            return read;
        } catch (IOException e) {
            throw new axn(e, 2000);
        }
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        Uri uri = asyVar.a;
        this.b = uri;
        e(asyVar);
        int i = 2006;
        try {
            String path = uri.getPath();
            ptx.a(path);
            RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
            this.a = randomAccessFile;
            try {
                randomAccessFile.seek(asyVar.g);
                long j = asyVar.h;
                if (j == -1) {
                    j = this.a.length() - asyVar.g;
                }
                this.c = j;
                if (j >= 0) {
                    this.d = true;
                    f(asyVar);
                    return this.c;
                }
                throw new axn(null, null, 2008);
            } catch (IOException e) {
                throw new axn(e, 2000);
            }
        } catch (FileNotFoundException e2) {
            if (!TextUtils.isEmpty(uri.getQuery()) || !TextUtils.isEmpty(uri.getFragment())) {
                throw new axn(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e2, 1004);
            }
            int i2 = pxi.a;
            if (true != axm.a(e2.getCause())) {
                i = 2005;
            }
            throw new axn(e2, i);
        } catch (SecurityException e3) {
            throw new axn(e3, 2006);
        } catch (RuntimeException e4) {
            throw new axn(e4, 2000);
        }
    }

    @Override // defpackage.asv
    public final Uri i() {
        return this.b;
    }

    @Override // defpackage.asv
    public final void j() {
        this.b = null;
        try {
            try {
                RandomAccessFile randomAccessFile = this.a;
                if (randomAccessFile != null) {
                    randomAccessFile.close();
                }
                this.a = null;
                if (!this.d) {
                    return;
                }
                this.d = false;
                d();
            } catch (IOException e) {
                throw new axn(e, 2000);
            }
        } catch (Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                d();
            }
            throw th;
        }
    }
}
