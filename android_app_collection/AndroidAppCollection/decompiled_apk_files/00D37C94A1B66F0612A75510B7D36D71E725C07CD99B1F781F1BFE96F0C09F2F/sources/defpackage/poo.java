package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: poo  reason: default package */
/* loaded from: classes4.dex */
public abstract class poo implements poi {
    @Override // defpackage.poi
    public final Metadata a(pol polVar) {
        ByteBuffer byteBuffer = polVar.d;
        ptx.a(byteBuffer);
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        ptx.c(z);
        if (polVar.isDecodeOnly()) {
            return null;
        }
        return b(polVar, byteBuffer);
    }

    protected abstract Metadata b(pol polVar, ByteBuffer byteBuffer);
}
