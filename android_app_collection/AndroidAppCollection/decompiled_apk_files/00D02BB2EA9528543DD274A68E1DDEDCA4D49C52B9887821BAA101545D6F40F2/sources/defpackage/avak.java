package defpackage;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;
import java.util.List;
/* compiled from: PG */
/* renamed from: avak  reason: default package */
/* loaded from: classes2.dex */
public final class avak implements cvip {
    static final dcza a = dczd.a;
    static final int b = 32768;
    final avcb c;
    private final File d;
    private final File e;

    public avak(File file, File file2, avcb avcbVar) {
        this.d = file2;
        this.e = file;
        dbsk.e(true, "Must specify positive chunkSizeBytes: %s", 131072);
        this.c = avcbVar;
    }

    static dlva c(File file) {
        try {
            return (dlva) dsqw.cq(dlva.d, ddau.d(file));
        } catch (dsrm e) {
            throw new IOException(e);
        }
    }

    @Override // defpackage.cvip
    public final long a(InputStream inputStream, long j, long j2) {
        dlva bK;
        File parentFile = this.d.getParentFile();
        dbsk.s(parentFile);
        if (parentFile.exists() || parentFile.mkdirs() || parentFile.exists()) {
            File parentFile2 = this.e.getParentFile();
            dbsk.s(parentFile2);
            if (!parentFile2.exists() && !parentFile2.mkdirs() && !parentFile2.exists()) {
                throw new IOException("Error creating output directory");
            }
            int i = 0;
            dbsk.f(j >= 0, "Negative offsetBytes: %s", j);
            dbsk.f(j % 131072 == 0, "offsetBytes not a multiple of chunkSizeBytes: %s", j);
            if (!this.d.exists() || j <= 0) {
                dluz bZ = dlva.d.bZ();
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dlva dlvaVar = (dlva) bZ.b;
                dlvaVar.a |= 1;
                dlvaVar.b = 131072;
                bK = bZ.bK();
            } else {
                bK = c(this.d);
                int i2 = bK.b;
                if (i2 != 131072) {
                    StringBuilder sb = new StringBuilder(76);
                    sb.append("Mismatch between stored and current chunkSizeBytes: ");
                    sb.append(i2);
                    sb.append(", ");
                    sb.append(131072);
                    throw new IOException(sb.toString());
                }
            }
            long j3 = j / 131072;
            int size = bK.c.size();
            if (size < j3) {
                StringBuilder sb2 = new StringBuilder(80);
                sb2.append("Too few existing hashes for given offsetBytes: ");
                sb2.append(size);
                sb2.append(", ");
                sb2.append(j);
                throw new IOException(sb2.toString());
            }
            List<dspd> subList = bK.c.subList(0, (int) j3);
            dsqp dsqpVar = (dsqp) bK.cu(5);
            dsqpVar.bC(bK);
            dluz dluzVar = (dluz) dsqpVar;
            if (dluzVar.c) {
                dluzVar.bF();
                dluzVar.c = false;
            }
            ((dlva) dluzVar.b).c = dlva.ck();
            dluzVar.a(subList);
            ddau.e(dluzVar.bK().bS(), this.d);
            long length = this.e.length();
            if (length < j) {
                StringBuilder sb3 = new StringBuilder(95);
                sb3.append("Too few existing output bytes for given offsetBytes: ");
                sb3.append(length);
                sb3.append(", ");
                sb3.append(j);
                throw new IOException(sb3.toString());
            }
            if (length > j) {
                FileChannel channel = new FileOutputStream(this.e, true).getChannel();
                channel.truncate(j);
                channel.close();
            }
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(this.e, true));
            FileOutputStream fileOutputStream = new FileOutputStream(this.d, true);
            avcb avcbVar = this.c;
            int min = Math.min(b, 131072);
            byte[] bArr = new byte[min];
            dczb f = a.f();
            int i3 = 131072;
            long j4 = 0;
            while (true) {
                try {
                    int read = inputStream.read(bArr, i, Math.min(min, i3));
                    if (read == -1) {
                        break;
                    }
                    f.g(bArr, read);
                    bufferedOutputStream.write(bArr, 0, read);
                    byte[] bArr2 = bArr;
                    j4 += read;
                    i3 -= read;
                    if (i3 == 0) {
                        avaj.a(f.p().b(), fileOutputStream);
                        f = a.f();
                        if (j2 > 0) {
                            double d = j4;
                            double d2 = j2;
                            Double.isNaN(d);
                            Double.isNaN(d2);
                            avcbVar.a.a.c(avcbVar.b, d / d2);
                            f = f;
                        }
                        bArr = bArr2;
                        i = 0;
                        i3 = 131072;
                    } else {
                        bArr = bArr2;
                        i = 0;
                    }
                } catch (Throwable th) {
                    try {
                        bufferedOutputStream.close();
                    } catch (IOException unused) {
                    }
                    try {
                        avaj.b(fileOutputStream);
                    } catch (IOException unused2) {
                    }
                    throw th;
                }
            }
            if (i3 < 131072) {
                avaj.a(f.p().b(), fileOutputStream);
            }
            try {
                bufferedOutputStream.close();
                e = null;
            } catch (IOException e) {
                e = e;
            }
            try {
                avaj.b(fileOutputStream);
            } catch (IOException e2) {
                e = e2;
            }
            if (e != null) {
                throw e;
            }
            return j + j4;
        }
        throw new IOException("Error creating output directory");
    }

    @Override // defpackage.cvip
    public final long b() {
        if (this.e.exists() && this.d.exists()) {
            try {
                dlva c = c(this.d);
                if (c.b == 131072) {
                    return Math.min(this.e.length() / 131072, c.c.size()) * 131072;
                }
                return 0L;
            } catch (IOException e) {
                e.getMessage();
            }
        }
        return 0L;
    }
}
