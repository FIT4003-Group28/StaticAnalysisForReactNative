package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: crrd  reason: default package */
/* loaded from: classes5.dex */
public final class crrd extends crqy {
    public amwb a;
    public boolean c;
    public final boolean d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public crrd(defpackage.amwb r4, boolean r5) {
        /*
            r3 = this;
            java.lang.String r0 = r4.d()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1c
            boolean r0 = r4.v()
            if (r0 == 0) goto L14
            java.lang.String r0 = r4.g()
            if (r0 == 0) goto L1c
        L14:
            doyd r0 = r4.h()
            if (r0 != 0) goto L1b
            goto L1c
        L1b:
            r2 = 0
        L1c:
            r3.<init>(r2)
            r3.c = r1
            r3.a = r4
            r3.d = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.crrd.<init>(amwb, boolean):void");
    }

    @Override // defpackage.crqw
    public final crqv a() {
        return this.d ? crqv.MODERATABLE_TRAFFIC_INCIDENT : crqv.TRAFFIC_INCIDENT;
    }

    @Override // defpackage.crqw
    public final boolean b() {
        return true;
    }

    @Override // defpackage.crqw
    public final boolean c() {
        return true;
    }

    @Override // defpackage.crqy
    public final crqx n() {
        return new crqx(R.string.UNABLE_TO_LOAD_DATA, dtxw.cQ, dtxw.cR);
    }
}
