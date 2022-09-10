package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: csci  reason: default package */
/* loaded from: classes5.dex */
public final class csci implements Iterable<csch> {
    public final csch b;
    public final csch c;
    public final csch d;
    public final csch e;
    public final csch f;
    public final csch g;
    public final cscj h;
    public final cscf i;
    public boolean j;
    public final List<csch> a = new ArrayList(6);
    public float k = 75.0f;
    public float l = 25.0f;

    public csci(csch cschVar, csch cschVar2, csch cschVar3, csch cschVar4, csch cschVar5, csch cschVar6, cscj cscjVar, cscf cscfVar) {
        this.b = cschVar;
        cschVar.a(12.0f, 3.1415927f, 1.0f, -12483341);
        this.c = cschVar2;
        cschVar2.a(4.0f, 3.1415927f, 1.0f, -1424587);
        this.d = cschVar3;
        cschVar3.a(4.0f, 0.0f, 1.0f, -279547);
        this.e = cschVar4;
        cschVar4.a(12.0f, 0.0f, 1.0f, -13326253);
        this.f = cschVar5;
        cschVar5.a(8.0f, 0.0f, 0.0f, -12483341);
        this.g = cschVar6;
        cschVar6.a(16.0f, 0.0f, 0.0f, -1424587);
        this.h = cscjVar;
        this.i = cscfVar;
        cscfVar.e(1.0f);
        b(false);
    }

    public final int a(csch cschVar) {
        if (cschVar == this.b) {
            return 0;
        }
        if (cschVar == this.c) {
            return 1;
        }
        if (cschVar == this.d) {
            return 2;
        }
        if (cschVar == this.e) {
            return this.j ? 4 : 3;
        } else if (cschVar == this.f && this.j) {
            return 3;
        } else {
            if (cschVar == this.g && this.j) {
                return 5;
            }
            throw new IllegalArgumentException("Unknown or unexpected dot");
        }
    }

    public final void b(boolean z) {
        if (this.a.isEmpty()) {
            this.a.add(this.e);
            this.a.add(this.d);
            this.a.add(this.c);
            this.a.add(this.b);
        }
        if (z != this.j) {
            if (z) {
                this.a.add(1, this.f);
                this.a.add(0, this.g);
            } else {
                this.a.remove(this.f);
                this.a.remove(this.g);
            }
        }
        this.j = z;
    }

    public final float c(csch cschVar) {
        if (cschVar == this.b) {
            return -16.0f;
        }
        if (cschVar == this.c) {
            return -7.85f;
        }
        if (cschVar == this.d) {
            return -2.55f;
        }
        if (cschVar == this.e) {
            return 11.5f;
        }
        if (cschVar == this.f) {
            return 6.7f;
        }
        if (cschVar != this.g) {
            throw new IllegalArgumentException("Unknown dot");
        }
        return 16.1f;
    }

    public final void d(float f) {
        cscj cscjVar = this.h;
        cscjVar.b.a(f);
        cscjVar.c = true;
    }

    public final float e() {
        return this.h.a();
    }

    public final void f() {
        cscj cscjVar = this.h;
        csce csceVar = cscjVar.a;
        float f = cscjVar.b.c;
        if (f != csceVar.d) {
            csceVar.d = f;
            csceVar.e = false;
        }
        csceVar.a(0.0f);
        cscjVar.b.e(0.0f);
        cscjVar.c = false;
    }

    public final void g() {
        Iterator<csch> it = iterator();
        while (it.hasNext()) {
            csch next = it.next();
            cscg cscgVar = next.a;
            cscgVar.e(cscgVar.b);
            csce csceVar = next.b;
            csceVar.e(csceVar.b);
            cscg cscgVar2 = next.c;
            cscgVar2.e(cscgVar2.b);
            cscg cscgVar3 = next.d;
            cscgVar3.e(cscgVar3.b);
            cscg cscgVar4 = next.e;
            cscgVar4.e(cscgVar4.b);
            cscf cscfVar = next.f;
            cscfVar.e(cscfVar.b);
            cscf cscfVar2 = next.h;
            cscfVar2.e(cscfVar2.b);
            cscf cscfVar3 = next.i;
            cscfVar3.e(cscfVar3.b);
            cscf cscfVar4 = next.g;
            cscfVar4.e(cscfVar4.b);
        }
        cscj cscjVar = this.h;
        cscf cscfVar5 = cscjVar.b;
        cscfVar5.e(cscfVar5.b);
        csce csceVar2 = cscjVar.a;
        csceVar2.e(csceVar2.b);
        cscf cscfVar6 = this.i;
        cscfVar6.e(cscfVar6.b);
    }

    public final void h(csch cschVar, float f) {
        csce csceVar = cschVar.b;
        float f2 = f - csceVar.b;
        csceVar.d(f2);
        Iterator<csch> it = iterator();
        while (it.hasNext()) {
            csch next = it.next();
            if (next != cschVar) {
                next.g(f2);
            }
        }
        this.h.b(-f2);
    }

    public final void i(float f) {
        this.i.a(f);
    }

    @Override // java.lang.Iterable
    public final Iterator<csch> iterator() {
        return this.a.iterator();
    }

    public final void j() {
        float a = (-0.3926991f) - this.h.a();
        this.h.b(a);
        Iterator<csch> it = iterator();
        while (it.hasNext()) {
            it.next().g(-a);
        }
    }
}
