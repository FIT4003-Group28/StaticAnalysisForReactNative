package defpackage;

import java.util.Comparator;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: azgo  reason: default package */
/* loaded from: classes3.dex */
public final class azgo implements Comparator<azvo> {
    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(azvo azvoVar, azvo azvoVar2) {
        azvo azvoVar3 = azvoVar;
        azvo azvoVar4 = azvoVar2;
        String e = azvoVar3.e(null);
        String e2 = azvoVar4.e(null);
        if (e.equals(e2)) {
            return (azvoVar3.k() == dnkb.CUSTOM ? azvoVar3.l() : azvoVar3.k().name()).compareTo(azvoVar4.k() == dnkb.CUSTOM ? azvoVar4.l() : azvoVar4.k().name());
        }
        return e.compareTo(e2);
    }
}
