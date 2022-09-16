package defpackage;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cmju  reason: default package */
/* loaded from: classes5.dex */
public final class cmju extends cmka {
    private final AssetManager a;
    private Uri b;
    private InputStream c;
    private long d;
    private boolean e;

    public cmju(Context context) {
        super(false);
        this.a = context.getAssets();
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
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
                throw new cmjt(e);
            }
        }
        InputStream inputStream = this.c;
        int i3 = cmny.a;
        int read = inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.d != -1) {
                throw new cmjt(new EOFException());
            }
            return -1;
        }
        long j2 = this.d;
        if (j2 != -1) {
            this.d = j2 - read;
        }
        h(read);
        return read;
    }

    @Override // defpackage.cmkg
    public final long c(cmkj cmkjVar) {
        try {
            Uri uri = cmkjVar.a;
            this.b = uri;
            String path = uri.getPath();
            cmmn.f(path);
            if (path.startsWith("/android_asset/")) {
                path = path.substring(15);
            } else if (path.startsWith("/")) {
                path = path.substring(1);
            }
            j();
            InputStream open = this.a.open(path, 1);
            this.c = open;
            if (open.skip(cmkjVar.f) < cmkjVar.f) {
                throw new EOFException();
            }
            long j = cmkjVar.g;
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
            g(cmkjVar);
            return this.d;
        } catch (IOException e) {
            throw new cmjt(e);
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
                InputStream inputStream = this.c;
                if (inputStream != null) {
                    inputStream.close();
                }
                this.c = null;
                if (!this.e) {
                    return;
                }
                this.e = false;
                i();
            } catch (IOException e) {
                throw new cmjt(e);
            }
        } catch (Throwable th) {
            this.c = null;
            if (this.e) {
                this.e = false;
                i();
            }
            throw th;
        }
    }
}
