package com.google.webrtc.hwcodec;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.webrtc.Logging;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoEncoderFactory;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class InternalMediaCodecVideoEncoderFactory implements VideoEncoderFactory {
    public static final List a = Arrays.asList("SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4");
    private final Map b = new HashMap();
    private final amqo c = aqxo.i(axib.a);
    private final amqo d;
    private final boolean e;
    private final amul f;
    private final amup g;
    private final acoz h;

    public InternalMediaCodecVideoEncoderFactory(amqo amqoVar, boolean z, acoz acozVar, amul amulVar, amup amupVar) {
        Logging.a("IMCVideoEncoderFactory", "InternalMediaCodecVideoEncoderFactory ctor");
        this.d = amqoVar;
        this.e = z;
        this.h = acozVar;
        this.f = amulVar;
        this.g = amupVar;
    }

    public static int a(axgq axgqVar) {
        axgq axgqVar2 = axgq.UNKNOWN;
        axgp axgpVar = axgp.NONE;
        int ordinal = axgqVar.ordinal();
        if (ordinal == 1 || ordinal == 2) {
            return 100;
        }
        if (ordinal == 3 || ordinal == 4) {
            return 20;
        }
        if (ordinal == 5) {
            return 100;
        }
        int i = axgqVar.g;
        StringBuilder sb = new StringBuilder(38);
        sb.append("Unsupported VideoCodecType ");
        sb.append(i);
        throw new IllegalArgumentException(sb.toString());
    }

    public static axgs b(axgq axgqVar, String str, axgp axgpVar) {
        aopa createBuilder = axgs.a.createBuilder();
        createBuilder.copyOnWrite();
        axgs axgsVar = (axgs) createBuilder.instance;
        axgsVar.c = axgqVar.g;
        axgsVar.b |= 1;
        createBuilder.copyOnWrite();
        axgs axgsVar2 = (axgs) createBuilder.instance;
        axgsVar2.b |= 2;
        axgsVar2.d = str;
        createBuilder.copyOnWrite();
        axgs axgsVar3 = (axgs) createBuilder.instance;
        axgsVar3.e = axgpVar.d;
        axgsVar3.b |= 16;
        int a2 = a(axgqVar);
        createBuilder.copyOnWrite();
        axgs axgsVar4 = (axgs) createBuilder.instance;
        axgsVar4.b |= 32;
        axgsVar4.f = a2;
        createBuilder.copyOnWrite();
        axgs axgsVar5 = (axgs) createBuilder.instance;
        axgsVar5.b |= 64;
        axgsVar5.g = 0;
        createBuilder.copyOnWrite();
        axgs.a((axgs) createBuilder.instance);
        return (axgs) createBuilder.mo39build();
    }

    public static axic c() {
        return new axic();
    }

    private final axid d(axgq axgqVar) {
        axid axidVar;
        amuk a2;
        if (this.b.containsKey(axgqVar)) {
            return (axid) this.b.get(axgqVar);
        }
        String c = axie.c(axgqVar);
        Logging.a("IMCVideoEncoderFactory", c.length() != 0 ? "Searching HW encoder for ".concat(c) : new String("Searching HW encoder for "));
        try {
            MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.c.get();
            if (mediaCodecInfoArr == null) {
                Logging.b("IMCVideoEncoderFactory", "Empty codec info");
                axidVar = axid.a;
            } else {
                int length = mediaCodecInfoArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        axidVar = axid.a;
                        break;
                    }
                    MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i];
                    if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                        axgs axgsVar = null;
                        if (axie.e(mediaCodecInfo, axgqVar) && (a2 = this.f.a(axgqVar)) != null) {
                            String name = mediaCodecInfo.getName();
                            String valueOf = String.valueOf(name);
                            Logging.a("IMCVideoEncoderFactory", valueOf.length() != 0 ? "Found candidate encoder ".concat(valueOf) : new String("Found candidate encoder "));
                            int size = a2.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                }
                                axgs axgsVar2 = (axgs) a2.get(i2);
                                i2++;
                                if (name.startsWith(axgsVar2.d)) {
                                    String valueOf2 = String.valueOf(name);
                                    Logging.a("IMCVideoEncoderFactory", valueOf2.length() != 0 ? "Found target encoder ".concat(valueOf2) : new String("Found target encoder "));
                                    axgsVar = axgsVar2;
                                }
                            }
                        }
                        if (axgsVar != null) {
                            String name2 = mediaCodecInfo.getName();
                            axgq b = axgq.b(axgsVar.c);
                            if (b == null) {
                                b = axgq.UNKNOWN;
                            }
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(axie.c(b));
                                axidVar = new axid(name2, axie.b(axie.d, capabilitiesForType.colorFormats), axie.b(axie.c, capabilitiesForType.colorFormats), axgsVar, b == axgq.H264 && Build.VERSION.SDK_INT >= 23 && name2.startsWith("OMX.Exynos."));
                            } catch (IllegalArgumentException e) {
                                Logging.e("IMCVideoEncoderFactory", "Cannot retrieve encoder capabilities.", e);
                                axidVar = axid.a;
                            }
                        }
                    }
                    i++;
                }
            }
        } catch (Exception e2) {
            Logging.c("IMCVideoEncoderFactory", "Cannot retrieve encoder codec info", e2);
            axidVar = axid.a;
        }
        this.b.put(axgqVar, axidVar);
        String valueOf3 = String.valueOf(axidVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf3).length() + 15);
        sb.append("Search result: ");
        sb.append(valueOf3);
        Logging.a("IMCVideoEncoderFactory", sb.toString());
        return axidVar;
    }

    private static native boolean nativeIsSameH264Profile(Map map, Map map2);

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
        if (r3 != false) goto L18;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00de  */
    @Override // org.webrtc.VideoEncoderFactory
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final org.webrtc.VideoEncoder createEncoder(org.webrtc.VideoCodecInfo r15) {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoderFactory.createEncoder(org.webrtc.VideoCodecInfo):org.webrtc.VideoEncoder");
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final /* synthetic */ VideoEncoderFactory.VideoEncoderSelector getEncoderSelector() {
        return null;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final /* synthetic */ VideoCodecInfo[] getImplementations() {
        VideoCodecInfo[] supportedCodecs;
        supportedCodecs = getSupportedCodecs();
        return supportedCodecs;
    }

    @Override // org.webrtc.VideoEncoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        ArrayList arrayList;
        ArrayList arrayList2 = new ArrayList();
        amzs it = axie.a.iterator();
        while (it.hasNext()) {
            axgq axgqVar = (axgq) it.next();
            axid d = d(axgqVar);
            if (!d.b) {
                arrayList = new ArrayList();
            } else {
                ArrayList arrayList3 = new ArrayList();
                if (axgqVar == axgq.H264 && d.g) {
                    arrayList3.add(new VideoCodecInfo(axgqVar.name(), axie.d(axgqVar, true)));
                }
                arrayList3.add(new VideoCodecInfo(axgqVar.name(), axie.d(axgqVar, false)));
                arrayList = arrayList3;
            }
            arrayList2.addAll(arrayList);
        }
        return (VideoCodecInfo[]) arrayList2.toArray(new VideoCodecInfo[arrayList2.size()]);
    }
}
