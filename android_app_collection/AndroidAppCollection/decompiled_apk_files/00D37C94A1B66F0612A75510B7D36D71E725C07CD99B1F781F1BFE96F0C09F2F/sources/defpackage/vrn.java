package defpackage;

import android.media.MediaCodec;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: vrn  reason: default package */
/* loaded from: classes4.dex */
final class vrn implements vrp {
    @Override // defpackage.vrp
    public final vru a(String str, boolean z) {
        MediaCodec createDecoderByType;
        viu.d(true);
        try {
            if (z) {
                createDecoderByType = MediaCodec.createEncoderByType(str);
            } else {
                createDecoderByType = MediaCodec.createDecoderByType(str);
            }
            return new vru(createDecoderByType);
        } catch (IOException e) {
            String valueOf = String.valueOf(str);
            vqy.c(valueOf.length() != 0 ? "Failed to create media decoder for mime type: ".concat(valueOf) : new String("Failed to create media decoder for mime type: "), e);
            return null;
        }
    }
}
