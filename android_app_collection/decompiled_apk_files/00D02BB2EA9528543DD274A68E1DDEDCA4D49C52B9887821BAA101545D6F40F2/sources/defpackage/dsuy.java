package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: dsuy  reason: default package */
/* loaded from: classes6.dex */
final class dsuy implements Comparator<dspt> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(dspt dsptVar, dspt dsptVar2) {
        dspt dsptVar3 = dsptVar;
        dspt dsptVar4 = dsptVar2;
        dsuz.e(dsptVar3);
        dsuz.e(dsptVar4);
        long j = dsptVar3.a;
        long j2 = dsptVar4.a;
        return j != j2 ? (j > j2 ? 1 : (j == j2 ? 0 : -1)) : Integer.compare(dsptVar3.b, dsptVar4.b);
    }
}
