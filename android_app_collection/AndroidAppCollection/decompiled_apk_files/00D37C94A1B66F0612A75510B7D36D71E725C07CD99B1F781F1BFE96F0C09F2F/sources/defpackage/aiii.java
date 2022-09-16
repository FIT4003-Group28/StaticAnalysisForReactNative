package defpackage;

import android.os.Handler;
import com.google.protos.youtube.api.innertube.CommandExecutorCommandOuterClass$CommandExecutorCommand;
/* compiled from: PG */
/* renamed from: aiii  reason: default package */
/* loaded from: classes.dex */
public final class aiii implements airt {
    public final airw b;
    public final airr c;
    public final zah d;
    public final aafo e;
    public awgx f;
    public Runnable g;
    public boolean h;
    public boolean i;
    public final ofv l;
    private final acrr m;
    private final acti n;
    private final Handler o;
    public final aypf a = new aypf();
    public String j = "";
    public int k = -1;

    public aiii(Handler handler, airw airwVar, airr airrVar, zah zahVar, acrr acrrVar, acti actiVar, aafo aafoVar, ofv ofvVar) {
        this.o = handler;
        this.b = airwVar;
        this.c = airrVar;
        this.d = zahVar;
        this.m = acrrVar;
        this.n = actiVar;
        this.e = aafoVar;
        this.l = ofvVar;
    }

    public final void a() {
        Runnable runnable = this.g;
        if (runnable != null) {
            this.o.removeCallbacks(runnable);
            this.g = null;
        }
    }

    public final void b(awgu awguVar, awgw awgwVar) {
        awgs a = awgt.a();
        a.copyOnWrite();
        ((awgt) a.instance).r(awguVar);
        String k = this.n.k();
        a.copyOnWrite();
        ((awgt) a.instance).l(k);
        int i = awgwVar.d;
        a.copyOnWrite();
        ((awgt) a.instance).o(i);
        long j = awgwVar.c;
        a.copyOnWrite();
        ((awgt) a.instance).n(j);
        awgv b = awgv.b(awgwVar.g);
        if (b == null) {
            b = awgv.YOU_THERE_TRIGGER_REASON_UNKNOWN;
        }
        a.copyOnWrite();
        ((awgt) a.instance).q(b);
        long j2 = awgwVar.h;
        a.copyOnWrite();
        ((awgt) a.instance).m(j2);
        String str = this.j;
        if (str != null && !"".equals(str)) {
            String str2 = this.j;
            a.copyOnWrite();
            ((awgt) a.instance).k(str2);
        }
        if (this.k != -1 && (awguVar == awgu.YOU_THERE_EVENT_TYPE_PROMPT_SHOWN || awguVar == awgu.YOU_THERE_EVENT_TYPE_WARNING_PROMPT_SHOWN)) {
            int i2 = this.k;
            a.copyOnWrite();
            ((awgt) a.instance).p(i2);
        }
        arrf a2 = arrh.a();
        a2.copyOnWrite();
        ((arrh) a2.instance).ei((awgt) a.mo39build());
        this.m.c((arrh) a2.mo39build());
    }

    public final void c(final awgw awgwVar, final boolean z) {
        int i = awgwVar.b;
        if ((32768 & i) != 0) {
            long j = (i & 4) != 0 ? awgwVar.e : 0L;
            Runnable runnable = new Runnable() { // from class: aiie
                @Override // java.lang.Runnable
                public final void run() {
                    aiii aiiiVar = aiii.this;
                    boolean z2 = z;
                    awgw awgwVar2 = awgwVar;
                    aiiiVar.g = null;
                    if (z2) {
                        ofv ofvVar = aiiiVar.l;
                        ofvVar.a.m(ofvVar.b);
                    }
                    apzg apzgVar = awgwVar2.n;
                    if (apzgVar == null) {
                        apzgVar = apzg.a;
                    }
                    if (apzgVar.qn(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)) {
                        apzg apzgVar2 = awgwVar2.n;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aiiiVar.e.b(((CommandExecutorCommandOuterClass$CommandExecutorCommand) apzgVar2.qm(CommandExecutorCommandOuterClass$CommandExecutorCommand.commandExecutorCommand)).b);
                    }
                    aiiiVar.b(awgu.YOU_THERE_EVENT_TYPE_WARNING_PROMPT_SHOWN_IN_DIALOG, awgwVar2);
                    if (!z2) {
                        aiiiVar.i(awgwVar2);
                    }
                    aiiiVar.h(awgwVar2);
                }
            };
            this.g = runnable;
            this.o.postDelayed(runnable, j);
            return;
        }
        h(awgwVar);
    }

    public final void d(awgw awgwVar) {
        arag aragVar;
        f();
        a();
        akfg akfgVar = this.l.a;
        fvg d = fvl.d();
        d.e(true);
        d.i(-1);
        if ((awgwVar.b & 16384) != 0) {
            aragVar = awgwVar.m;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        d.k(ajgl.b(aragVar));
        akfgVar.n(d.b());
        b(awgu.YOU_THERE_EVENT_TYPE_USER_RESPONDED, awgwVar);
    }

    public final void e(awgw awgwVar) {
        this.c.a();
        b(awgu.YOU_THERE_EVENT_TYPE_PLAYBACK_PAUSED, awgwVar);
    }

    public final void f() {
        this.o.postDelayed(new Runnable() { // from class: aiic
            @Override // java.lang.Runnable
            public final void run() {
                aiii aiiiVar = aiii.this;
                if (!aiiiVar.c.d()) {
                    aiiiVar.c.b();
                }
            }
        }, 300L);
    }

    @Override // defpackage.airt
    public final aypg[] g(airw airwVar) {
        return new aypg[]{airwVar.G().a.h(aiwv.n(airwVar.aB(), 536870912L)).h(aiwv.l(1)).aa(new aiib(this), aiax.n), airwVar.G().d.h(aiwv.n(airwVar.aB(), 536870912L)).h(aiwv.l(1)).aa(new aiib(this, 2), aiax.n), airwVar.s().b.h(aiwv.n(airwVar.aB(), 536870912L)).h(aiwv.l(0)).aa(new aiib(this, 1), aiax.n)};
    }

    public final void h(final awgw awgwVar) {
        Runnable runnable = new Runnable() { // from class: aiid
            @Override // java.lang.Runnable
            public final void run() {
                arag aragVar;
                aiii aiiiVar = aiii.this;
                awgw awgwVar2 = awgwVar;
                arag aragVar2 = null;
                aiiiVar.g = null;
                if (!awgwVar2.o.isEmpty()) {
                    aiiiVar.e.b(awgwVar2.o);
                    aiiiVar.e(awgwVar2);
                    return;
                }
                ofv ofvVar = aiiiVar.l;
                aiig aiigVar = new aiig(aiiiVar, awgwVar2);
                aiia aiiaVar = new aiia(aiiiVar, awgwVar2);
                akfg akfgVar = ofvVar.a;
                fvg d = fvl.d();
                d.e(true);
                d.i(-2);
                if ((awgwVar2.b & 4096) != 0) {
                    aragVar = awgwVar2.l;
                    if (aragVar == null) {
                        aragVar = arag.a;
                    }
                } else {
                    aragVar = null;
                }
                d.k(ajgl.b(aragVar));
                apok apokVar = awgwVar2.k;
                if (apokVar == null) {
                    apokVar = apok.a;
                }
                apoj apojVar = apokVar.c;
                if (apojVar == null) {
                    apojVar = apoj.a;
                }
                if ((apojVar.b & 256) != 0) {
                    apok apokVar2 = awgwVar2.k;
                    if (apokVar2 == null) {
                        apokVar2 = apok.a;
                    }
                    apoj apojVar2 = apokVar2.c;
                    if (apojVar2 == null) {
                        apojVar2 = apoj.a;
                    }
                    aragVar2 = apojVar2.i;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                }
                d.m(ajgl.b(aragVar2), aiiaVar);
                d.b = aiigVar;
                akfgVar.n(d.b());
            }
        };
        this.g = runnable;
        this.o.postDelayed(runnable, awgwVar.f);
    }

    public final void i(awgw awgwVar) {
        this.d.addObserver(new aiih(this, awgwVar));
    }
}
