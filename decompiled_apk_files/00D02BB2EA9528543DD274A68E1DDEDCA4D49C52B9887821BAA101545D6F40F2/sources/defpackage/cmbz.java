package defpackage;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: cmbz  reason: default package */
/* loaded from: classes5.dex */
public abstract class cmbz implements cmbt {
    @Override // defpackage.cmbt
    public final Metadata a(cmbw cmbwVar) {
        ByteBuffer byteBuffer = cmbwVar.b;
        cmmn.f(byteBuffer);
        boolean z = false;
        if (byteBuffer.position() == 0 && byteBuffer.hasArray() && byteBuffer.arrayOffset() == 0) {
            z = true;
        }
        cmmn.a(z);
        if (cmbwVar.isDecodeOnly()) {
            return null;
        }
        return b(cmbwVar, byteBuffer);
    }

    protected abstract Metadata b(cmbw cmbwVar, ByteBuffer byteBuffer);
}
