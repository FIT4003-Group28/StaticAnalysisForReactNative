package defpackage;

import com.google.protos.youtube.api.innertube.ReelWatchEndpointOuterClass$ReelWatchEndpoint;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: gtu  reason: default package */
/* loaded from: classes3.dex */
public final class gtu implements ynl {
    static final String a = aakj.f(aumg.b.a(), "SHORTS_SEEDLESS_ENDPOINT");
    public static final /* synthetic */ int d = 0;
    public final Map b = new HashMap();
    public boolean c = false;
    private final aagi e;
    private final afvn f;
    private final axnm g;
    private final Executor h;
    private final azqb i;
    private final azqb j;

    public gtu(aagi aagiVar, afvn afvnVar, axnm axnmVar, Executor executor, azqb azqbVar, azqb azqbVar2) {
        this.e = aagiVar;
        this.f = afvnVar;
        this.g = axnmVar;
        this.h = executor;
        this.i = azqbVar;
        this.j = azqbVar2;
    }

    public final void a() {
        synchronized (this.b) {
            this.c = true;
        }
        aukw aukwVar = ((aacz) this.j.get()).b().E;
        if (aukwVar == null) {
            aukwVar = aukw.a;
        }
        if (aukwVar.g) {
            c();
        } else {
            aukw aukwVar2 = ((aacz) this.j.get()).b().E;
            if (aukwVar2 == null) {
                aukwVar2 = aukw.a;
            }
            if (!aukwVar2.f) {
                for (Map.Entry entry : this.b.entrySet()) {
                    b((aumf) entry.getValue());
                }
            }
        }
        this.b.clear();
    }

    public final void b(aumf aumfVar) {
        if (this.g.get() == null) {
            return;
        }
        if (aumfVar.f()) {
            gtd.b(aumfVar.getUpdatedEndpointProto(), (ajmy) this.g.get());
        } else if (!aumfVar.b()) {
        } else {
            try {
                apzg apzgVar = (apzg) aopi.parseFrom(apzg.a, aumfVar.getUpdatedEndpoint(), aoos.b());
                if (!apzgVar.qn(ReelWatchEndpointOuterClass$ReelWatchEndpoint.reelWatchEndpoint)) {
                    return;
                }
                gtd.b(apzgVar, (ajmy) this.g.get());
            } catch (aopx e) {
                zep.d("Error parsing bytes for updated ReelWatchEndpoint.", e);
            }
        }
    }

    public final void c() {
        ((yni) this.i.get()).g(this);
        d();
    }

    public final void d() {
        this.e.a(this.f.c()).h(a, true).X(azpj.b(this.h)).at(new ayqb() { // from class: gtt
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                aumf aumfVar;
                gtu gtuVar = gtu.this;
                aajp aajpVar = (aajp) obj;
                if (aajpVar != null) {
                    aajj aajjVar = aajpVar.c;
                    if (!(aajjVar instanceof aumf) || (aumfVar = (aumf) aajjVar) == null) {
                        return;
                    }
                    synchronized (gtuVar.b) {
                        if (!gtuVar.c) {
                            gtuVar.b.put(aumfVar.d(), aumfVar);
                        } else {
                            gtuVar.b(aumfVar);
                        }
                    }
                }
            }
        }, fzc.r);
    }

    @Override // defpackage.ynl
    public final Class[] ky(Class cls, Object obj, int i) {
        if (i != -1) {
            if (i == 0) {
                afwb afwbVar = (afwb) obj;
                d();
                return null;
            }
            StringBuilder sb = new StringBuilder(32);
            sb.append("unsupported op code: ");
            sb.append(i);
            throw new IllegalStateException(sb.toString());
        }
        return new Class[]{afwb.class};
    }
}
