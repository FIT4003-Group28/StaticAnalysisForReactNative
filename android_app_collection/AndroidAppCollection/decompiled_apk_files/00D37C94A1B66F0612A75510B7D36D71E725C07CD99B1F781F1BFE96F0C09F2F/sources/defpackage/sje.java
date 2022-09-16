package defpackage;

import com.google.android.libraries.ar.faceviewer.runtime.RuntimeJni;
/* compiled from: PG */
/* renamed from: sje  reason: default package */
/* loaded from: classes4.dex */
public final class sje implements AutoCloseable {
    public static final /* synthetic */ int b = 0;
    public final RuntimeJni a;

    public sje(RuntimeJni runtimeJni) {
        this.a = runtimeJni;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        RuntimeJni runtimeJni = this.a;
        long j = runtimeJni.a;
        if (j != 0) {
            runtimeJni.nativeDestroy(j);
            runtimeJni.a = 0L;
        }
    }
}
