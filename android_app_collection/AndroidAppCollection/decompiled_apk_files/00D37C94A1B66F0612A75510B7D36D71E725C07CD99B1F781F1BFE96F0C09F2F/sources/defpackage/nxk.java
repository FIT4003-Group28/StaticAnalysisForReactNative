package defpackage;

import android.graphics.Rect;
import android.view.View;
import com.google.android.youtube.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: nxk  reason: default package */
/* loaded from: classes3.dex */
public final class nxk {
    public final View a;
    public final int b;
    public final int c;
    public final nxn d;
    public nxj e;
    public final oah f;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public nxk(android.view.View r13, int r14, int r15, defpackage.nxe r16, defpackage.nxe r17, defpackage.oah r18, defpackage.aynx r19, defpackage.aadd r20) {
        /*
            r12 = this;
            nxe r3 = defpackage.nwz.b(r16)
            nxe r5 = defpackage.nwz.b(r17)
            zer r0 = defpackage.nys.a
            java.lang.Object r0 = r0.get()
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            r1 = r14 | r15
            java.lang.Object r0 = r0.get(r1)
            nyl r0 = (defpackage.nyl) r0
            if (r0 == 0) goto L33
            r1 = r13
            r2 = r14
            r4 = r15
            r6 = r19
            r7 = r20
            nxn r10 = r0.a(r1, r2, r3, r4, r5, r6, r7)
            r0 = 0
            r10.a(r0)
            r6 = r12
            r7 = r13
            r8 = r14
            r9 = r15
            r11 = r18
            r6.<init>(r7, r8, r9, r10, r11)
            return
        L33:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Unsupported transition."
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxk.<init>(android.view.View, int, int, nxe, nxe, oah, aynx, aadd):void");
    }

    public final int a(int i) {
        int centerX;
        int centerX2;
        nxn nxnVar = this.d;
        Rect t = ((nxm) nxnVar.a.get(0)).a.t();
        List list = nxnVar.a;
        Rect t2 = ((nxm) list.get(list.size() - 1)).a.t();
        if (i == 1) {
            centerX = t.centerY();
            centerX2 = t2.centerY();
        } else {
            centerX = t.centerX();
            centerX2 = t2.centerX();
        }
        return centerX2 - centerX;
    }

    public final void b() {
        nxj nxjVar = this.e;
        if (nxjVar == null) {
            return;
        }
        nxjVar.b = true;
        nxjVar.a.cancel();
        this.e = null;
    }

    public final void c() {
        b();
        nxl nxlVar = this.d.b;
        if (nxlVar != null) {
            nxlVar.a();
        }
    }

    public final void d(float f) {
        nxn nxnVar = this.d;
        if (f == nxnVar.c) {
            return;
        }
        nxnVar.a(f);
        oah oahVar = this.f;
        if (oahVar == null) {
            return;
        }
        oahVar.b(this.b, this.c, f);
    }

    public final boolean e() {
        return this.e != null;
    }

    public final void f(float f, nzw nzwVar) {
        int integer;
        if (!e()) {
            int i = this.b;
            int i2 = this.c;
            boolean z = false;
            if ((nys.a(i) == 2 && nys.a(i2) == 1) || (nys.a(i) == 1 && nys.a(i2) == 2)) {
                z = true;
            }
            if (this.b != 128 || this.c != 2) {
                integer = this.a.getContext().getResources().getInteger(true != z ? R.integer.next_gen_watch_transition_animation_duration_ms : R.integer.next_gen_watch_min_max_transition_animation_duration_ms);
            } else {
                integer = this.a.getContext().getResources().getInteger(R.integer.next_gen_watch_down_and_out_transition_animation_duration_ms);
            }
            nxj nxjVar = new nxj(this, (int) (integer * (1.0f - f)), f, nzwVar);
            this.e = nxjVar;
            nxjVar.a.addListener(nxjVar);
            nxjVar.a.addUpdateListener(nxjVar);
            this.e.a.start();
        }
    }

    public nxk(View view, int i, int i2, nxn nxnVar, oah oahVar) {
        this.a = view;
        this.b = i;
        this.c = i2;
        this.d = nxnVar;
        this.f = oahVar;
        nxnVar.a(0.0f);
    }
}
