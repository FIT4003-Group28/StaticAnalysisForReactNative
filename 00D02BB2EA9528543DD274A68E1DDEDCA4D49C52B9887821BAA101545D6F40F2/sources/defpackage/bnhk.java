package defpackage;

import android.app.Activity;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bnhk  reason: default package */
/* loaded from: classes3.dex */
public class bnhk implements bney {
    static final bneu a = new bnhj();
    private final bnew b;
    private final bnex c;
    private final bhhf d;
    private final bnev e;
    private final ilo f;

    public bnhk(bnhf bnhfVar, bnhi bnhiVar, bhhf bhhfVar, bnhc bnhcVar, bwrs<ilo> bwrsVar) {
        ilo c = bwrsVar.c();
        dbsk.s(c);
        Activity activity = (Activity) ((dxjd) bnhfVar.a).a;
        bnhf.a(activity, 1);
        bhje a2 = bnhfVar.b.a();
        bnhf.a(a2, 2);
        bnhf.a(c, 3);
        this.b = new bnhe(activity, a2, c);
        cdjj a3 = bnhiVar.a.a();
        bnhi.a(a3, 1);
        bnfp a4 = bnhiVar.b.a();
        bnhi.a(a4, 2);
        bnhi.a(c, 3);
        this.c = new bnhh(a3, a4, c);
        this.d = bhhfVar;
        this.e = bnhcVar.a(bwrsVar, a);
        this.f = c;
    }

    @Override // defpackage.bney
    public List<cqix<?>> a() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(cqgr.fT(new bncy(), this.e.c()));
        for (bneq bneqVar : this.e.d()) {
            arrayList.add(cqgr.fT(new bnco(), bneqVar));
        }
        arrayList.add(cqgr.fT(new bndb(), this.e.e()));
        return arrayList;
    }

    @Override // defpackage.bney
    public bnew b() {
        return this.b;
    }

    @Override // defpackage.bney
    public bnex c() {
        return this.c;
    }

    @Override // defpackage.bney
    public bnev d() {
        return this.e;
    }

    @Override // defpackage.bney
    public Boolean e() {
        return Boolean.valueOf(this.d.a(this.f));
    }
}
