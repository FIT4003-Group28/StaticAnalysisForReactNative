package defpackage;

import com.google.android.libraries.youtube.ads.model.InstreamAdBreak;
import com.google.android.libraries.youtube.innertube.model.ads.AdBreakRendererModel;
import com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;
/* compiled from: PG */
/* renamed from: wwa  reason: default package */
/* loaded from: classes4.dex */
public final class wwa {
    private static final wvz a = new wvz();
    private final snc b;
    private final azqb c;
    private final wnb d;
    private final wmu e;

    public wwa(snc sncVar, wnb wnbVar, wmu wmuVar, azqb azqbVar) {
        this.b = sncVar;
        this.d = wnbVar;
        this.e = wmuVar;
        this.c = azqbVar;
    }

    private final String c() {
        return this.d.a();
    }

    public final List a(PlayerResponseModel playerResponseModel) {
        int i;
        int d;
        int d2;
        List<aoyb> C = playerResponseModel.C();
        if (C == null || C.isEmpty()) {
            return Collections.emptyList();
        }
        PriorityQueue priorityQueue = new PriorityQueue(C.size(), a);
        for (aoyb aoybVar : C) {
            int d3 = aoyt.d(aoybVar.d);
            if ((d3 != 0 && d3 == 3 && aoybVar.b > 0) || (((d = aoyt.d(aoybVar.d)) != 0 && d == 2) || ((d2 = aoyt.d(aoybVar.d)) != 0 && d2 == 4))) {
                priorityQueue.add(aoybVar);
            }
        }
        if (priorityQueue.isEmpty()) {
            return Collections.emptyList();
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
            arrayList.add(new InstreamAdBreak(adBreakRendererModel, i, playerResponseModel.E(), playerResponseModel.B(), c(), playerResponseModel.y(), playerResponseModel.J()));
        }
        return arrayList;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x007c, code lost:
        if (r3 != null) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List b(com.google.android.libraries.youtube.ads.model.InstreamAdBreak r23, java.util.List r24, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel r25) {
        /*
            Method dump skipped, instructions count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wwa.b(com.google.android.libraries.youtube.ads.model.InstreamAdBreak, java.util.List, com.google.android.libraries.youtube.innertube.model.player.PlayerResponseModel):java.util.List");
    }
}
