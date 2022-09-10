package defpackage;
/* compiled from: PG */
/* renamed from: bdci  reason: default package */
/* loaded from: classes3.dex */
public class bdci implements bdae {
    private final afxv a;

    public bdci(afxv afxvVar) {
        this.a = afxvVar;
    }

    @Override // defpackage.bdae
    public Boolean a() {
        afxv afxvVar = this.a;
        if (afxvVar.g.b()) {
            return Boolean.valueOf(afxvVar.p.get());
        }
        return false;
    }

    @Override // defpackage.bdae
    public Boolean b() {
        return Boolean.valueOf(this.a.i.getLensParameters().f);
    }

    @Override // defpackage.jbt
    public void j(cqiv cqivVar) {
        cqivVar.a(new bcuc(), this);
    }

    @Override // defpackage.jbt
    public cjtd k() {
        ddhj ddhjVar;
        if (a().booleanValue()) {
            cjta b = cjtd.b();
            b.d = dtxy.cv;
            if (b().booleanValue()) {
                ddhjVar = ddhj.VISIBILITY_REPRESSED_COUNTERFACTUAL;
            } else {
                ddhjVar = ddhj.VISIBILITY_VISIBLE;
            }
            b.w(ddhjVar);
            return b.a();
        }
        return cjtd.b;
    }
}
