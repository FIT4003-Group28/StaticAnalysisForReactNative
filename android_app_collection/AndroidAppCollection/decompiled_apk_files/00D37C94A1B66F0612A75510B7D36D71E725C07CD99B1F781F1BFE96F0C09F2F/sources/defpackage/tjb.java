package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.apps.gsa.publicsearch.SystemParcelableWrapper;
import com.google.lens.sdk.PendingIntentConsumer;
import java.util.ArrayDeque;
import java.util.Queue;
/* compiled from: PG */
/* renamed from: tjb  reason: default package */
/* loaded from: classes4.dex */
public final class tjb implements tjc {
    public final tjd a;
    public PendingIntentConsumer b;
    private final Queue c = new ArrayDeque();

    public tjb(Context context, tiy tiyVar) {
        this.a = new tjj(context, this, tiyVar);
    }

    private final boolean g() {
        dwb a = a();
        return (a.b & 2) != 0 && this.a.b() >= a.d;
    }

    public final dwb a() {
        tjk.a();
        tjk.b(this.a.f(), "getServerFlags() called before ready.");
        if (!this.a.f()) {
            return dwb.a;
        }
        tjd tjdVar = this.a;
        tjk.a();
        tjj tjjVar = (tjj) tjdVar;
        tjk.b(tjjVar.l(), "Attempted to use ServerFlags before ready.");
        return tjjVar.f;
    }

    public final void b() {
        while (this.c.peek() != null) {
            ((tja) this.c.remove()).a(this.a.g());
        }
    }

    public final boolean c(Bundle bundle) {
        tjk.a();
        if (!this.a.f()) {
            return false;
        }
        aopc aopcVar = (aopc) dvv.a.createBuilder();
        aopcVar.copyOnWrite();
        dvv dvvVar = (dvv) aopcVar.instance;
        dvvVar.c = 341;
        dvvVar.b |= 1;
        try {
            this.a.c(((dvv) aopcVar.mo39build()).toByteArray(), new SystemParcelableWrapper(bundle));
            return true;
        } catch (RemoteException | SecurityException e) {
            Log.e("LensServiceBridge", "Failed to inject image.", e);
            return false;
        }
    }

    public final void d(tja tjaVar) {
        tjk.a();
        if (this.a.f() || this.a.e()) {
            tjaVar.a(this.a.g());
            return;
        }
        this.c.add(tjaVar);
        tjj tjjVar = (tjj) this.a;
        if (tjjVar.j() || tjjVar.k()) {
            return;
        }
        tjjVar.m();
    }

    public final int e() {
        tjk.a();
        if (!this.a.f()) {
            return this.a.g();
        }
        return g() ? 2 : 13;
    }

    public final int f() {
        tjk.a();
        if (!this.a.f()) {
            return this.a.g();
        }
        if (!g()) {
            return 13;
        }
        dwb a = a();
        return ((a.b & 8) == 0 || this.a.b() < a.f) ? 13 : 2;
    }
}
