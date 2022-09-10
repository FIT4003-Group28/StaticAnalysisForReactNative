package defpackage;

import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bsnf  reason: default package */
/* loaded from: classes4.dex */
public class bsnf implements bsmz {
    private final bsmd a;
    private final djrm b;
    private final List<dqer> c = new ArrayList();
    private final List<jic> d;
    private final String e;
    private final cjtd f;

    public bsnf(btvo btvoVar, Resources resources, bsmd bsmdVar, djrm djrmVar, int i, ddho ddhoVar) {
        ArrayList arrayList = new ArrayList();
        this.d = arrayList;
        this.a = bsmdVar;
        this.b = djrmVar;
        String str = djrmVar.q;
        cjta b = cjtd.b();
        b.d = ddhoVar;
        b.i(i);
        if (!dbsj.d(str)) {
            b.g(str);
        }
        this.f = b.a();
        this.e = djrmVar.b;
        int size = djrmVar.e.size();
        if (!djrmVar.k.isEmpty()) {
            arrayList.add(new jic(djrmVar.k, ckqc.FIFE, 0));
        } else if (size > 0) {
            for (int i2 = 0; i2 < size && this.d.size() <= 0; i2++) {
                dvyw dvywVar = djrmVar.e.get(i2);
                if (dvywVar.F.size() > 0) {
                    List<dqer> list = this.c;
                    dqeq bZ = dqer.c.bZ();
                    String str2 = dvywVar.g;
                    if (bZ.c) {
                        bZ.bF();
                        bZ.c = false;
                    }
                    dqer dqerVar = (dqer) bZ.b;
                    str2.getClass();
                    dqerVar.a |= 1;
                    dqerVar.b = str2;
                    list.add(bZ.bK());
                    dwfl dwflVar = dvywVar.F.get(0).b;
                    dwflVar = dwflVar == null ? dwfl.w : dwflVar;
                    this.d.add(new jic(dwflVar.h, jfv.b(dwflVar), 0));
                }
            }
        } else {
            if ((djrmVar.a & 512) == 0) {
                return;
            }
            arrayList.add(new jic(djrmVar.l, ckqc.FULLY_QUALIFIED, 0));
        }
    }

    @Override // defpackage.bsmz
    @dzsi
    public jic d(int i) {
        if (this.d.size() <= 0) {
            return null;
        }
        return this.d.get(0);
    }

    @Override // defpackage.bsmz
    public String e() {
        return this.e;
    }

    @Override // defpackage.bsmz
    public cqkl f(cjqm cjqmVar) {
        bsmc a = this.a.a(this.b, cjqmVar);
        a.a = this.c;
        a.a();
        return cqkl.a;
    }

    @Override // defpackage.bsmz
    @dzsi
    public cjtd g() {
        return this.f;
    }
}
