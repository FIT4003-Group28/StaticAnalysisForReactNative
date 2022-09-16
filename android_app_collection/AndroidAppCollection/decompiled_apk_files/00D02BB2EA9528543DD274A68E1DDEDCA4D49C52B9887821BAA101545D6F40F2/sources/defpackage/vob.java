package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: vob  reason: default package */
/* loaded from: classes7.dex */
public final class vob implements degu<Set<String>> {
    final /* synthetic */ amsy a;
    final /* synthetic */ voe b;
    final /* synthetic */ Collection c;
    final /* synthetic */ vog d;

    public vob(vog vogVar, amsy amsyVar, voe voeVar, Collection collection) {
        this.d = vogVar;
        this.a = amsyVar;
        this.b = voeVar;
        this.c = collection;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
        if (th instanceof CancellationException) {
            return;
        }
        voe voeVar = this.b;
        voeVar.a = false;
        vog.c(voeVar, dcbg.b(this.c).o(vnz.a).s(voa.a).z(), 4);
        this.d.d(3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v34, types: [deig] */
    /* JADX WARN: Type inference failed for: r7v35, types: [dehn] */
    /* JADX WARN: Type inference failed for: r7v37, types: [dehn] */
    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(Set<String> set) {
        int i;
        Iterator it;
        ?? d;
        Set<String> set2 = set;
        vog vogVar = this.d;
        amsy amsyVar = this.a;
        voe b = vogVar.b(amsyVar);
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        Iterator<wuv> it2 = b.c().iterator();
        while (true) {
            i = 3;
            if (!it2.hasNext()) {
                break;
            }
            wuv next = it2.next();
            String c = next.b().c();
            if (next.v() == 3) {
                if (!set2.contains(next.b().c())) {
                    arrayList.add(next.x());
                } else {
                    List list = (List) hashMap.get(c);
                    if (list == null) {
                        list = new ArrayList();
                        hashMap.put(c, list);
                    }
                    list.add(next.x());
                }
            }
        }
        Iterator it3 = hashMap.entrySet().iterator();
        while (it3.hasNext()) {
            Map.Entry entry = (Map.Entry) it3.next();
            String str = (String) entry.getKey();
            List<wut> list2 = (List) entry.getValue();
            vog.c(b, list2, i);
            dpkf h = amsyVar.h(0);
            dpkf h2 = amsyVar.h(amsyVar.i() - 1);
            wtq wtqVar = vogVar.d;
            dpjn dpjnVar = h.b;
            if (dpjnVar == null) {
                dpjnVar = dpjn.m;
            }
            dpjx dpjxVar = dpjnVar.b;
            if (dpjxVar == null) {
                dpjxVar = dpjx.n;
            }
            dnoh dnohVar = dpjxVar.d;
            if (dnohVar == null) {
                dnohVar = dnoh.d;
            }
            dpjn dpjnVar2 = h2.b;
            if (dpjnVar2 == null) {
                dpjnVar2 = dpjn.m;
            }
            dpjx dpjxVar2 = dpjnVar2.b;
            if (dpjxVar2 == null) {
                dpjxVar2 = dpjx.n;
            }
            dnoh dnohVar2 = dpjxVar2.d;
            if (dnohVar2 == null) {
                dnohVar2 = dnoh.d;
            }
            bvrj.UI_THREAD.c();
            if (list2.isEmpty()) {
                d = deha.a(dcdc.e());
                it = it3;
            } else {
                dehn<dlzp> remove = wtqVar.b.remove(str);
                if (remove != null) {
                    remove.cancel(false);
                }
                dlzj bZ = dlzm.e.bZ();
                dmab bZ2 = dmac.d.bZ();
                dmad bZ3 = dmae.c.bZ();
                dpum a = dmlf.a(dnohVar);
                if (bZ3.c) {
                    bZ3.bF();
                    bZ3.c = false;
                }
                dmae dmaeVar = (dmae) bZ3.b;
                a.getClass();
                dmaeVar.b = a;
                dmaeVar.a |= 1;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmac dmacVar = (dmac) bZ2.b;
                dmae bK = bZ3.bK();
                bK.getClass();
                dmacVar.b = bK;
                dmacVar.a |= 1;
                dmad bZ4 = dmae.c.bZ();
                dpum a2 = dmlf.a(dnohVar2);
                if (bZ4.c) {
                    bZ4.bF();
                    bZ4.c = false;
                }
                dmae dmaeVar2 = (dmae) bZ4.b;
                a2.getClass();
                dmaeVar2.b = a2;
                dmaeVar2.a |= 1;
                if (bZ2.c) {
                    bZ2.bF();
                    bZ2.c = false;
                }
                dmac dmacVar2 = (dmac) bZ2.b;
                dmae bK2 = bZ4.bK();
                bK2.getClass();
                dmacVar2.c = bK2;
                dmacVar2.a |= 2;
                if (bZ.c) {
                    bZ.bF();
                    bZ.c = false;
                }
                dlzm dlzmVar = (dlzm) bZ.b;
                dmac bK3 = bZ2.bK();
                bK3.getClass();
                dlzmVar.c = bK3;
                dlzmVar.a |= 8;
                for (wut wutVar : list2) {
                    String a3 = wutVar.a();
                    dlzk bZ5 = dlzl.c.bZ();
                    if (bZ5.c) {
                        bZ5.bF();
                        bZ5.c = false;
                    }
                    dlzl dlzlVar = (dlzl) bZ5.b;
                    a3.getClass();
                    dlzlVar.a |= 1;
                    dlzlVar.b = a3;
                    dlzl bK4 = bZ5.bK();
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dlzm dlzmVar2 = (dlzm) bZ.b;
                    bK4.getClass();
                    dsrj<dlzl> dsrjVar = dlzmVar2.d;
                    if (!dsrjVar.a()) {
                        dlzmVar2.d = dsqw.cl(dsrjVar);
                    }
                    dlzmVar2.d.add(bK4);
                }
                byaq byaqVar = wtqVar.c;
                dlzm bK5 = bZ.bK();
                byai a4 = byaqVar.a.a();
                dbsk.a(!((bK5.a & 4) != 0));
                it = it3;
                byah byahVar = new byah(str, a4.b, a4.c, bK5, (ckhe) a4.a.a().a(ckkg.a));
                byahVar.d.a();
                Object obj = byahVar.e;
                String str2 = byahVar.b;
                dmaf bZ6 = dmag.d.bZ();
                if (str2 != null) {
                    if (bZ6.c) {
                        bZ6.bF();
                        bZ6.c = false;
                    }
                    dmag dmagVar = (dmag) bZ6.b;
                    str2.getClass();
                    dmagVar.a |= 2;
                    dmagVar.c = str2;
                }
                byahVar.e = byahVar.c(obj, bZ6);
                dehn g = deew.g(byahVar.d(), new byao(byahVar), dege.a);
                deha.q(g, new byam(byahVar), dege.a);
                dehn<dlzp> h3 = deew.h(g, byag.a, dege.a);
                wtqVar.b.put(str, h3);
                d = deig.d();
                deha.q(h3, new wtp(wtqVar, str, d), wtqVar.a);
            }
            deha.q(d, new voc(vogVar, b, list2), vogVar.b);
            it3 = it;
            i = 3;
        }
        vog.c(b, arrayList, 2);
        vogVar.d(2);
    }
}
