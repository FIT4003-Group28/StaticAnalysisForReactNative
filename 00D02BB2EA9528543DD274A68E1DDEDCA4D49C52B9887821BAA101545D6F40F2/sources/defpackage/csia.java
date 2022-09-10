package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collection;
/* compiled from: PG */
/* renamed from: csia  reason: default package */
/* loaded from: classes5.dex */
final class csia implements cshr<csgt> {
    final /* synthetic */ csib a;

    public csia(csib csibVar) {
        this.a = csibVar;
    }

    @Override // defpackage.cshr
    public final /* bridge */ /* synthetic */ void a(csgt csgtVar) {
        csgt csgtVar2 = csgtVar;
        csha cshaVar = csgtVar2.a;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        if (cshaVar.c) {
            cshaVar.bF();
            cshaVar.c = false;
        }
        cshb cshbVar = (cshb) cshaVar.b;
        cshb cshbVar2 = cshb.f;
        cshbVar.a |= 4;
        cshbVar.e = elapsedRealtime;
        csie csieVar = this.a.b;
        csht<csgt> cshtVar = csgtVar2.c;
        csha cshaVar2 = csgtVar2.a;
        ddxx ddxxVar = ((cshb) cshaVar2.b).c;
        if (ddxxVar == null) {
            ddxxVar = ddxx.j;
        }
        if ((ddxxVar.a & 2048) != 0) {
            ddhj h = ((cshd) cshtVar).h();
            ddhj b = ddhj.b(((cshb) cshaVar2.b).d);
            if (b == null) {
                b = ddhj.VISIBILITY_VISIBLE;
            }
            if (b == h) {
                return;
            }
            int i = ((cshb) cshaVar2.b).d;
            if (!csieVar.d(csgtVar2, h)) {
                return;
            }
        } else {
            if (cshtVar instanceof cshd) {
                if (!csgtVar2.a.g(cskj.a)) {
                    ((cshd) cshtVar).j(false);
                } else if (!cshtVar.c()) {
                    ((cshd) cshtVar).j(true);
                }
            }
            csieVar.a.add(csgtVar);
        }
        this.a.a();
    }

    @Override // defpackage.cshr
    public final /* bridge */ /* synthetic */ void b(csgt csgtVar) {
        csgt csgtVar2 = csgtVar;
        csha cshaVar = csgtVar2.a;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        if (cshaVar.c) {
            cshaVar.bF();
            cshaVar.c = false;
        }
        cshb cshbVar = (cshb) cshaVar.b;
        cshb cshbVar2 = cshb.f;
        cshbVar.a |= 4;
        cshbVar.e = elapsedRealtime;
        csie csieVar = this.a.b;
        boolean z = csieVar.g;
        Collection<cshb> remove = csieVar.e.remove(csgtVar);
        if (remove != null) {
            remove.clear();
            csieVar.f = remove;
        }
        if (csgtVar2.e()) {
            csgt i = csgtVar2.c.i();
            if (csgtVar2.c.c() || (i != null && i.e())) {
                Collection<cshb> collection = csieVar.e.get(i);
                if (collection != null) {
                    collection.add(csgtVar2.b());
                } else {
                    Collection<cshb> collection2 = csieVar.f;
                    if (collection2 != null) {
                        csieVar.f = null;
                    } else {
                        collection2 = new ArrayList<>();
                    }
                    collection2.add(csgtVar2.b());
                    csieVar.e.put(i, collection2);
                }
            }
        }
        csieVar.a.remove(csgtVar);
        csieVar.b.remove(csgtVar);
        csgtVar2.g();
        if (!csieVar.e.isEmpty()) {
            this.a.a();
        }
    }

    @Override // defpackage.cshr
    public final /* bridge */ /* synthetic */ void c(csgt csgtVar) {
        czhz.b();
        csib csibVar = this.a;
        if (csibVar.e != null) {
            if (csibVar.d <= 0 && !csgtVar.c.c()) {
                return;
            }
            czhz.d().removeCallbacks(this.a.e);
            this.a.b();
        }
    }

    @Override // defpackage.cshr
    public final /* bridge */ /* synthetic */ void d() {
        czhz.b();
    }

    @Override // defpackage.cshr
    public final /* bridge */ /* synthetic */ void e(csgt csgtVar, ddhj ddhjVar) {
        csgt csgtVar2 = csgtVar;
        csha cshaVar = csgtVar2.a;
        long elapsedRealtime = SystemClock.elapsedRealtime() * 1000;
        if (cshaVar.c) {
            cshaVar.bF();
            cshaVar.c = false;
        }
        cshb cshbVar = (cshb) cshaVar.b;
        cshb cshbVar2 = cshb.f;
        cshbVar.a |= 4;
        cshbVar.e = elapsedRealtime;
        if (this.a.b.d(csgtVar2, ddhjVar)) {
            this.a.a();
        }
    }
}
