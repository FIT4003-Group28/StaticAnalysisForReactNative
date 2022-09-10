package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: bdmj  reason: default package */
/* loaded from: classes3.dex */
final class bdmj implements Comparator<bbtj> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(bbtj bbtjVar, bbtj bbtjVar2) {
        Long a = bdmk.a(bbtjVar);
        Long a2 = bdmk.a(bbtjVar2);
        if (a == null) {
            return a2 == null ? 0 : 1;
        } else if (a2 != null) {
            return a2.compareTo(a);
        } else {
            return -1;
        }
    }
}
