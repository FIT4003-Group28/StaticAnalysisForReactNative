package defpackage;

import com.google.android.libraries.youtube.media.player.scripted.jni.NativeSupport;
/* compiled from: PG */
/* renamed from: afhv  reason: default package */
/* loaded from: classes.dex */
public final class afhv {
    private final long a;
    private final long b;

    public afhv(long j, long j2) {
        boolean z = false;
        if (j2 != 0 && j != 0) {
            z = true;
        }
        aqxo.p(z);
        this.a = j;
        this.b = j2;
    }

    public final byte[] a(String str, byte[] bArr) {
        return NativeSupport.nativeCall(this.a, this.b, str, bArr);
    }
}
