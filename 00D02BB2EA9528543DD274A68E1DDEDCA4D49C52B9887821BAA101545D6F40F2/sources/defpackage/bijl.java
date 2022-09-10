package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bijl  reason: default package */
/* loaded from: classes3.dex */
public class bijl extends bijk implements biiw {
    private final dnfm g;
    private final dxio<afha> h;

    public bijl(dnfm dnfmVar, bijz bijzVar, gga ggaVar, cjqy cjqyVar, cjqq cjqqVar, buzn buznVar, dxio<afha> dxioVar, dxio<axwy> dxioVar2, @dzsi axxe axxeVar) {
        super(bijzVar, ggaVar, cjqyVar, cjqqVar, buznVar, dxioVar2, axxeVar);
        this.g = dnfmVar;
        this.h = dxioVar;
    }

    private final String d() {
        dnpq dnpqVar = this.g.f;
        if (dnpqVar == null) {
            dnpqVar = dnpq.g;
        }
        return dnpqVar.c;
    }

    @Override // defpackage.bijk
    protected final int A() {
        return R.string.PERSONAL_INTELLIGENCE_DISMISS_CALENDAR_EVENT_ERROR_TEXT;
    }

    @Override // defpackage.biiw
    @dzsi
    public String a() {
        dnfm dnfmVar = this.g;
        if ((dnfmVar.a & 1) != 0) {
            return dnfmVar.b;
        }
        return null;
    }

    @Override // defpackage.biiw
    public String b() {
        dnfm dnfmVar = this.g;
        String str = dnfmVar.c;
        return dnfmVar.e ? this.b.getString(R.string.PERSONAL_CALENDAR_EVENT_RECURRING, new Object[]{str}) : str;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x00d0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d1  */
    @Override // defpackage.biiw
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.String c() {
        /*
            r10 = this;
            dnfm r0 = r10.g
            dsrj<dnfl> r0 = r0.d
            int r0 = r0.size()
            r1 = 0
            if (r0 == 0) goto Ldf
            dnfm r0 = r10.g
            dsrj<dnfl> r0 = r0.d
            int r0 = r0.size()
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L1a
        L17:
            r0 = r1
            goto Lce
        L1a:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            dnfm r4 = r10.g
            dsrj<dnfl> r4 = r4.d
            java.util.Iterator r4 = r4.iterator()
        L27:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L4f
            java.lang.Object r5 = r4.next()
            dnfl r5 = (defpackage.dnfl) r5
            int r6 = r5.a
            r7 = r6 & 1
            if (r7 == 0) goto L3c
            java.lang.String r5 = r5.b
            goto L45
        L3c:
            r6 = r6 & 2
            if (r6 == 0) goto L43
            java.lang.String r5 = r5.c
            goto L45
        L43:
            java.lang.String r5 = ""
        L45:
            boolean r6 = defpackage.dbsj.d(r5)
            if (r6 != 0) goto L27
            r0.add(r5)
            goto L27
        L4f:
            int r4 = r0.size()
            if (r4 == 0) goto L17
            if (r4 == r3) goto Lc8
            r5 = 2
            if (r4 == r5) goto Lb0
            r6 = 3
            if (r4 == r6) goto L92
            int r4 = r0.size()
            int r4 = r4 + (-2)
            gga r7 = r10.b
            android.content.res.Resources r7 = r7.getResources()
            java.lang.Object[] r8 = new java.lang.Object[r3]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r4)
            r8[r2] = r9
            r9 = 2131820703(0x7f11009f, float:1.9274128E38)
            java.lang.String r4 = r7.getQuantityString(r9, r4, r8)
            gga r7 = r10.b
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Object r8 = r0.get(r2)
            r6[r2] = r8
            java.lang.Object r0 = r0.get(r3)
            r6[r3] = r0
            r6[r5] = r4
            r0 = 2131956162(0x7f1311c2, float:1.9548872E38)
            java.lang.String r0 = r7.getString(r0, r6)
            goto Lce
        L92:
            gga r4 = r10.b
            java.lang.Object[] r6 = new java.lang.Object[r6]
            java.lang.Object r7 = r0.get(r2)
            r6[r2] = r7
            java.lang.Object r7 = r0.get(r3)
            r6[r3] = r7
            java.lang.Object r0 = r0.get(r5)
            r6[r5] = r0
            r0 = 2131956163(0x7f1311c3, float:1.9548874E38)
            java.lang.String r0 = r4.getString(r0, r6)
            goto Lce
        Lb0:
            gga r4 = r10.b
            java.lang.Object[] r5 = new java.lang.Object[r5]
            java.lang.Object r6 = r0.get(r2)
            r5[r2] = r6
            java.lang.Object r0 = r0.get(r3)
            r5[r3] = r0
            r0 = 2131956164(0x7f1311c4, float:1.9548876E38)
            java.lang.String r0 = r4.getString(r0, r5)
            goto Lce
        Lc8:
            java.lang.Object r0 = r0.get(r2)
            java.lang.String r0 = (java.lang.String) r0
        Lce:
            if (r0 != 0) goto Ld1
            return r1
        Ld1:
            gga r1 = r10.b
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r3[r2] = r0
            r0 = 2131956165(0x7f1311c5, float:1.9548878E38)
            java.lang.String r0 = r1.getString(r0, r3)
            return r0
        Ldf:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bijl.c():java.lang.String");
    }

    @Override // defpackage.bijk, defpackage.bijd
    public Boolean j() {
        return Boolean.valueOf(!dbsj.d(d()));
    }

    @Override // defpackage.bijk, defpackage.bijd
    public cqkl m() {
        this.h.a().k(this.b, d(), 1);
        return cqkl.a;
    }

    @Override // defpackage.bijd
    public String q() {
        dnwd dnwdVar = this.g.g;
        if (dnwdVar == null) {
            dnwdVar = dnwd.b;
        }
        return dnwdVar.a;
    }

    @Override // defpackage.bijk
    @dzsi
    public final String u() {
        return a();
    }

    @Override // defpackage.bijk
    @dzsi
    public final String v() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bijk
    public final int y() {
        return R.string.PERSONAL_INTELLIGENCE_DISMISS_CALENDAR_EVENT_DIALOG_TITLE;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.bijk
    public final int z() {
        return R.string.PERSONAL_INTELLIGENCE_DISMISS_CALENDAR_EVENT_DIALOG_INFO;
    }
}
