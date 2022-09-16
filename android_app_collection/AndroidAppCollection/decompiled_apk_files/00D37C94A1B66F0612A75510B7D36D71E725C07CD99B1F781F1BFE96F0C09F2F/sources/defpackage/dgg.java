package defpackage;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
/* compiled from: PG */
/* renamed from: dgg  reason: default package */
/* loaded from: classes3.dex */
public final class dgg {
    public static dgg a;
    private final ArrayList b = new ArrayList();
    private final ArrayList c = new ArrayList();
    private final Map d = new HashMap();
    private boolean e = false;
    private final dgd f;

    public dgg(dgd dgdVar) {
        this.f = dgdVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(long j) {
        if (this.e) {
            this.c.clear();
            if (this.b.size() != 0) {
                dgy dgyVar = new dgy();
                agd agdVar = new agd();
                int size = this.b.size();
                for (int i = 0; i < size; i++) {
                    ArrayList arrayList = ((dgj) this.b.get(i)).c;
                    int size2 = arrayList.size();
                    for (int i2 = 0; i2 < size2; i2++) {
                        dgp dgpVar = (dgp) arrayList.get(i2);
                        ArrayList arrayList2 = dgpVar.b;
                        int size3 = arrayList2 == null ? 0 : arrayList2.size();
                        if (size3 == 0) {
                            dgyVar.add(dgpVar);
                        } else {
                            agdVar.put(dgpVar, Integer.valueOf(size3));
                        }
                    }
                }
                if (!agdVar.isEmpty() && dgyVar.isEmpty()) {
                    throw new dgh("Graph has nodes, but they represent a cycle with no leaf nodes!");
                }
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.addAll(dgyVar);
                while (!arrayDeque.isEmpty()) {
                    dgp dgpVar2 = (dgp) arrayDeque.pollFirst();
                    this.c.add(dgpVar2);
                    for (dgp dgpVar3 : dgpVar2.h()) {
                        int intValue = ((Integer) agdVar.get(dgpVar3)).intValue() - 1;
                        agdVar.put(dgpVar3, Integer.valueOf(intValue));
                        if (intValue == 0) {
                            arrayDeque.addLast(dgpVar3);
                        } else if (intValue < 0) {
                            throw new dgh("Detected cycle.");
                        }
                    }
                }
                if (this.c.size() != agdVar.j + dgyVar.size()) {
                    throw new dgh("Had unreachable nodes in graph -- this likely means there was a cycle");
                }
                Collections.reverse(this.c);
                this.e = false;
            }
        }
        int size4 = this.c.size();
        for (int i3 = 0; i3 < size4; i3++) {
            dgp dgpVar4 = (dgp) this.c.get(i3);
            float a2 = dgpVar4.a(j);
            if (j != dgpVar4.d) {
                dgpVar4.d = j;
                dgpVar4.c = a2;
            } else {
                throw new RuntimeException("Got a calculate value call multiple times in the same frame. This isn't expected.");
            }
        }
        int size5 = this.c.size();
        for (int i4 = 0; i4 < size5; i4++) {
            dgp dgpVar5 = (dgp) this.c.get(i4);
            dgf dgfVar = (dgf) this.d.get(dgpVar5);
            if (!dgfVar.a) {
                Iterator it = dgpVar5.h().iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!((dgf) this.d.get((dgp) it.next())).a) {
                            break;
                        }
                    } else if (!(dgpVar5 instanceof dgm) || ((dgm) dgpVar5).b()) {
                        dgfVar.a = true;
                    }
                }
            }
        }
        int size6 = this.b.size();
        while (true) {
            size6--;
            if (size6 >= 0) {
                dgj dgjVar = (dgj) this.b.get(size6);
                ArrayList arrayList3 = dgjVar.c;
                int size7 = arrayList3.size();
                int i5 = 0;
                while (true) {
                    if (i5 < size7) {
                        if (!((dgf) this.d.get(arrayList3.get(i5))).a) {
                            break;
                        }
                        i5++;
                    } else {
                        dfq dfqVar = dgjVar.f;
                        if (dfqVar != null) {
                            dfr dfrVar = dfqVar.a;
                            dfrVar.h();
                            dfrVar.d();
                        }
                        dgjVar.b();
                    }
                }
            }
        }
    }

    public final synchronized void b(dgj dgjVar) {
        if (!dgjVar.d) {
            String valueOf = String.valueOf(dgjVar);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 42);
            sb.append("Expected added GraphBinding to be active: ");
            sb.append(valueOf);
            throw new RuntimeException(sb.toString());
        }
        this.b.add(dgjVar);
        ArrayList arrayList = dgjVar.c;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            dgp dgpVar = (dgp) arrayList.get(i);
            dgf dgfVar = (dgf) this.d.get(dgpVar);
            if (dgfVar != null) {
                dgfVar.b++;
            } else {
                dgf dgfVar2 = new dgf();
                dgfVar2.b = 1;
                this.d.put(dgpVar, dgfVar2);
            }
        }
        if (this.b.size() == 1) {
            dgd dgdVar = this.f;
            if (dgdVar.c != null) {
                if (!dgdVar.d) {
                    dgdVar.d = true;
                    dgdVar.a();
                } else {
                    throw new RuntimeException("Tried to start but was already running.");
                }
            } else {
                throw new RuntimeException("Must set a binding graph first.");
            }
        }
        this.e = true;
    }

    public final synchronized void c(dgj dgjVar) {
        if (this.b.remove(dgjVar)) {
            ArrayList arrayList = dgjVar.c;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                dgp dgpVar = (dgp) arrayList.get(i);
                dgf dgfVar = (dgf) this.d.get(dgpVar);
                int i2 = dgfVar.b - 1;
                dgfVar.b = i2;
                if (i2 == 0) {
                    this.d.remove(dgpVar);
                }
            }
            if (this.b.isEmpty()) {
                dgd dgdVar = this.f;
                if (dgdVar.d) {
                    dgdVar.d = false;
                    dfw dfwVar = dgdVar.a;
                    dfv dfvVar = dgdVar.b;
                    dfvVar.a.set(null);
                    if (((dfy) dfwVar).c == null) {
                        ((dfy) dfwVar).b.removeCallbacks(dfvVar.b());
                    } else {
                        ((dfy) dfwVar).c.removeFrameCallback(dfvVar.a());
                    }
                    dgdVar.e = false;
                    this.c.clear();
                    if (!this.d.isEmpty()) {
                        throw new RuntimeException("Failed to clean up all nodes");
                    }
                } else {
                    throw new RuntimeException("Tried to stop but wasn't running.");
                }
            }
            this.e = true;
        } else {
            throw new RuntimeException("Tried to unregister non-existent binding");
        }
    }
}
