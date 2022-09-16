package defpackage;
/* compiled from: PG */
/* renamed from: joh  reason: default package */
/* loaded from: classes3.dex */
public final class joh {
    public final yni a;
    public final fcn b;
    private final azqb c;
    private final agsd d;
    private final ahdf e;

    public joh(fcn fcnVar, azqb azqbVar, yni yniVar, agsd agsdVar, ahdf ahdfVar) {
        this.b = fcnVar;
        this.c = azqbVar;
        this.a = yniVar;
        this.d = agsdVar;
        this.e = ahdfVar;
    }

    public final ankt a() {
        return this.b.a(jgl.q);
    }

    public final ankt b(String str) {
        if (this.e.m()) {
            try {
                agsd agsdVar = this.d;
                aopa createBuilder = atrf.a.createBuilder();
                createBuilder.copyOnWrite();
                atrf atrfVar = (atrf) createBuilder.instance;
                atrfVar.c = 2;
                atrfVar.b |= 1;
                String h = emn.h(str);
                createBuilder.copyOnWrite();
                atrf atrfVar2 = (atrf) createBuilder.instance;
                h.getClass();
                atrfVar2.b |= 2;
                atrfVar2.d = h;
                agsdVar.d((atrf) createBuilder.mo39build());
                agsd agsdVar2 = this.d;
                aopa createBuilder2 = atrf.a.createBuilder();
                createBuilder2.copyOnWrite();
                atrf atrfVar3 = (atrf) createBuilder2.instance;
                atrfVar3.c = 2;
                atrfVar3.b |= 1;
                String v = emn.v(str);
                createBuilder2.copyOnWrite();
                atrf atrfVar4 = (atrf) createBuilder2.instance;
                v.getClass();
                atrfVar4.b = 2 | atrfVar4.b;
                atrfVar4.d = v;
                agsdVar2.d((atrf) createBuilder2.mo39build());
            } catch (agse unused) {
                return anlz.q(null);
            }
        } else {
            ((agrf) this.c.get()).a().m().y(str);
        }
        return a();
    }
}
