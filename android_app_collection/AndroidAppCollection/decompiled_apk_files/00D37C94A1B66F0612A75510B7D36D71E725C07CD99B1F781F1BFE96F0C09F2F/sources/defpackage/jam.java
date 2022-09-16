package defpackage;

import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jam  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class jam implements Runnable {
    public final /* synthetic */ jan a;
    private final /* synthetic */ int b;

    public /* synthetic */ jam(jan janVar, int i) {
        this.b = i;
        this.a = janVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.b != 0) {
            jan janVar = this.a;
            if (!janVar.f.f()) {
                return;
            }
            try {
                agsd agsdVar = janVar.g;
                aopa createBuilder = atrf.a.createBuilder();
                createBuilder.copyOnWrite();
                atrf atrfVar = (atrf) createBuilder.instance;
                atrfVar.c = 2;
                atrfVar.b = 1 | atrfVar.b;
                String d = emn.d();
                createBuilder.copyOnWrite();
                atrf atrfVar2 = (atrf) createBuilder.instance;
                d.getClass();
                atrfVar2.b = 2 | atrfVar2.b;
                atrfVar2.d = d;
                agsdVar.d((atrf) createBuilder.mo39build());
                return;
            } catch (agse e) {
                String valueOf = String.valueOf(e.getMessage());
                zep.b(valueOf.length() != 0 ? "Couldn't delete: ".concat(valueOf) : new String("Couldn't delete: "));
                return;
            }
        }
        jan janVar2 = this.a;
        asyv asyvVar = (asyv) janVar2.h.a(janVar2.c.c()).f(emn.d()).g(asyv.class).W();
        if (asyvVar != null) {
            aajj b = asyvVar.b.b(asyvVar.c.f);
            aqxo.z(b == null || (b instanceof aumo), "entityFromStore is not instance of RefreshEntityModel, key=refresh");
            aumo aumoVar = (aumo) b;
            if (aumoVar != null && TimeUnit.MILLISECONDS.toSeconds(janVar2.i.c()) - aumoVar.getRefreshTime().longValue() < jan.a) {
                return;
            }
        }
        try {
            agsd agsdVar2 = janVar2.g;
            aopa createBuilder2 = atrf.a.createBuilder();
            createBuilder2.copyOnWrite();
            atrf atrfVar3 = (atrf) createBuilder2.instance;
            atrfVar3.c = 3;
            atrfVar3.b = 1 | atrfVar3.b;
            String d2 = emn.d();
            createBuilder2.copyOnWrite();
            atrf atrfVar4 = (atrf) createBuilder2.instance;
            d2.getClass();
            atrfVar4.b = 2 | atrfVar4.b;
            atrfVar4.d = d2;
            agsdVar2.d((atrf) createBuilder2.mo39build());
        } catch (agse e2) {
            String valueOf2 = String.valueOf(e2.getMessage());
            zep.b(valueOf2.length() != 0 ? "Couldn't refresh: ".concat(valueOf2) : new String("Couldn't refresh: "));
        }
        if (janVar2.f.m()) {
            ylr.b();
            agwc k = ((jod) janVar2.e.get()).b.a().k();
            if (k != null) {
                k.i(jod.a);
            }
        }
        String c = ((agrf) janVar2.b.get()).c();
        if ("NO_OP_STORE_TAG".equals(c)) {
            return;
        }
        janVar2.d.a(c);
    }
}
