package defpackage;

import android.os.Build;
import com.google.webrtc.hwcodec.InternalMediaCodecVideoEncoderFactory;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: axic  reason: default package */
/* loaded from: classes2.dex */
public final class axic {
    public amqo a = aqxo.j(null);
    public boolean b = true;
    public final amxc c = amry.u();
    public amup d = amyc.b;
    public acoz e;

    public axic() {
        boolean contains = InternalMediaCodecVideoEncoderFactory.a.contains(Build.MODEL);
        int i = 15;
        if (Build.VERSION.SDK_INT <= 23) {
            if (Build.VERSION.SDK_INT == 23) {
                i = 20;
            } else if (Build.VERSION.SDK_INT != 21 && Build.VERSION.SDK_INT != 22) {
                i = 0;
            }
        }
        ArrayList<axgs> arrayList = new ArrayList();
        arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axgq.H265X, "OMX.Exynos.", axgp.FRAMERATE));
        arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axgq.H265X, "OMX.qcom.", axgp.NONE));
        aopa createBuilder = axgs.a.createBuilder();
        axgq axgqVar = axgq.VP8;
        createBuilder.copyOnWrite();
        axgs axgsVar = (axgs) createBuilder.instance;
        axgsVar.c = axgqVar.g;
        axgsVar.b = 1 | axgsVar.b;
        createBuilder.copyOnWrite();
        axgs axgsVar2 = (axgs) createBuilder.instance;
        axgsVar2.b |= 2;
        axgsVar2.d = "OMX.qcom.";
        axgp axgpVar = axgp.NONE;
        createBuilder.copyOnWrite();
        axgs axgsVar3 = (axgs) createBuilder.instance;
        axgsVar3.e = axgpVar.d;
        axgsVar3.b |= 16;
        createBuilder.copyOnWrite();
        axgs axgsVar4 = (axgs) createBuilder.instance;
        axgsVar4.b |= 64;
        axgsVar4.g = i;
        int a = InternalMediaCodecVideoEncoderFactory.a(axgq.VP8);
        createBuilder.copyOnWrite();
        axgs axgsVar5 = (axgs) createBuilder.instance;
        axgsVar5.b |= 32;
        axgsVar5.f = a;
        createBuilder.copyOnWrite();
        axgs.a((axgs) createBuilder.instance);
        arrayList.add((axgs) createBuilder.mo39build());
        if (!contains) {
            arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axgq.H264, "OMX.qcom.", axgp.NONE));
            arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axgq.H264, "OMX.Exynos.", axgp.FRAMERATE));
        }
        if (Build.VERSION.SDK_INT >= 23) {
            arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axgq.VP8, "OMX.Exynos.", axgp.DYNAMIC));
        }
        if (Build.VERSION.SDK_INT >= 24) {
            arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axgq.VP9, "OMX.Exynos.", axgp.FRAMERATE));
        }
        arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axgq.VP8, "c2.exynos.", axgp.NONE));
        arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axgq.VP9, "c2.exynos.", axgp.NONE));
        arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axgq.H264, "c2.exynos.", axgp.NONE));
        arrayList.add(InternalMediaCodecVideoEncoderFactory.b(axgq.H265X, "c2.exynos.", axgp.NONE));
        for (axgs axgsVar6 : arrayList) {
            a(axgsVar6);
        }
    }

    public final void a(axgs axgsVar) {
        boolean z = true;
        aqxo.p(1 == (axgsVar.b & 1));
        aqxo.p((axgsVar.b & 2) != 0);
        aqxo.p((axgsVar.b & 32) != 0);
        aqxo.p((axgsVar.b & 64) != 0);
        if ((axgsVar.b & 128) == 0) {
            z = false;
        }
        aqxo.p(z);
        amxc amxcVar = this.c;
        axgq b = axgq.b(axgsVar.c);
        if (b == null) {
            b = axgq.UNKNOWN;
        }
        amxcVar.p(b, axgsVar);
    }
}
