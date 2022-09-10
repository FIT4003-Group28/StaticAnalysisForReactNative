package defpackage;

import java.util.SortedMap;
import java.util.TreeMap;
/* compiled from: PG */
/* renamed from: bsrn  reason: default package */
/* loaded from: classes4.dex */
final class bsrn {
    private static final dcqe b = dcqe.c("bsrn");
    public final SortedMap<Integer, cqkp> a = new TreeMap();

    public final void a(int i, cqkp cqkpVar) {
        SortedMap<Integer, cqkp> sortedMap = this.a;
        Integer valueOf = Integer.valueOf(i);
        if (sortedMap.containsKey(valueOf)) {
            bvoo.h("(ttd-team): SupplementalResultsAdder already has another viewmodel at position %d. This is a malformed response from GWS/SR and should never happen. Dropping viewModel.", valueOf);
        } else {
            this.a.put(valueOf, cqkpVar);
        }
    }
}
