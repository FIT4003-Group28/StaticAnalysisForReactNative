package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.channels.FileChannel;
/* compiled from: PG */
/* renamed from: cmkc  reason: default package */
/* loaded from: classes5.dex */
public final class cmkc extends cmka {
    private final ContentResolver a;
    private Uri b;
    private AssetFileDescriptor c;
    private FileInputStream d;
    private long e;
    private boolean f;

    public cmkc(Context context) {
        super(false);
        this.a = context.getContentResolver();
    }

    @Override // defpackage.cmkd
    public final int a(byte[] bArr, int i, int i2) {
        if (i2 == 0) {
            return 0;
        }
        long j = this.e;
        if (j == 0) {
            return -1;
        }
        if (j != -1) {
            try {
                i2 = (int) Math.min(j, i2);
            } catch (IOException e) {
                throw new cmkb(e);
            }
        }
        FileInputStream fileInputStream = this.d;
        int i3 = cmny.a;
        int read = fileInputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.e != -1) {
                throw new cmkb(new EOFException());
            }
            return -1;
        }
        long j2 = this.e;
        if (j2 != -1) {
            this.e = j2 - read;
        }
        h(read);
        return read;
    }

    @Override // defpackage.cmkg
    public final long c(cmkj cmkjVar) {
        try {
            Uri uri = cmkjVar.a;
            this.b = uri;
            j();
            AssetFileDescriptor openAssetFileDescriptor = this.a.openAssetFileDescriptor(uri, "r");
            this.c = openAssetFileDescriptor;
            if (openAssetFileDescriptor != null) {
                FileInputStream fileInputStream = new FileInputStream(openAssetFileDescriptor.getFileDescriptor());
                this.d = fileInputStream;
                long startOffset = openAssetFileDescriptor.getStartOffset();
                long skip = fileInputStream.skip(cmkjVar.f + startOffset) - startOffset;
                if (skip != cmkjVar.f) {
                    throw new EOFException();
                }
                long j = cmkjVar.g;
                if (j != -1) {
                    this.e = j;
                } else {
                    long length = openAssetFileDescriptor.getLength();
                    if (length == -1) {
                        FileChannel channel = fileInputStream.getChannel();
                        long size = channel.size();
                        if (size == 0) {
                            this.e = -1L;
                        } else {
                            long position = size - channel.position();
                            this.e = position;
                            if (position < 0) {
                                throw new EOFException();
                            }
                        }
                    } else {
                        long j2 = length - skip;
                        this.e = j2;
                        if (j2 < 0) {
                            throw new EOFException();
                        }
                    }
                }
                this.f = true;
                g(cmkjVar);
                return this.e;
            }
            String valueOf = String.valueOf(uri);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 36);
            sb.append("Could not open file descriptor for: ");
            sb.append(valueOf);
            throw new FileNotFoundException(sb.toString());
        } catch (IOException e) {
            throw new cmkb(e);
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
                FileInputStream fileInputStream = this.d;
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                this.d = null;
                try {
                    try {
                        AssetFileDescriptor assetFileDescriptor = this.c;
                        if (assetFileDescriptor != null) {
                            assetFileDescriptor.close();
                        }
                    } finally {
                        this.c = null;
                        if (this.f) {
                            this.f = false;
                            i();
                        }
                    }
                } catch (IOException e) {
                    throw new cmkb(e);
                }
            } catch (IOException e2) {
                throw new cmkb(e2);
            }
        } catch (Throwable th) {
            this.d = null;
            try {
                try {
                    AssetFileDescriptor assetFileDescriptor2 = this.c;
                    if (assetFileDescriptor2 != null) {
                        assetFileDescriptor2.close();
                    }
                    this.c = null;
                    if (this.f) {
                        this.f = false;
                        i();
                    }
                    throw th;
                } catch (IOException e3) {
                    throw new cmkb(e3);
                }
            } catch (Throwable th2) {
                this.c = null;
                if (this.f) {
                    this.f = false;
                    i();
                }
                throw th2;
            }
        }
    }
}
