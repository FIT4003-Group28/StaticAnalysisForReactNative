package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
/* compiled from: PG */
/* renamed from: aggd  reason: default package */
/* loaded from: classes.dex */
public final class aggd implements aggf {
    private final wns a;

    public aggd(wns wnsVar) {
        this.a = wnsVar;
    }

    @Override // defpackage.aggf
    public final List a(PlayerResponseModel playerResponseModel) {
        int i;
        int d;
        int d2;
        playerResponseModel.getClass();
        wns wnsVar = this.a;
        List<aoyb> C = playerResponseModel.C();
        if (C == null || C.isEmpty()) {
            return amuk.q();
        }
        PriorityQueue priorityQueue = new PriorityQueue(C.size(), wns.a);
        for (aoyb aoybVar : C) {
            int d3 = aoyt.d(aoybVar.d);
            if ((d3 != 0 && d3 == 3 && aoybVar.b > 0) || (((d = aoyt.d(aoybVar.d)) != 0 && d == 2) || ((d2 = aoyt.d(aoybVar.d)) != 0 && d2 == 4))) {
                priorityQueue.add(aoybVar);
            }
        }
        if (priorityQueue.isEmpty()) {
            return amuk.q();
        }
        ArrayList arrayList = new ArrayList();
        int i2 = 1;
        while (priorityQueue.size() > 0) {
            aoyb aoybVar2 = (aoyb) priorityQueue.poll();
            AdBreakRendererModel adBreakRendererModel = new AdBreakRendererModel(aoybVar2);
            int d4 = aoyt.d(aoybVar2.d);
            if (d4 != 0 && d4 == 2) {
                i = 0;
            } else {
                i = i2;
                i2++;
            }
            arrayList.add(new InstreamAdBreak(adBreakRendererModel, i, playerResponseModel.E(), playerResponseModel.B(), wnsVar.b(), playerResponseModel.y(), playerResponseModel.J()));
        }
        return amuk.o(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f7 A[SYNTHETIC] */
    @Override // defpackage.aggf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(com.google.android.libraries.youtube.ads.model.InstreamAdBreak r18) {
        /*
            Method dump skipped, instructions count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aggd.b(com.google.android.libraries.youtube.ads.model.InstreamAdBreak):java.util.List");
    }
}
