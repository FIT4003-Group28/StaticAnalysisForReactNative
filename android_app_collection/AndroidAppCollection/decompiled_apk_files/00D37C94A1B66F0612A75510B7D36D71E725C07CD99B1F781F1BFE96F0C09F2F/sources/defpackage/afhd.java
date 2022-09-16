package defpackage;

import android.media.MediaCodecInfo;
/* compiled from: PG */
/* renamed from: afhd  reason: default package */
/* loaded from: classes.dex */
public final class afhd implements afhf {
    public static final amup a = amup.m("audio/mp4a-latm", aouu.AAC, "audio/opus", aouu.OPUS, "audio/webm", aouu.OPUS);
    public static final amup b = amup.o("video/av01", aouv.AV1, "video/avc", aouv.H264, "video/x-vnd.on2.vp9", aouv.VP9, "video/3gpp", aouv.MPEG4, "video/webm", aouv.VP9);
    public static final amvn c = amvn.s(60, 30);
    public static final amuk d;
    public static final amuk e;
    private static final afhc f;
    private final amqo g = aqxo.i(afhb.a);

    static {
        amuk A = amuk.A(afhc.a(8192, 8192), afhc.a(7680, 4320), afhc.a(3840, 2160), afhc.a(2560, 1440), afhc.a(1920, 1080), afhc.a(1280, 720), afhc.a(960, 540), afhc.a(854, 480), afhc.a(640, 360), afhc.a(426, 240), afhc.a(256, 144), afhc.a(128, 72), new afhc[0]);
        d = A;
        amuf h = amuk.h(((amxx) A).c);
        int i = ((amxx) A).c;
        for (int i2 = 0; i2 < i; i2++) {
            afhc afhcVar = (afhc) A.get(i2);
            h.h(afhc.a(afhcVar.b, afhcVar.a));
        }
        e = h.g();
        f = afhc.a(0, 0);
    }

    public static ampr a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, amuk amukVar) {
        int i2 = ((amxx) amukVar).c;
        afhc afhcVar = null;
        afhc afhcVar2 = null;
        for (int i3 = 0; i3 < i2; i3++) {
            afhc afhcVar3 = (afhc) amukVar.get(i3);
            if (videoCapabilities.areSizeAndRateSupported(afhcVar3.a, afhcVar3.b, i)) {
                if (afhcVar == null) {
                    afhcVar = afhcVar3;
                    afhcVar2 = afhcVar;
                } else {
                    afhcVar2 = afhcVar3;
                }
            }
        }
        if (afhcVar == null) {
            afhcVar = f;
        }
        if (afhcVar2 == null) {
            afhcVar2 = f;
        }
        return ampr.a(afhcVar, afhcVar2);
    }

    @Override // defpackage.afhf
    public final amqo b() {
        return this.g;
    }
}
