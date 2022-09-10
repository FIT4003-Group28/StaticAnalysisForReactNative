package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
/* compiled from: PG */
/* renamed from: cvhy  reason: default package */
/* loaded from: classes5.dex */
public final class cvhy implements cvip {
    private final File a;
    private final File b;

    public cvhy(File file, String str) {
        this.a = file;
        this.b = new File(file, str);
    }

    @Override // defpackage.cvip
    public final long a(InputStream inputStream, long j, long j2) {
        boolean z;
        if (this.a.exists() || this.a.mkdirs() || this.a.exists()) {
            if (j > this.b.length()) {
                long length = this.b.length();
                StringBuilder sb = new StringBuilder(100);
                sb.append("Given offsetBytes does not correspond with existing data: ");
                sb.append(j);
                sb.append(", ");
                sb.append(length);
                throw new IOException(sb.toString());
            }
            eajx g = j > 0 ? eajl.g(this.b) : eajl.f(this.b);
            eajb a = eajl.a(eajl.e(inputStream));
            try {
                try {
                    eaiz eaizVar = new eaiz();
                    long j3 = 0;
                    while (!a.c()) {
                        try {
                            a.Te(eaizVar, 65536L);
                            long j4 = eaizVar.b;
                            if (j4 > 0) {
                                g.a(eaizVar, j4);
                            }
                            j3 += j4;
                        } catch (IOException e) {
                            e = e;
                            z = true;
                            throw new cvim(e, z ? cvhz.NETWORK_IO_ERROR : cvhz.DISK_IO_ERROR);
                        }
                    }
                    g.flush();
                    long length2 = this.b.length();
                    String absolutePath = this.b.getAbsolutePath();
                    StringBuilder sb2 = new StringBuilder(String.valueOf(absolutePath).length() + 92);
                    sb2.append("Wrote response to file: ");
                    sb2.append(absolutePath);
                    sb2.append(", size: ");
                    sb2.append(length2);
                    sb2.append(" bytes, read: ");
                    sb2.append(j3);
                    sb2.append(" bytes");
                    sb2.toString();
                    try {
                        g.close();
                    } catch (IOException unused) {
                    }
                    try {
                        a.close();
                    } catch (IOException unused2) {
                    }
                    return length2;
                } catch (Throwable th) {
                    try {
                        g.close();
                    } catch (IOException unused3) {
                    }
                    try {
                        a.close();
                    } catch (IOException unused4) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e = e2;
                z = false;
            }
        } else {
            throw new cvim(new IOException("Error creating output directory"), cvhz.FILE_SYSTEM_ERROR);
        }
    }

    @Override // defpackage.cvip
    public final long b() {
        return this.b.length();
    }
}
