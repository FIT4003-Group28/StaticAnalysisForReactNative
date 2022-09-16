package defpackage;

import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
/* compiled from: PG */
/* renamed from: pdt  reason: default package */
/* loaded from: classes4.dex */
public final class pdt extends ass {
    private RandomAccessFile a;
    private Uri b;
    private long c;
    private boolean d;
    private final String e;

    public pdt(String str) {
        super(false);
        this.e = str;
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
            String str = this.e;
            throw new pds(str.length() != 0 ? "c.file.read;src.".concat(str) : new String("c.file.read;src."), e);
        }
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        try {
            Uri uri = asyVar.a;
            this.b = uri;
            e(asyVar);
            try {
                String path = uri.getPath();
                ptx.a(path);
                RandomAccessFile randomAccessFile = new RandomAccessFile(path, "r");
                this.a = randomAccessFile;
                randomAccessFile.seek(asyVar.g);
                long j = asyVar.h;
                if (j == -1) {
                    j = this.a.length() - asyVar.g;
                }
                this.c = j;
                if (j < 0) {
                    throw new asw(2008);
                }
                this.d = true;
                f(asyVar);
                return this.c;
            } catch (FileNotFoundException e) {
                String str = this.e;
                throw new pds(str.length() != 0 ? "c.FileNotFound;src.".concat(str) : new String("c.FileNotFound;src."), e);
            }
        } catch (Exception e2) {
            String str2 = this.e;
            throw new pds(str2.length() != 0 ? "c.file.open;src.".concat(str2) : new String("c.file.open;src."), e2);
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
            } catch (IOException e) {
                String str = this.e;
                throw new pds(str.length() != 0 ? "c.close;src.".concat(str) : new String("c.close;src."), e);
            }
        } finally {
            this.a = null;
            if (this.d) {
                this.d = false;
                d();
            }
        }
    }
}
