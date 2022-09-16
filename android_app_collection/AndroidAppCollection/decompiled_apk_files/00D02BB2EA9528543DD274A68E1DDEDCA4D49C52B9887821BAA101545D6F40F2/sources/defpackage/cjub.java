package defpackage;
/* compiled from: PG */
/* renamed from: cjub  reason: default package */
/* loaded from: classes4.dex */
public abstract class cjub extends cjtk {
    public cjub(cqat cqatVar) {
        super(cqatVar.e());
    }

    @Override // defpackage.cjtk
    public final synchronized void C(dwum dwumVar) {
        super.C(dwumVar);
        dcdc<doem> a = a();
        int size = a.size();
        for (int i = 0; i < size; i++) {
            doem doemVar = a.get(i);
            if (dwumVar.c) {
                dwumVar.bF();
                dwumVar.c = false;
            }
            dwun dwunVar = (dwun) dwumVar.b;
            dwun dwunVar2 = dwun.w;
            doemVar.getClass();
            dsrj<doem> dsrjVar = dwunVar.s;
            if (!dsrjVar.a()) {
                dwunVar.s = dsqw.cl(dsrjVar);
            }
            dwunVar.s.add(doemVar);
        }
    }

    protected abstract dcdc<doem> a();

    @Override // defpackage.cjtk
    public final boolean f() {
        return true;
    }
}
