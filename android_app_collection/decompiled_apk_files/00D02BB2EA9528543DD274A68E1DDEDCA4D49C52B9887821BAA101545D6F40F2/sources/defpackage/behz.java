package defpackage;

import android.os.Bundle;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: behz  reason: default package */
/* loaded from: classes3.dex */
public final class behz {
    private final bwqv a;

    public behz(bwqv bwqvVar) {
        this.a = bwqvVar;
    }

    public final void a(List<befz<? extends bega>> list, bwrs<ilo> bwrsVar, bege begeVar, List<begd> list2, Map<bege, List<befz<? extends bega>>> map) {
        boolean z = false;
        for (befz<? extends bega> befzVar : list) {
            befzVar.c().u();
            befzVar.c().t(bwrsVar);
            z |= befzVar.c().w().booleanValue();
        }
        if (z) {
            bwqv bwqvVar = this.a;
            bfdm bfdmVar = new bfdm();
            Bundle bundle = new Bundle();
            bundle.putSerializable("tab type", begeVar);
            cctq.a(bundle, bwqvVar, bwrsVar);
            bfdmVar.B(bundle);
            list2.add(bfdmVar);
            map.put(begeVar, list);
        }
    }
}
