package defpackage;

import com.google.android.apps.gmm.map.model.location.GmmLocation;
/* compiled from: PG */
/* renamed from: ahnn  reason: default package */
/* loaded from: classes2.dex */
public class ahnn {
    protected final ckcw a;
    private final btwd f;
    private final cqat g;
    private final float h;
    private boolean i;
    private boolean j;
    @dzsi
    private GmmLocation l;
    private boolean b = false;
    private boolean c = false;
    private int d = -1;
    private long e = 0;
    private boolean k = false;

    public ahnn(btvo btvoVar, cqat cqatVar, ckcw ckcwVar) {
        btwd navigationParameters = btvoVar.getNavigationParameters();
        this.f = navigationParameters;
        this.g = cqatVar;
        this.a = ckcwVar;
        c();
        this.h = navigationParameters.g() + 0.123456f;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(int i, int i2, boolean z) {
        this.d = i;
        boolean z2 = false;
        this.b = (i > 0 || i2 > 0) | this.b;
        boolean z3 = this.c;
        if (i >= 3) {
            z2 = true;
        }
        this.c = z3 | z2;
        this.k = z;
        this.e = this.g.e();
    }

    /* JADX WARN: Removed duplicated region for block: B:160:0x02ea  */
    @defpackage.dzsi
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.google.android.apps.gmm.map.model.location.GmmLocation b(@defpackage.dzsi com.google.android.apps.gmm.map.model.location.GmmLocation r12) {
        /*
            Method dump skipped, instructions count: 811
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ahnn.b(com.google.android.apps.gmm.map.model.location.GmmLocation):com.google.android.apps.gmm.map.model.location.GmmLocation");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void c() {
        this.d = -1;
        this.b = false;
        this.c = false;
        this.e = -1L;
        this.j = false;
        this.i = false;
        this.l = null;
    }
}
