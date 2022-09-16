package defpackage;

import android.text.TextUtils;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import j$.util.Optional;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: icc  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class icc implements ayqb {
    public final /* synthetic */ icm a;
    private final /* synthetic */ int b;

    public /* synthetic */ icc(icm icmVar) {
        this.a = icmVar;
    }

    public /* synthetic */ icc(icm icmVar, int i) {
        this.b = i;
        this.a = icmVar;
    }

    @Override // defpackage.ayqb
    public final void a(Object obj) {
        long j;
        String str;
        PlaybackStartDescriptor g;
        apzg apzgVar;
        artv artvVar;
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint;
        ajff a;
        PlaybackStartDescriptor g2;
        apzg apzgVar2;
        ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint2;
        int i = this.b;
        boolean z = false;
        if (i == 0) {
            icm icmVar = this.a;
            ahhj ahhjVar = (ahhj) obj;
            synchronized (icmVar.b.bt) {
                ico icoVar = icmVar.b;
                if (ahhjVar.b().ordinal() >= aijw.PLAYBACK_LOADED.ordinal()) {
                    z = true;
                }
                icoVar.bv = z;
                icmVar.b.aO();
            }
        } else if (i == 1) {
            icm icmVar2 = this.a;
            PlayerResponseModel playerResponseModel = (PlayerResponseModel) obj;
            String B = playerResponseModel != null ? playerResponseModel.B() : "";
            ico icoVar2 = icmVar2.b;
            if (icoVar2.bs != null && !TextUtils.isEmpty(B) && icoVar2.bs.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                ReelWatchEndpointOuterClass$ReelWatchEndpoint reelWatchEndpointOuterClass$ReelWatchEndpoint3 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) icoVar2.bs.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint);
                if (!reelWatchEndpointOuterClass$ReelWatchEndpoint3.d.isEmpty() && !reelWatchEndpointOuterClass$ReelWatchEndpoint3.d.equals(B)) {
                    return;
                }
            }
            iak iakVar = icmVar2.b.am;
            synchronized (iakVar.a) {
                if (iakVar.c == null || iakVar.e || !iakVar.h(B)) {
                    j = 0;
                } else {
                    long c = iakVar.b.c();
                    iakVar.c.c("r_tr");
                    iakVar.e = true;
                    j = c - iakVar.d;
                }
            }
            ico icoVar3 = icmVar2.b;
            FormatStreamModel formatStreamModel = icoVar3.by.a;
            if (formatStreamModel != null) {
                iak iakVar2 = icoVar3.am;
                int e = formatStreamModel.e();
                synchronized (iakVar2.a) {
                    if (iakVar2.c != null && iakVar2.h(B)) {
                        aopa createBuilder = asnq.a.createBuilder();
                        createBuilder.copyOnWrite();
                        asnq asnqVar = (asnq) createBuilder.instance;
                        asnqVar.b |= 1;
                        asnqVar.c = e;
                        asnq asnqVar2 = (asnq) createBuilder.mo39build();
                        aopa createBuilder2 = asno.a.createBuilder();
                        createBuilder2.copyOnWrite();
                        asno asnoVar = (asno) createBuilder2.instance;
                        asnqVar2.getClass();
                        asnoVar.v = asnqVar2;
                        asnoVar.c |= 262144;
                        iakVar2.c.a((asno) createBuilder2.mo39build());
                    }
                }
            }
            iet aF = icmVar2.b.aF();
            if (aF != null) {
                aF.f.e();
            }
            icmVar2.b.bg.e(j);
            if (!icmVar2.b.bg.h()) {
                return;
            }
            zep.g(String.format(Locale.US, "Reels[%s] Playback Time: %d ms", B, Long.valueOf(j)));
        } else if (i != 2) {
            if (i == 3) {
                this.a.b((ahhx) obj);
            } else if (i == 4) {
                this.a.c((ahia) obj);
            } else {
                this.a.a((aikd) obj);
            }
        } else {
            icm icmVar3 = this.a;
            ahic ahicVar = (ahic) obj;
            synchronized (icmVar3.b.bt) {
                ico icoVar4 = icmVar3.b;
                icoVar4.bv = false;
                icoVar4.bw = false;
                str = null;
                if (icoVar4.bu != null) {
                    hqp.C(1, "Last delayed ReelItemPlayback not processed during root change");
                    icmVar3.b.bu = null;
                }
            }
            iet aF2 = icmVar3.b.aF();
            if (aF2 != null) {
                aF2.p = false;
            }
            if (icmVar3.b.aI().h && (artvVar = icmVar3.b.bf) != null && (artvVar.b & 8) != 0) {
                apzg apzgVar3 = artvVar.f;
                if (apzgVar3 == null) {
                    apzgVar3 = apzg.a;
                }
                if (apzgVar3.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) && (reelWatchEndpointOuterClass$ReelWatchEndpoint = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar3.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) != null && (g2 = (a = ahicVar.a()).g()) != null && (apzgVar2 = g2.b) != null && apzgVar2.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint) && (reelWatchEndpointOuterClass$ReelWatchEndpoint2 = (ReelWatchEndpointOuterClass$ReelWatchEndpoint) apzgVar2.qm(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) != null && reelWatchEndpointOuterClass$ReelWatchEndpoint2.d.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint.d) && reelWatchEndpointOuterClass$ReelWatchEndpoint2.e.equals(reelWatchEndpointOuterClass$ReelWatchEndpoint.e)) {
                    zgz b = a.b();
                    icmVar3.b.aZ(apzgVar2, 5, b != null ? (acvg) b.a() : null);
                }
            }
            iat iatVar = icmVar3.b.bn;
            if (ahicVar != null && ahicVar.a() != null) {
                String Z = ahicVar.a().Z();
                iatVar.a = iatVar.b;
                iatVar.b = Z;
            }
            ico icoVar5 = icmVar3.b;
            String str2 = icoVar5.bp;
            if (ahicVar != null && ahicVar.a() != null) {
                str = ahicVar.a().Z();
            }
            icoVar5.bp = str;
            if (!icmVar3.b.bc()) {
                return;
            }
            ico icoVar6 = icmVar3.b;
            if (icoVar6.bs == null || akzj.f(str2, icoVar6.bp) || (g = ahicVar.a().g()) == null || (apzgVar = g.b) == null || !apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                return;
            }
            ico icoVar7 = icmVar3.b;
            boolean z2 = icoVar7.bx;
            icoVar7.bx = false;
            acti aH = icoVar7.aH();
            icmVar3.b.bo.a(aH);
            ico icoVar8 = icmVar3.b;
            icoVar8.bo.b(Optional.of(icoVar8.af), aH, apzgVar, str2, icmVar3.b.bp, true, z2);
        }
    }
}
