package defpackage;

import android.text.Html;
import android.text.Spanned;
import java.util.List;
/* compiled from: PG */
/* renamed from: cflb  reason: default package */
/* loaded from: classes4.dex */
public final class cflb extends cfje implements cfho {
    public final mw<Boolean> a;
    private final dddi b;
    private final dlnl c;
    private dcdc<cfhn> d;

    public cflb(cfkz cfkzVar, dddi dddiVar, dspd dspdVar, dlnl dlnlVar, mw<Boolean> mwVar) {
        this.b = dddiVar;
        this.c = dlnlVar;
        this.a = mwVar;
        this.d = dcdc.e();
        dccx F = dcdc.F();
        for (dlnk dlnkVar : dlnlVar.b) {
            cfla cflaVar = new cfla(this);
            cfgv a = cfkzVar.a.a();
            cfkz.a(a, 1);
            cfkz.a(cfkzVar.b.a(), 2);
            cfkz.a(dddiVar, 3);
            cfkz.a(dspdVar, 4);
            cfkz.a(dlnkVar, 5);
            cfkz.a(cflaVar, 6);
            F.g(new cfky(a, dddiVar, dspdVar, dlnkVar, cflaVar));
        }
        this.d = F.f();
        mwVar.a(Boolean.valueOf(!d().booleanValue()));
    }

    @Override // defpackage.cfho
    public Spanned a() {
        return Html.fromHtml(this.c.a);
    }

    @Override // defpackage.cfho
    public List<cfhn> b() {
        return this.d;
    }

    @Override // defpackage.cfho
    public cjtd c() {
        cjta b = cjtd.b();
        b.d = dtxy.ok;
        dddf bZ = dddg.g.bZ();
        dddi dddiVar = this.b;
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dddg dddgVar = (dddg) bZ.b;
        dddiVar.getClass();
        dddgVar.d = dddiVar;
        dddgVar.a |= 32;
        b.j(bZ.bK());
        return b.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Boolean d() {
        dcdc<cfhn> dcdcVar = this.d;
        int size = dcdcVar.size();
        int i = 0;
        while (i < size) {
            int i2 = i + 1;
            if (dcdcVar.get(i).e().booleanValue()) {
                return true;
            }
            i = i2;
        }
        return false;
    }
}
