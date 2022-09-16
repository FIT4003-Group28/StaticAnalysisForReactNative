package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: aaoh  reason: default package */
/* loaded from: classes.dex */
final class aaoh implements Runnable {
    final /* synthetic */ aaof a;
    final /* synthetic */ aaoi b;

    public aaoh(aaoi aaoiVar, aaof aaofVar) {
        this.b = aaoiVar;
        this.a = aaofVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        asmc[] a;
        HashMap hashMap = new HashMap();
        for (asmc asmcVar : this.a.a()) {
            hashMap.put(asmcVar.e, asmcVar.c == 2 ? (String) asmcVar.d : "");
        }
        this.b.b.b = hashMap;
        this.b.b.g();
    }
}
