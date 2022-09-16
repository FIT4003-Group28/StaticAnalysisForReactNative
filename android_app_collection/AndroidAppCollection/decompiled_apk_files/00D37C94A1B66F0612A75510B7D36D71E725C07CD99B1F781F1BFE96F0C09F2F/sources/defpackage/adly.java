package defpackage;

import android.util.Pair;
import java.util.Comparator;
/* compiled from: PG */
/* renamed from: adly  reason: default package */
/* loaded from: classes.dex */
final class adly implements Comparator {
    final /* synthetic */ adlz a;

    public adly(adlz adlzVar) {
        this.a = adlzVar;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        adls adlsVar = (adls) this.a.c.get(((Pair) obj).first);
        adls adlsVar2 = (adls) this.a.c.get(((Pair) obj2).first);
        if (adlsVar == null && adlsVar2 == null) {
            return 0;
        }
        if (adlsVar == null) {
            return 1;
        }
        if (adlsVar2 != null) {
            return adlsVar2.b - adlsVar.b;
        }
        return -1;
    }
}
