package com.facebook.soloader;

import android.content.Context;
import android.os.Parcel;
import android.os.StrictMode;
import android.util.Log;
import java.io.Closeable;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public abstract class n extends com.facebook.soloader.c {

    /* renamed from: c  reason: collision with root package name */
    protected final Context f6484c;

    /* renamed from: d  reason: collision with root package name */
    protected String f6485d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, Object> f6486e;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class a implements Runnable {

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ File f6487b;

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ byte[] f6488c;

        /* renamed from: d  reason: collision with root package name */
        final /* synthetic */ c f6489d;

        /* renamed from: e  reason: collision with root package name */
        final /* synthetic */ File f6490e;

        /* renamed from: f  reason: collision with root package name */
        final /* synthetic */ g f6491f;

        a(File file, byte[] bArr, c cVar, File file2, g gVar) {
            this.f6487b = file;
            this.f6488c = bArr;
            this.f6489d = cVar;
            this.f6490e = file2;
            this.f6491f = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                Log.v("fb-UnpackingSoSource", "starting syncer worker");
                RandomAccessFile randomAccessFile = new RandomAccessFile(this.f6487b, "rw");
                try {
                    randomAccessFile.write(this.f6488c);
                    randomAccessFile.setLength(randomAccessFile.getFilePointer());
                    randomAccessFile.close();
                    RandomAccessFile randomAccessFile2 = new RandomAccessFile(new File(n.this.f6459a, "dso_manifest"), "rw");
                    try {
                        this.f6489d.a((DataOutput) randomAccessFile2);
                        randomAccessFile2.close();
                        SysUtil.b(n.this.f6459a);
                        n.b(this.f6490e, (byte) 1);
                        Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + n.this.f6459a + " (from syncer thread)");
                        this.f6491f.close();
                    } finally {
                    }
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        try {
                            randomAccessFile.close();
                        } catch (Throwable th3) {
                            th.addSuppressed(th3);
                        }
                        throw th2;
                    }
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
    }

    /* loaded from: classes.dex */
    public static class b {

        /* renamed from: b  reason: collision with root package name */
        public final String f6493b;

        /* renamed from: c  reason: collision with root package name */
        public final String f6494c;

        public b(String str, String str2) {
            this.f6493b = str;
            this.f6494c = str2;
        }
    }

    /* loaded from: classes.dex */
    public static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final b[] f6495a;

        public c(b[] bVarArr) {
            this.f6495a = bVarArr;
        }

        static final c a(DataInput dataInput) {
            if (dataInput.readByte() == 1) {
                int readInt = dataInput.readInt();
                if (readInt < 0) {
                    throw new RuntimeException("illegal number of shared libraries");
                }
                b[] bVarArr = new b[readInt];
                for (int i = 0; i < readInt; i++) {
                    bVarArr[i] = new b(dataInput.readUTF(), dataInput.readUTF());
                }
                return new c(bVarArr);
            }
            throw new RuntimeException("wrong dso manifest version");
        }

        public final void a(DataOutput dataOutput) {
            dataOutput.writeByte(1);
            dataOutput.writeInt(this.f6495a.length);
            int i = 0;
            while (true) {
                b[] bVarArr = this.f6495a;
                if (i < bVarArr.length) {
                    dataOutput.writeUTF(bVarArr[i].f6493b);
                    dataOutput.writeUTF(this.f6495a[i].f6494c);
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static final class d implements Closeable {

        /* renamed from: b  reason: collision with root package name */
        public final b f6496b;

        /* renamed from: c  reason: collision with root package name */
        public final InputStream f6497c;

        public d(b bVar, InputStream inputStream) {
            this.f6496b = bVar;
            this.f6497c = inputStream;
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            this.f6497c.close();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static abstract class e implements Closeable {
        public abstract boolean a();

        public abstract d b();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* loaded from: classes.dex */
    public static abstract class f implements Closeable {
        protected abstract c a();

        protected abstract e b();

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public n(Context context, String str) {
        super(a(context, str), 1);
        this.f6486e = new HashMap();
        this.f6484c = context;
    }

    public static File a(Context context, String str) {
        return new File(context.getApplicationInfo().dataDir + "/" + str);
    }

    private void a(byte b2, c cVar, e eVar) {
        Log.v("fb-UnpackingSoSource", "regenerating DSO store " + getClass().getName());
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File(this.f6459a, "dso_manifest"), "rw");
        c cVar2 = null;
        if (b2 == 1) {
            try {
                try {
                    cVar2 = c.a((DataInput) randomAccessFile);
                } catch (Exception e2) {
                    Log.i("fb-UnpackingSoSource", "error reading existing DSO manifest", e2);
                }
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    try {
                        randomAccessFile.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        }
        if (cVar2 == null) {
            cVar2 = new c(new b[0]);
        }
        a(cVar.f6495a);
        byte[] bArr = new byte[32768];
        while (eVar.a()) {
            d b3 = eVar.b();
            boolean z = true;
            for (int i = 0; z && i < cVar2.f6495a.length; i++) {
                if (cVar2.f6495a[i].f6493b.equals(b3.f6496b.f6493b) && cVar2.f6495a[i].f6494c.equals(b3.f6496b.f6494c)) {
                    z = false;
                }
            }
            if (z) {
                a(b3, bArr);
            }
            if (b3 != null) {
                b3.close();
            }
        }
        randomAccessFile.close();
        Log.v("fb-UnpackingSoSource", "Finished regenerating DSO store " + getClass().getName());
    }

    private void a(d dVar, byte[] bArr) {
        RandomAccessFile randomAccessFile;
        Log.i("fb-UnpackingSoSource", "extracting DSO " + dVar.f6496b.f6493b);
        if (!this.f6459a.setWritable(true, true)) {
            throw new IOException("cannot make directory writable for us: " + this.f6459a);
        }
        File file = new File(this.f6459a, dVar.f6496b.f6493b);
        try {
            randomAccessFile = new RandomAccessFile(file, "rw");
        } catch (IOException e2) {
            Log.w("fb-UnpackingSoSource", "error overwriting " + file + " trying to delete and start over", e2);
            SysUtil.a(file);
            randomAccessFile = new RandomAccessFile(file, "rw");
        }
        try {
            try {
                int available = dVar.f6497c.available();
                if (available > 1) {
                    SysUtil.a(randomAccessFile.getFD(), available);
                }
                SysUtil.a(randomAccessFile, dVar.f6497c, Integer.MAX_VALUE, bArr);
                randomAccessFile.setLength(randomAccessFile.getFilePointer());
                if (file.setExecutable(true, false)) {
                    return;
                }
                throw new IOException("cannot make file executable: " + file);
            } catch (IOException e3) {
                SysUtil.a(file);
                throw e3;
            }
        } finally {
            randomAccessFile.close();
        }
    }

    private void a(b[] bVarArr) {
        String[] list = this.f6459a.list();
        if (list == null) {
            throw new IOException("unable to list directory " + this.f6459a);
        }
        for (String str : list) {
            if (!str.equals("dso_state") && !str.equals("dso_lock") && !str.equals("dso_deps") && !str.equals("dso_manifest")) {
                boolean z = false;
                for (int i = 0; !z && i < bVarArr.length; i++) {
                    if (bVarArr[i].f6493b.equals(str)) {
                        z = true;
                    }
                }
                if (!z) {
                    File file = new File(this.f6459a, str);
                    Log.v("fb-UnpackingSoSource", "deleting unaccounted-for file " + file);
                    SysUtil.a(file);
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00a5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(com.facebook.soloader.g r12, int r13, byte[] r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.n.a(com.facebook.soloader.g, int, byte[]):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(File file, byte b2) {
        RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
        try {
            randomAccessFile.seek(0L);
            randomAccessFile.write(b2);
            randomAccessFile.setLength(randomAccessFile.getFilePointer());
            randomAccessFile.getFD().sync();
            randomAccessFile.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                try {
                    randomAccessFile.close();
                } catch (Throwable th3) {
                    th.addSuppressed(th3);
                }
                throw th2;
            }
        }
    }

    private Object c(String str) {
        Object obj;
        synchronized (this.f6486e) {
            obj = this.f6486e.get(str);
            if (obj == null) {
                obj = new Object();
                this.f6486e.put(str, obj);
            }
        }
        return obj;
    }

    @Override // com.facebook.soloader.c, com.facebook.soloader.l
    public int a(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        int a2;
        synchronized (c(str)) {
            a2 = a(str, i, this.f6459a, threadPolicy);
        }
        return a2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.soloader.l
    public void a(int i) {
        SysUtil.c(this.f6459a);
        g a2 = g.a(new File(this.f6459a, "dso_lock"));
        try {
            Log.v("fb-UnpackingSoSource", "locked dso store " + this.f6459a);
            if (a(a2, i, a())) {
                a2 = null;
            } else {
                Log.i("fb-UnpackingSoSource", "dso store is up-to-date: " + this.f6459a);
            }
        } finally {
            if (a2 != null) {
                Log.v("fb-UnpackingSoSource", "releasing dso store lock for " + this.f6459a);
                a2.close();
            } else {
                Log.v("fb-UnpackingSoSource", "not releasing dso store lock for " + this.f6459a + " (syncer thread started)");
            }
        }
    }

    public void a(String[] strArr) {
    }

    protected byte[] a() {
        Parcel obtain = Parcel.obtain();
        f b2 = b();
        try {
            b[] bVarArr = b2.a().f6495a;
            obtain.writeByte((byte) 1);
            obtain.writeInt(bVarArr.length);
            for (int i = 0; i < bVarArr.length; i++) {
                obtain.writeString(bVarArr[i].f6493b);
                obtain.writeString(bVarArr[i].f6494c);
            }
            if (b2 != null) {
                b2.close();
            }
            byte[] marshall = obtain.marshall();
            obtain.recycle();
            return marshall;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                if (b2 != null) {
                    try {
                        b2.close();
                    } catch (Throwable th3) {
                        th.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    protected abstract f b();

    /* JADX INFO: Access modifiers changed from: protected */
    public synchronized void b(String str) {
        synchronized (c(str)) {
            this.f6485d = str;
            a(2);
        }
    }
}
