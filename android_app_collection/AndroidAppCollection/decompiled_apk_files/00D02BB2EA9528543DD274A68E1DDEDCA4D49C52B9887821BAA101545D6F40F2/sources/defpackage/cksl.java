package defpackage;

import android.app.Application;
import java.util.concurrent.PriorityBlockingQueue;
/* compiled from: PG */
/* renamed from: cksl  reason: default package */
/* loaded from: classes4.dex */
public final class cksl implements ckst {
    private final Application a;
    private final cqat b;
    private final btrm c;
    private final btyh d;
    private final crep e;
    private final crox f;
    private final bvrb g;
    private final dehq h;
    private final Boolean i;
    private final buyi j;
    private final crdz k;
    private final cksv l;

    public cksl(Application application, cqat cqatVar, btrm btrmVar, btyh btyhVar, crep crepVar, crox croxVar, bvrb bvrbVar, buyi buyiVar, dehq dehqVar, crdz crdzVar, cksv cksvVar, Boolean bool) {
        this.a = application;
        this.b = cqatVar;
        this.c = btrmVar;
        this.d = btyhVar;
        this.e = crepVar;
        this.f = croxVar;
        this.g = bvrbVar;
        this.j = buyiVar;
        this.h = dehqVar;
        this.k = crdzVar;
        this.l = cksvVar;
        this.i = bool;
    }

    @dzsi
    private final ckrt b(@dzsi crdv crdvVar, cksn cksnVar) {
        if (this.i.booleanValue()) {
            return null;
        }
        cksk ckskVar = new cksk(this.a);
        crep crepVar = this.e;
        crox croxVar = this.f;
        ckrt ckrtVar = new ckrt(ckskVar, crdvVar, crepVar, cksnVar, croxVar);
        ckrtVar.a.a(new ckrq(ckrtVar), croxVar);
        return ckrtVar;
    }

    private final ckse c(crdv crdvVar, cksn cksnVar, btvo btvoVar) {
        Application application = this.a;
        bvrb bvrbVar = this.g;
        cksj cksjVar = new cksj(application, bvrbVar, this.b, btvoVar);
        crdz crdzVar = this.k;
        btrm btrmVar = this.c;
        crox croxVar = this.f;
        btyh btyhVar = this.d;
        buyi buyiVar = this.j;
        dehq dehqVar = this.h;
        PriorityBlockingQueue priorityBlockingQueue = new PriorityBlockingQueue();
        cksa cksaVar = new cksa(btvoVar, btrmVar, crdzVar);
        dceq a = dcet.a();
        a.b(amqo.class, new cksb(amqo.class, cksaVar));
        btrmVar.g(cksaVar, a.a());
        ckse ckseVar = new ckse(cksjVar, btvoVar, croxVar, priorityBlockingQueue, new cksd(priorityBlockingQueue, crdvVar, cksnVar, btvoVar, cksjVar, bvrbVar, croxVar, cksaVar, new ckrz(buyiVar, dehqVar, btvoVar, crdzVar), btyhVar, crdzVar), crdzVar);
        ckseVar.b = bvqm.a(application, bvrj.NETWORK_TTS_SYNTHESIS, bvrbVar);
        bvrbVar.b(ckseVar.a, bvrj.NETWORK_TTS_SYNTHESIS);
        return ckseVar;
    }

    @Override // defpackage.ckst
    public final ckss a(crdv crdvVar, btvo btvoVar) {
        ckse ckseVar;
        cksn cksnVar = new cksn(this.a.getDir("tts-temp", 0), this.b, this.g);
        cksnVar.c.getAbsolutePath();
        cksnVar.a.b(new cksm(cksnVar), bvrj.BACKGROUND_THREADPOOL);
        int a = dwkg.a(btvoVar.getTextToSpeechParameters().c);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        ckrt ckrtVar = null;
        if (i == 0) {
            ckrtVar = b(crdvVar, cksnVar);
            ckseVar = null;
        } else if (i == 1) {
            ckseVar = c(crdvVar, cksnVar, btvoVar);
        } else {
            ckrtVar = b(null, cksnVar);
            ckseVar = c(crdvVar, cksnVar, btvoVar);
        }
        return new ckso(ckrtVar, ckseVar);
    }
}
