package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcdl  reason: default package */
/* loaded from: classes5.dex */
public final class dcdl extends dcdi {
    final /* synthetic */ dcdn a;

    public dcdl(dcdn dcdnVar) {
        this.a = dcdnVar;
    }

    @Override // defpackage.dcdn
    public final boolean SK() {
        return this.a.SK();
    }

    @Override // defpackage.dcdn
    public final boolean c() {
        return this.a.c();
    }

    @Override // defpackage.dcdn, java.util.Map
    public final boolean containsKey(Object obj) {
        return this.a.containsKey(obj);
    }

    @Override // defpackage.dcdi, defpackage.dcdn
    public final dcep d() {
        return this.a.keySet();
    }

    @Override // defpackage.dcdi
    public final dcpd<Map.Entry> e() {
        return new dcdk(this.a.entrySet().iterator());
    }

    @Override // defpackage.dcdn, java.util.Map
    public final /* bridge */ /* synthetic */ Object get(Object obj) {
        Object obj2 = this.a.get(obj);
        if (obj2 == null) {
            return null;
        }
        return dcep.B(obj2);
    }

    @Override // defpackage.dcdn, java.util.Map
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // java.util.Map
    public final int size() {
        return this.a.size();
    }
}
