package defpackage;

import java.util.Map;
/* compiled from: PG */
/* renamed from: dcev  reason: default package */
/* loaded from: classes5.dex */
final class dcev extends dcdq {
    final /* synthetic */ dcey a;

    public dcev(dcey dceyVar) {
        this.a = dceyVar;
    }

    @Override // defpackage.dcep, defpackage.dccr, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet
    /* renamed from: SE */
    public final dcpd<Map.Entry> iterator() {
        return v().listIterator();
    }

    @Override // defpackage.dcep
    public final dcdc<Map.Entry> SH() {
        return new dceu(this);
    }

    @Override // defpackage.dcdq
    public final dcdn b() {
        return this.a;
    }
}
