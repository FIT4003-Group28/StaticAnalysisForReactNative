package defpackage;

import java.nio.ByteBuffer;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: ctuf  reason: default package */
/* loaded from: classes5.dex */
public final class ctuf {
    public static UUID a(dspd dspdVar) {
        ByteBuffer wrap = ByteBuffer.wrap(dspdVar.G());
        return new UUID(wrap.getLong(), wrap.getLong());
    }
}
