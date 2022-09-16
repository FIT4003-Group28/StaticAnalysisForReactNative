package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashSet;
import org.webrtc.LibaomAv1Decoder;
import org.webrtc.LibvpxVp8Decoder;
import org.webrtc.LibvpxVp9Decoder;
import org.webrtc.Logging;
import org.webrtc.VideoCodecInfo;
import org.webrtc.VideoDecoder;
import org.webrtc.VideoDecoderFactory;
import org.webrtc.VideoDecoderFallback;
/* compiled from: PG */
/* renamed from: axio  reason: default package */
/* loaded from: classes2.dex */
public final class axio implements VideoDecoderFactory {
    private final VideoDecoderFactory a;

    public axio(bamm bammVar) {
        axho axhoVar = new axho();
        axhoVar.a = aqxo.j(bammVar);
        this.a = new axhq(axhoVar.a, amul.b(axhoVar.b), axhoVar.c.g());
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoDecoder createDecoder(VideoCodecInfo videoCodecInfo) {
        VideoDecoder libaomAv1Decoder;
        String name = videoCodecInfo.getName();
        axhn axhnVar = null;
        if (name.equalsIgnoreCase(bapa.a(1))) {
            libaomAv1Decoder = new LibvpxVp8Decoder();
        } else if (!name.equalsIgnoreCase(bapa.a(2)) || !LibvpxVp9Decoder.nativeIsSupported()) {
            libaomAv1Decoder = (!name.equalsIgnoreCase(bapa.a(4)) || !LibaomAv1Decoder.nativeIsSupported()) ? null : new LibaomAv1Decoder();
        } else {
            libaomAv1Decoder = new LibvpxVp9Decoder();
        }
        VideoDecoderFactory videoDecoderFactory = this.a;
        try {
            axgq q = axds.q(videoCodecInfo.a);
            axhq axhqVar = (axhq) videoDecoderFactory;
            boolean contains = axhqVar.b.contains(q);
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
            axhp b = axhqVar.b(q);
            if (!b.b) {
                String valueOf = String.valueOf(videoCodecInfo.a);
                Logging.b("IMCVideoDecoderFactory", valueOf.length() != 0 ? "Unsupported decoder: ".concat(valueOf) : new String("Unsupported decoder: "));
            } else {
                axhnVar = new axhn(b.c, q, b.d, b.f, axhqVar.a, contains);
            }
        } catch (IllegalArgumentException e) {
            String valueOf2 = String.valueOf(videoCodecInfo.a);
            Logging.c("IMCVideoDecoderFactory", valueOf2.length() != 0 ? "Unknown codec type: ".concat(valueOf2) : new String("Unknown codec type: "), e);
        }
        if (axhnVar == null || libaomAv1Decoder == null) {
            return axhnVar != null ? axhnVar : libaomAv1Decoder;
        }
        return new VideoDecoderFallback(libaomAv1Decoder, axhnVar);
    }

    @Override // org.webrtc.VideoDecoderFactory
    public final VideoCodecInfo[] getSupportedCodecs() {
        VideoCodecInfo videoCodecInfo;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList = new ArrayList();
        arrayList.add(new VideoCodecInfo(bapa.a(1), new HashMap()));
        if (LibvpxVp9Decoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo(bapa.a(2), new HashMap()));
        }
        if (LibaomAv1Decoder.nativeIsSupported()) {
            arrayList.add(new VideoCodecInfo(bapa.a(4), new HashMap()));
        }
        linkedHashSet.addAll(Arrays.asList((VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()])));
        VideoDecoderFactory videoDecoderFactory = this.a;
        ArrayList arrayList2 = new ArrayList();
        amzs it = axie.a.iterator();
        while (it.hasNext()) {
            axgq axgqVar = (axgq) it.next();
            axhp b = ((axhq) videoDecoderFactory).b(axgqVar);
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
                arrayList2.add(videoCodecInfo);
            }
        }
        linkedHashSet.addAll(Arrays.asList((VideoCodecInfo[]) arrayList2.toArray(new VideoCodecInfo[arrayList2.size()])));
        return (VideoCodecInfo[]) linkedHashSet.toArray(new VideoCodecInfo[linkedHashSet.size()]);
    }
}
