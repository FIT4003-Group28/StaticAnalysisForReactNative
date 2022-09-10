package com.google.android.apps.gmm.map.internal.store.diskcache;

import com.google.android.apps.gmm.map.util.jni.NativeHelper;
import java.io.Closeable;
import java.io.File;
/* compiled from: PG */
/* loaded from: classes.dex */
public class NativeSqliteDiskCacheImpl implements Closeable, amcw {
    private static final dcqe a = dcqe.c("com.google.android.apps.gmm.map.internal.store.diskcache.NativeSqliteDiskCacheImpl");
    private long b;

    static {
        NativeHelper.a();
        nativeInitClass();
    }

    private NativeSqliteDiskCacheImpl(long j) {
        this.b = j;
    }

    private static native void nativeDestroySqliteDiskCache(long j);

    private static native boolean nativeInitClass();

    private static native long nativeOpenOrCreateSqliteDiskCache(String str, String str2, boolean z);

    private static native void nativeSqliteDiskCacheClear(long j);

    private static native void nativeSqliteDiskCacheClearTiles(long j);

    private static native void nativeSqliteDiskCacheDeleteEmptyTiles(long j, byte[] bArr, int[] iArr);

    private static native int nativeSqliteDiskCacheDeleteExpired(long j);

    private static native void nativeSqliteDiskCacheDeleteResource(long j, byte[] bArr);

    private static native void nativeSqliteDiskCacheDeleteTile(long j, byte[] bArr);

    private static native void nativeSqliteDiskCacheFlushWrites(long j);

    private static native byte[] nativeSqliteDiskCacheGetAndClearStats(long j);

    private static native long nativeSqliteDiskCacheGetDatabaseSize(long j);

    private static native byte[] nativeSqliteDiskCacheGetResource(long j, byte[] bArr);

    private static native int nativeSqliteDiskCacheGetServerDataVersion(long j);

    private static native byte[] nativeSqliteDiskCacheGetTile(long j, byte[] bArr);

    private static native byte[] nativeSqliteDiskCacheGetTileMetadata(long j, byte[] bArr);

    private static native boolean nativeSqliteDiskCacheHasResource(long j, byte[] bArr);

    private static native boolean nativeSqliteDiskCacheHasTile(long j, byte[] bArr);

    private static native void nativeSqliteDiskCacheIncrementalVacuum(long j, long j2);

    private static native void nativeSqliteDiskCacheInsertOrUpdateEmptyTile(long j, byte[] bArr);

    private static native void nativeSqliteDiskCacheInsertOrUpdateResource(long j, byte[] bArr, byte[] bArr2);

    private static native void nativeSqliteDiskCacheInsertOrUpdateTile(long j, byte[] bArr, byte[] bArr2);

    private static native void nativeSqliteDiskCachePinTile(long j, byte[] bArr, byte[] bArr2);

    private static native void nativeSqliteDiskCacheSetServerDataVersion(long j, int i);

    private static native void nativeSqliteDiskCacheSetStyleTablePriorityBoostMillis(long j, long j2);

    private static native void nativeSqliteDiskCacheTrimToSize(long j, long j2);

    private static native void nativeSqliteDiskCacheUnpinTiles(long j, byte[] bArr);

    private static native void nativeSqliteDiskCacheUpdateTileMetadata(long j, byte[] bArr);

    public static amcw y(File file, File file2) {
        try {
            return new NativeSqliteDiskCacheImpl(nativeOpenOrCreateSqliteDiskCache(file.toString(), file2.toString(), true));
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final int a() {
        try {
            return nativeSqliteDiskCacheGetServerDataVersion(this.b);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final boolean c(amyv amyvVar) {
        try {
            return nativeSqliteDiskCacheHasResource(this.b, amyvVar.bS());
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j = this.b;
        if (j != 0) {
            nativeDestroySqliteDiskCache(j);
        }
        this.b = 0L;
    }

    @Override // defpackage.amcw
    @dzsi
    public final amyt d(amyv amyvVar) {
        try {
            byte[] nativeSqliteDiskCacheGetResource = nativeSqliteDiskCacheGetResource(this.b, amyvVar.bS());
            if (nativeSqliteDiskCacheGetResource == null) {
                return null;
            }
            return (amyt) dsqw.cq(amyt.c, nativeSqliteDiskCacheGetResource);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    protected final void finalize() {
        close();
    }

    @Override // defpackage.amcw
    public final boolean g(amza amzaVar) {
        try {
            return nativeSqliteDiskCacheHasTile(this.b, amzaVar.bS());
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    @dzsi
    public final amzc h(amza amzaVar) {
        try {
            byte[] nativeSqliteDiskCacheGetTile = nativeSqliteDiskCacheGetTile(this.b, amzaVar.bS());
            if (nativeSqliteDiskCacheGetTile == null) {
                return null;
            }
            return (amzc) dsqw.cq(amzc.c, nativeSqliteDiskCacheGetTile);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    @dzsi
    public final amze i(amza amzaVar) {
        try {
            byte[] nativeSqliteDiskCacheGetTileMetadata = nativeSqliteDiskCacheGetTileMetadata(this.b, amzaVar.bS());
            if (nativeSqliteDiskCacheGetTileMetadata == null) {
                return null;
            }
            return (amze) dsqw.cq(amze.o, nativeSqliteDiskCacheGetTileMetadata);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final long q() {
        try {
            return nativeSqliteDiskCacheGetDatabaseSize(this.b);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final int s() {
        try {
            return nativeSqliteDiskCacheDeleteExpired(this.b);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final amyp u() {
        try {
            try {
                return (amyp) dsqw.cq(amyp.i, nativeSqliteDiskCacheGetAndClearStats(this.b));
            } catch (dsrm e) {
                throw new amcx(e);
            }
        } catch (anam unused) {
            bvoo.h("getAndClearStats result bytes were null", new Object[0]);
            return amyp.i;
        }
    }

    @Override // defpackage.amcw
    public final void x(long j) {
        nativeSqliteDiskCacheSetStyleTablePriorityBoostMillis(this.b, j);
    }

    @Override // defpackage.amcw
    public final void b(int i) {
        try {
            nativeSqliteDiskCacheSetServerDataVersion(this.b, i);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void e(amyx amyxVar, byte[] bArr) {
        try {
            nativeSqliteDiskCacheInsertOrUpdateResource(this.b, amyxVar.bS(), bArr);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void f(amyv amyvVar) {
        try {
            nativeSqliteDiskCacheDeleteResource(this.b, amyvVar.bS());
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void j(amze amzeVar, byte[] bArr) {
        try {
            nativeSqliteDiskCacheInsertOrUpdateTile(this.b, amzeVar.bS(), bArr);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void k(amza amzaVar, int[] iArr) {
        try {
            nativeSqliteDiskCacheDeleteEmptyTiles(this.b, amzaVar.bS(), iArr);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void n(amza amzaVar) {
        try {
            nativeSqliteDiskCacheDeleteTile(this.b, amzaVar.bS());
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void o() {
        try {
            nativeSqliteDiskCacheClear(this.b);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void p() {
        try {
            nativeSqliteDiskCacheFlushWrites(this.b);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void r(long j) {
        try {
            nativeSqliteDiskCacheIncrementalVacuum(this.b, j);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void v(amza amzaVar, byte[] bArr) {
        try {
            nativeSqliteDiskCachePinTile(this.b, amzaVar.bS(), bArr);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void w(byte[] bArr) {
        try {
            nativeSqliteDiskCacheUnpinTiles(this.b, bArr);
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void l(amze amzeVar) {
        try {
            nativeSqliteDiskCacheInsertOrUpdateEmptyTile(this.b, amzeVar.bS());
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void m(amze amzeVar) {
        try {
            nativeSqliteDiskCacheUpdateTileMetadata(this.b, amzeVar.bS());
        } catch (anam e) {
            throw new amcx(e);
        }
    }

    @Override // defpackage.amcw
    public final void t(long j) {
        try {
            nativeSqliteDiskCacheTrimToSize(this.b, j);
            nativeSqliteDiskCacheFlushWrites(this.b);
        } catch (anam e) {
            throw new amcx(e);
        }
    }
}
