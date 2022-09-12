package defpackage;

import java.util.Comparator;
/* compiled from: PG */
/* renamed from: azcm  reason: default package */
/* loaded from: classes3.dex */
final class azcm implements Comparator<azbc> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(azbc azbcVar, azbc azbcVar2) {
        azbc azbcVar3 = azbcVar;
        azbc azbcVar4 = azbcVar2;
        if (!azbcVar3.d().booleanValue() || azbcVar4.d().booleanValue()) {
            return (azbcVar3.d().booleanValue() || !azbcVar4.d().booleanValue()) ? 0 : 1;
        }
        return -1;
    }
}
