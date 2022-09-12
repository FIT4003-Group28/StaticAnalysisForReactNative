package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.lens.sdk.PendingIntentConsumer;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: cseg  reason: default package */
/* loaded from: classes5.dex */
public final class cseg implements cseh {
    public final csei a;
    public PendingIntentConsumer b;
    private final Queue<csef> c = new ArrayDeque();

    public cseg(Context context, csea cseaVar) {
        this.a = new cseq(context, this, cseaVar);
    }

    private final boolean g() {
        ckzp b = b();
        return (b.a & 2) != 0 && this.a.d() >= b.c;
    }

    public final boolean a(Bundle bundle) {
        cser.b();
        if (!this.a.e()) {
            return false;
        }
        ckyp ckypVar = (ckyp) ckyq.c.bZ();
        if (ckypVar.c) {
            ckypVar.bF();
            ckypVar.c = false;
        }
        ckyq ckyqVar = (ckyq) ckypVar.b;
        ckyqVar.b = 341;
        ckyqVar.a |= 1;
        try {
            this.a.c(((ckyq) ckypVar.bK()).bS(), new SystemParcelableWrapper(bundle));
            return true;
        } catch (RemoteException | SecurityException unused) {
            return false;
        }
    }

    public final ckzp b() {
        cser.b();
        cser.a(this.a.e(), "getServerFlags() called before ready.");
        if (!this.a.e()) {
            return ckzp.f;
        }
        csei cseiVar = this.a;
        cser.b();
        cseq cseqVar = (cseq) cseiVar;
        cser.a(cseqVar.i(), "Attempted to use ServerFlags before ready.");
        return cseqVar.f;
    }

    public final void c() {
        while (this.c.peek() != null) {
            this.c.remove().a(this.a.g());
        }
    }

    public final void d(csef csefVar) {
        cser.b();
        if (this.a.e() || this.a.f()) {
            csefVar.a(this.a.g());
            return;
        }
        this.c.add(csefVar);
        cseq cseqVar = (cseq) this.a;
        if (cseqVar.k() || cseqVar.j()) {
            return;
        }
        cseqVar.m();
    }

    public final int e() {
        cser.b();
        if (!this.a.e()) {
            return this.a.g();
        }
        if (!g()) {
            return 13;
        }
        ckzp b = b();
        return ((b.a & 8) == 0 || this.a.d() < b.e) ? 13 : 2;
    }

    public final int f() {
        cser.b();
        if (!this.a.e()) {
            return this.a.g();
        }
        return g() ? 2 : 13;
    }
}
