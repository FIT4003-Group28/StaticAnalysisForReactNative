package defpackage;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.List;
/* compiled from: PG */
/* renamed from: afhb  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class afhb implements amqo {
    public static final /* synthetic */ afhb a = new afhb();

    private /* synthetic */ afhb() {
    }

    @Override // defpackage.amqo
    public final Object get() {
        MediaCodecInfo[] codecInfos;
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        String[] strArr;
        String[] supportedTypes;
        MediaCodecInfo.CodecCapabilities capabilitiesForType2;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        amup amupVar = afhd.a;
        aopa createBuilder = orb.a.createBuilder();
        amuf f = amuk.f();
        for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
            for (String str : mediaCodecInfo.getSupportedTypes()) {
                if (afhd.a.containsKey(str) && (capabilitiesForType2 = mediaCodecInfo.getCapabilitiesForType(str)) != null && (audioCapabilities = capabilitiesForType2.getAudioCapabilities()) != null) {
                    Integer upper = audioCapabilities.getBitrateRange().getUpper();
                    int maxInputChannelCount = audioCapabilities.getMaxInputChannelCount();
                    aopa createBuilder2 = oqy.a.createBuilder();
                    createBuilder2.copyOnWrite();
                    oqy oqyVar = (oqy) createBuilder2.instance;
                    oqyVar.b |= 2;
                    oqyVar.d = maxInputChannelCount;
                    createBuilder2.copyOnWrite();
                    oqy oqyVar2 = (oqy) createBuilder2.instance;
                    oqyVar2.c = ((aouu) afhd.a.get(str)).m;
                    oqyVar2.b |= 1;
                    if (upper != null) {
                        int intValue = upper.intValue();
                        createBuilder2.copyOnWrite();
                        oqy oqyVar3 = (oqy) createBuilder2.instance;
                        oqyVar3.b |= 4;
                        oqyVar3.e = intValue;
                    }
                    f.h((oqy) createBuilder2.mo39build());
                }
            }
        }
        amuk g = f.g();
        createBuilder.copyOnWrite();
        orb orbVar = (orb) createBuilder.instance;
        aopu aopuVar = orbVar.c;
        if (!aopuVar.c()) {
            orbVar.c = aopi.mutableCopy(aopuVar);
        }
        aonk.addAll((Iterable) g, (List) orbVar.c);
        amuf f2 = amuk.f();
        MediaCodecInfo[] codecInfos2 = new MediaCodecList(0).getCodecInfos();
        int length = codecInfos2.length;
        for (int i = 0; i < length; i++) {
            MediaCodecInfo mediaCodecInfo2 = codecInfos2[i];
            String[] supportedTypes2 = mediaCodecInfo2.getSupportedTypes();
            int length2 = supportedTypes2.length;
            int i2 = 0;
            while (i2 < length2) {
                String str2 = supportedTypes2[i2];
                if (afhd.b.containsKey(str2) && (capabilitiesForType = mediaCodecInfo2.getCapabilitiesForType(str2)) != null && (videoCapabilities = capabilitiesForType.getVideoCapabilities()) != null) {
                    Integer upper2 = videoCapabilities.getBitrateRange().getUpper();
                    amzs it = afhd.c.iterator();
                    while (it.hasNext()) {
                        int intValue2 = ((Integer) it.next()).intValue();
                        aopa createBuilder3 = ora.a.createBuilder();
                        MediaCodecInfo[] mediaCodecInfoArr = codecInfos2;
                        createBuilder3.copyOnWrite();
                        int i3 = length;
                        ora oraVar = (ora) createBuilder3.instance;
                        oraVar.c = ((aouv) afhd.b.get(str2)).l;
                        oraVar.b |= 1;
                        createBuilder3.copyOnWrite();
                        ora oraVar2 = (ora) createBuilder3.instance;
                        oraVar2.b |= 1024;
                        oraVar2.m = intValue2;
                        if (upper2 != null) {
                            int intValue3 = upper2.intValue();
                            createBuilder3.copyOnWrite();
                            ora oraVar3 = (ora) createBuilder3.instance;
                            strArr = supportedTypes2;
                            oraVar3.b |= 2048;
                            oraVar3.n = intValue3;
                        } else {
                            strArr = supportedTypes2;
                        }
                        ampr a2 = afhd.a(videoCapabilities, intValue2, afhd.d);
                        ampr a3 = afhd.a(videoCapabilities, intValue2, afhd.e);
                        int i4 = ((afhc) a2.a).b;
                        createBuilder3.copyOnWrite();
                        ora oraVar4 = (ora) createBuilder3.instance;
                        int i5 = length2;
                        oraVar4.b |= 4;
                        oraVar4.e = i4;
                        int i6 = ((afhc) a2.a).a;
                        createBuilder3.copyOnWrite();
                        ora oraVar5 = (ora) createBuilder3.instance;
                        oraVar5.b |= 8;
                        oraVar5.f = i6;
                        int i7 = ((afhc) a2.b).b;
                        createBuilder3.copyOnWrite();
                        ora oraVar6 = (ora) createBuilder3.instance;
                        oraVar6.b |= 16;
                        oraVar6.g = i7;
                        int i8 = ((afhc) a2.b).a;
                        createBuilder3.copyOnWrite();
                        ora oraVar7 = (ora) createBuilder3.instance;
                        oraVar7.b |= 32;
                        oraVar7.h = i8;
                        int i9 = ((afhc) a3.a).b;
                        createBuilder3.copyOnWrite();
                        ora oraVar8 = (ora) createBuilder3.instance;
                        oraVar8.b |= 64;
                        oraVar8.i = i9;
                        int i10 = ((afhc) a3.a).a;
                        createBuilder3.copyOnWrite();
                        ora oraVar9 = (ora) createBuilder3.instance;
                        oraVar9.b |= 128;
                        oraVar9.j = i10;
                        int i11 = ((afhc) a3.b).b;
                        createBuilder3.copyOnWrite();
                        ora oraVar10 = (ora) createBuilder3.instance;
                        oraVar10.b |= 256;
                        oraVar10.k = i11;
                        int i12 = ((afhc) a3.b).a;
                        createBuilder3.copyOnWrite();
                        ora oraVar11 = (ora) createBuilder3.instance;
                        oraVar11.b |= 512;
                        oraVar11.l = i12;
                        if (Build.VERSION.SDK_INT >= 29) {
                            boolean isHardwareAccelerated = mediaCodecInfo2.isHardwareAccelerated();
                            createBuilder3.copyOnWrite();
                            ora oraVar12 = (ora) createBuilder3.instance;
                            oraVar12.b |= 2;
                            oraVar12.d = isHardwareAccelerated;
                        }
                        boolean isFeatureSupported = capabilitiesForType.isFeatureSupported("secure-playback");
                        aopa createBuilder4 = oqz.a.createBuilder();
                        createBuilder4.copyOnWrite();
                        oqz oqzVar = (oqz) createBuilder4.instance;
                        oqzVar.b |= 16;
                        oqzVar.e = isFeatureSupported;
                        createBuilder4.copyOnWrite();
                        oqz oqzVar2 = (oqz) createBuilder4.instance;
                        oqzVar2.b |= 1;
                        oqzVar2.c = isFeatureSupported;
                        createBuilder4.copyOnWrite();
                        oqz oqzVar3 = (oqz) createBuilder4.instance;
                        oqzVar3.b |= 2;
                        oqzVar3.d = isFeatureSupported;
                        createBuilder3.copyOnWrite();
                        ora oraVar13 = (ora) createBuilder3.instance;
                        oqz oqzVar4 = (oqz) createBuilder4.mo39build();
                        oqzVar4.getClass();
                        oraVar13.o = oqzVar4;
                        oraVar13.b |= 4096;
                        f2.h((ora) createBuilder3.mo39build());
                        codecInfos2 = mediaCodecInfoArr;
                        length = i3;
                        supportedTypes2 = strArr;
                        length2 = i5;
                    }
                }
                i2++;
                codecInfos2 = codecInfos2;
                length = length;
                supportedTypes2 = supportedTypes2;
                length2 = length2;
            }
        }
        amuk g2 = f2.g();
        createBuilder.copyOnWrite();
        orb orbVar2 = (orb) createBuilder.instance;
        aopu aopuVar2 = orbVar2.b;
        if (!aopuVar2.c()) {
            orbVar2.b = aopi.mutableCopy(aopuVar2);
        }
        aonk.addAll((Iterable) g2, (List) orbVar2.b);
        return (orb) createBuilder.mo39build();
    }
}
