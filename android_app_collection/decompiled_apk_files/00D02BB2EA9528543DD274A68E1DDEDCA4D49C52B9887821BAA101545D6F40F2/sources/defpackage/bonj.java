package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: bonj  reason: default package */
/* loaded from: classes3.dex */
final class bonj implements Comparator<bopy> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(bopy bopyVar, bopy bopyVar2) {
        Integer valueOf;
        Integer valueOf2;
        bopy bopyVar3 = bopyVar;
        bopy bopyVar4 = bopyVar2;
        int intValue = bopyVar3.i().G().intValue();
        int intValue2 = bopyVar3.i().H().intValue();
        int intValue3 = bopyVar4.i().G().intValue();
        int intValue4 = bopyVar4.i().H().intValue();
        if (intValue != intValue3) {
            valueOf = Integer.valueOf(intValue);
            valueOf2 = Integer.valueOf(intValue3);
        } else {
            valueOf = Integer.valueOf(intValue2);
            valueOf2 = Integer.valueOf(intValue4);
        }
        return valueOf.compareTo(valueOf2);
    }
}
