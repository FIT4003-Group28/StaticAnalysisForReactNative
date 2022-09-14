package defpackage;

import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arxz  reason: default package */
/* loaded from: classes2.dex */
public final class arxz implements Comparator<arxx> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(arxx arxxVar, arxx arxxVar2) {
        arxx arxxVar3 = arxxVar;
        arxx arxxVar4 = arxxVar2;
        if (!arxxVar3.f() || arxxVar4.f()) {
            return (arxxVar3.f() || !arxxVar4.f()) ? 0 : 1;
        }
        return -1;
    }
}
