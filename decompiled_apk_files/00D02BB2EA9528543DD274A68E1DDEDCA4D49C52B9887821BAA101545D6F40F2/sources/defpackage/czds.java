package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: czds  reason: default package */
/* loaded from: classes5.dex */
final class czds implements Comparator<cyvs> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(cyvs cyvsVar, cyvs cyvsVar2) {
        cyvs cyvsVar3 = cyvsVar;
        cyvs cyvsVar4 = cyvsVar2;
        boolean a = dcft.m(cyvsVar3.a(), czdq.a).a();
        boolean a2 = dcft.m(cyvsVar4.a(), czdr.a).a();
        if (a) {
            if (!a2) {
                return -1;
            }
            a2 = true;
        }
        if (a || !a2) {
            return czdt.a.compare(cyvsVar3, cyvsVar4);
        }
        return 1;
    }
}
