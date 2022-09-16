package defpackage;

import java.util.Arrays;
import java.util.Set;
/* compiled from: PG */
/* renamed from: akjs  reason: default package */
/* loaded from: classes.dex */
public final class akjs {
    public avbl a = null;
    public avbp b;
    public Set c;
    public avbp d;
    public Set e;
    public avbp f;
    public Set g;
    public boolean h;
    private avbp[] i;
    private avbq[] j;

    public final CharSequence a() {
        avbl avblVar = this.a;
        if (avblVar != null) {
            apok apokVar = avblVar.i;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) == 0) {
                return null;
            }
            apok apokVar2 = this.a.i;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            arag aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            return ajgl.b(aragVar);
        }
        return null;
    }

    public final CharSequence b() {
        avbl avblVar = this.a;
        if (avblVar != null) {
            apok apokVar = avblVar.h;
            if (apokVar == null) {
                apokVar = apok.a;
            }
            if ((apokVar.b & 1) == 0) {
                return null;
            }
            apok apokVar2 = this.a.h;
            if (apokVar2 == null) {
                apokVar2 = apok.a;
            }
            apoj apojVar = apokVar2.c;
            if (apojVar == null) {
                apojVar = apoj.a;
            }
            arag aragVar = apojVar.i;
            if (aragVar == null) {
                aragVar = arag.a;
            }
            return ajgl.b(aragVar);
        }
        return null;
    }

    public final avbp[] c() {
        avbp avbpVar;
        if (this.i == null) {
            this.i = new avbp[this.a.c.size()];
            for (int i = 0; i < this.a.c.size(); i++) {
                avbm avbmVar = (avbm) this.a.c.get(i);
                if (avbmVar.b == 119719473) {
                    avbpVar = (avbp) avbmVar.c;
                } else {
                    avbpVar = avbp.a;
                }
                this.i[i] = avbpVar;
            }
        }
        return this.i;
    }

    public final avbq[] d() {
        avbq avbqVar;
        if (this.j == null) {
            this.j = new avbq[this.a.d.size()];
            for (int i = 0; i < this.a.d.size(); i++) {
                avbn avbnVar = (avbn) this.a.d.get(i);
                if (avbnVar.b == 94522740) {
                    avbqVar = (avbq) avbnVar.c;
                } else {
                    avbqVar = avbq.a;
                }
                this.j[i] = avbqVar;
            }
        }
        return this.j;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof akjs)) {
            return false;
        }
        akjs akjsVar = (akjs) obj;
        if (akzj.f(akjsVar.a, this.a) && akjsVar.e.equals(this.e) && akzj.f(akjsVar.d, this.d) && akzj.f(akjsVar.b, this.b) && akjsVar.c.equals(this.c) && akzj.f(akjsVar.f, this.f)) {
            Set set = akjsVar.g;
            if (set == null && this.g == null) {
                return true;
            }
            if (set == null) {
                this.g.getClass();
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(Arrays.hashCode(this.a.toByteArray())), Integer.valueOf(Arrays.hashCode(this.d.toByteArray())), this.e, this.c, Integer.valueOf(Arrays.hashCode(this.b.toByteArray())), Integer.valueOf(Arrays.hashCode(this.f.toByteArray())), this.g});
    }
}
