package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
/* compiled from: PG */
/* renamed from: gca  reason: default package */
/* loaded from: classes3.dex */
public final class gca implements fqb, yze {
    public gbz a;
    public final gby b;
    private final ghd c;
    private int d;
    private int e;

    public gca(Activity activity, ghd ghdVar) {
        gby gbyVar = new gby(activity);
        this.e = 0;
        this.b = gbyVar;
        this.c = ghdVar;
        g(activity.getResources().getConfiguration());
    }

    public final int a() {
        return this.b.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x002c, code lost:
        if (r6.e == 2) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(int r7) {
        /*
            r6 = this;
            gby r0 = r6.b
            boolean r1 = r0.b
            r2 = 4
            r3 = 2
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L2f
            boolean r1 = r0.e()
            if (r1 == 0) goto L2f
            android.app.Activity r0 = r0.a
            android.content.ContentResolver r0 = r0.getContentResolver()
            java.lang.String r1 = "show_rotation_suggestions"
            int r0 = android.provider.Settings.Secure.getInt(r0, r1, r5)
            if (r0 != r5) goto L2f
            if (r7 != r3) goto L28
            int r7 = r6.e
            if (r7 == r5) goto L26
            r7 = 2
            goto L28
        L26:
            r7 = 0
            goto L2f
        L28:
            if (r7 != r2) goto L2f
            int r0 = r6.e
            if (r0 != r3) goto L2f
            goto L26
        L2f:
            ghd r0 = r6.c
            boolean r0 = r0.isInMultiWindowMode()
            if (r5 != r0) goto L38
            r7 = 0
        L38:
            r0 = -1
            if (r7 == r3) goto L72
            r1 = 3
            if (r7 == r1) goto L94
            if (r7 == r2) goto L49
            r1 = 5
            if (r7 == r1) goto L6b
            gby r1 = r6.b
            r1.d(r0)
            goto L9c
        L49:
            gby r1 = r6.b
            boolean r1 = r1.e()
            if (r1 != 0) goto L6b
            gby r1 = r6.b
            int r1 = r1.c
            boolean r1 = defpackage.elk.j(r1)
            if (r1 == 0) goto L6b
            gby r1 = r6.b
            int r2 = r1.c
            int r1 = r1.a()
            if (r2 != r1) goto L6b
            gby r7 = r6.b
            r7.d(r0)
            goto L9d
        L6b:
            gby r0 = r6.b
            r1 = 6
            r0.d(r1)
            goto L9c
        L72:
            gby r1 = r6.b
            boolean r1 = r1.e()
            if (r1 != 0) goto L94
            gby r1 = r6.b
            int r1 = r1.c
            boolean r1 = defpackage.elk.k(r1)
            if (r1 == 0) goto L94
            gby r1 = r6.b
            int r2 = r1.c
            int r1 = r1.a()
            if (r2 != r1) goto L94
            gby r7 = r6.b
            r7.d(r0)
            goto L9d
        L94:
            r6.e = r5
            gby r0 = r6.b
            r1 = 7
            r0.d(r1)
        L9c:
            r4 = r7
        L9d:
            r6.d = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gca.d(int):void");
    }

    @Override // defpackage.fqb
    public final void g(Configuration configuration) {
        if (this.b.a.getRequestedOrientation() == -1) {
            this.e = configuration.orientation;
        }
    }

    @Override // defpackage.yze
    public final void lE(boolean z, int i) {
        gbz gbzVar;
        gbz gbzVar2;
        gby gbyVar = this.b;
        int i2 = gbyVar.c;
        gbyVar.lE(z, i);
        if (this.b.e()) {
            return;
        }
        int i3 = this.b.c;
        if (i2 == 2) {
            if (i3 != 1) {
                return;
            }
            int i4 = this.d;
            if (i4 == 4) {
                d(0);
            } else if (i4 != 5 || (gbzVar2 = this.a) == null) {
            } else {
                gbzVar2.c(1);
            }
        } else if (i2 != 1 || i3 != 2) {
        } else {
            int i5 = this.d;
            if (i5 == 2) {
                d(0);
            } else if (i5 != 3 || (gbzVar = this.a) == null) {
            } else {
                gbzVar.c(2);
            }
        }
    }

    @Override // defpackage.yze
    public final void lF(boolean z, int i) {
        this.b.lE(z, i);
        lE(z, i);
    }
}
