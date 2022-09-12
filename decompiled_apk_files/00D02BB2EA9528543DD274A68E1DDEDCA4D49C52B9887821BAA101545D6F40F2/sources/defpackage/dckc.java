package defpackage;

import java.util.Collection;
import java.util.EnumMap;
import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dckc  reason: default package */
/* loaded from: classes5.dex */
public final class dckc extends dckk {
    final /* synthetic */ Class a;

    public dckc(Class cls) {
        this.a = cls;
    }

    @Override // defpackage.dckk
    public final <K, V> Map<K, Collection<V>> a() {
        return new EnumMap(this.a);
    }
}
