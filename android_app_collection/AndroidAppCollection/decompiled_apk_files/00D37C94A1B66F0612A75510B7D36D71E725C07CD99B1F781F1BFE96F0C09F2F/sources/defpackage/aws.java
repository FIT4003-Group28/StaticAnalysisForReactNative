package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: aws  reason: default package */
/* loaded from: classes2.dex */
public final class aws extends ass {
    private final AssetManager a;
    private Uri b;
    private InputStream c;
    private long d;
    private boolean e;

    public aws(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // defpackage.ast
    public final int g(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.d;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new awr(e, 2000);
            }
        }
        InputStream inputStream = this.c;
        int i3 = pxi.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            return -1;
        }
        long j2 = this.d;
        if (j2 != -1) {
            this.d = j2 - read;
        }
        c(read);
        return read;
    }

    @Override // defpackage.asv
    public final long h(asy asyVar) {
        try {
            Uri uri = asyVar.a;
            this.b = uri;
            String path = uri.getPath();
            ptx.a(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            e(asyVar);
            InputStream open = this.a.open(path, 1);
            this.c = open;
            if (open.skip(asyVar.g) < asyVar.g) {
                throw new awr(null, 2008);
            }
            long j = asyVar.h;
            if (j != -1) {
                this.d = j;
            } else {
                long available = this.c.available();
                this.d = available;
                if (available == 2147483647L) {
                    this.d = -1L;
                }
            }
            this.e = true;
            f(asyVar);
            return this.d;
        } catch (awr e) {
            throw e;
        } catch (IOException e2) {
            throw new awr(e2, true != (e2 instanceof FileNotFoundException) ? 2000 : 2005);
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
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.c = null;
                if (!this.e) {
                    return;
                }
                this.e = false;
                d();
            } catch (IOException e) {
                throw new awr(e, 2000);
            }
        } catch (Throwable th) {
            this.c = null;
            if (this.e) {
                this.e = false;
                d();
            }
            throw th;
        }
    }
}
