package defpackage;

import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.youtube.player.features.overlay.timebar.TimelineMarker;
import j$.time.Duration;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: aifm  reason: default package */
/* loaded from: classes.dex */
public final class aifm {
    public final aifs a;
    public final Handler b;
    public final aifj c;
    public boolean d;
    public boolean e;
    public boolean f;
    public final Runnable g = new Runnable() { // from class: aifk
        @Override // java.lang.Runnable
        public final void run() {
            aifm.this.b();
        }
    };
    public aifw h;
    private final acti i;
    private final aizn j;
    private final airr k;

    public aifm(azqb azqbVar, aifs aifsVar, Handler handler, aizn aiznVar, aifj aifjVar, airr airrVar) {
        this.i = (acti) azqbVar.get();
        this.a = aifsVar;
        this.b = handler;
        this.j = aiznVar;
        this.c = aifjVar;
        this.k = airrVar;
    }

    private static final auqn c(aifi aifiVar) {
        if (aifiVar.a) {
            return auqn.SEEK_SOURCE_DOUBLE_TAP_TO_SKIP_CHAPTER;
        }
        return auqn.SEEK_SOURCE_DOUBLE_TAP_TO_SEEK;
    }

    public final void a(MotionEvent motionEvent, View view, boolean z) {
        actj actjVar;
        aifi a;
        long j;
        Optional of;
        CharSequence b;
        Optional c;
        aifr aifrVar = new aifr(motionEvent, aifr.a(motionEvent, view.getWidth(), z), z);
        int i = aifrVar.b;
        if (i == 0 || this.h == null) {
            return;
        }
        if (!aifrVar.c) {
            actjVar = i == 1 ? actj.DOUBLE_TAP_TO_SEEK_FAST_FORWARD : actj.DOUBLE_TAP_TO_SEEK_REWIND;
        } else if (i == 1) {
            actjVar = actj.TWO_FINGERS_DOUBLE_TAP_TO_SEEK_FORWARD;
        } else {
            actjVar = actj.TWO_FINGERS_DOUBLE_TAP_TO_SEEK_REWIND;
        }
        aifj aifjVar = this.c;
        Duration a2 = this.a.a();
        if (!aifjVar.c || !aifrVar.c) {
            a = aifi.a(a2);
        } else {
            if (aifrVar.b == 1) {
                c = aifjVar.a.b(aicb.CHAPTER);
            } else {
                c = aifjVar.a.c(aicb.CHAPTER);
            }
            if (!c.isPresent()) {
                a = aifi.a(a2);
            } else {
                ajbf o = ((airr) aifjVar.b.get()).o();
                if (o == null) {
                    a = aifi.a(a2);
                } else {
                    a = new aifi(true, Duration.ofMillis(Math.abs(((TimelineMarker) c.get()).a - o.b())), Optional.ofNullable(((TimelineMarker) c.get()).e), true);
                }
            }
        }
        Duration duration = a.b;
        if (aifrVar.b == 1) {
            j = duration.toMillis();
        } else {
            j = -duration.toMillis();
        }
        acti actiVar = this.i;
        acte acteVar = new acte(actjVar);
        auqn c2 = c(a);
        if (!this.e) {
            of = Optional.empty();
        } else {
            int b2 = this.k.o() == null ? 0 : (int) this.k.o().b();
            long min = Math.min(this.k.h(), Math.max(0L, b2 + j));
            aopa createBuilder = asjt.a.createBuilder();
            createBuilder.copyOnWrite();
            asjt asjtVar = (asjt) createBuilder.instance;
            asjtVar.c = c2.n;
            asjtVar.b |= 1;
            createBuilder.copyOnWrite();
            asjt asjtVar2 = (asjt) createBuilder.instance;
            asjtVar2.b |= 2;
            asjtVar2.d = b2;
            createBuilder.copyOnWrite();
            asjt asjtVar3 = (asjt) createBuilder.instance;
            asjtVar3.b |= 4;
            asjtVar3.e = (int) min;
            asjt asjtVar4 = (asjt) createBuilder.mo39build();
            aopa createBuilder2 = asjj.a.createBuilder();
            createBuilder2.copyOnWrite();
            asjj asjjVar = (asjj) createBuilder2.instance;
            asjtVar4.getClass();
            asjjVar.G = asjtVar4;
            asjjVar.c |= 67108864;
            of = Optional.of((asjj) createBuilder2.mo39build());
        }
        actiVar.H(3, acteVar, (asjj) of.orElse(null));
        if (this.f) {
            this.j.h(j, c(a));
        } else {
            this.j.g(j);
        }
        this.a.c(aifrVar);
        this.b.removeCallbacks(this.g);
        this.b.postDelayed(this.g, 650L);
        this.d = true;
        if (!a.a || !a.c.isPresent()) {
            b = this.a.b();
        } else {
            b = (CharSequence) a.c.get();
        }
        this.h.e(b, aifrVar, a.d);
    }

    public final void b() {
        this.d = false;
        this.a.d();
    }
}
