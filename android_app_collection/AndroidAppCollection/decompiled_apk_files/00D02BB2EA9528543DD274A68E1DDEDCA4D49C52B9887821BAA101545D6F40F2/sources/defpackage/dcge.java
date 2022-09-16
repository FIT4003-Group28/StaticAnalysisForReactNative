package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: dcge  reason: default package */
/* loaded from: classes5.dex */
final class dcge implements Comparator<dcgg> {
    final /* synthetic */ Comparator a;

    public dcge(Comparator comparator) {
        this.a = comparator;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(dcgg dcggVar, dcgg dcggVar2) {
        return this.a.compare(dcggVar.a(), dcggVar2.a());
    }
}
