package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: cyxy  reason: default package */
/* loaded from: classes5.dex */
final class cyxy implements Comparator<cyft> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(cyft cyftVar, cyft cyftVar2) {
        cyft cyftVar3 = cyftVar;
        cyft cyftVar4 = cyftVar2;
        boolean z = cyftVar3.b().m;
        boolean z2 = cyftVar4.b().m;
        if (z) {
            if (!z2) {
                return -1;
            }
            z2 = true;
        }
        if (z || !z2) {
            return cyxz.a.compare(cyftVar3, cyftVar4);
        }
        return 1;
    }
}
