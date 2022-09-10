package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: alze  reason: default package */
/* loaded from: classes.dex */
public final class alze implements alzp {
    private final dbty<Boolean> a;

    public alze(dbty<Boolean> dbtyVar) {
        this.a = dbtyVar;
    }

    @Override // defpackage.alzp
    public final void a(@dzsi altv altvVar, dmxg dmxgVar) {
        if (this.a.a().booleanValue()) {
            dmyw dmywVar = ((dmxh) dmxgVar.b).f;
            if (dmywVar == null) {
                dmywVar = dmyw.d;
            }
            dsqp dsqpVar = (dsqp) dmywVar.cu(5);
            dsqpVar.bC(dmywVar);
            dmyv dmyvVar = (dmyv) dsqpVar;
            if (dmyvVar.c) {
                dmyvVar.bF();
                dmyvVar.c = false;
            }
            dmyw dmywVar2 = (dmyw) dmyvVar.b;
            dmywVar2.a |= 268435456;
            dmywVar2.b = true;
            if (dmxgVar.c) {
                dmxgVar.bF();
                dmxgVar.c = false;
            }
            dmxh dmxhVar = (dmxh) dmxgVar.b;
            dmyw bK = dmyvVar.bK();
            bK.getClass();
            dmxhVar.f = bK;
            dmxhVar.a |= 64;
        }
    }

    @Override // defpackage.alzp
    public final boolean b(List<alzr> list, alzr alzrVar) {
        return true;
    }
}
