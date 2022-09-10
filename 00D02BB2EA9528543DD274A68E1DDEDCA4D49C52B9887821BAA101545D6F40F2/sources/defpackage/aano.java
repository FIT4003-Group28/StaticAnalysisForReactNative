package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aano  reason: default package */
/* loaded from: classes2.dex */
public class aano implements aang {
    private final aanm a;
    private List<aanf> b = dcdc.e();

    public aano(aanm aanmVar) {
        this.a = aanmVar;
    }

    @Override // defpackage.aang
    public List<aanf> a() {
        return this.b;
    }

    public void b(diwb diwbVar) {
        dccx F = dcdc.F();
        for (diub diubVar : diwbVar.F) {
            aanm aanmVar = this.a;
            ditt dittVar = diwbVar.e;
            if (dittVar == null) {
                dittVar = ditt.n;
            }
            F.g(aanmVar.a(diubVar, dittVar.b));
        }
        this.b = F.f();
    }

    @Override // defpackage.aakt
    public Boolean c() {
        return Boolean.valueOf(!this.b.isEmpty());
    }
}
