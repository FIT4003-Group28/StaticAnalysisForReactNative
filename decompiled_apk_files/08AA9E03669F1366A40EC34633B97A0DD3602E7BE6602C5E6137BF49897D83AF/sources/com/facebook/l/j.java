package com.facebook.l;

import android.content.Context;
import android.os.Parcel;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
/* compiled from: UnpackingSoSource.java */
/* loaded from: classes.dex */
public abstract class j extends com.facebook.l.b {
    protected final Context e;

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes.dex */
    public static abstract class d implements Closeable {
        public abstract boolean a();

        public abstract c b();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes.dex */
    public static abstract class e implements Closeable {
        protected abstract b a();

        protected abstract d b();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    protected abstract e a();

    /* JADX INFO: Access modifiers changed from: protected */
    public j(Context context, String str) {
        super(a(context, str), 1);
        this.e = context;
    }

    public static File a(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes.dex */
    public static class a {

        /* renamed from: c  reason: collision with root package name */
        public final String f3051c;

        /* renamed from: d  reason: collision with root package name */
        public final String f3052d;

        public a(String str, String str2) {
            this.f3051c = str;
            this.f3052d = str2;
        }
    }

    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes.dex */
    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final a[] f3053a;

        public b(a[] aVarArr) {
            this.f3053a = aVarArr;
        }

        static final b a(DataInput dataInput) {
            if (dataInput.readByte() != 1) {
                throw new RuntimeException("wrong dso manifest version");
            }
            int readInt = dataInput.readInt();
            if (readInt < 0) {
                throw new RuntimeException("illegal number of shared libraries");
            }
            a[] aVarArr = new a[readInt];
            for (int i = 0; i < readInt; i++) {
                aVarArr[i] = new a(dataInput.readUTF(), dataInput.readUTF());
            }
            return new b(aVarArr);
        }

        public final void a(DataOutput dataOutput) {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f3053a.length);
            for (int i = 0; i < this.f3053a.length; i++) {
                dataOutput.writeUTF(this.f3053a[i].f3051c);
                dataOutput.writeUTF(this.f3053a[i].f3052d);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* compiled from: UnpackingSoSource.java */
    /* loaded from: classes.dex */
    public static final class c implements Closeable {

        /* renamed from: a  reason: collision with root package name */
        public final a f3054a;

        /* renamed from: b  reason: collision with root package name */
        public final InputStream f3055b;

        public c(a aVar, InputStream inputStream) {
            this.f3054a = aVar;
            this.f3055b = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f3055b.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(File file, byte b2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(b2);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            if (randomAccessFile == null) {
                return;
            }
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (randomAccessFile != null) {
                    if (th != null) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    } else {
                        randomAccessFile.close();
                    }
                }
                throw th2;
            }
        }
    }

    private void a(a[] aVarArr) {
        String[] list = this.f3025a.list();
        if (list == null) {
            throw new IOException("unable to list directory " + this.f3025a);
        }
        for (String str : list) {
            if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                boolean z = false;
                for (int i = 0; !z && i < aVarArr.length; i++) {
                    if (aVarArr[i].f3051c.equals(str)) {
                        z = true;
                    }
                }
                if (!z) {
                    File file = new File(this.f3025a, str);
                    Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                    i.a(file);
                }
            }
        }
    }

    private void a(c cVar, byte[] bArr) {
        RandomAccessFile randomAccessFile;
        Log.i("fb-UnpackingSoSource", "extracting DSO " + cVar.f3054a.f3051c);
        File file = new File(this.f3025a, cVar.f3054a.f3051c);
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (IOException e2) {
            Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e2);
            file.delete();
            randomAccessFile = new RandomAccessFile(file, "rw");
        }
        try {
            int available = cVar.f3055b.available();
            if (available > 1) {
                i.a(randomAccessFile.getFD(), available);
            }
            i.a(randomAccessFile, cVar.f3055b, Api.BaseClientBuilder.API_PRIORITY_OTHER, bArr);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            if (file.setExecutable(true, false)) {
                return;
            }
            throw new IOException("cannot make file executable: " + file);
        } finally {
            randomAccessFile.close();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004a A[Catch: Throwable -> 0x003a, TryCatch #4 {all -> 0x0037, blocks: (B:4:0x0032, B:15:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x0061, B:49:0x00b5, B:11:0x003f, B:22:0x0069, B:24:0x006e, B:26:0x007e, B:29:0x008f, B:35:0x0099), top: B:63:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061 A[Catch: Throwable -> 0x003a, TRY_LEAVE, TryCatch #4 {all -> 0x0037, blocks: (B:4:0x0032, B:15:0x004a, B:16:0x0051, B:17:0x005b, B:19:0x0061, B:49:0x00b5, B:11:0x003f, B:22:0x0069, B:24:0x006e, B:26:0x007e, B:29:0x008f, B:35:0x0099), top: B:63:0x0032 }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void a(byte r11, com.facebook.l.j.b r12, com.facebook.l.j.d r13) {
        /*
            Method dump skipped, instructions count: 209
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.l.j.a(byte, com.facebook.l.j$b, com.facebook.l.j$d):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: Found unreachable blocks
        	at jadx.core.dex.visitors.blocks.DominatorTree.sortBlocks(DominatorTree.java:35)
        	at jadx.core.dex.visitors.blocks.DominatorTree.compute(DominatorTree.java:25)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.computeDominators(BlockProcessor.java:203)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:46)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:40)
        */
    private boolean a(com.facebook.l.e r12, int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 307
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.l.j.a(com.facebook.l.e, int, byte[]):boolean");
    }

    protected byte[] b() {
        Parcel obtain = Parcel.obtain();
        e a2 = a();
        try {
            a[] aVarArr = a2.a().f3053a;
            obtain.writeByte((byte) 1);
            obtain.writeInt(aVarArr.length);
            for (int i = 0; i < aVarArr.length; i++) {
                obtain.writeString(aVarArr[i].f3051c);
                obtain.writeString(aVarArr[i].f3052d);
            }
            if (a2 != null) {
                a2.close();
            }
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (a2 != null) {
                    if (th != null) {
                        try {
                            a2.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                    } else {
                        a2.close();
                    }
                }
                throw th2;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.l.h
    public void a(int i) {
        i.b(this.f3025a);
        com.facebook.l.e a2 = com.facebook.l.e.a(new File(this.f3025a, "dso_lock"));
        try {
            Log.v("fb-UnpackingSoSource", "locked dso store " + this.f3025a);
            if (a(a2, i, b())) {
                a2 = null;
            } else {
                Log.i("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f3025a);
            }
        } finally {
            if (a2 != null) {
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + this.f3025a);
                a2.close();
            } else {
                Log.v("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f3025a + " (syncer thread started)");
            }
        }
    }
}
