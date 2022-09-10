package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: asxl  reason: default package */
/* loaded from: classes2.dex */
public final class asxl extends atyi<crqd> {
    private final bvjj b;
    private final Context c;
    private final boolean d;
    @dzsi
    private final dxio<jzk> e;

    public asxl(ckcw ckcwVar, broq broqVar, akox akoxVar, akfa akfaVar, bvjj bvjjVar, dxio<cref> dxioVar, Context context, int i, brcw brcwVar, btvo btvoVar, boolean z, @dzsi dxio<jzk> dxioVar2) {
        super(ckcwVar, broqVar, akoxVar, akfaVar, dxioVar, i, brcwVar, btvoVar);
        this.b = bvjjVar;
        this.c = context;
        this.d = z;
        this.e = dxioVar2;
    }

    @dzsi
    private final amub m(aste asteVar) {
        if (!asteVar.j().a()) {
            return null;
        }
        amub b = asteVar.j().b().b(0, this.c);
        if (b == null) {
            bvoo.f(new IllegalStateException("Could not get route for free nav search request"));
        }
        return b;
    }

    @Override // defpackage.atyi
    protected final String a(String str) {
        return this.c.getString(R.string.DA_SPEECH_SEARCH_FREE_NAV_CONFIRMATION, str);
    }

    @Override // defpackage.atyi
    @dzsi
    protected final /* bridge */ /* synthetic */ amvq b(crqd crqdVar, aste asteVar) {
        amub m = m(asteVar);
        if (m == null) {
            return null;
        }
        dbsk.a(true);
        double d = m.D;
        Double.isNaN(d);
        akra X = m.X(d * dcyn.a);
        dbsk.s(X);
        return new amvq(X.k(), X.o());
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0071, code lost:
        if (r0.c != false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0073, code lost:
        r0.bF();
        r0.c = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0078, code lost:
        r8 = (defpackage.dodt) r0.b;
        r8.a |= 16;
        r8.f = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x009f, code lost:
        if (r0.c != false) goto L17;
     */
    @Override // defpackage.atyi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final /* bridge */ /* synthetic */ void c(defpackage.dwim r6, defpackage.crqd r7, defpackage.aste r8, boolean r9) {
        /*
            r5 = this;
            crqd r7 = (defpackage.crqd) r7
            amub r0 = r5.m(r8)
            if (r0 != 0) goto L9
            return
        L9:
            dxio<jzk> r1 = r5.e
            if (r1 == 0) goto L17
            boolean r2 = r5.d
            if (r2 == 0) goto L17
            java.lang.Object r1 = r1.a()
            jzk r1 = (defpackage.jzk) r1
        L17:
            com.google.android.apps.gmm.map.model.location.GmmLocation r7 = r7.a
            r1 = 0
            doud r2 = defpackage.brlj.c(r0, r1)
            amsx r3 = r0.F()
            int r4 = r0.G()
            dodr r7 = defpackage.brlj.d(r0, r7, r2, r3, r4)
            dodt r0 = defpackage.dodt.h
            dsqp r0 = r0.bZ()
            dodn r0 = (defpackage.dodn) r0
            boolean r2 = r0.c
            if (r2 == 0) goto L3b
            r0.bF()
            r0.c = r1
        L3b:
            MessageType extends dsqw<MessageType, BuilderType> r2 = r0.b
            dodt r2 = (defpackage.dodt) r2
            int r3 = r2.a
            r3 = r3 | 4
            r2.a = r3
            r2.d = r9
            r7.getClass()
            r2.c = r7
            r7 = 2
            r2.b = r7
            MessageType extends dsqw<MessageType, BuilderType> r7 = r0.b
            dodt r7 = (defpackage.dodt) r7
            r9 = 1
            r7.e = r9
            int r9 = r7.a
            r9 = r9 | 8
            r7.a = r9
            boolean r2 = r5.d
            r9 = r9 | 32
            r7.a = r9
            r7.g = r2
            bvjj r7 = r5.b
            bvjk r9 = defpackage.bvjk.kb
            r2 = -1
            int r7 = r7.s(r9, r2)
            if (r7 <= 0) goto L85
            boolean r8 = r0.c
            if (r8 == 0) goto L78
        L73:
            r0.bF()
            r0.c = r1
        L78:
            MessageType extends dsqw<MessageType, BuilderType> r8 = r0.b
            dodt r8 = (defpackage.dodt) r8
            int r9 = r8.a
            r9 = r9 | 16
            r8.a = r9
            r8.f = r7
            goto La2
        L85:
            dbsg r7 = r8.k()
            boolean r7 = r7.a()
            if (r7 == 0) goto La2
            dbsg r7 = r8.k()
            java.lang.Object r7 = r7.b()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            boolean r8 = r0.c
            if (r8 == 0) goto L78
            goto L73
        La2:
            boolean r7 = r6.c
            if (r7 == 0) goto Lab
            r6.bF()
            r6.c = r1
        Lab:
            MessageType extends dsqw<MessageType, BuilderType> r6 = r6.b
            dwir r6 = (defpackage.dwir) r6
            dsqw r7 = r0.bK()
            dodt r7 = (defpackage.dodt) r7
            dwir r8 = defpackage.dwir.R
            r7.getClass()
            r6.y = r7
            int r7 = r6.a
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r7 | r8
            r6.a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asxl.c(dwim, crpx, aste, boolean):void");
    }

    @Override // defpackage.atyi
    protected final /* bridge */ /* synthetic */ boolean d(@dzsi crqd crqdVar) {
        crqd crqdVar2 = crqdVar;
        return (crqdVar2 == null || crqdVar2.a == null) ? false : true;
    }
}
