package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aeea  reason: default package */
/* loaded from: classes.dex */
public class aeea implements aedw {
    public final dktk b;
    public ddho c;
    public ddho d;
    public boolean e;
    public boolean f;
    public boolean g;
    @dzsi
    public cjqv h;
    final /* synthetic */ aeeb i;
    private final Activity j;
    private final cqtd k;
    private final cqtd l;
    private final int m;
    private final int n;
    private final boolean o;

    public aeea(aeeb aeebVar, Activity activity, dktk dktkVar, cqtd cqtdVar, cqtd cqtdVar2, int i, ddho ddhoVar, ddho ddhoVar2, int i2) {
        this.i = aeebVar;
        dbsk.s(aeebVar.a);
        dbsk.s(aeebVar.f);
        this.j = activity;
        this.b = dktkVar;
        this.k = cqtdVar;
        this.l = cqtdVar2;
        this.m = i;
        this.c = ddhoVar;
        this.d = ddhoVar2;
        this.n = i2;
        this.o = aeebVar.a == dkuo.ICON_AND_TEXT;
    }

    private final void q(boolean z, boolean z2) {
        boolean z3 = true;
        this.e = z && !z2;
        if (!z || !z2) {
            z3 = false;
        }
        this.f = z3;
        this.g = z2;
    }

    @Override // defpackage.aedw
    public cqtd a() {
        return this.k;
    }

    @Override // defpackage.aedw
    public cqtd b() {
        return this.l;
    }

    @Override // defpackage.aedw
    public String c() {
        return this.j.getString(this.m);
    }

    @Override // defpackage.aedw
    public String d() {
        String c = c();
        return h().booleanValue() ? this.j.getString(R.string.TAB_BUTTON_NEEDS_ATTENTION_CONTENT_DESCRIPTION, new Object[]{c}) : c;
    }

    @Override // defpackage.aedw
    public cqtv e() {
        if (this.k.equals(iup.e(R.raw.ic_mod_tab_commute)) || this.k.equals(iup.e(R.raw.ic_mod_tab_commute_selected))) {
            return cqrp.d(12.0d);
        }
        if (this.k.equals(iup.e(R.raw.ic_mod_tab_updates)) || this.k.equals(iup.e(R.raw.ic_mod_tab_updates_selected)) || this.k.equals(iup.e(R.raw.ic_mod_tab_saved)) || this.k.equals(iup.e(R.raw.ic_mod_tab_saved_selected))) {
            return cqrp.d(8.0d);
        }
        return cqrp.d(10.0d);
    }

    @Override // defpackage.aedw
    public Boolean f() {
        return Boolean.valueOf(this.o);
    }

    @Override // defpackage.aedw
    public Boolean g() {
        return Boolean.valueOf(this.b == this.i.f);
    }

    @Override // defpackage.aedw
    public Boolean h() {
        return Boolean.valueOf(this.e);
    }

    @Override // defpackage.aedw
    public cqtc i() {
        return this.i.d;
    }

    @Override // defpackage.aedw
    public cqkl j(cjqm cjqmVar) {
        this.i.c(this.b, cjqmVar);
        return cqkl.a;
    }

    @Override // defpackage.aedw
    public View.OnAttachStateChangeListener k() {
        return new aedy(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    @Override // defpackage.aedw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.cjtd l() {
        /*
            r7 = this;
            cjta r0 = defpackage.cjtd.b()
            boolean r1 = r7.e
            if (r1 == 0) goto Lb
            ddho r1 = r7.d
            goto Ld
        Lb:
            ddho r1 = r7.c
        Ld:
            r0.d = r1
            ddho r1 = r7.c
            ddho r2 = defpackage.dtxr.ax
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L87
            aeeb r1 = r7.i
            bzmc r1 = r1.e
            int r1 = r1.a()
            int r2 = r1 + (-1)
            if (r1 == 0) goto L85
            r1 = 2
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L35
            if (r2 == r4) goto L36
            if (r2 == r1) goto L33
            r1 = 4
            if (r2 == r1) goto L35
            r1 = 0
            goto L36
        L33:
            r1 = 3
            goto L36
        L35:
            r1 = 1
        L36:
            if (r1 == 0) goto L87
            ddet r2 = defpackage.ddet.D
            dsqp r2 = r2.bZ()
            ddes r2 = (defpackage.ddes) r2
            ddgw r5 = defpackage.ddgw.c
            dsqp r5 = r5.bZ()
            ddgu r5 = (defpackage.ddgu) r5
            boolean r6 = r5.c
            if (r6 == 0) goto L51
            r5.bF()
            r5.c = r3
        L51:
            MessageType extends dsqw<MessageType, BuilderType> r6 = r5.b
            ddgw r6 = (defpackage.ddgw) r6
            int r1 = r1 + (-1)
            r6.b = r1
            int r1 = r6.a
            r1 = r1 | r4
            r6.a = r1
            dsqw r1 = r5.bK()
            ddgw r1 = (defpackage.ddgw) r1
            boolean r5 = r2.c
            if (r5 == 0) goto L6d
            r2.bF()
            r2.c = r3
        L6d:
            MessageType extends dsqw<MessageType, BuilderType> r3 = r2.b
            ddet r3 = (defpackage.ddet) r3
            r1.getClass()
            r3.y = r1
            int r1 = r3.b
            r1 = r1 | r4
            r3.b = r1
            dsqw r1 = r2.bK()
            ddet r1 = (defpackage.ddet) r1
            r0.s(r1)
            goto L87
        L85:
            r0 = 0
            throw r0
        L87:
            cjtd r0 = r0.a()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aeea.l():cjtd");
    }

    @Override // defpackage.aedw
    public Integer m() {
        return Integer.valueOf(this.n);
    }

    public void n(boolean z) {
        q(z, this.f);
    }

    public void o(boolean z) {
        q(this.e, z);
    }

    public void p(ddho ddhoVar, ddho ddhoVar2) {
        this.c = ddhoVar;
        this.d = ddhoVar2;
    }
}
