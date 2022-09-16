package defpackage;

import java.util.Arrays;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wuz  reason: default package */
/* loaded from: classes4.dex */
public final class wuz implements wvb {
    private final azqb a;
    private final azqb b;
    private final azqb c;
    private final azqb d;
    private final Executor e;
    private final azqb f;

    public wuz(azqb azqbVar, azqb azqbVar2, azqb azqbVar3, azqb azqbVar4, Executor executor, azqb azqbVar5) {
        this.a = azqbVar;
        this.b = azqbVar2;
        this.c = azqbVar3;
        this.d = azqbVar4;
        this.e = executor;
        this.f = azqbVar5;
    }

    @Override // defpackage.wvb
    public final wuw a(wuv wuvVar, xdu xduVar) {
        if (xduVar.g(apcd.SLOT_TYPE_PLAYER_BYTES, Arrays.asList(xao.class, xbw.class))) {
            return new wuu(wuvVar, (aadd) this.d.get(), (wnp) this.a.get(), (wvh) this.c.get(), xduVar, (yni) this.b.get(), this.e, (wun) this.f.get());
        }
        if (xduVar.h(apcd.SLOT_TYPE_PLAYER_BYTES, xaw.class)) {
            return wuy.a.a(wuvVar, xduVar);
        }
        throw new wva("PlayerBytesSlotAdapterFactory received unsupported metadata");
    }
}
