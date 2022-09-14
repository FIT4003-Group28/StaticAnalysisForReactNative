package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: bubl  reason: default package */
/* loaded from: classes.dex */
public final class bubl extends bufb {
    private final Set<bufb> a;

    public bubl(Set<bufb> set) {
        this.a = set;
    }

    @Override // defpackage.bufb
    public final Set<dyib<? extends dssj, ? extends dssj>> a(Class<? extends dssj> cls) {
        HashSet hashSet = new HashSet();
        for (bufb bufbVar : this.a) {
            hashSet.addAll(bufbVar.a(cls));
        }
        return hashSet;
    }

    @Override // defpackage.bufb
    public final Set<Class<? extends dssj>> b() {
        HashSet hashSet = new HashSet();
        for (bufb bufbVar : this.a) {
            hashSet.addAll(bufbVar.b());
        }
        return hashSet;
    }
}
