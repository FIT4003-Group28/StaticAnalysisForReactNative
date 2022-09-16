package defpackage;

import android.media.MediaCodecInfo;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: oty  reason: default package */
/* loaded from: classes4.dex */
public final class oty {
    private static final Map a;

    static {
        new osv("OMX.google.raw.decoder", null);
        a = new HashMap();
    }

    public static synchronized List a(String str, boolean z) {
        otv otwVar;
        synchronized (oty.class) {
            ott ottVar = new ott(str, z);
            Map map = a;
            List list = (List) map.get(ottVar);
            if (list != null) {
                return list;
            }
            if (pcx.a >= 21) {
                otwVar = new otx(z);
            } else {
                otwVar = new otw();
            }
            List b = b(ottVar, otwVar);
            if (z && b.isEmpty() && pcx.a >= 21 && pcx.a <= 23) {
                b = b(ottVar, new otw());
                if (!b.isEmpty()) {
                    String str2 = ((osv) b.get(0)).a;
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 63 + String.valueOf(str2).length());
                    sb.append("MediaCodecList API didn't list secure decoder for: ");
                    sb.append(str);
                    sb.append(". Assuming: ");
                    sb.append(str2);
                    Log.w("MediaCodecUtil", sb.toString());
                }
            }
            List unmodifiableList = Collections.unmodifiableList(b);
            map.put(ottVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    private static List b(ott ottVar, otv otvVar) {
        ott ottVar2 = ottVar;
        otv otvVar2 = otvVar;
        try {
            ArrayList arrayList = new ArrayList();
            String str = ottVar2.a;
            int a2 = otvVar.a();
            boolean d = otvVar.d();
            int i = 0;
            while (i < a2) {
                MediaCodecInfo b = otvVar2.b(i);
                String name = b.getName();
                if (!b.isEncoder() && ((d || !name.endsWith(".secure")) && ((pcx.a >= 21 || (!"CIPAACDecoder".equals(name) && !"CIPMP3Decoder".equals(name) && !"CIPVorbisDecoder".equals(name) && !"CIPAMRNBDecoder".equals(name) && !"AACDecoder".equals(name) && !"MP3Decoder".equals(name))) && ((pcx.a >= 18 || !"OMX.SEC.MP3.Decoder".equals(name)) && ((pcx.a >= 18 || !"OMX.MTK.AUDIO.DECODER.AAC".equals(name) || !"a70".equals(pcx.b)) && ((pcx.a != 16 || pcx.b == null || !"OMX.qcom.audio.decoder.mp3".equals(name) || (!"dlxu".equals(pcx.b) && !"protou".equals(pcx.b) && !"ville".equals(pcx.b) && !"villeplus".equals(pcx.b) && !"villec2".equals(pcx.b) && !pcx.b.startsWith("gee") && !"C6602".equals(pcx.b) && !"C6603".equals(pcx.b) && !"C6606".equals(pcx.b) && !"C6616".equals(pcx.b) && !"L36h".equals(pcx.b) && !"SO-02E".equals(pcx.b))) && ((pcx.a != 16 || !"OMX.qcom.audio.decoder.aac".equals(name) || (!"C1504".equals(pcx.b) && !"C1505".equals(pcx.b) && !"C1604".equals(pcx.b) && !"C1605".equals(pcx.b))) && ((pcx.a > 19 || pcx.b == null || ((!pcx.b.startsWith("d2") && !pcx.b.startsWith("serrano") && !pcx.b.startsWith("jflte") && !pcx.b.startsWith("santos")) || !"samsung".equals(pcx.c) || !name.equals("OMX.SEC.vp8.dec"))) && (pcx.a > 19 || pcx.b == null || !pcx.b.startsWith("jflte") || !"OMX.qcom.video.decoder.vp8".equals(name)))))))))) {
                    String[] supportedTypes = b.getSupportedTypes();
                    int length = supportedTypes.length;
                    int i2 = 0;
                    while (i2 < length) {
                        String str2 = supportedTypes[i2];
                        if (str2.equalsIgnoreCase(str)) {
                            try {
                                MediaCodecInfo.CodecCapabilities capabilitiesForType = b.getCapabilitiesForType(str2);
                                boolean c = otvVar2.c(str, capabilitiesForType);
                                if ((d && ottVar2.b == c) || (!d && !ottVar2.b)) {
                                    arrayList.add(new osv(name, capabilitiesForType));
                                } else if (!d && c) {
                                    arrayList.add(new osv(String.valueOf(name).concat(".secure"), capabilitiesForType));
                                    return arrayList;
                                }
                            } catch (Exception e) {
                                if (pcx.a <= 23 && !arrayList.isEmpty()) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 46);
                                    sb.append("Skipping codec ");
                                    sb.append(name);
                                    sb.append(" (failed to query capabilities)");
                                    Log.e("MediaCodecUtil", sb.toString());
                                } else {
                                    StringBuilder sb2 = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(str2).length());
                                    sb2.append("Failed to query codec ");
                                    sb2.append(name);
                                    sb2.append(" (");
                                    sb2.append(str2);
                                    sb2.append(")");
                                    Log.e("MediaCodecUtil", sb2.toString());
                                    throw e;
                                }
                            }
                        }
                        i2++;
                        ottVar2 = ottVar;
                        otvVar2 = otvVar;
                    }
                    continue;
                }
                i++;
                ottVar2 = ottVar;
                otvVar2 = otvVar;
            }
            return arrayList;
        } catch (Exception e2) {
            throw new otu(e2);
        }
    }
}
