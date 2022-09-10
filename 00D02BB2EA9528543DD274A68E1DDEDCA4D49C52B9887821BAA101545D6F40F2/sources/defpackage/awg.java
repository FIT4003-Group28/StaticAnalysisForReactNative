package defpackage;

import android.content.Context;
import android.os.Build;
import java.io.File;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: awg  reason: default package */
/* loaded from: classes3.dex */
public final class awg implements avz {
    private final Context a;
    private final String b;
    private final avv c;
    private final boolean d;
    private final Object e = new Object();
    private awf f;
    private boolean g;

    public awg(Context context, String str, avv avvVar, boolean z) {
        this.a = context;
        this.b = str;
        this.c = avvVar;
        this.d = z;
    }

    @Override // defpackage.avz
    public final void a(boolean z) {
        synchronized (this.e) {
            awf awfVar = this.f;
            if (awfVar != null) {
                awfVar.setWriteAheadLoggingEnabled(z);
            }
            this.g = z;
        }
    }

    @Override // defpackage.avz
    public final avu b() {
        return c().a();
    }

    @Override // defpackage.avz, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        c().close();
    }

    private final awf c() {
        awf awfVar;
        synchronized (this.e) {
            if (this.f == null) {
                awd[] awdVarArr = new awd[1];
                if (Build.VERSION.SDK_INT < 23 || this.b == null || !this.d) {
                    this.f = new awf(this.a, this.b, awdVarArr, this.c);
                } else {
                    this.f = new awf(this.a, new File(this.a.getNoBackupFilesDir(), this.b).getAbsolutePath(), awdVarArr, this.c);
                }
                this.f.setWriteAheadLoggingEnabled(this.g);
            }
            awfVar = this.f;
        }
        return awfVar;
    }
}
