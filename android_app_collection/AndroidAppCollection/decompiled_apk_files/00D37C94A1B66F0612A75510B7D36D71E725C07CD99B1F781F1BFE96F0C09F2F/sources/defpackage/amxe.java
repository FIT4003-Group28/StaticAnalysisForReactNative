package defpackage;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: amxe  reason: default package */
/* loaded from: classes.dex */
public final class amxe extends amxg {
    final /* synthetic */ Comparator a;

    public amxe(Comparator comparator) {
        this.a = comparator;
    }

    @Override // defpackage.amxg
    public final Map a() {
        return new TreeMap(this.a);
    }
}
