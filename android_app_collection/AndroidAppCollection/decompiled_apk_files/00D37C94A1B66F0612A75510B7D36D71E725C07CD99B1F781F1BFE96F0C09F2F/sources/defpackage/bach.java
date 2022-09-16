package defpackage;

import android.os.StrictMode;
import java.io.Closeable;
/* compiled from: PG */
/* renamed from: bach  reason: default package */
/* loaded from: classes2.dex */
public final class bach implements Closeable {
    private final StrictMode.ThreadPolicy a;
    private final StrictMode.VmPolicy b;

    private bach(StrictMode.ThreadPolicy threadPolicy) {
        this(threadPolicy, null);
    }

    public bach(StrictMode.ThreadPolicy threadPolicy, StrictMode.VmPolicy vmPolicy) {
        this.a = threadPolicy;
        this.b = vmPolicy;
    }

    public static bach a() {
        return new bach(StrictMode.allowThreadDiskReads());
    }

    public static bach b() {
        return new bach(StrictMode.allowThreadDiskWrites());
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        StrictMode.ThreadPolicy threadPolicy = this.a;
        if (threadPolicy != null) {
            StrictMode.setThreadPolicy(threadPolicy);
        }
        StrictMode.VmPolicy vmPolicy = this.b;
        if (vmPolicy != null) {
            StrictMode.setVmPolicy(vmPolicy);
        }
    }
}
