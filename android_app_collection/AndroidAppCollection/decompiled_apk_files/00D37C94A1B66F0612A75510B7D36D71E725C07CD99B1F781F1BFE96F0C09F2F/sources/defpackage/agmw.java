package defpackage;

import android.net.Uri;
import android.util.SparseArray;
import com.google.android.libraries.youtube.innertube.model.media.FormatStreamModel;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: agmw  reason: default package */
/* loaded from: classes.dex */
public final class agmw implements agml {
    final SparseArray a;
    final /* synthetic */ agmz b;
    private String c;
    private boolean d;
    private agqm e;

    public agmw(agmz agmzVar, agql agqlVar, agql agqlVar2) {
        this.b = agmzVar;
        SparseArray sparseArray = new SparseArray();
        this.a = sparseArray;
        aqxo.q((agqlVar == null && agqlVar2 == null) ? false : true, "One stream pair cannot hold a pair of null streams");
        if (agqlVar != null) {
            sparseArray.put(agqlVar.a(), agqlVar);
            this.c = agqlVar.g();
        }
        if (agqlVar2 != null) {
            sparseArray.put(agqlVar2.a(), agqlVar2);
            this.c = agqlVar2.g();
        }
        this.d = true;
    }

    private final void i() {
        this.e = null;
    }

    private final void j(String str) {
        agmx agmxVar = (agmx) this.b.b.get(str);
        if (agmxVar != null) {
            agmxVar.g();
        }
    }

    @Override // defpackage.agml
    public final agql a() {
        for (int i = 0; i < this.a.size(); i++) {
            agql agqlVar = (agql) this.a.valueAt(i);
            if (agqlVar.c) {
                return agqlVar;
            }
        }
        return null;
    }

    @Override // defpackage.agml
    public final agql b(int i) {
        return (agql) this.a.get(i);
    }

    @Override // defpackage.agml
    public final agql c() {
        for (int i = 0; i < this.a.size(); i++) {
            agql agqlVar = (agql) this.a.valueAt(i);
            if (!agqlVar.c) {
                return agqlVar;
            }
        }
        return null;
    }

    @Override // defpackage.agml
    public final agqm d() {
        synchronized (this.b.k) {
            if (this.e == null) {
                agql c = c();
                agql a = a();
                if (c == null && a == null) {
                    return null;
                }
                this.e = new agqm(c, a, this.d);
            }
            return this.e;
        }
    }

    @Override // defpackage.agml
    public final void e(int i) {
        synchronized (this.b.k) {
            if (this.a.get(i) != null) {
                i();
                j(this.c);
            }
            this.a.remove(i);
        }
    }

    @Override // defpackage.agml
    public final void f(boolean z) {
        synchronized (this.b.k) {
            this.d = z;
            i();
            j(this.c);
        }
    }

    @Override // defpackage.agml
    public final void g(agql agqlVar) {
        synchronized (this.b.k) {
            this.a.put(agqlVar.a(), agqlVar);
            i();
            j(this.c);
        }
    }

    @Override // defpackage.agml
    public final agqm h(agke agkeVar) {
        Object obj;
        agqm d;
        agmw agmwVar = this;
        Object obj2 = agmwVar.b.k;
        synchronized (obj2) {
            try {
                try {
                    if (agkeVar != null) {
                        int i = 0;
                        agql agqlVar = null;
                        agql agqlVar2 = null;
                        while (i < agmwVar.a.size()) {
                            try {
                                agql agqlVar3 = (agql) agmwVar.a.valueAt(i);
                                aopc aopcVar = (aopc) agqlVar3.b.a.mo52toBuilder();
                                agql agqlVar4 = agqlVar;
                                obj = obj2;
                                try {
                                    Uri a = aguc.a(agkeVar.a, agqlVar3.g(), agqlVar3.a(), ((aqzx) aopcVar.instance).q, agqlVar3.b(), ((aqzx) aopcVar.instance).o, agkeVar.b);
                                    String uri = a == null ? "" : a.toString();
                                    aopcVar.copyOnWrite();
                                    aqzx aqzxVar = (aqzx) aopcVar.instance;
                                    uri.getClass();
                                    aqzxVar.c |= 2;
                                    aqzxVar.e = uri;
                                    agqk d2 = agqlVar3.d();
                                    d2.d(new FormatStreamModel((aqzx) aopcVar.mo39build(), agqlVar3.g(), agqlVar3.b.c));
                                    agql a2 = d2.a();
                                    if (a2.c && !a2.b.M()) {
                                        agqlVar2 = a2;
                                        agqlVar = agqlVar4;
                                        i++;
                                        agmwVar = this;
                                        obj2 = obj;
                                    }
                                    agqlVar = a2;
                                    i++;
                                    agmwVar = this;
                                    obj2 = obj;
                                } catch (Throwable th) {
                                    th = th;
                                    throw th;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                obj = obj2;
                            }
                        }
                        Object obj3 = obj2;
                        agql agqlVar5 = agqlVar;
                        if (agqlVar5 != null || agqlVar2 != null) {
                            agqm agqmVar = new agqm(agqlVar5, agqlVar2, this.d);
                            return agqmVar;
                        }
                        return null;
                    }
                    d = d();
                } catch (Throwable th3) {
                    th = th3;
                    obj = obj2;
                }
            } catch (Throwable th4) {
                th = th4;
            }
        }
        return d;
    }
}
