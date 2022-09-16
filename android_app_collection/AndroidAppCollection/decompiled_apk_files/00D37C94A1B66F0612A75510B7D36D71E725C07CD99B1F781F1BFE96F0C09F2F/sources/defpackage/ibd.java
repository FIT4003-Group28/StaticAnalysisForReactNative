package defpackage;

import com.google.android.apps.youtube.app.extensions.reel.watch.fragment.ReelSequenceController$PendingContinuation;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: ibd  reason: default package */
/* loaded from: classes3.dex */
public final class ibd {
    public final ihp a;
    public final iai b;
    public final azqb c;
    public final hyu d;
    public final snc e;
    public final Executor f;
    public final Object g = new Object();
    public ReelSequenceController$PendingContinuation h = new ReelSequenceController$PendingContinuation();
    public ReelSequenceController$PendingContinuation i = new ReelSequenceController$PendingContinuation();
    public final List j = new ArrayList();
    public boolean k;
    public boolean l;

    public ibd(ihp ihpVar, azqb azqbVar, hyu hyuVar, snc sncVar, Executor executor, iai iaiVar) {
        this.a = ihpVar;
        this.b = iaiVar;
        this.c = azqbVar;
        this.d = hyuVar;
        this.e = sncVar;
        this.f = executor;
    }

    public final void a(ReelSequenceController$PendingContinuation reelSequenceController$PendingContinuation, ihq ihqVar, int i) {
        synchronized (this.g) {
            if (!reelSequenceController$PendingContinuation.a) {
                reelSequenceController$PendingContinuation.a = true;
                long d = this.e.d();
                ihp ihpVar = this.a;
                ihpVar.c.e(ihqVar, new ibb(this, reelSequenceController$PendingContinuation, i, ihqVar, d));
            }
        }
    }

    public final void b() {
        String str;
        synchronized (this.g) {
            str = this.i.b;
        }
        if (amps.e(str)) {
            return;
        }
        ihq a = this.a.a();
        a.a = str;
        a(this.i, a, 2);
    }

    public final boolean d() {
        boolean a;
        synchronized (this.g) {
            a = this.h.a();
        }
        return a;
    }

    public final boolean c(ibc ibcVar) {
        synchronized (this.g) {
            if (!this.i.a && !this.h.a) {
                return false;
            }
            this.j.add(ibcVar);
            return true;
        }
    }
}
