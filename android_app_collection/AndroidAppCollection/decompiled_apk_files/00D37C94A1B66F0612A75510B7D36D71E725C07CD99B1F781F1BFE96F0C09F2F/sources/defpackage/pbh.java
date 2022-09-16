package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: pbh  reason: default package */
/* loaded from: classes4.dex */
public final class pbh implements pca {
    private final AssetManager a;
    private InputStream b;
    private long c;
    private boolean d;

    public pbh(Context context) {
        this.a = context.getAssets();
    }

    @Override // defpackage.pbl
    public final int a(byte[] bArr, int i, int i2) {
        long j = this.c;
        if (j != 0) {
            if (j != -1) {
                try {
                    i2 = (int) Math.min(j, i2);
                } catch (IOException e) {
                    throw new pbg(e);
                }
            }
            int read = this.b.read(bArr, i, i2);
            if (read > 0) {
                long j2 = this.c;
                if (j2 != -1) {
                    this.c = j2 - read;
                }
            }
            return read;
        }
        return -1;
    }

    @Override // defpackage.pbl
    public final long b(pbn pbnVar) {
        try {
            pbnVar.a.toString();
            String path = pbnVar.a.getPath();
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            pbnVar.a.toString();
            InputStream open = this.a.open(path, 1);
            this.b = open;
            if (open.skip(pbnVar.d) < pbnVar.d) {
                throw new EOFException();
            }
            long j = pbnVar.e;
            if (j != -1) {
                this.c = j;
            } else {
                j = this.b.available();
                this.c = j;
                if (j == 2147483647L) {
                    this.c = -1L;
                    j = -1;
                }
            }
            this.d = true;
            return j;
        } catch (IOException e) {
            throw new pbg(e);
        }
    }

    @Override // defpackage.pbl
    public final void c() {
        InputStream inputStream = this.b;
        if (inputStream != null) {
            try {
                try {
                    inputStream.close();
                    this.b = null;
                    if (!this.d) {
                        return;
                    }
                    this.d = false;
                } catch (IOException e) {
                    throw new pbg(e);
                }
            } catch (Throwable th) {
                this.b = null;
                if (this.d) {
                    this.d = false;
                }
                throw th;
            }
        }
    }
}
