package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: zaq  reason: default package */
/* loaded from: classes7.dex */
final class zaq implements Comparator<doyp> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(doyp doypVar, doyp doypVar2) {
        doyp doypVar3 = doypVar2;
        dgaw dgawVar = doypVar.b;
        if (dgawVar == null) {
            dgawVar = dgaw.g;
        }
        long j = dgawVar.b;
        dgaw dgawVar2 = doypVar3.b;
        if (dgawVar2 == null) {
            dgawVar2 = dgaw.g;
        }
        return (j > dgawVar2.b ? 1 : (j == dgawVar2.b ? 0 : -1));
    }
}
