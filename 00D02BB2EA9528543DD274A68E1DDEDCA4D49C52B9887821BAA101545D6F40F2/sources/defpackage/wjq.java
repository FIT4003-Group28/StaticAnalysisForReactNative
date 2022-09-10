package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: wjq  reason: default package */
/* loaded from: classes7.dex */
final class wjq implements Comparator<dbsi<dgaw, wpv>> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(dbsi<dgaw, wpv> dbsiVar, dbsi<dgaw, wpv> dbsiVar2) {
        long j = dbsiVar.a.b;
        long j2 = dbsiVar2.a.b;
        if (j < j2) {
            return -1;
        }
        return j <= j2 ? 0 : 1;
    }
}
