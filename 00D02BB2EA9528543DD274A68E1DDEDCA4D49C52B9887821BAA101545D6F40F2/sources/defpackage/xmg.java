package defpackage;

import android.app.Application;
import android.graphics.Rect;
import com.google.android.apps.gmm.map.model.location.GmmLocation;
import com.google.android.apps.maps.R;
import java.util.List;
/* compiled from: PG */
/* renamed from: xmg  reason: default package */
/* loaded from: classes7.dex */
public final class xmg {
    public final gll a;
    public final akpm b;
    private final Application c;
    private final ahjq d;

    public xmg(Application application, gll gllVar, ahjq ahjqVar, akpm akpmVar) {
        this.c = application;
        this.a = gllVar;
        this.d = ahjqVar;
        this.b = akpmVar;
    }

    public final void a(List<akqq> list, boolean z) {
        GmmLocation a;
        akqr a2 = akqs.a();
        for (akqq akqqVar : list) {
            a2.d(akqqVar);
        }
        if (z && (a = this.d.a()) != null) {
            a2.d(a.B());
        }
        akqs b = a2.b();
        Rect e = this.a.e();
        int dimensionPixelOffset = this.c.getResources().getDimensionPixelOffset(R.dimen.map_visiblerect_padding);
        e.inset(dimensionPixelOffset, dimensionPixelOffset);
        if (!e.isEmpty()) {
            this.b.p(akyt.o(b, e));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean b(java.util.List<defpackage.akqq> r7, boolean r8) {
        /*
            r6 = this;
            akpm r0 = r6.b
            alrh r0 = r0.ak()
            r1 = 0
            if (r0 != 0) goto La
            return r1
        La:
            gll r2 = r6.a
            android.graphics.Rect r2 = r2.e()
            java.util.Iterator r7 = r7.iterator()
        L14:
            boolean r3 = r7.hasNext()
            r4 = 1
            if (r3 == 0) goto L32
            java.lang.Object r3 = r7.next()
            akqq r3 = (defpackage.akqq) r3
            android.graphics.Point r3 = r0.b(r3)
            if (r3 == 0) goto L31
            int r5 = r3.x
            int r3 = r3.y
            boolean r3 = r2.contains(r5, r3)
            if (r3 != 0) goto L14
        L31:
            return r4
        L32:
            if (r8 == 0) goto L51
            ahjq r7 = r6.d
            com.google.android.apps.gmm.map.model.location.GmmLocation r7 = r7.a()
            if (r7 == 0) goto L51
            akqq r7 = r7.B()
            android.graphics.Point r7 = r0.b(r7)
            if (r7 == 0) goto L50
            int r8 = r7.x
            int r7 = r7.y
            boolean r7 = r2.contains(r8, r7)
            if (r7 != 0) goto L51
        L50:
            return r4
        L51:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xmg.b(java.util.List, boolean):boolean");
    }
}
