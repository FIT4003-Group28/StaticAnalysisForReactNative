package defpackage;

import android.app.Activity;
import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: dax  reason: default package */
/* loaded from: classes5.dex */
public final class dax implements dai {
    private final czw a;
    private final dbd b;
    private final Activity c;
    private final dfeh d;
    private final czz f;
    private final dgb g;
    private final ArrayList<dbc> e = new ArrayList<>();
    private long h = -1;

    public dax(czw czwVar, dbd dbdVar, dgc dgcVar, Activity activity, dfeh dfehVar, czz czzVar) {
        this.a = czwVar;
        this.b = dbdVar;
        this.c = activity;
        this.d = dfehVar;
        this.f = czzVar;
        dnz dnzVar = (dnz) czzVar;
        this.g = dgcVar.a(dnzVar.a, dnzVar.c);
    }

    private final void c() {
        this.g.b(false);
        int size = this.e.size();
        while (true) {
            size--;
            if (size >= 0) {
                this.e.get(size).a();
                this.e.remove(size);
            } else {
                return;
            }
        }
    }

    @Override // defpackage.czg
    public final void a() {
        c();
        this.g.a();
    }

    @Override // defpackage.dai
    public final void b(@dzsi dtk dtkVar) {
        if (dtkVar != null) {
            bvrj.UI_THREAD.c();
            dte dteVar = this.a.a().b;
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
                dth dthVar2 = dtkVar.e;
                if (dthVar2 == null) {
                    dthVar2 = dth.f;
                }
                long j = dthVar2.e;
                if (dsrjVar2.isEmpty() || i2 < 0 || i2 >= dsrjVar2.size()) {
                    return;
                }
                int i3 = 4;
                if (this.h != j) {
                    this.g.b(false);
                    int size = this.e.size() - 1;
                    while (size >= dsrjVar2.size()) {
                        this.e.get(size).a();
                        this.e.remove(size);
                        size--;
                        i3 = 4;
                    }
                    while (this.e.size() < dsrjVar2.size()) {
                        dbd dbdVar = this.b;
                        Activity activity = this.c;
                        dfeh dfehVar = this.d;
                        int size2 = this.e.size();
                        czz czzVar = this.f;
                        cqat a = dbdVar.a.a();
                        dbd.a(a, 1);
                        bvsl a2 = dbdVar.b.a();
                        dbd.a(a2, 2);
                        dbd.a(activity, 3);
                        dbd.a(dfehVar, i3);
                        dbd.a(czzVar, 6);
                        dbc dbcVar = new dbc(a, a2, activity, dfehVar, size2, czzVar);
                        dbcVar.d = b;
                        this.e.add(dbcVar);
                        i3 = 4;
                    }
                    ArrayList<dbc> arrayList = this.e;
                    int size3 = arrayList.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        dbc dbcVar2 = arrayList.get(i4);
                        dbcVar2.b(null, 1);
                        dbcVar2.f = null;
                    }
                }
                if (this.e.size() > i2 && dsrjVar2.size() > i2) {
                    dbc dbcVar3 = this.e.get(i2);
                    dbsk.s(dbcVar3);
                    dbcVar3.b(dsrjVar2.get(i2), 3);
                }
                int i5 = 0;
                while (i5 < this.e.size()) {
                    dtj dtjVar = dsrjVar2.get(i5);
                    dbc dbcVar4 = this.e.get(i5);
                    dbsk.s(dbcVar4);
                    int i6 = i5 == i2 + (-1) ? 2 : i5 == i2 ? 3 : i5 == i2 + 1 ? 4 : 1;
                    dbcVar4.f = i6 == 3 ? this.g : null;
                    dbcVar4.b(dtjVar, i6);
                    i5++;
                }
                this.h = j;
                return;
            }
            c();
        }
    }
}
