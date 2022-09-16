package defpackage;
/* compiled from: PG */
/* renamed from: dui  reason: default package */
/* loaded from: classes3.dex */
public final class dui extends dux {
    private final dta h;

    public dui(dtq dtqVar, aopa aopaVar, int i, dta dtaVar) {
        super(dtqVar, "PensvsJnNpL+yMY4XKkStmGa2ptSElaVh4r1XUZqw9XUyy1JGZtm1IlZ+/JN7vku", "iKRtJC3GX2+V8JbfzLbaCxdTcja6vuePh9SVzOC/Kyg=", aopaVar, i, 11);
        this.h = dtaVar;
    }

    @Override // defpackage.dux
    protected final void a() {
        dta dtaVar = this.h;
        if (dtaVar != null) {
            aopa aopaVar = this.g;
            long longValue = ((Long) this.d.invoke(null, dtaVar.a)).longValue();
            aopaVar.copyOnWrite();
            dnw dnwVar = (dnw) aopaVar.instance;
            dnw dnwVar2 = dnw.a;
            dnwVar.b |= 1024;
            dnwVar.j = longValue;
        }
    }
}
