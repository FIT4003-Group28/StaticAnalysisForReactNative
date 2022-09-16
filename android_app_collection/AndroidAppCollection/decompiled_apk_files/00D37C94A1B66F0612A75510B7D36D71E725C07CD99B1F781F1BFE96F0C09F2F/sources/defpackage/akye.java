package defpackage;

import j$.time.Duration;
import j$.time.Instant;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: akye  reason: default package */
/* loaded from: classes.dex */
public final class akye {
    public final yjs a;
    private final axnm b;
    private final axnm c;
    private final akzp d;
    private final Executor e;
    private final akze f;

    public akye(axnm axnmVar, axnm axnmVar2, akzp akzpVar, yjs yjsVar, Executor executor, akze akzeVar) {
        this.b = axnmVar;
        this.c = axnmVar2;
        this.d = akzpVar;
        this.a = yjsVar;
        this.e = executor;
        this.f = akzeVar;
    }

    public final void a() {
        try {
            this.e.execute(new Runnable() { // from class: akyd
                @Override // java.lang.Runnable
                public final void run() {
                    akye akyeVar = akye.this;
                    akyeVar.a.c("yt_upload_wifi_req");
                    akyeVar.a.c("yt_upload_network_req");
                    akyeVar.a.b("yt_upload_long_retry");
                }
            });
            Map d = this.d.d(akxb.d);
            if (!d.isEmpty()) {
                akys akysVar = (akys) this.b.get();
                for (alcw alcwVar : d.values()) {
                    alcl a = alcm.a(alcwVar.k);
                    if ((alcwVar.b & 2048) != 0) {
                        a.c = alcwVar.n.I();
                    }
                    if ((alcwVar.b & 4096) != 0) {
                        a.b = akys.a(alcwVar);
                    }
                    ((alci) akysVar.l.get()).B(a.a());
                    akysVar.j.b(alcwVar.k);
                }
            }
            if (this.d.d(akxb.c).isEmpty()) {
                return;
            }
            final akxz akxzVar = (akxz) this.c.get();
            ylx.j(anlz.v(new aniq() { // from class: akxc
                @Override // defpackage.aniq
                public final ankt a() {
                    final akxz akxzVar2 = akxz.this;
                    List t = akxzVar2.t(new ayqf() { // from class: akxr
                        @Override // defpackage.ayqf
                        public final boolean a(Object obj) {
                            akxz akxzVar3 = akxz.this;
                            return Duration.between(Instant.ofEpochMilli(((alcw) obj).h), Instant.ofEpochMilli(akxzVar3.b.c())).compareTo(akxzVar3.r()) > 0;
                        }
                    }, avum.UPLOAD_PROCESSOR_ABANDONMENT_REASON_TIMED_OUT_CREATION);
                    Map d2 = akxzVar2.i.d(akxb.b);
                    d2.values().removeAll(t);
                    for (alcw alcwVar2 : d2.values()) {
                        akxzVar2.n.b(alcwVar2.k);
                    }
                    HashSet<alcw> hashSet = new HashSet();
                    for (alcw alcwVar3 : d2.values()) {
                        if ((alcwVar3.b & 128) == 0 || (alcwVar3.t && aley.c(alcwVar3))) {
                            akxzVar2.a(alcwVar3);
                        } else {
                            hashSet.add(alcwVar3);
                        }
                    }
                    for (alcw alcwVar4 : hashSet) {
                        if (alcwVar4.t) {
                            alcl a2 = alcm.a(alcwVar4.k);
                            if ((alcwVar4.b & 2048) != 0) {
                                a2.c = alcwVar4.n.I();
                            }
                            if ((alcwVar4.b & 4096) != 0) {
                                a2.b = akys.a(alcwVar4);
                            }
                            ((alci) akxzVar2.j.get()).B(a2.a());
                        } else {
                            akxzVar2.a(alcwVar4);
                            akxzVar2.l.e(alcwVar4.k);
                        }
                    }
                    return ankq.a;
                }
            }, akxzVar.e), akxzVar.v(), new akxn(akxzVar, 1));
        } catch (akzq e) {
            this.f.b("Failed to resume uploads.", e);
            zep.f("PendingUploadsChecker", "Failed to resume uploads.", e);
        }
    }
}
