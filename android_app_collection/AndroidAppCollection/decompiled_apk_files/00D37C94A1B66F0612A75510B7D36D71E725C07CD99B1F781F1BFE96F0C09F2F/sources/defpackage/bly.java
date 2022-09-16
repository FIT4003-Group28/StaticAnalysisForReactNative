package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;
/* compiled from: PG */
/* renamed from: bly  reason: default package */
/* loaded from: classes2.dex */
public final class bly implements blr {
    public final Object a = new Object();
    public blx b;
    public boolean c;
    private final Context d;
    private final String e;
    private final bln f;
    private final boolean g;

    public bly(Context context, String str, bln blnVar, boolean z) {
        this.d = context;
        this.e = str;
        this.f = blnVar;
        this.g = z;
    }

    @Override // defpackage.blr
    public final blv a() {
        return b().c();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        b().close();
    }

    private final blx b() {
        blx blxVar;
        synchronized (this.a) {
            if (this.b == null) {
                blv[] blvVarArr = new blv[1];
                if (Build.VERSION.SDK_INT < 23 || this.e == null || !this.g) {
                    this.b = new blx(this.d, this.e, blvVarArr, this.f);
                } else {
                    this.b = new blx(this.d, new File(this.d.getNoBackupFilesDir(), this.e).getAbsolutePath(), blvVarArr, this.f);
                }
                this.b.setWriteAheadLoggingEnabled(this.c);
            }
            blxVar = this.b;
        }
        return blxVar;
    }
}
