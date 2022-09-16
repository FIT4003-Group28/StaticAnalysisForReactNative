package defpackage;

import com.google.android.libraries.youtube.player.model.PlaybackStartDescriptor;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: PG */
/* renamed from: aifg  reason: default package */
/* loaded from: classes.dex */
public final class aifg implements aiet {
    public final azqb a;
    public WeakReference b;
    private final azqb c;
    private final Set d;

    public aifg(azqb azqbVar, azqb azqbVar2) {
        azqbVar.getClass();
        this.a = azqbVar;
        azqbVar2.getClass();
        this.c = azqbVar2;
        this.d = Collections.newSetFromMap(new WeakHashMap());
    }

    @Override // defpackage.aiet
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        if (!this.d.isEmpty()) {
            return;
        }
        d((fgh) obj, new aiff(this), false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Object b() {
        Object obj = new Object();
        this.d.add(obj);
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(Object obj) {
        this.d.remove(obj);
    }

    public final void d(fgh fghVar, aiff aiffVar, boolean z) {
        PlaybackStartDescriptor a;
        airr airrVar = (airr) this.a.get();
        aire aireVar = (aire) this.c.get();
        if (fghVar == null) {
            if (airrVar.n() == null) {
                return;
            }
            airrVar.D();
            return;
        }
        if (aiffVar != null) {
            if (((airr) aiffVar.a.a.get()).d()) {
                a = fghVar.a();
            } else {
                aijl e = fghVar.a().e();
                e.b(true);
                a = e.a();
            }
        } else {
            a = fghVar.a();
        }
        if (z) {
            airrVar.D();
        } else if (airrVar.N(a)) {
            return;
        }
        aireVar.d(a);
    }
}
