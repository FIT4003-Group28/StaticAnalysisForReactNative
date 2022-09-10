package defpackage;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.widget.RemoteViews;
/* compiled from: PG */
/* renamed from: auof  reason: default package */
/* loaded from: classes2.dex */
public abstract class auof {
    private final dxio<akfa> a;
    private final auhz b;
    private final boolean c;

    public auof(dxio<akfa> dxioVar, auhz auhzVar, boolean z) {
        this.a = dxioVar;
        this.b = auhzVar;
        this.c = z;
    }

    private final void a(int i, dlgf dlgfVar, boolean z) {
        auhw auhwVar;
        auod m = auoe.m(dlgfVar.b);
        auoa auoaVar = (auoa) m;
        auoaVar.e = i;
        int a = dlhf.a(dlgfVar.e);
        int i2 = 1;
        if (a == 0) {
            a = 1;
        }
        m.c(aunx.a(a));
        m.g(dlgfVar.c);
        auhz auhzVar = this.b;
        boolean z2 = (dlgfVar.a & 16) != 0;
        dplx dplxVar = dlgfVar.f;
        if (dplxVar == null) {
            dplxVar = dplx.g;
        }
        Intent b = auhzVar.b(z2, dplxVar, dlgfVar.d, dlgfVar.g);
        if ((dlgfVar.a & 32) != 0) {
            int a2 = dlga.a(dlgfVar.h);
            if (a2 != 0) {
                i2 = a2;
            }
            auhwVar = auhz.e(i2);
        } else {
            auhwVar = auhw.ACTIVITY;
        }
        auoaVar.a = new auhx(b, auhwVar);
        m.f(z);
        if ((dlgfVar.a & 256) != 0) {
            auoaVar.d = dbsg.i(Integer.valueOf(dlgfVar.k));
        }
        B(m.h());
    }

    public abstract void A(long j);

    public abstract void B(auoe auoeVar);

    public abstract void C(boolean z);

    public abstract void D(int i);

    public abstract void E(Intent intent, auhw auhwVar);

    public abstract void F(CharSequence charSequence);

    public abstract void G(CharSequence charSequence);

    public abstract void H(int i);

    public abstract void I();

    public abstract void J(int i);

    public abstract void K(boolean z);

    public abstract void L(ih ihVar);

    public abstract void M(@dzsi CharSequence charSequence);

    public abstract void N(CharSequence charSequence);

    public abstract void O(long j);

    /* JADX WARN: Removed duplicated region for block: B:102:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:125:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x018a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void P(defpackage.auog r9, @defpackage.dzsi java.lang.String r10) {
        /*
            Method dump skipped, instructions count: 554
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auof.P(auog, java.lang.String):void");
    }

    public abstract void b(Bundle bundle);

    public abstract void i(RemoteViews remoteViews, auoc... auocVarArr);

    public abstract void k(RemoteViews remoteViews, auoc... auocVarArr);

    public abstract void n(akqi akqiVar);

    public abstract void o(String str);

    public abstract void p(Bitmap bitmap);

    public abstract void w(int i);

    public abstract void x(String str);
}
