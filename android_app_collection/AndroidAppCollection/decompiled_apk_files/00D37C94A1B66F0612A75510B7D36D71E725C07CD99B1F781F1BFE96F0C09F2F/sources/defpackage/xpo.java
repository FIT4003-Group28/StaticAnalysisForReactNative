package defpackage;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCallback;
import com.google.mediapipe.framework.PacketGetter;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: xpo  reason: default package */
/* loaded from: classes4.dex */
public final class xpo implements PacketCallback {
    final /* synthetic */ xpr a;

    public xpo(xpr xprVar) {
        this.a = xprVar;
    }

    @Override // com.google.mediapipe.framework.PacketCallback
    public final void process(Packet packet) {
        int nativeGetImageWidth = PacketGetter.nativeGetImageWidth(packet.getNativeHandle());
        int nativeGetImageHeight = PacketGetter.nativeGetImageHeight(packet.getNativeHandle());
        Bitmap createBitmap = Bitmap.createBitmap(nativeGetImageWidth, nativeGetImageHeight, Bitmap.Config.ARGB_8888);
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect(nativeGetImageWidth * nativeGetImageHeight * 4);
        allocateDirect.order(ByteOrder.nativeOrder());
        aqxo.z(PacketGetter.nativeGetImageData(packet.getNativeHandle(), allocateDirect), String.format("Got error from getImageData, returning null Bitmap. Image width %d, height %d", Integer.valueOf(nativeGetImageWidth), Integer.valueOf(nativeGetImageHeight)));
        createBitmap.copyPixelsFromBuffer(allocateDirect);
        new Handler(Looper.getMainLooper()).post(new xpn(this, createBitmap));
    }
}
