package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahbb  reason: default package */
/* loaded from: classes2.dex */
public class ahbb implements agyt {
    public final List<cqix<?>> a;
    public List<agys> b;
    public final dehq c;
    public boolean d = false;
    @dzsi
    public final ahfa e;
    private final View.OnAttachStateChangeListener f;
    private final cjtd g;
    private final boolean h;
    @dzsi
    private final CharSequence i;
    @dzsi
    private final jic j;
    private final cjtd k;
    @dzsi
    private final jmp l;
    private final jmo m;
    @dzsi
    private final ahdv n;

    public ahbb(gga ggaVar, huc hucVar, bvpe bvpeVar, dehq dehqVar, cpv cpvVar, List list, cjtd cjtdVar, CharSequence charSequence, ahdv ahdvVar, jic jicVar, cjtd cjtdVar2, ahfa ahfaVar, boolean z) {
        boolean z2 = false;
        ahay ahayVar = new ahay(this);
        this.m = ahayVar;
        this.a = new ArrayList(list);
        this.b = new ArrayList(dchl.k(list, ahau.a));
        this.g = cjtdVar;
        this.f = new bvob(bvpeVar.b, hucVar.a(new htz(this) { // from class: ahav
            private final ahbb a;

            {
                this.a = this;
            }

            @Override // defpackage.htz
            public final cjtd a() {
                return this.a.c();
            }

            @Override // defpackage.htz
            public final cjql b() {
                return null;
            }
        }));
        this.c = dehqVar;
        this.e = ahfaVar;
        this.n = ahdvVar;
        this.k = cjtdVar2;
        this.i = charSequence;
        jmp jmpVar = null;
        this.j = null;
        this.h = z;
        if (ahdvVar == null || (!cjtd.b.equals(cjtdVar2) && cjtdVar2.g != null)) {
            z2 = true;
        }
        dbsk.a(z2);
        if (!cpvVar.e(ggaVar)) {
            this.l = ahfaVar != null ? jmq.a(ahayVar) : jmpVar;
        } else {
            this.l = null;
        }
    }

    @Override // defpackage.agyt
    public List<cqix<?>> a() {
        return dcdc.r(this.a);
    }

    @Override // defpackage.agyt
    public List<agys> b() {
        return dcdc.r(this.b);
    }

    @Override // defpackage.agyt
    public cjtd c() {
        return this.g;
    }

    @Override // defpackage.agyt
    public Boolean d() {
        boolean z = true;
        if (this.h || this.a.size() != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.agyt
    public Boolean e() {
        return Boolean.valueOf(this.n != null);
    }

    @Override // defpackage.agyt
    @dzsi
    public CharSequence f() {
        return this.i;
    }

    @Override // defpackage.agyt
    public cqkl g() {
        ahdv ahdvVar = this.n;
        if (ahdvVar != null) {
            ahdvVar.a();
        }
        return cqkl.a;
    }

    @Override // defpackage.agyt
    @dzsi
    public jic h() {
        return null;
    }

    @Override // defpackage.agyt
    public cjtd i() {
        return this.k;
    }

    @Override // defpackage.agyt
    public View.OnAttachStateChangeListener j() {
        return this.f;
    }

    @Override // defpackage.agyt
    @dzsi
    public cqqw k() {
        return this.l;
    }

    @Override // defpackage.agyt
    public Boolean l() {
        return Boolean.valueOf(this.d);
    }

    public boolean m(cqkp cqkpVar, dbsg<cqjg> dbsgVar) {
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= this.a.size()) {
                i2 = -1;
                break;
            } else if (this.a.get(i2).b().equals(cqkpVar)) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 < 0) {
            return false;
        }
        cqix<?> cqixVar = this.a.get(i2);
        ArrayList arrayList = new ArrayList();
        if (i2 < this.a.size() - 1) {
            arrayList.add(this.a.get(i2 + 1));
        }
        if (i2 > 0) {
            arrayList.add(this.a.get(i2 - 1));
        }
        this.a.remove(cqixVar);
        this.b.remove(new ahba(cqixVar));
        int size = arrayList.size();
        while (true) {
            if (i >= size) {
                break;
            }
            View o = cqkx.o(((cqix) arrayList.get(i)).b());
            i++;
            if (o != null) {
                View a = cqhu.a(o, (cqjg) ((dbsu) dbsgVar).a);
                dbsk.s(a);
                a.sendAccessibilityEvent(8);
                break;
            }
        }
        return true;
    }
}
