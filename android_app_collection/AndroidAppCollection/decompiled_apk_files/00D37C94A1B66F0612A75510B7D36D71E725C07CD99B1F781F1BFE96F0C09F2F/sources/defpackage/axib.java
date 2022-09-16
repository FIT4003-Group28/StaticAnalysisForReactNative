package defpackage;

import android.media.MediaCodecList;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoderFactory;
import java.util.List;
/* compiled from: PG */
/* renamed from: axib  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class axib implements amqo {
    private final /* synthetic */ int c;
    public static final /* synthetic */ axib b = new axib(1);
    public static final /* synthetic */ axib a = new axib();

    private /* synthetic */ axib() {
    }

    private /* synthetic */ axib(int i) {
        this.c = i;
    }

    @Override // defpackage.amqo
    public final Object get() {
        if (this.c == 0) {
            List list = InternalMediaCodecVideoEncoderFactory.a;
            return new MediaCodecList(1).getCodecInfos();
        }
        return new MediaCodecList(1).getCodecInfos();
    }
}
