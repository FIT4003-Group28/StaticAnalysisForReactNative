package defpackage;

import android.content.Context;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.facebook.litho.ComponentTree;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: PG */
/* renamed from: cyr  reason: default package */
/* loaded from: classes3.dex */
public class cyr extends czb implements Cloneable, dbb, dan {
    public static final AtomicInteger h = new AtomicInteger(1);
    public static final dal[] i = new dal[0];
    private final String a;
    private boolean b;
    private SparseArray c;
    private SparseIntArray d;
    private Map e;
    List j;
    public int k;
    public String l;
    public String m;
    public String n;
    public boolean o;
    public AtomicBoolean p;
    public cyv q;
    public Context r;
    public cyo s;

    public cyr() {
        throw null;
    }

    public static boolean A(cyv cyvVar, cyr cyrVar) {
        dbq e;
        return x(cyrVar) || !(cyrVar == null || cyvVar == null || (e = cyvVar.e()) == null || !e.i.containsKey(Integer.valueOf(cyrVar.k)));
    }

    public static void B(tfp tfpVar, cyr cyrVar) {
        if (cyrVar.j == null) {
            cyrVar.j = new ArrayList();
        }
        cyrVar.j.add(new dey(tfpVar, cyrVar));
    }

    public static boolean v(cyr cyrVar) {
        return cyrVar instanceof dbe;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean w(cyr cyrVar) {
        return cyrVar != null && cyrVar.aj() == 1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean x(cyr cyrVar) {
        return w(cyrVar) && cyrVar.Z();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static boolean y(cyr cyrVar) {
        return (cyrVar == null || cyrVar.aj() == 1) ? false : true;
    }

    public static boolean z(cyr cyrVar) {
        return cyrVar != null && cyrVar.aj() == 3;
    }

    public final cyo C() {
        if (this.s == null) {
            this.s = new cyo();
        }
        return this.s;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public boolean d() {
        return false;
    }

    @Override // defpackage.dan
    /* renamed from: e */
    public boolean f(cyr cyrVar) {
        if (this == cyrVar) {
            return true;
        }
        if (cyrVar == null || getClass() != cyrVar.getClass()) {
            return false;
        }
        if (this.k != cyrVar.k) {
            return czu.b(this, cyrVar, true);
        }
        return true;
    }

    public SparseArray g() {
        return this.c;
    }

    public final SparseArray h() {
        if (this.c == null) {
            this.c = new SparseArray();
        }
        return this.c;
    }

    protected cyr i() {
        return null;
    }

    public cyr j() {
        try {
            cyr cyrVar = (cyr) super.clone();
            cyrVar.m = null;
            cyrVar.b = false;
            cyrVar.o = false;
            cyrVar.p = new AtomicBoolean();
            cyrVar.q = null;
            cyrVar.d = null;
            cyrVar.e = null;
            return cyrVar;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cyr k(cyv cyvVar) {
        cyr j = j();
        j.m = this.m;
        j.p(this);
        j.t(cyvVar);
        j.q.m = at(cyvVar, cyvVar.m);
        return j;
    }

    @Override // defpackage.dbb
    @Deprecated
    public final dap l() {
        return this;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ddl m() {
        return null;
    }

    public final String n() {
        if (this.n == null && !this.o) {
            this.n = Integer.toString(this.u);
        }
        return this.n;
    }

    public final String o() {
        cyr i2 = i();
        if (i2 == null) {
            return this.a;
        }
        String str = this.a;
        while (i2.i() != null) {
            i2 = i2.i();
        }
        String o = i2.o();
        StringBuilder sb = new StringBuilder(str.length() + 2 + String.valueOf(o).length());
        sb.append(str);
        sb.append("(");
        sb.append(o);
        sb.append(")");
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void p(cyr cyrVar) {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void q() {
        if (!this.b) {
            this.b = true;
        } else {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 33);
            sb.append("Duplicate layout of a component: ");
            sb.append(valueOf);
            throw new IllegalStateException(sb.toString());
        }
    }

    public final void r(cyv cyvVar, int i2, int i3, ddj ddjVar) {
        dbq e = cyvVar.e();
        if (e == null) {
            throw new IllegalStateException(String.valueOf(o()).concat(": Trying to measure a component outside of a LayoutState calculation. If that is what you must do, see Component#measureMightNotCacheInternalNode."));
        }
        dbk d = e.d(this);
        if (d == null || !czu.C(d.e(), i2, d.H()) || !czu.C(d.d(), i3, d.C())) {
            e.j(this);
            d = dbm.f(cyvVar, this, i2, i3, null, null, null);
            e.i.put(Integer.valueOf(this.k), d);
            if (w(this)) {
                d.kn(i2);
                d.kk(i3);
                d.km(d.H());
                d.kl(d.C());
            }
        }
        ddjVar.a = d.H();
        ddjVar.b = d.C();
    }

    public void s(dat datVar) {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t(cyv cyvVar) {
        ddl ddlVar;
        Object obj;
        ArrayList arrayList;
        List<ddk> list;
        if ((dfz.a || dfz.g) && this.m == null) {
            cyr cyrVar = cyvVar.f;
            String n = n();
            if (cyrVar != null) {
                String str = cyrVar.m;
                if (str != null) {
                    StringBuilder sb = new StringBuilder(str.length() + n.length() + 1);
                    sb.append(str);
                    sb.append(",");
                    sb.append(n);
                    String sb2 = sb.toString();
                    int i2 = 0;
                    if (!this.o) {
                        if (cyrVar.d == null) {
                            cyrVar.d = new SparseIntArray();
                        }
                        int i3 = this.u;
                        int i4 = cyrVar.d.get(i3, 0);
                        cyrVar.d.put(i3, i4 + 1);
                        n = hz.l(sb2, i4);
                    } else {
                        if (cyrVar.e == null) {
                            cyrVar.e = new HashMap();
                        }
                        int intValue = cyrVar.e.containsKey(sb2) ? ((Integer) cyrVar.e.get(sb2)).intValue() : 0;
                        cyrVar.e.put(sb2, Integer.valueOf(intValue + 1));
                        if (intValue != 0) {
                            String o = o();
                            StringBuilder sb3 = new StringBuilder(String.valueOf(n).length() + 158 + String.valueOf(o).length());
                            sb3.append("The manual key ");
                            sb3.append(n);
                            sb3.append(" you are setting on this ");
                            sb3.append(o);
                            sb3.append(" is a duplicate and will be changed into a unique one. This will result in unexpected behavior if you don't change it.");
                            czq.a(1, "Component:DuplicateManualKey", sb3.toString());
                            i2 = intValue;
                        }
                        n = hz.l(sb2, i2);
                    }
                } else {
                    String o2 = o();
                    String o3 = cyrVar.o();
                    StringBuilder sb4 = new StringBuilder(String.valueOf(o2).length() + 192 + String.valueOf(o3).length());
                    sb4.append("Trying to generate parent-based key for component ");
                    sb4.append(o2);
                    sb4.append(" , but parent ");
                    sb4.append(o3);
                    sb4.append(" has a null global key \". This is most likely a configuration mistake, check the value of ComponentsConfiguration.useGlobalKeys.");
                    czq.a(2, "Component:NullParentKey", sb4.toString());
                    String valueOf = String.valueOf(n);
                    n = valueOf.length() != 0 ? "null".concat(valueOf) : new String("null");
                }
            }
            this.m = n;
        }
        cyv d = cyv.d(cyvVar, this);
        this.q = d;
        au(d.m);
        if (ac()) {
            ddm ddmVar = cyvVar.d;
            ddmVar.l();
            ddmVar.j();
            if (ac()) {
                String str2 = this.m;
                synchronized (ddmVar) {
                    ddlVar = (ddl) ddmVar.e.get(str2);
                    ddmVar.f.add(str2);
                }
                if (ddlVar != null) {
                    X(ddlVar, m());
                } else {
                    cyv cyvVar2 = this.q;
                    ComponentTree componentTree = cyvVar2.j;
                    if (componentTree == null) {
                        M(cyvVar2);
                    } else {
                        dbi dbiVar = componentTree.d;
                        synchronized (dbiVar) {
                            obj = dbiVar.b.get(this.m);
                            if (obj == null) {
                                obj = new Object();
                                dbiVar.b.put(this.m, obj);
                            }
                        }
                        synchronized (obj) {
                            ddl ddlVar2 = (ddl) dbiVar.a.get(this.m);
                            if (ddlVar2 == null) {
                                M(this.q);
                                dbiVar.a.put(this.m, m());
                            } else {
                                X(ddlVar2, m());
                            }
                        }
                    }
                }
                synchronized (ddmVar) {
                    Map map = ddmVar.a;
                    arrayList = null;
                    list = map == null ? null : (List) map.get(str2);
                }
                if (list != null) {
                    ArrayList arrayList2 = null;
                    for (ddk ddkVar : list) {
                        ddl m = m();
                        m.a(ddkVar);
                        dee a = m instanceof cza ? ((cza) m).a() : null;
                        if (a != null) {
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList();
                            }
                            arrayList2.add(a);
                        }
                    }
                    dio.a.addAndGet(list.size());
                    synchronized (ddmVar) {
                        ddmVar.a.remove(str2);
                        Map map2 = ddmVar.b;
                        if (map2 != null) {
                            map2.remove(str2);
                        }
                        ddmVar.d.put(str2, list);
                    }
                    arrayList = arrayList2;
                }
                synchronized (ddmVar) {
                    ddmVar.e.put(str2, m());
                    if (arrayList != null && !arrayList.isEmpty()) {
                        ddmVar.k();
                        ddmVar.c.put(str2, arrayList);
                    }
                }
            }
        }
        AtomicBoolean atomicBoolean = this.p;
        if (atomicBoolean != null) {
            atomicBoolean.set(true);
        }
    }

    public boolean u() {
        return this.c != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public cyr(String str) {
        this.k = h.getAndIncrement();
        this.p = new AtomicBoolean();
        this.b = false;
        this.a = str;
    }
}
