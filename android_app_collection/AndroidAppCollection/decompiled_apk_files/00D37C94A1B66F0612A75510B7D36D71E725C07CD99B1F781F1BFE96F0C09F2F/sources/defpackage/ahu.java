package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: ahu  reason: default package */
/* loaded from: classes.dex */
public class ahu implements ahs {
    final aid d;
    int e;
    public int f;
    public ahs a = null;
    public boolean b = false;
    public boolean c = false;
    int l = 1;
    int g = 1;
    ahv h = null;
    public boolean i = false;
    final List j = new ArrayList();
    final List k = new ArrayList();

    public ahu(aid aidVar) {
        this.d = aidVar;
    }

    public final void a(ahs ahsVar) {
        this.j.add(ahsVar);
        if (this.i) {
            ahsVar.f();
        }
    }

    public final void b() {
        this.k.clear();
        this.j.clear();
        this.i = false;
        this.f = 0;
        this.c = false;
        this.b = false;
    }

    public void c(int i) {
        if (this.i) {
            return;
        }
        this.i = true;
        this.f = i;
        for (ahs ahsVar : this.j) {
            ahsVar.f();
        }
    }

    @Override // defpackage.ahs
    public final void f() {
        for (ahu ahuVar : this.k) {
            if (!ahuVar.i) {
                return;
            }
        }
        this.c = true;
        ahs ahsVar = this.a;
        if (ahsVar != null) {
            ahsVar.f();
        }
        if (this.b) {
            this.d.f();
            return;
        }
        ahu ahuVar2 = null;
        int i = 0;
        for (ahu ahuVar3 : this.k) {
            if (!(ahuVar3 instanceof ahv)) {
                i++;
                ahuVar2 = ahuVar3;
            }
        }
        if (ahuVar2 != null && i == 1 && ahuVar2.i) {
            ahv ahvVar = this.h;
            if (ahvVar != null) {
                if (!ahvVar.i) {
                    return;
                }
                this.e = this.g * ahvVar.f;
            }
            c(ahuVar2.f + this.e);
        }
        ahs ahsVar2 = this.a;
        if (ahsVar2 == null) {
            return;
        }
        ahsVar2.f();
    }

    public final String toString() {
        String str;
        String str2 = this.d.d.ah;
        switch (this.l) {
            case 1:
                str = "UNKNOWN";
                break;
            case 2:
                str = "HORIZONTAL_DIMENSION";
                break;
            case 3:
                str = "VERTICAL_DIMENSION";
                break;
            case 4:
                str = "LEFT";
                break;
            case 5:
                str = "RIGHT";
                break;
            case 6:
                str = "TOP";
                break;
            case 7:
                str = "BOTTOM";
                break;
            case 8:
                str = "BASELINE";
                break;
            default:
                str = "null";
                break;
        }
        String valueOf = String.valueOf(this.i ? Integer.valueOf(this.f) : "unresolved");
        int size = this.k.size();
        int size2 = this.j.size();
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 33 + str.length() + String.valueOf(valueOf).length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        sb.append("(");
        sb.append(valueOf);
        sb.append(") <t=");
        sb.append(size);
        sb.append(":d=");
        sb.append(size2);
        sb.append(">");
        return sb.toString();
    }
}
