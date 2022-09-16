package defpackage;

import android.media.MediaCodecInfo;
import android.os.Build;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.webrtc.Logging;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
/* compiled from: PG */
/* renamed from: axhq  reason: default package */
/* loaded from: classes2.dex */
public final class axhq implements VideoDecoderFactory {
    public final amqo a;
    public final amvn b;
    private final Map c = new HashMap();
    private final amqo d = aqxo.i(axib.b);
    private final amul e;

    public axhq(amqo amqoVar, amul amulVar, amvn amvnVar) {
        Logging.a("IMCVideoDecoderFactory", "InternalMediaCodecVideoDecoderFactory ctor.");
        this.a = amqoVar;
        this.e = amulVar;
        this.b = amvnVar;
    }

    public static axgr a(axgq axgqVar, String str) {
        aopa createBuilder = axgr.a.createBuilder();
        createBuilder.copyOnWrite();
        axgr axgrVar = (axgr) createBuilder.instance;
        axgrVar.c = axgqVar.g;
        axgrVar.b |= 1;
        createBuilder.copyOnWrite();
        axgr axgrVar2 = (axgr) createBuilder.instance;
        axgrVar2.b |= 2;
        axgrVar2.d = str;
        return (axgr) createBuilder.mo39build();
    }

    public final axhp b(axgq axgqVar) {
        axhp axhpVar;
        amuk a;
        if (this.c.containsKey(axgqVar)) {
            return (axhp) this.c.get(axgqVar);
        }
        String c = axie.c(axgqVar);
        Logging.a("IMCVideoDecoderFactory", c.length() != 0 ? "Searching HW decoder for ".concat(c) : new String("Searching HW decoder for "));
        try {
            MediaCodecInfo[] mediaCodecInfoArr = (MediaCodecInfo[]) this.d.get();
            if (mediaCodecInfoArr == null) {
                Logging.b("IMCVideoDecoderFactory", "Empty media codec info");
                axhpVar = axhp.a;
            } else {
                int length = mediaCodecInfoArr.length;
                boolean z = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        axhpVar = axhp.a;
                        break;
                    }
                    MediaCodecInfo mediaCodecInfo = mediaCodecInfoArr[i];
                    if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                        axgr axgrVar = null;
                        if (axie.e(mediaCodecInfo, axgqVar) && (a = this.e.a(axgqVar)) != null) {
                            String name = mediaCodecInfo.getName();
                            String valueOf = String.valueOf(name);
                            Logging.a("IMCVideoDecoderFactory", valueOf.length() != 0 ? "Found candidate decoder ".concat(valueOf) : new String("Found candidate decoder "));
                            int size = a.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 >= size) {
                                    break;
                                }
                                axgr axgrVar2 = (axgr) a.get(i2);
                                i2++;
                                if (name.startsWith(axgrVar2.d)) {
                                    String valueOf2 = String.valueOf(name);
                                    Logging.a("IMCVideoDecoderFactory", valueOf2.length() != 0 ? "Found target decoder ".concat(valueOf2) : new String("Found target decoder "));
                                    axgrVar = axgrVar2;
                                }
                            }
                        }
                        if (axgrVar != null) {
                            String name2 = mediaCodecInfo.getName();
                            axgq b = axgq.b(axgrVar.c);
                            if (b == null) {
                                b = axgq.UNKNOWN;
                            }
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(axie.c(b));
                                for (int i3 : capabilitiesForType.colorFormats) {
                                    String valueOf3 = String.valueOf(Integer.toHexString(i3));
                                    Logging.a("IMCVideoDecoderFactory", valueOf3.length() != 0 ? "   Color: 0x".concat(valueOf3) : new String("   Color: 0x"));
                                }
                                Integer b2 = axie.b(axie.b, capabilitiesForType.colorFormats);
                                if (b2 == null) {
                                    Logging.d("IMCVideoDecoderFactory", "Can not find supported color format. Only surface decoding is supported.");
                                    b2 = 0;
                                }
                                if (b == axgq.H264 && (name2.startsWith("OMX.qcom.") || (Build.VERSION.SDK_INT >= 23 && name2.startsWith("OMX.Exynos.")))) {
                                    z = true;
                                }
                                axhpVar = new axhp(name2, b2.intValue(), z, axgrVar);
                            } catch (IllegalArgumentException e) {
                                Logging.c("IMCVideoDecoderFactory", "Cannot retrieve decoder capabilities", e);
                                axhpVar = axhp.a;
                            }
                        }
                    }
                    i++;
                }
            }
        } catch (Exception e2) {
            Logging.c("IMCVideoDecoderFactory", "Cannot retrieve media codec info", e2);
            axhpVar = axhp.a;
        }
        this.c.put(axgqVar, axhpVar);
        String valueOf4 = String.valueOf(axhpVar);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf4).length() + 15);
        sb.append("Search result: ");
        sb.append(valueOf4);
        Logging.a("IMCVideoDecoderFactory", sb.toString());
        return axhpVar;
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        try {
            axgq q = axds.q(videoCodecInfo.a);
            boolean contains = this.b.contains(q);
            String str = videoCodecInfo.a;
            String c = axie.c(q);
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 57 + c.length());
            sb.append("createDecoder for type: ");
            sb.append(str);
            sb.append(", mime: ");
            sb.append(c);
            sb.append(", dynamic reconfig: ");
            sb.append(contains);
            Logging.a("IMCVideoDecoderFactory", sb.toString());
            axhp b = b(q);
            if (!b.b) {
                String valueOf = String.valueOf(videoCodecInfo.a);
                Logging.b("IMCVideoDecoderFactory", valueOf.length() != 0 ? "Unsupported decoder: ".concat(valueOf) : new String("Unsupported decoder: "));
                return null;
            }
            return new axhn(b.c, q, b.d, b.f, this.a, contains);
        } catch (IllegalArgumentException e) {
            String valueOf2 = String.valueOf(videoCodecInfo.a);
            Logging.c("IMCVideoDecoderFactory", valueOf2.length() != 0 ? "Unknown codec type: ".concat(valueOf2) : new String("Unknown codec type: "), e);
            return null;
        }
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo videoCodecInfo;
        ArrayList arrayList = new ArrayList();
        amzs it = axie.a.iterator();
        while (it.hasNext()) {
            axgq axgqVar = (axgq) it.next();
            axhp b = b(axgqVar);
            if (!b.b) {
                videoCodecInfo = null;
            } else {
                boolean z = false;
                if (axgqVar == axgq.H264 && b.e) {
                    z = true;
                }
                videoCodecInfo = new VideoCodecInfo(axgqVar.name(), axie.d(axgqVar, z));
            }
            if (videoCodecInfo != null) {
                arrayList.add(videoCodecInfo);
            }
        }
        return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
    }
}
