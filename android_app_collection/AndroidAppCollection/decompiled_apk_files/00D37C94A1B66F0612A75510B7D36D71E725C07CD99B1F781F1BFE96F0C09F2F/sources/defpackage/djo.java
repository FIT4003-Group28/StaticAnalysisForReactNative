package defpackage;

import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
/* compiled from: PG */
/* renamed from: djo  reason: default package */
/* loaded from: classes3.dex */
public class djo {
    public final LinearLayoutManager a;

    public djo(int i) {
        djm djmVar = new djm(i);
        this.a = djmVar;
        djmVar.B = false;
    }

    public djo(LinearLayoutManager linearLayoutManager) {
        this.a = linearLayoutManager;
    }

    public final int b() {
        return this.a.I();
    }

    public final int c() {
        return this.a.J();
    }

    public final int d() {
        return this.a.K();
    }

    public final int e() {
        return this.a.L();
    }

    public int f(int i, dlj dljVar) {
        return this.a.i != 0 ? View.MeasureSpec.makeMeasureSpec(0, 0) : i;
    }

    public final int g() {
        return this.a.at();
    }

    public final int h() {
        return this.a.i;
    }

    public final int i(int i) {
        return this.a.i != 0 ? i : View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    public final int a(int i, int i2, int i3, int i4) {
        double ceil;
        if (this.a.i == 0) {
            ceil = Math.ceil(i3 / i);
        } else {
            ceil = Math.ceil(i4 / i2);
        }
        int i5 = (int) ceil;
        if (i5 < 2) {
            return 2;
        }
        if (i5 <= 10) {
            return i5;
        }
        return 10;
    }
}
