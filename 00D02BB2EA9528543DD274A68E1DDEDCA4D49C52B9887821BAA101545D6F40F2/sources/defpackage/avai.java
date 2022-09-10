package defpackage;

import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;
import java.util.List;
/* compiled from: PG */
/* renamed from: avai  reason: default package */
/* loaded from: classes2.dex */
public final class avai implements cljs {
    static final dcza a = dczd.a;
    private final File b;
    private final File c;
    private final Object d = new Object();
    @dzsi
    private dlva e = null;
    private long f = 0;

    public avai(File file, File file2) {
        this.b = file;
        this.c = file2;
    }

    private static void e(File file) {
        if (!file.exists() || file.delete()) {
            return;
        }
        throw new IOException("Failed to delete()");
    }

    private final void f() {
        if (this.e != null) {
            return;
        }
        File parentFile = this.b.getParentFile();
        dbsk.s(parentFile);
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            String valueOf = String.valueOf(parentFile);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 37);
            sb.append("Unable to create download directory: ");
            sb.append(valueOf);
            throw new IOException(sb.toString());
        }
        File parentFile2 = this.c.getParentFile();
        dbsk.s(parentFile2);
        if (!parentFile2.exists() && !parentFile2.mkdirs()) {
            String valueOf2 = String.valueOf(parentFile2);
            StringBuilder sb2 = new StringBuilder(String.valueOf(valueOf2).length() + 35);
            sb2.append("Unable to create hashes directory: ");
            sb2.append(valueOf2);
            throw new IOException(sb2.toString());
        } else if (this.b.exists() && this.c.exists()) {
            try {
                dlva dlvaVar = (dlva) dsqw.cq(dlva.d, ddau.d(this.c));
                this.e = dlvaVar;
                this.f = dlvaVar.b != 131072 ? 0L : Math.min(this.b.length() / 131072, dlvaVar.c.size()) * 131072;
            } catch (dsrm e) {
                throw new IOException(e);
            }
        } else {
            dluz bZ = dlva.d.bZ();
            if (bZ.c) {
                bZ.bF();
                bZ.c = false;
            }
            dlva dlvaVar2 = (dlva) bZ.b;
            dlvaVar2.a |= 1;
            dlvaVar2.b = 131072;
            this.e = bZ.bK();
        }
    }

    @Override // defpackage.cljs
    public final long a() {
        long j;
        synchronized (this.d) {
            f();
            j = this.f;
        }
        return j;
    }

    @Override // defpackage.cljs
    public final clju b() {
        clis clisVar;
        synchronized (this.d) {
            f();
            clisVar = new clis("", 0L);
        }
        return clisVar;
    }

    @Override // defpackage.cljs
    public final void c() {
        synchronized (this.d) {
            this.e = null;
            this.f = 0L;
            e(this.b);
            e(this.c);
        }
    }

    @Override // defpackage.cljs
    public final WritableByteChannel d(long j) {
        avah avahVar;
        synchronized (this.d) {
            f();
            dbsk.b(j <= this.f, "Opening byte channel with offset past known end of file");
            dlva dlvaVar = this.e;
            dbsk.s(dlvaVar);
            File file = this.b;
            File file2 = this.c;
            int i = dlvaVar.b;
            if (i == 131072) {
                long j2 = j / 131072;
                int size = dlvaVar.c.size();
                if (size >= j2) {
                    List<dspd> subList = dlvaVar.c.subList(0, (int) j2);
                    dsqp dsqpVar = (dsqp) dlvaVar.cu(5);
                    dsqpVar.bC(dlvaVar);
                    dluz dluzVar = (dluz) dsqpVar;
                    if (dluzVar.c) {
                        dluzVar.bF();
                        dluzVar.c = false;
                    }
                    ((dlva) dluzVar.b).c = dlva.ck();
                    dluzVar.a(subList);
                    ddau.e(dluzVar.bK().bS(), file2);
                    long length = file.length();
                    if (length < j) {
                        StringBuilder sb = new StringBuilder(95);
                        sb.append("Too few existing output bytes for given offsetBytes: ");
                        sb.append(length);
                        sb.append(", ");
                        sb.append(j);
                        throw new IOException(sb.toString());
                    }
                    FileChannel channel = new RandomAccessFile(file, "rw").getChannel();
                    if (length > j) {
                        channel.truncate(j);
                    }
                    channel.position(j);
                    FileChannel channel2 = new RandomAccessFile(this.c, "rw").getChannel();
                    channel2.position(this.c.length());
                    avahVar = new avah(channel, channel2);
                } else {
                    StringBuilder sb2 = new StringBuilder(79);
                    sb2.append("Too few existing hashes for given byteOffset: ");
                    sb2.append(size);
                    sb2.append(", ");
                    sb2.append(j);
                    throw new IOException(sb2.toString());
                }
            } else {
                StringBuilder sb3 = new StringBuilder(85);
                sb3.append("Mismatch between stored and current chunkSizeBytes: ");
                sb3.append(i);
                sb3.append(", ");
                sb3.append(131072L);
                throw new IOException(sb3.toString());
            }
        }
        return avahVar;
    }

    public final String toString() {
        return this.b.toString();
    }
}
