package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: dwb  reason: default package */
/* loaded from: classes6.dex */
public final class dwb implements dai {
    @dzsi
    dud a;
    private final Activity b;
    private final czz c;
    private final czw d;
    private final dua e;
    private final ArrayList<dwf> f = new ArrayList<>();
    private final dwg g;
    private final cze h;
    private final czd i;
    private final czd j;
    private final czd k;
    private final dui l;

    public dwb(czw czwVar, dui duiVar, dwg dwgVar, Activity activity, czz czzVar, dua duaVar, cze czeVar, czd czdVar, czd czdVar2, czd czdVar3) {
        this.d = czwVar;
        this.l = duiVar;
        this.g = dwgVar;
        this.b = activity;
        this.c = czzVar;
        this.e = duaVar;
        this.h = czeVar;
        this.i = czdVar;
        this.j = czdVar2;
        this.k = czdVar3;
    }

    @Override // defpackage.czg
    public final void a() {
    }

    @Override // defpackage.dai
    public final void b(@dzsi dtk dtkVar) {
        dud dudVar;
        if (dtkVar != null) {
            bvrj.UI_THREAD.c();
            dte dteVar = this.d.a().b;
            if (dteVar == null) {
                dteVar = dte.w;
            }
            dfkv dfkvVar = dteVar.e;
            if (dfkvVar == null) {
                dfkvVar = dfkv.c;
            }
            dfku dfkuVar = dfkvVar.b;
            if (dfkuVar == null) {
                dfkuVar = dfku.f;
            }
            if (dfkuVar.b) {
                dsrj<dtj> dsrjVar = dtkVar.d;
                int i = dtkVar.c;
                if (dsrjVar.isEmpty() || i < 0 || i >= dsrjVar.size()) {
                    return;
                }
                dsrj<dtj> dsrjVar2 = dtkVar.d;
                int i2 = dtkVar.c;
                dth dthVar = dtkVar.e;
                if (dthVar == null) {
                    dthVar = dth.f;
                }
                dowa b = dowa.b(dthVar.d);
                if (b == null) {
                    b = dowa.KILOMETERS;
                }
                if (dsrjVar2.isEmpty() || i2 < 0 || i2 >= dsrjVar2.size()) {
                    return;
                }
                int i3 = 2;
                int i4 = 1;
                if (this.a == null) {
                    dui duiVar = this.l;
                    czz czzVar = this.c;
                    dgc a = duiVar.a.a.a();
                    due.a(a, 1);
                    due.a(czzVar, 2);
                    dnz dnzVar = (dnz) czzVar;
                    dud dudVar2 = new dud(a.a(dnzVar.a, dnzVar.c));
                    this.a = dudVar2;
                    this.e.a(dudVar2);
                }
                this.a.a(true);
                if (this.f.size() != dsrjVar2.size()) {
                    dud dudVar3 = this.a;
                    if (dudVar3 != null) {
                        dudVar3.a = null;
                    }
                    int size = this.f.size() - 1;
                    while (size >= dsrjVar2.size()) {
                        this.e.b(this.f.get(size));
                        this.f.remove(size);
                        size--;
                        i3 = 2;
                        i4 = 1;
                    }
                    while (this.f.size() < dsrjVar2.size()) {
                        dwg dwgVar = this.g;
                        Activity activity = this.b;
                        dua duaVar = this.e;
                        cze czeVar = this.h;
                        czd czdVar = this.i;
                        czd czdVar2 = this.j;
                        czd czdVar3 = this.k;
                        Executor a2 = dwgVar.a.a();
                        dwg.a(a2, i4);
                        dvh a3 = dwgVar.b.a();
                        dwg.a(a3, i3);
                        bvsl a4 = dwgVar.c.a();
                        dwg.a(a4, 3);
                        dwg.a(activity, 4);
                        dwg.a(duaVar, 5);
                        dwg.a(czeVar, 6);
                        dwg.a(czdVar, 7);
                        dwg.a(czdVar2, 8);
                        dwg.a(czdVar3, 9);
                        dwf dwfVar = new dwf(a2, a3, a4, activity, duaVar, czeVar, czdVar, czdVar2, czdVar3);
                        dwfVar.e = b;
                        this.e.a(dwfVar);
                        this.f.add(dwfVar);
                        i3 = 2;
                        i4 = 1;
                    }
                }
                int i5 = 0;
                while (i5 < this.f.size()) {
                    dtj dtjVar = dsrjVar2.get(i5);
                    dwf dwfVar2 = this.f.get(i5);
                    dbsk.s(dwfVar2);
                    int i6 = i5 == i2 + (-1) ? 2 : i5 == i2 ? 3 : i5 == i2 + 1 ? 4 : 1;
                    dtj dtjVar2 = dwfVar2.b;
                    if (dtjVar2 != null && !dtjVar2.equals(dtjVar)) {
                        dwfVar2.a();
                    }
                    dwfVar2.b = dtjVar;
                    dwfVar2.l = i6;
                    boolean z = i6 != 1;
                    bvrj.UI_THREAD.c();
                    dwfVar2.c = z;
                    if (i6 != 3 || (dudVar = this.a) == null) {
                        dwfVar2.k = null;
                    } else {
                        dwfVar2.k = dudVar;
                    }
                    i5++;
                }
                return;
            }
            int size2 = this.f.size();
            while (true) {
                size2--;
                if (size2 < 0) {
                    break;
                }
                this.e.b(this.f.get(size2));
                this.f.remove(size2);
            }
            dud dudVar4 = this.a;
            if (dudVar4 == null) {
                return;
            }
            dudVar4.a = null;
            dudVar4.a(false);
        }
    }
}
