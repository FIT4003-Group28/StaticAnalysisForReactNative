package defpackage;

import java.util.ArrayList;
/* compiled from: PG */
/* renamed from: aic  reason: default package */
/* loaded from: classes.dex */
public final class aic {
    static int a;
    public int c;
    public int d;
    final ArrayList b = new ArrayList();
    ArrayList e = null;
    private int f = -1;

    public aic(int i) {
        this.c = -1;
        this.d = 0;
        int i2 = a;
        a = i2 + 1;
        this.c = i2;
        this.d = i;
    }

    public final int a(agy agyVar, int i) {
        int o;
        int o2;
        if (this.b.size() == 0) {
            return 0;
        }
        ArrayList arrayList = this.b;
        ahh ahhVar = ((ahh) arrayList.get(0)).T;
        agyVar.k();
        ahhVar.b(agyVar, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((ahh) arrayList.get(i2)).b(agyVar, false);
        }
        if (i == 0) {
            ahi ahiVar = (ahi) ahhVar;
            if (ahiVar.at > 0) {
                aeh.b(ahiVar, agyVar, arrayList, 0);
            }
        }
        if (i == 1) {
            ahi ahiVar2 = (ahi) ahhVar;
            if (ahiVar2.au > 0) {
                aeh.b(ahiVar2, agyVar, arrayList, 1);
            }
        }
        try {
            agyVar.j();
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.e = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.e.add(new aek((ahh) arrayList.get(i3)));
        }
        if (i == 0) {
            ahi ahiVar3 = (ahi) ahhVar;
            o = agy.o(ahiVar3.f46J);
            o2 = agy.o(ahiVar3.L);
            agyVar.k();
        } else {
            ahi ahiVar4 = (ahi) ahhVar;
            o = agy.o(ahiVar4.K);
            o2 = agy.o(ahiVar4.M);
            agyVar.k();
        }
        return o2 - o;
    }

    public final void b(ArrayList arrayList) {
        int size = this.b.size();
        if (this.f != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                aic aicVar = (aic) arrayList.get(i);
                if (this.f == aicVar.c) {
                    c(this.d, aicVar);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final void c(int i, aic aicVar) {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ahh ahhVar = (ahh) arrayList.get(i2);
            aicVar.d(ahhVar);
            if (i != 0) {
                ahhVar.ao = aicVar.c;
            } else {
                ahhVar.an = aicVar.c;
            }
        }
        this.f = aicVar.c;
    }

    public final boolean d(ahh ahhVar) {
        if (this.b.contains(ahhVar)) {
            return false;
        }
        this.b.add(ahhVar);
        return true;
    }

    public final String toString() {
        int i = this.d;
        String str = i == 0 ? "Horizontal" : i == 1 ? "Vertical" : "Both";
        int i2 = this.c;
        StringBuilder sb = new StringBuilder(str.length() + 16);
        sb.append(str);
        sb.append(" [");
        sb.append(i2);
        sb.append("] <");
        String sb2 = sb.toString();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            String valueOf = String.valueOf(sb2);
            String str2 = ((ahh) arrayList.get(i3)).ah;
            StringBuilder sb3 = new StringBuilder(String.valueOf(valueOf).length() + 1 + String.valueOf(str2).length());
            sb3.append(valueOf);
            sb3.append(" ");
            sb3.append(str2);
            sb2 = sb3.toString();
        }
        return String.valueOf(sb2).concat(" >");
    }
}
