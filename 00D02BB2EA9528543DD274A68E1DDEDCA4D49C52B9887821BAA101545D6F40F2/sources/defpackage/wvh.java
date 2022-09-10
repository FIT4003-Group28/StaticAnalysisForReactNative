package defpackage;

import java.util.HashMap;
import java.util.HashSet;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: wvh  reason: default package */
/* loaded from: classes7.dex */
public final class wvh implements btzi<digt, digv> {
    final /* synthetic */ vtn a;
    final /* synthetic */ wvi b;

    public wvh(wvi wviVar, vtn vtnVar) {
        this.b = wviVar;
        this.a = vtnVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<digt> btzrVar, btzy btzyVar) {
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<digt> btzrVar, digv digvVar) {
        digv digvVar2 = digvVar;
        this.b.a = digvVar2;
        for (djws djwsVar : this.b.a.a) {
            HashMap<String, djws> hashMap = this.b.b;
            drhj drhjVar = djwsVar.c;
            if (drhjVar == null) {
                drhjVar = drhj.c;
            }
            hashMap.put(drhjVar.b, djwsVar);
        }
        dsrj<djws> dsrjVar = digvVar2.a;
        HashSet hashSet = new HashSet();
        for (djws djwsVar2 : dsrjVar) {
            if (djwsVar2.a == 5) {
                for (djwq djwqVar : ((djwr) djwsVar2.b).a) {
                    drhh drhhVar = djwqVar.b;
                    if (drhhVar == null) {
                        drhhVar = drhh.k;
                    }
                    if ((drhhVar.a & 16) != 0) {
                        drhh drhhVar2 = djwqVar.b;
                        if (drhhVar2 == null) {
                            drhhVar2 = drhh.k;
                        }
                        hashSet.add(drhhVar2.e);
                    }
                    drhh drhhVar3 = djwqVar.b;
                    if (drhhVar3 == null) {
                        drhhVar3 = drhh.k;
                    }
                    if ((drhhVar3.a & 64) != 0) {
                        drhh drhhVar4 = djwqVar.b;
                        if (drhhVar4 == null) {
                            drhhVar4 = drhh.k;
                        }
                        hashSet.add(drhhVar4.g);
                    }
                    drhh drhhVar5 = djwqVar.b;
                    if (drhhVar5 == null) {
                        drhhVar5 = drhh.k;
                    }
                    if ((drhhVar5.a & 256) != 0) {
                        drhh drhhVar6 = djwqVar.b;
                        if (drhhVar6 == null) {
                            drhhVar6 = drhh.k;
                        }
                        hashSet.add(drhhVar6.i);
                    }
                    drhh drhhVar7 = djwqVar.b;
                    if (drhhVar7 == null) {
                        drhhVar7 = drhh.k;
                    }
                    if ((drhhVar7.a & 32) != 0) {
                        drhh drhhVar8 = djwqVar.b;
                        if (drhhVar8 == null) {
                            drhhVar8 = drhh.k;
                        }
                        hashSet.add(drhhVar8.f);
                    }
                    drhh drhhVar9 = djwqVar.b;
                    if (drhhVar9 == null) {
                        drhhVar9 = drhh.k;
                    }
                    if ((drhhVar9.a & 128) != 0) {
                        drhh drhhVar10 = djwqVar.b;
                        if (drhhVar10 == null) {
                            drhhVar10 = drhh.k;
                        }
                        hashSet.add(drhhVar10.h);
                    }
                    drhh drhhVar11 = djwqVar.b;
                    if (drhhVar11 == null) {
                        drhhVar11 = drhh.k;
                    }
                    if ((drhhVar11.a & 512) != 0) {
                        drhh drhhVar12 = djwqVar.b;
                        if (drhhVar12 == null) {
                            drhhVar12 = drhh.k;
                        }
                        hashSet.add(drhhVar12.j);
                    }
                }
            }
        }
        this.a.h(hashSet, wvg.a);
    }
}
