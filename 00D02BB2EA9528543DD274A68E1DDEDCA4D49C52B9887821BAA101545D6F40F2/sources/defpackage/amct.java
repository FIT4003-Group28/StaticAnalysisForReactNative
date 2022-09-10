package defpackage;

import java.lang.ref.SoftReference;
/* compiled from: PG */
/* renamed from: amct  reason: default package */
/* loaded from: classes.dex */
public final class amct {
    @dzsi
    final SoftReference<alyg> a;
    @dzsi
    final alyg b;

    public amct(alyg alygVar) {
        SoftReference<alyg> softReference = null;
        alyg alygVar2 = true != alyt.m(alygVar) ? null : alygVar;
        this.b = alygVar2;
        this.a = alygVar2 == null ? new SoftReference<>(alygVar) : softReference;
    }
}
