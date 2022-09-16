package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.chromium.net.CellularSignalStrengthError;
/* compiled from: PG */
/* renamed from: ahg  reason: default package */
/* loaded from: classes.dex */
public final class ahg {
    public int b;
    public boolean c;
    public final ahh d;
    public ahg e;
    public ahc h;
    public final int i;
    public HashSet a = null;
    public int f = 0;
    int g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;

    public ahg(ahh ahhVar, int i) {
        this.d = ahhVar;
        this.i = i;
    }

    public final int a() {
        if (!this.c) {
            return 0;
        }
        return this.b;
    }

    public final int b() {
        ahg ahgVar;
        if (this.d.ag == 8) {
            return 0;
        }
        int i = this.g;
        return (i == Integer.MIN_VALUE || (ahgVar = this.e) == null || ahgVar.d.ag != 8) ? this.f : i;
    }

    public final void c(int i, ArrayList arrayList, aic aicVar) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                aej.b(((ahg) it.next()).d, i, arrayList, aicVar);
            }
        }
    }

    public final void d() {
        HashSet hashSet;
        ahg ahgVar = this.e;
        if (ahgVar != null && (hashSet = ahgVar.a) != null) {
            hashSet.remove(this);
            if (this.e.a.size() == 0) {
                this.e.a = null;
            }
        }
        this.a = null;
        this.e = null;
        this.f = 0;
        this.g = CellularSignalStrengthError.ERROR_NOT_SUPPORTED;
        this.c = false;
        this.b = 0;
    }

    public final void e(int i) {
        this.b = i;
        this.c = true;
    }

    public final boolean f() {
        ahg ahgVar;
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            ahg ahgVar2 = (ahg) it.next();
            int i = ahgVar2.i - 1;
            if (i == 1) {
                ahgVar = ahgVar2.d.L;
            } else if (i == 2) {
                ahgVar = ahgVar2.d.M;
            } else if (i != 3) {
                ahgVar = i != 4 ? null : ahgVar2.d.K;
            } else {
                ahgVar = ahgVar2.d.f46J;
            }
            if (ahgVar.h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        return hashSet != null && hashSet.size() > 0;
    }

    public final boolean h() {
        return this.e != null;
    }

    public final void i() {
        ahc ahcVar = this.h;
        if (ahcVar == null) {
            this.h = new ahc(1);
        } else {
            ahcVar.c();
        }
    }

    public final void j(ahg ahgVar, int i, int i2) {
        if (ahgVar == null) {
            d();
            return;
        }
        this.e = ahgVar;
        if (ahgVar.a == null) {
            ahgVar.a = new HashSet();
        }
        HashSet hashSet = this.e.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.f = i;
        this.g = i2;
    }

    public final String toString() {
        String str;
        String str2 = this.d.ah;
        switch (this.i) {
            case 2:
                str = "LEFT";
                break;
            case 3:
                str = "TOP";
                break;
            case 4:
                str = "RIGHT";
                break;
            case 5:
                str = "BOTTOM";
                break;
            case 6:
                str = "BASELINE";
                break;
            case 7:
                str = "CENTER";
                break;
            case 8:
                str = "CENTER_X";
                break;
            default:
                str = "CENTER_Y";
                break;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 1 + str.length());
        sb.append(str2);
        sb.append(":");
        sb.append(str);
        return sb.toString();
    }
}
