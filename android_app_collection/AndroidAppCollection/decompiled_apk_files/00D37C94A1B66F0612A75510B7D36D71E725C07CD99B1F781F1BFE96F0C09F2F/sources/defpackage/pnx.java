package defpackage;

import com.google.android.exoplayer2.drm.ExoMediaCrypto;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: pnx  reason: default package */
/* loaded from: classes4.dex */
public final class pnx implements ExoMediaCrypto {
    public static final boolean a;
    public final UUID b;
    public final byte[] c;

    static {
        boolean z = true;
        if (!"Amazon".equals(pxi.c) || (!"AFTM".equals(pxi.d) && !"AFTB".equals(pxi.d))) {
            z = false;
        }
        a = z;
    }

    public pnx(UUID uuid, byte[] bArr) {
        this.b = uuid;
        this.c = bArr;
    }
}
