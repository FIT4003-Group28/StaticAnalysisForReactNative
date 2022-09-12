package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: anlv  reason: default package */
/* loaded from: classes2.dex */
final class anlv implements Comparator<dmki<anms, anmq>> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(dmki<anms, anmq> dmkiVar, dmki<anms, anmq> dmkiVar2) {
        dmki<anms, anmq> dmkiVar3 = dmkiVar;
        dmki<anms, anmq> dmkiVar4 = dmkiVar2;
        if (dmkiVar3.c() < dmkiVar4.c()) {
            return -1;
        }
        return dmkiVar3.c() > dmkiVar4.c() ? 1 : 0;
    }
}
