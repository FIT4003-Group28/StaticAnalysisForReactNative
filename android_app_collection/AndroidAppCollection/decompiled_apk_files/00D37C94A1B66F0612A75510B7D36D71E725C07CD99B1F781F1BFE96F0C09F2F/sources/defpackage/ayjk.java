package defpackage;

import java.util.Collections;
/* compiled from: PG */
/* renamed from: ayjk  reason: default package */
/* loaded from: classes2.dex */
final class ayjk extends aybg {
    final /* synthetic */ ayjl a;

    public ayjk(ayjl ayjlVar) {
        this.a = ayjlVar;
    }

    @Override // defpackage.aybg
    public final String a() {
        return this.a.b;
    }

    @Override // defpackage.aybg
    public final void c() {
    }

    @Override // defpackage.aybg
    public final void d(aybc aybcVar) {
        aybd a = aybe.a();
        a.a = Collections.singletonList(new axzc(this.a.a));
        a.b = axyb.a;
        aybcVar.c(a.a());
    }
}
