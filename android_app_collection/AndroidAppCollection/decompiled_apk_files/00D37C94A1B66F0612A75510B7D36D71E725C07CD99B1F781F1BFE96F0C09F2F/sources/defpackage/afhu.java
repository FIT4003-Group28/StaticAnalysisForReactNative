package defpackage;

import com.google.android.libraries.youtube.media.player.scripted.jni.NativeSupport;
/* compiled from: PG */
/* renamed from: afhu  reason: default package */
/* loaded from: classes.dex */
public final class afhu {
    private final long a;

    public afhu(long j) {
        aqxo.p(j != 0);
        this.a = j;
    }

    public final afhv a(byte[] bArr) {
        long nativeLoadScript = NativeSupport.nativeLoadScript(this.a, bArr);
        if (nativeLoadScript != 0) {
            return new afhv(this.a, nativeLoadScript);
        }
        return null;
    }
}
