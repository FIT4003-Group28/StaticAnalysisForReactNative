package defpackage;

import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
/* compiled from: PG */
/* renamed from: vro  reason: default package */
/* loaded from: classes4.dex */
final class vro implements vrp {
    private Map c;

    private static final String b(String str) {
        return str.toLowerCase(Locale.US);
    }

    @Override // defpackage.vrp
    public final vru a(String str, boolean z) {
        MediaCodec createDecoderByType;
        viu.d(true);
        try {
            String b = b(str);
            String b2 = b(b);
            if (this.c == null) {
                this.c = new HashMap();
                for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
                    MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
                    if (!codecInfoAt.isEncoder()) {
                        for (String str2 : codecInfoAt.getSupportedTypes()) {
                            String b3 = b(str2);
                            if (!this.c.containsKey(b3)) {
                                this.c.put(b3, new ArrayList());
                            }
                            ((List) this.c.get(b3)).add(codecInfoAt);
                        }
                    }
                }
            }
            List list = (List) this.c.get(b2);
            if (list == null) {
                list = Collections.emptyList();
            }
            Iterator it = list.iterator();
            while (true) {
                if (it.hasNext()) {
                    String name = ((MediaCodecInfo) it.next()).getName();
                    if (name.startsWith("OMX.google.")) {
                        createDecoderByType = MediaCodec.createByCodecName(name);
                        break;
                    }
                } else {
                    createDecoderByType = MediaCodec.createDecoderByType(b);
                    break;
                }
            }
            return new vru(createDecoderByType);
        } catch (IOException e) {
            String valueOf = String.valueOf(str);
            vqy.c(valueOf.length() != 0 ? "Failed to create media decoder for mime type: ".concat(valueOf) : new String("Failed to create media decoder for mime type: "), e);
            return null;
        }
    }
}
