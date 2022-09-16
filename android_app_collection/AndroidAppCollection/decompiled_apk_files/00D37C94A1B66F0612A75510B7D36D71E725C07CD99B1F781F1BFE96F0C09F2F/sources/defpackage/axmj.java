package defpackage;

import com.google.android.libraries.elements.interfaces.PbToFb;
import com.youtube.android.libraries.elements.StatusOr;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicBoolean;
/* compiled from: PG */
/* renamed from: axmj  reason: default package */
/* loaded from: classes2.dex */
public final class axmj {
    public static final AtomicBoolean a;

    static {
        smc.b();
        a = new AtomicBoolean(false);
    }

    public static int a(byte[] bArr, aodt aodtVar, boolean z, boolean z2) {
        StatusOr convert = PbToFb.convert(ByteBuffer.wrap(bArr), a.get(), z, z2);
        if (convert.hasValue) {
            aodt.aF(ByteBuffer.wrap((byte[]) convert.value), aodtVar);
            return convert.status.getCode().value();
        }
        String valueOf = String.valueOf(convert.status);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 8);
        sb.append("status: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }
}
