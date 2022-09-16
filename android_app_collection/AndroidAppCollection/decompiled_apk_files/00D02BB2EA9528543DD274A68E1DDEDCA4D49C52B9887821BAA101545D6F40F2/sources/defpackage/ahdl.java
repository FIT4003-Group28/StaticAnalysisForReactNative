package defpackage;

import android.view.View;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahdl  reason: default package */
/* loaded from: classes2.dex */
public class ahdl extends ahhv {
    public final String a;
    public final dxio<afha> b;
    private final List<agxa<?>> c;
    private final List<agwu> d;
    private final agwu e;
    private final cjta f;
    private final agyq g;

    public ahdl(ahas ahasVar, ahht ahhtVar, dxio<afha> dxioVar, dlcv dlcvVar, agyh agyhVar, List<agxa<?>> list, agwu agwuVar, dlbd dlbdVar, String str, String str2, cjta cjtaVar) {
        super(ahhtVar, dlcvVar, agyhVar);
        this.b = dxioVar;
        this.c = list;
        this.d = dcdc.f(agwuVar);
        this.e = agwuVar;
        this.a = str;
        this.f = cjtaVar;
        cjtd cjtdVar = cjtd.b;
        jic h = (dlbdVar.a & 2) != 0 ? agxk.h(dlbdVar.c, ckqc.FULLY_QUALIFIED) : null;
        String str3 = dlbdVar.b;
        this.g = ahasVar.a(str3, str2, h, null, cjtdVar, str3, null, this);
    }

    @Override // defpackage.agxe
    public List<agxa<?>> a() {
        return this.c;
    }

    @Override // defpackage.agxe
    public cjtd b(ddho ddhoVar) {
        return this.f.b(ddhoVar);
    }

    @Override // defpackage.agxe
    public cqix<agyq> c() {
        return cqgr.fT(new agdv(), this.g);
    }

    @Override // defpackage.agxe
    public List<agwu> g() {
        return this.d;
    }

    @Override // defpackage.ahhv
    @dzsi
    public agwu o() {
        return this.e;
    }

    @Override // defpackage.ahhv
    protected final List<jho> r() {
        dccx F = dcdc.F();
        if (!dbsj.d(this.a)) {
            jhm jhmVar = new jhm();
            jhmVar.a = this.k.getString(R.string.REPORT_POST);
            jhmVar.d(new View.OnClickListener(this) { // from class: ahdi
                private final ahdl a;

                {
                    this.a = this;
                }

                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    ahdl ahdlVar = this.a;
                    ahdlVar.b.a().r(ahdlVar.a, 1);
                }
            });
            F.g(jhmVar.c());
        }
        return F.f();
    }
}
