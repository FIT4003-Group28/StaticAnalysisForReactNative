package defpackage;

import android.app.Application;
import com.google.android.apps.maps.R;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: bgza  reason: default package */
/* loaded from: classes3.dex */
public class bgza implements bgyq {
    private final cqss a;
    private final int b;
    private final cqtd c;
    private final String d;
    private final bgyx e;
    private final cjtd f;
    @dzsi
    private bgyw g;

    public bgza(Application application, cqhn cqhnVar, bgyx bgyxVar, cjtd cjtdVar) {
        this.e = bgyxVar;
        this.f = cjtdVar;
        ArrayList arrayList = new ArrayList(3);
        cqsr.b(ibm.o(), new int[]{16842910}, arrayList);
        cqsr.b(ibm.o(), new int[0], arrayList);
        this.a = cqsr.a(arrayList);
        this.b = (int) application.getResources().getDisplayMetrics().density;
        this.d = application.getString(R.string.MERCHANT_PANEL_INSIGHTS_MONTHS_HINT);
        this.c = cqrt.g(2131232149, ibm.p());
    }

    public void a(List<String> list, @dzsi Integer num, @dzsi Integer num2, @dzsi Integer num3, bgyz bgyzVar, cqjg cqjgVar) {
        int intValue = num.intValue();
        bgyx bgyxVar = this.e;
        Integer valueOf = Integer.valueOf(num2.intValue());
        bgyy bgyyVar = new bgyy(this, bgyzVar);
        cjtd cjtdVar = this.f;
        cpv a = bgyxVar.a.a();
        bgyx.a(a, 1);
        Application a2 = bgyxVar.b.a();
        bgyx.a(a2, 2);
        cqhn a3 = bgyxVar.c.a();
        bgyx.a(a3, 3);
        cqhu a4 = bgyxVar.d.a();
        bgyx.a(a4, 4);
        fd fdVar = (fd) ((dxjd) bgyxVar.e).a;
        bgyx.a(fdVar, 5);
        bgyx.a(list, 6);
        bgyx.a(valueOf, 8);
        bgyx.a(bgyyVar, 10);
        bgyx.a(cjtdVar, 11);
        bgyx.a(cqjgVar, 12);
        this.g = new bgyw(a, a2, a3, a4, fdVar, list, intValue, valueOf, num3, bgyyVar, cjtdVar, cqjgVar);
    }

    @dzsi
    public bgyp b() {
        return this.g;
    }

    @Override // defpackage.bgyq
    public Boolean h() {
        return Boolean.valueOf(this.g == null);
    }

    @Override // defpackage.bgyq
    public String i() {
        bgyw bgywVar = this.g;
        return bgywVar == null ? " " : bgywVar.i();
    }

    @Override // defpackage.bgyq
    public cqss j() {
        return this.a;
    }

    @Override // defpackage.bgyq
    public Integer k() {
        return Integer.valueOf(this.b);
    }

    @Override // defpackage.bgyq
    public cqtd l() {
        return this.c;
    }

    @Override // defpackage.bgyq
    public cqkl m() {
        bgyw bgywVar = this.g;
        if (bgywVar != null) {
            bgywVar.p();
        }
        return cqkl.a;
    }

    @Override // defpackage.bgyq
    public String n() {
        bgyw bgywVar = this.g;
        return bgywVar == null ? this.d : bgywVar.n();
    }

    @Override // defpackage.bgyq
    public cjtd o() {
        return this.f;
    }
}
