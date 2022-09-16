package defpackage;

import java.util.Collection;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: arh  reason: default package */
/* loaded from: classes2.dex */
public final class arh {
    final /* synthetic */ arm a;

    public arh(arm armVar) {
        this.a = armVar;
    }

    public final void a(aqu aquVar, aqn aqnVar, Collection<aqt> collection) {
        arm armVar = this.a;
        if (aquVar != armVar.o || aqnVar == null) {
            if (aquVar != armVar.m) {
                return;
            }
            if (aqnVar != null) {
                armVar.h(armVar.l, aqnVar);
            }
            this.a.l.i(collection);
            return;
        }
        arp arpVar = armVar.n.a;
        String a = aqnVar.a();
        arq arqVar = new arq(arpVar, a, this.a.i(arpVar, a));
        arqVar.g(aqnVar);
        arm armVar2 = this.a;
        arq arqVar2 = armVar2.n;
        if (armVar2.l == arqVar) {
            return;
        }
        armVar2.o(3);
        armVar2.l = arqVar;
        armVar2.m = armVar2.o;
        armVar2.n = null;
        armVar2.o = null;
        armVar2.h.b(264, new mx(arqVar2, arqVar), 3);
        armVar2.p.clear();
        armVar2.l.i(collection);
        armVar2.m();
        armVar2.n();
    }
}
