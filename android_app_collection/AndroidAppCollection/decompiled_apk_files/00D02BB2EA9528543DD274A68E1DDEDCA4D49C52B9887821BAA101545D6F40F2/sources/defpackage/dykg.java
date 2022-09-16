package defpackage;

import com.google.ar.core.ImageMetadata;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dykg  reason: default package */
/* loaded from: classes6.dex */
final class dykg implements dyvt {
    @Override // defpackage.dyvt
    public final dyvs a(int i) {
        return new dykf(ByteBuffer.allocateDirect(Math.min((int) ImageMetadata.SHADING_MODE, i)));
    }
}
