package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: PG */
/* renamed from: pbs  reason: default package */
/* loaded from: classes4.dex */
public final class pbs implements pca {
    private RandomAccessFile a;
    private long b;
    private boolean c;

    public pbs() {
    }

    public pbs(byte[] bArr) {
    }

    @Override // defpackage.pbl
    public final int a(byte[] bArr, int i, int i2) {
        long j = this.b;
        if (j != 0) {
            try {
                int read = this.a.read(bArr, i, (int) Math.min(j, i2));
                if (read > 0) {
                    this.b -= read;
                }
                return read;
            } catch (IOException e) {
                throw new pbr(e);
            }
        }
        return -1;
    }

    @Override // defpackage.pbl
    public final long b(pbn pbnVar) {
        try {
            pbnVar.a.toString();
            RandomAccessFile randomAccessFile = new RandomAccessFile(pbnVar.a.getPath(), "r");
            this.a = randomAccessFile;
            randomAccessFile.seek(pbnVar.d);
            long j = pbnVar.e;
            if (j == -1) {
                j = this.a.length() - pbnVar.d;
            }
            this.b = j;
            if (j < 0) {
                throw new EOFException();
            }
            this.c = true;
            return j;
        } catch (IOException e) {
            throw new pbr(e);
        }
    }

    @Override // defpackage.pbl
    public final void c() {
        RandomAccessFile randomAccessFile = this.a;
        if (randomAccessFile != null) {
            try {
                try {
                    randomAccessFile.close();
                    this.a = null;
                    if (!this.c) {
                        return;
                    }
                    this.c = false;
                } catch (IOException e) {
                    throw new pbr(e);
                }
            } catch (Throwable th) {
                this.a = null;
                if (this.c) {
                    this.c = false;
                }
                throw th;
            }
        }
    }
}
