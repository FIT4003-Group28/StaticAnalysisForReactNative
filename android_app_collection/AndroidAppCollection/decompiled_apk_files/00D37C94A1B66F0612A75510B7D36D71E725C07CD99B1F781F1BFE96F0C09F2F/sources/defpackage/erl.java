package defpackage;

import com.google.protos.youtube.api.innertube.ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint;
import com.google.protos.youtube.api.innertube.ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint;
import j$.util.Objects;
import java.util.Map;
/* compiled from: PG */
/* renamed from: erl  reason: default package */
/* loaded from: classes3.dex */
public final class erl implements aafl {
    private final nml a;

    public erl(nml nmlVar) {
        this.a = nmlVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aqvl aqvlVar;
        String str;
        ampq i;
        aqvl aqvlVar2;
        ampq i2;
        ampq j;
        if (!this.a.y()) {
            return;
        }
        nml nmlVar = this.a;
        String str2 = null;
        if (!apzgVar.qn(ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.resizeEngagementPanelToFullBleedEndpoint)) {
            i = amon.a;
        } else {
            ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint = (ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint) apzgVar.qm(ResizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.resizeEngagementPanelToFullBleedEndpoint);
            if (resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.b == 2) {
                aqvlVar = (aqvl) resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.c;
            } else {
                aqvlVar = aqvl.a;
            }
            if ((aqvlVar.b & 2) == 0) {
                str = resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.b == 1 ? (String) resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.c : null;
            } else {
                str = (resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.b == 2 ? (aqvl) resizeEngagementPanelToFullBleedEndpointOuterClass$ResizeEngagementPanelToFullBleedEndpoint.c : aqvl.a).d;
            }
            i = ampq.i(str);
        }
        if (!i.h() || !Objects.equals(nmlVar.i(), i.c())) {
            if (!apzgVar.qn(ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.resizeEngagementPanelToMaximizedEndpoint)) {
                i2 = amon.a;
            } else {
                ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint = (ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint) apzgVar.qm(ResizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.resizeEngagementPanelToMaximizedEndpoint);
                if (resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.b == 2) {
                    aqvlVar2 = (aqvl) resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.c;
                } else {
                    aqvlVar2 = aqvl.a;
                }
                if ((aqvlVar2.b & 2) != 0) {
                    str2 = (resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.b == 2 ? (aqvl) resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.c : aqvl.a).d;
                } else if (resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.b == 1) {
                    str2 = (String) resizeEngagementPanelToMaximizedEndpointOuterClass$ResizeEngagementPanelToMaximizedEndpoint.c;
                }
                i2 = ampq.i(str2);
            }
            j = (!i2.h() || !Objects.equals(nmlVar.i(), i2.c())) ? amon.a : ampq.j(nsr.EXPANDED);
        } else {
            j = ampq.j(nsr.FULL_BLEED);
        }
        if (!j.h()) {
            return;
        }
        this.a.h().e.a((nsr) j.c());
    }
}
