package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: PG */
/* renamed from: cmku  reason: default package */
/* loaded from: classes5.dex */
public final class cmku extends cmka {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;

    public cmku() {
        super(false);
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.c;
        if (j == 0) {
            return -1;
        }
        try {
            RandomAccessFile randomAccessFile = this.a;
            int i3 = cmny.a;
            int read = randomAccessFile.read(bArr, i, (int) Math.min(j, i2));
            if (read > 0) {
                this.c -= read;
                h(read);
            }
            return read;
        } catch (IOException e) {
            throw new cmkt(e);
        }
    }

    @Override // defpackage.cmkg
    public final long c(cmkj cmkjVar) {
        try {
            Uri uri = cmkjVar.a;
            this.b = uri;
            j();
            try {
                String path = uri.getPath();
                cmmn.f(path);
                RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
                this.a = randomAccessFile;
                randomAccessFile.seek(cmkjVar.f);
                long j = cmkjVar.g;
                if (j == -1) {
                    j = this.a.length() - cmkjVar.f;
                }
                this.c = j;
                if (j >= 0) {
                    this.d = true;
                    g(cmkjVar);
                    return this.c;
                }
                throw new EOFException();
            } catch (FileNotFoundException e) {
                if (TextUtils.isEmpty(uri.getQuery()) && TextUtils.isEmpty(uri.getFragment())) {
                    throw new cmkt(e);
                }
                throw new cmkt(String.format("uri has query and/or fragment, which are not supported. Did you call Uri.parse() on a string containing '?' or '#'? Use Uri.fromFile(new File(path)) to avoid this. path=%s,query=%s,fragment=%s", uri.getPath(), uri.getQuery(), uri.getFragment()), e);
            }
        } catch (IOException e2) {
            throw new cmkt(e2);
        }
    }

    @Override // defpackage.cmkg
    public final Uri d() {
        return this.b;
    }

    @Override // defpackage.cmkg
    public final void f() {
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
                i();
            } catch (IOException e) {
                throw new cmkt(e);
            }
        } catch (Throwable th) {
            this.a = null;
            if (this.d) {
                this.d = false;
                i();
            }
            throw th;
        }
    }
}
