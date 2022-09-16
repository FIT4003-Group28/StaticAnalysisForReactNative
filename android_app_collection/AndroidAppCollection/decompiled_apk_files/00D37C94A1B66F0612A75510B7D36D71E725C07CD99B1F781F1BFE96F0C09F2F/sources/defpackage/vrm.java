package defpackage;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.view.Surface;
/* compiled from: PG */
/* renamed from: vrm  reason: default package */
/* loaded from: classes4.dex */
final class vrm {
    public MediaFormat a;
    public final MediaCodec b;
    public int c;

    public vrm(MediaFormat mediaFormat) {
        MediaCodec createEncoderByType = MediaCodec.createEncoderByType(mediaFormat.getString("mime"));
        this.b = createEncoderByType;
        createEncoderByType.configure(mediaFormat, (Surface) null, (MediaCrypto) null, 1);
        createEncoderByType.start();
        this.c = 1;
    }
}
