package defpackage;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akut  reason: default package */
/* loaded from: classes.dex */
public final class akut {
    public final Context b;
    public final azqb c;
    public final azqb d;
    public boolean f;
    private final azqb g;
    public final Object a = new Object();
    public final Map e = new HashMap();

    public akut(Context context, azqb azqbVar, azqb azqbVar2, azqb azqbVar3) {
        this.b = context;
        this.g = azqbVar;
        this.c = azqbVar2;
        this.d = azqbVar3;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(aveo aveoVar) {
        aopa createBuilder = aven.a.createBuilder();
        if (aveoVar != null) {
            createBuilder.copyOnWrite();
            aven avenVar = (aven) createBuilder.instance;
            avenVar.c = aveoVar.c;
            avenVar.b |= 1;
        }
        c(createBuilder, false, false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(aveo aveoVar) {
        if (this.f) {
            akwo akwoVar = new akwo("Heartbeat", aveoVar);
            utd a = utd.a();
            a.a.d(akwoVar.toString());
            return;
        }
        a(aveoVar);
    }

    public final void c(aopa aopaVar, boolean z, boolean z2) {
        if (z) {
            ((akuu) this.g.get()).a((aven) aopaVar.mo39build(), true);
            return;
        }
        synchronized (this.a) {
            for (aktk aktkVar : this.e.values()) {
                if (aktkVar.e()) {
                    z2 |= aktkVar.f(this.b, aopaVar);
                }
            }
        }
        if (!z2) {
            return;
        }
        ((akuu) this.g.get()).a((aven) aopaVar.mo39build(), false);
    }
}
