package defpackage;

import android.os.SystemClock;
import com.google.android.libraries.onegoogle.accountmenu.gmshead.GmsheadAccountsModelUpdater;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: cwfv  reason: default package */
/* loaded from: classes.dex */
public final class cwfv implements degu<dcdc<cwfm>> {
    final /* synthetic */ GmsheadAccountsModelUpdater a;

    public cwfv(GmsheadAccountsModelUpdater gmsheadAccountsModelUpdater) {
        this.a = gmsheadAccountsModelUpdater;
    }

    @Override // defpackage.degu
    public final void a(Throwable th) {
    }

    @Override // defpackage.degu
    public final /* bridge */ /* synthetic */ void b(dcdc<cwfm> dcdcVar) {
        final dcdc<cwfm> dcdcVar2 = dcdcVar;
        this.a.d.post(new Runnable(this, dcdcVar2) { // from class: cwfu
            private final cwfv a;
            private final dcdc b;

            {
                this.a = this;
                this.b = dcdcVar2;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                boolean m;
                boolean z;
                dcdc f;
                Object obj;
                cvui cvuiVar;
                String b;
                String b2;
                cvuj cvujVar;
                CharSequence b3;
                CharSequence a;
                String h;
                cwfv cwfvVar = this.a;
                dcdc<cwfm> dcdcVar3 = this.b;
                GmsheadAccountsModelUpdater gmsheadAccountsModelUpdater = cwfvVar.a;
                cvzg<cwfm> cvzgVar = gmsheadAccountsModelUpdater.b;
                gmsheadAccountsModelUpdater.c.a(dcdcVar3);
                dcdc r = dcdc.r(dcdcVar3);
                cvzgVar.c();
                r.size();
                dccx dccxVar = new dccx();
                for (Object obj2 : r) {
                    if (obj2 != null) {
                        b3 = ((cwfm) obj2).b();
                        String h2 = cvui.h(b3);
                        a = ((cwfm) obj2).a();
                        String h3 = cvui.h(a);
                        cwfm cwfmVar = (cwfm) obj2;
                        String c = cwfmVar.c();
                        String d = cwfmVar.d();
                        h = ((cwfm) obj2).h();
                        cvujVar = new cvuj(obj2, h2, h3, c, d, h, cwfn.e(obj2));
                    } else {
                        cvujVar = null;
                    }
                    dccxVar.g(cvujVar);
                }
                dcdc<cvui<T>> f2 = dccxVar.f();
                synchronized (cvzgVar.d) {
                    m = dchl.m(cvzgVar.e, f2);
                }
                if (m) {
                    cvzgVar.a();
                    return;
                }
                HashMap hashMap = new HashMap();
                int size = f2.size();
                for (int i = 0; i < size; i++) {
                    cvui cvuiVar2 = (cvui) f2.get(i);
                    b2 = ((cwfm) cvuiVar2.a()).b();
                    hashMap.put(b2, cvuiVar2);
                }
                int size2 = cvzgVar.g.size() - 1;
                boolean z2 = false;
                while (true) {
                    z = true;
                    if (size2 < 0) {
                        break;
                    }
                    cvui cvuiVar3 = (cvui) cvzgVar.g.get(size2);
                    b = ((cwfm) cvuiVar3.a()).b();
                    cvui cvuiVar4 = (cvui) hashMap.get(b);
                    if (cvuiVar4 != null) {
                        cvzgVar.g.set(size2, cvuiVar4);
                    } else if (size2 != 0) {
                        cvzgVar.g.remove(size2);
                    } else {
                        cvzgVar.g.clear();
                    }
                    z2 |= true ^ cvuiVar3.equals(cvuiVar4);
                    size2--;
                }
                synchronized (cvzgVar.d) {
                    dccx dccxVar2 = new dccx();
                    synchronized (cvzgVar.d) {
                        dcpe listIterator = cvzgVar.e.listIterator();
                        while (listIterator.hasNext()) {
                            dccxVar2.g(((cvui) listIterator.next()).a());
                        }
                    }
                    f = dccxVar2.f();
                    Map<String, cvui<T>> map = cvzgVar.f;
                    cvxi cvxiVar = cvxi.c;
                    if (!cvxiVar.a) {
                        if (cvxiVar.b != -1) {
                            if (SystemClock.elapsedRealtime() - cvxiVar.b >= 5000) {
                            }
                        }
                        obj = null;
                        cvuiVar = (cvui) obj;
                        cvzgVar.e = f2;
                        cvzgVar.f.clear();
                        cvzgVar.f.putAll(hashMap);
                    }
                    if (hashMap.size() == map.size() + 1) {
                        HashMap hashMap2 = new HashMap(hashMap);
                        hashMap2.keySet().removeAll(map.keySet());
                        if (hashMap2.size() == 1) {
                            obj = dcft.c(hashMap2.values());
                            cvuiVar = (cvui) obj;
                            cvzgVar.e = f2;
                            cvzgVar.f.clear();
                            cvzgVar.f.putAll(hashMap);
                        }
                    }
                    obj = null;
                    cvuiVar = (cvui) obj;
                    cvzgVar.e = f2;
                    cvzgVar.f.clear();
                    cvzgVar.f.putAll(hashMap);
                }
                if (cvuiVar != null) {
                    z = false;
                }
                boolean z3 = z & z2;
                cvzgVar.a();
                Iterator it = cvzgVar.c.iterator();
                while (it.hasNext()) {
                    cvzf cvzfVar = (cvzf) it.next();
                    new ArrayList(f);
                    cvzgVar.l();
                    cvzfVar.f();
                    if (z3) {
                        cvzfVar.a(cvzgVar.e(), cvzgVar.f(), cvzgVar.g());
                    }
                }
                Iterator it2 = cvzgVar.b.iterator();
                while (it2.hasNext()) {
                    cvxj cvxjVar = (cvxj) it2.next();
                    cvxjVar.c(r);
                    if (z3) {
                        cvxjVar.a(cvzgVar.e());
                    }
                }
                if (cvuiVar == null) {
                    return;
                }
                cvzgVar.b(cvuiVar.a());
                cvxi cvxiVar2 = cvxi.c;
                cvxiVar2.b = -1L;
                cvxiVar2.a = false;
            }
        });
    }
}
