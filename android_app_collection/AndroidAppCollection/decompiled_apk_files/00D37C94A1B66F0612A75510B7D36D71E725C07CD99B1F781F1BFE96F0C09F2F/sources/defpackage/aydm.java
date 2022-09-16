package defpackage;

import io.grpc.Status;
import java.net.InetSocketAddress;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Set;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: aydm  reason: default package */
/* loaded from: classes2.dex */
public final class aydm implements ayez {
    public final String a;
    public ayjs b;
    public final Object c = new Object();
    public final Set d = Collections.newSetFromMap(new IdentityHashMap());
    public final Executor e;
    public final int f;
    public final aymt g;
    public boolean h;
    public Status i;
    public boolean j;
    public final aydf k;
    private final axzs l;
    private final InetSocketAddress m;
    private final String n;
    private final axyb o;
    private boolean p;
    private boolean q;

    public aydm(aydf aydfVar, InetSocketAddress inetSocketAddress, String str, String str2, axyb axybVar, Executor executor, int i, aymt aymtVar) {
        inetSocketAddress.getClass();
        this.m = inetSocketAddress;
        this.l = axzs.a(getClass(), inetSocketAddress.toString());
        this.n = str;
        this.a = ayhf.i(str2);
        this.f = i;
        this.e = executor;
        this.k = aydfVar;
        this.g = aymtVar;
        axxz a = axyb.a();
        a.b(ayhb.a, aybo.PRIVACY_AND_INTEGRITY);
        a.b(ayhb.b, axybVar);
        this.o = a.a();
    }

    public final void a(aydj aydjVar, Status status) {
        synchronized (this.c) {
            if (this.d.remove(aydjVar)) {
                boolean z = true;
                if (status.getCode() != Status.Code.CANCELLED && status.getCode() != Status.Code.DEADLINE_EXCEEDED) {
                    z = false;
                }
                aydjVar.p.f(status, z, new ayat());
                b();
            }
        }
    }

    final void b() {
        synchronized (this.c) {
            if (!this.h || this.q || this.d.size() != 0) {
                return;
            }
            this.q = true;
            this.b.d();
        }
    }

    @Override // defpackage.axzw
    public final axzs c() {
        return this.l;
    }

    @Override // defpackage.ayjt
    public final Runnable d(ayjs ayjsVar) {
        this.b = ayjsVar;
        synchronized (this.c) {
            this.j = true;
        }
        return new aydk(this);
    }

    @Override // defpackage.ayjt
    public final void j(Status status) {
        synchronized (this.c) {
            if (this.h) {
                return;
            }
            synchronized (this.c) {
                if (this.p) {
                    return;
                }
                this.p = true;
                this.b.c(status);
                synchronized (this.c) {
                    this.h = true;
                    this.i = status;
                }
                b();
            }
        }
    }

    @Override // defpackage.ayjt
    public final void k(Status status) {
        ArrayList arrayList;
        j(status);
        synchronized (this.c) {
            arrayList = new ArrayList(this.d);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            ((aydj) arrayList.get(i)).c(status);
        }
        b();
    }

    @Override // defpackage.ayer
    public final /* bridge */ /* synthetic */ ayeo l(ayax ayaxVar, ayat ayatVar, axyd axydVar, azqj[] azqjVarArr) {
        ayaxVar.getClass();
        String str = ayaxVar.b;
        String concat = str.length() != 0 ? "/".concat(str) : new String("/");
        String str2 = this.n;
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 8 + String.valueOf(concat).length());
        sb.append("https://");
        sb.append(str2);
        sb.append(concat);
        return new aydl(this, sb.toString(), ayatVar, ayaxVar, aymk.m(azqjVarArr, this.o, ayatVar), axydVar).a;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.m);
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 2 + String.valueOf(valueOf).length());
        sb.append(obj);
        sb.append("(");
        sb.append(valueOf);
        sb.append(")");
        return sb.toString();
    }
}
