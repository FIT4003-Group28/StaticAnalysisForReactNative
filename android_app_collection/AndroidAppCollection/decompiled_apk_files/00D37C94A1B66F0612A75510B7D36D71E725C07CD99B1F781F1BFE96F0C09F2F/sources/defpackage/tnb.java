package defpackage;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
/* compiled from: PG */
/* renamed from: tnb  reason: default package */
/* loaded from: classes4.dex */
public final class tnb {
    public final Set a = new LinkedHashSet();
    public final Set b = new LinkedHashSet();
    private final Map h = new HashMap();
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    public final Map e = new HashMap();
    public Collection f = null;
    public final boolean g = true;

    public tnb() {
        amyg amygVar = amyg.a;
    }

    private final tna e(tmb tmbVar) {
        tna tnaVar = new tna(this.c.size(), this.a.size());
        tmh b = tnaVar.b(tmbVar, -1);
        ArrayList arrayList = new ArrayList(1);
        tnk.f(tmbVar, arrayList);
        angf angfVar = b.d;
        if (angfVar == null) {
            angfVar = angf.a;
        }
        tnaVar.e(new tnh(1, arrayList, angfVar.c));
        this.c.add(tnaVar);
        this.h.put(b, tnaVar);
        return tnaVar;
    }

    public final tna a(List list, int i) {
        tmh tmhVar = (tmh) arey.s(list);
        tna tnaVar = (tna) this.h.get(tmhVar);
        if (tnaVar == null) {
            tna tnaVar2 = new tna(this.c.size(), i);
            this.c.add(tnaVar2);
            this.h.put(tmhVar, tnaVar2);
            return tnaVar2;
        }
        return tnaVar;
    }

    public final tna b(tmb tmbVar) {
        int i = tmbVar.c;
        if (i != -1) {
            if (i != -2) {
                return (tna) this.c.get(i);
            }
            return null;
        }
        aqxo.y(tmbVar.b());
        this.d.add(tmbVar);
        tms tmsVar = tmbVar.b;
        if (!tmsVar.d()) {
            tmb b = ((tml) tmsVar).b();
            if (b == null) {
                if (!tmbVar.a().qn(too.a)) {
                    tms tmsVar2 = tmbVar.b;
                    View view = tmsVar2 instanceof tml ? ((tml) tmsVar2).a : null;
                    while (true) {
                        if (view != null) {
                            if (!tml.e(view)) {
                                ViewParent parent = view.getParent();
                                if (!(parent instanceof View)) {
                                    break;
                                }
                                view = (View) parent;
                            } else {
                                String valueOf = String.valueOf(tmbVar);
                                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 180);
                                sb.append("Unexpected visual element (");
                                sb.append(valueOf);
                                sb.append(") without parent detected. All visual elements except the root view must have a parent visual element. See also: go/gil-android/impressions#requirements.");
                                Log.e("GIL", sb.toString());
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                    tmbVar.c = -2;
                    return null;
                }
                return e(tmbVar);
            } else if (b.c != -1 || !b.c()) {
                tna b2 = b(b);
                if (b2 == null) {
                    return null;
                }
                angf angfVar = ((tmh) b.f.instance).d;
                if (angfVar == null) {
                    angfVar = angf.a;
                }
                b2.b(tmbVar, angfVar.c);
                return b2;
            } else {
                ArrayList arrayList = new ArrayList();
                arrayList.add(null);
                tnk.f(b, arrayList);
                aqxo.y(arrayList.size() > 1);
                tna a = a(arrayList, this.a.size());
                tmh b3 = a.b(tmbVar, -1);
                arrayList.set(0, b3);
                angf angfVar2 = b3.d;
                if (angfVar2 == null) {
                    angfVar2 = angf.a;
                }
                a.e(new tnh(1, arrayList, angfVar2.c));
                return a;
            }
        }
        return e(tmbVar);
    }

    public final List c() {
        amlp l = amna.l("GIL:LogBatch");
        try {
            ArrayList arrayList = new ArrayList(this.c.size());
            for (tna tnaVar : this.c) {
                arrayList.add(tnaVar.c());
            }
            this.c.clear();
            this.h.clear();
            l.close();
            return arrayList;
        } catch (Throwable th) {
            try {
                l.close();
            } catch (Throwable unused) {
            }
            throw th;
        }
    }

    public final boolean d(tmb tmbVar, int i) {
        if (!this.a.contains(tmbVar)) {
            int f = anhg.f(((tmh) tmbVar.f.instance).e);
            if (f == 0) {
                f = 1;
            }
            if (f == i) {
                this.b.remove(tmbVar);
                return false;
            }
            this.b.add(tmbVar);
            return true;
        }
        return false;
    }
}
