package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: dun  reason: default package */
/* loaded from: classes3.dex */
public final class dun extends dux {
    private List h;

    public dun(dtq dtqVar, aopa aopaVar, int i) {
        super(dtqVar, "7FKshcMzQ2JvPaQohfxJtH9Je8aRuZ/whf+X1aCEEwwPu6U1MmOzUdyjQ5ADF7ql", "HFC1WuOf/amlv/T+hPB5sO3NRNYX+s095nHO9xmNpbc=", aopaVar, i, 31);
        this.h = null;
    }

    @Override // defpackage.dux
    protected final void a() {
        aopa aopaVar = this.g;
        aopaVar.copyOnWrite();
        dnw dnwVar = (dnw) aopaVar.instance;
        dnw dnwVar2 = dnw.a;
        dnwVar.b |= 33554432;
        dnwVar.u = -1L;
        aopa aopaVar2 = this.g;
        aopaVar2.copyOnWrite();
        dnw dnwVar3 = (dnw) aopaVar2.instance;
        dnwVar3.b |= 67108864;
        dnwVar3.v = -1L;
        if (this.h == null) {
            this.h = (List) this.d.invoke(null, this.a.a);
        }
        List list = this.h;
        if (list == null || list.size() != 2) {
            return;
        }
        synchronized (this.g) {
            aopa aopaVar3 = this.g;
            long longValue = ((Long) this.h.get(0)).longValue();
            aopaVar3.copyOnWrite();
            dnw dnwVar4 = (dnw) aopaVar3.instance;
            dnwVar4.b = 33554432 | dnwVar4.b;
            dnwVar4.u = longValue;
            aopa aopaVar4 = this.g;
            long longValue2 = ((Long) this.h.get(1)).longValue();
            aopaVar4.copyOnWrite();
            dnw dnwVar5 = (dnw) aopaVar4.instance;
            dnwVar5.b |= 67108864;
            dnwVar5.v = longValue2;
        }
    }
}
