package defpackage;

import com.google.android.apps.youtube.embeddedplayer.service.jar.client.ab;
import java.util.concurrent.Callable;
/* compiled from: PG */
/* renamed from: ypx  reason: default package */
/* loaded from: classes4.dex */
public final class ypx {
    public final azpb a = azpa.ar().ax();
    public final azpb b = azpa.ar().ax();
    public final azpb c = azpa.ar().ax();
    public final azpb d = azpa.ar().ax();
    public final azpb e = azpa.as(0).ax();
    public final azpb f = azpa.ar().ax();
    public final ypq g;
    public final ayos h;
    private final azqb i;
    private ypy j;

    public ypx(azqb azqbVar, ypq ypqVar, final axxb axxbVar, ayor ayorVar) {
        this.i = azqbVar;
        this.g = ypqVar;
        axxbVar.getClass();
        this.h = ayos.A(new Callable() { // from class: ypt
            @Override // java.util.concurrent.Callable
            public final Object call() {
                aqxe aqxeVar = axxb.this.b.b().C;
                if (aqxeVar == null) {
                    aqxeVar = aqxe.a;
                }
                boolean z = false;
                if (aqxeVar.a(45356834L)) {
                    aoqp aoqpVar = aqxeVar.b;
                    if (!aoqpVar.containsKey(45356834L)) {
                        throw new IllegalArgumentException();
                    }
                    aqxf aqxfVar = (aqxf) aoqpVar.get(45356834L);
                    if (aqxfVar.b == 1) {
                        z = ((Boolean) aqxfVar.c).booleanValue();
                    }
                    return Boolean.valueOf(z);
                }
                return false;
            }
        }).G(ayorVar).l();
    }

    public final aynx a() {
        return this.f.I().L().A();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(final boolean z, final boolean z2, final boolean z3, final boolean z4, final int i) {
        ypy ypyVar = this.j;
        if (ypyVar == null || z != ypyVar.a()) {
            this.j = new ypy(z);
            ((yni) this.i.get()).f(this.j);
        }
        this.h.W(new ayrv(new ayqb() { // from class: ypu
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                ypx ypxVar = ypx.this;
                boolean z5 = z;
                boolean z6 = z2;
                boolean z7 = z3;
                boolean z8 = z4;
                int i2 = i;
                if (((Boolean) obj).booleanValue()) {
                    ypxVar.f.c(new ypw(z5, z6, z7, z8, i2));
                    return;
                }
                ypxVar.b.c(Boolean.valueOf(z6));
                ypxVar.c.c(Boolean.valueOf(z7));
                ypxVar.d.c(Boolean.valueOf(z8));
                ypxVar.e.c(Integer.valueOf(i2));
            }
        }, ab.r));
    }
}
