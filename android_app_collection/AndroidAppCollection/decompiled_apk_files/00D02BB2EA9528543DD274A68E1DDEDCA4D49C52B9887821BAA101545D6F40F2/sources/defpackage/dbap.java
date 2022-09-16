package defpackage;

import com.google.ar.core.ArImage;
import com.google.ar.core.Session;
import com.google.ar.core.exceptions.FatalException;
import java.nio.ByteBuffer;
/* compiled from: PG */
/* renamed from: dbap  reason: default package */
/* loaded from: classes5.dex */
public final class dbap extends dn {
    final /* synthetic */ ArImage a;
    private final long b;
    private final int c;

    public dbap(ArImage arImage, long j, int i) {
        this.a = arImage;
        this.b = j;
        this.c = i;
    }

    @Override // android.media.Image.Plane
    public final ByteBuffer getBuffer() {
        Session session;
        ByteBuffer nativeGetBuffer;
        ArImage arImage = this.a;
        session = arImage.session;
        nativeGetBuffer = arImage.nativeGetBuffer(session.nativeWrapperHandle, this.b, this.c);
        return nativeGetBuffer.asReadOnlyBuffer();
    }

    @Override // android.media.Image.Plane
    public final int getPixelStride() {
        Session session;
        int nativeGetPixelStride;
        ArImage arImage = this.a;
        session = arImage.session;
        nativeGetPixelStride = arImage.nativeGetPixelStride(session.nativeWrapperHandle, this.b, this.c);
        if (nativeGetPixelStride != -1) {
            return nativeGetPixelStride;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getPixelStride().");
    }

    @Override // android.media.Image.Plane
    public final int getRowStride() {
        Session session;
        int nativeGetRowStride;
        ArImage arImage = this.a;
        session = arImage.session;
        nativeGetRowStride = arImage.nativeGetRowStride(session.nativeWrapperHandle, this.b, this.c);
        if (nativeGetRowStride != -1) {
            return nativeGetRowStride;
        }
        throw new FatalException("Unknown error in ArImage.Plane.getRowStride().");
    }
}
