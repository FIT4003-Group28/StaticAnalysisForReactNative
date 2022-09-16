package defpackage;

import java.util.Map;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: swk  reason: default package */
/* loaded from: classes4.dex */
public final class swk extends cyr {
    @dfs(a = 13)
    tfw a;
    @dfs(a = 13)
    tcu b;
    @dfs(a = 13)
    tda c;
    @dfs(a = 13)
    tdg d;
    @dfs(a = 13)
    axmz e;
    @dfs(a = 13)
    tfw f;
    @dfs(a = 13)
    teb g;
    @dfs(a = 13)
    Map v;
    @dfs(a = 13)
    tfj w;
    @dfs(a = 14)
    private swj x;

    public swk() {
        super("ExpandableTextComponent");
        this.x = new swj();
    }

    public static daq a(cyv cyvVar, tfw tfwVar, tfw tfwVar2) {
        return H(swk.class, cyvVar, 2076732558, new Object[]{cyvVar, tfwVar, tfwVar2});
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:47:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0209  */
    @Override // defpackage.czb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.cyr G(defpackage.cyv r26, int r27, int r28) {
        /*
            Method dump skipped, instructions count: 531
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.swk.G(cyv, int, int):cyr");
    }

    @Override // defpackage.czb, defpackage.dap
    public final Object K(daq daqVar, Object obj) {
        int i = daqVar.b;
        if (i == -1048037474) {
            N((cyv) daqVar.c[0], (dao) obj);
            return null;
        } else if (i != 2076732558) {
            return null;
        } else {
            cyj cyjVar = (cyj) obj;
            dbb dbbVar = daqVar.a;
            Object[] objArr = daqVar.c;
            cyv cyvVar = (cyv) objArr[0];
            tfw tfwVar = (tfw) objArr[1];
            tfw tfwVar2 = (tfw) objArr[2];
            swk swkVar = (swk) dbbVar;
            tcu tcuVar = swkVar.b;
            tda tdaVar = swkVar.c;
            boolean booleanValue = swkVar.x.a.booleanValue();
            if (cyvVar.f != null) {
                cyvVar.g(new ddk(0, new Object[0]), "updateState:ExpandableTextComponent.updateExpand");
            }
            tcq a = tcs.a();
            a.h = tdaVar.u;
            tdh tdhVar = tdaVar.r;
            if (tdhVar != null) {
                a.f = tdhVar;
            }
            if (!booleanValue) {
                if (tfwVar != null) {
                    tcuVar.b(tfwVar.a(), a.a()).Q();
                }
            } else if (tfwVar2 != null) {
                tcuVar.b(tfwVar2.a(), a.a()).Q();
            }
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void M(cyv cyvVar) {
        dcz dczVar = new dcz();
        dczVar.a = false;
        this.x.a = (Boolean) dczVar.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final void X(ddl ddlVar, ddl ddlVar2) {
        ((swj) ddlVar2).a = ((swj) ddlVar).a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean Z() {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.czb
    public final boolean ac() {
        return true;
    }

    @Override // defpackage.cyr
    public final /* bridge */ /* synthetic */ cyr j() {
        swk swkVar = (swk) super.j();
        swkVar.x = new swj();
        return swkVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.cyr
    public final ddl m() {
        return this.x;
    }
}
