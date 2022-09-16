package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: qvx  reason: default package */
/* loaded from: classes4.dex */
public final class qvx {
    public qvo a;
    public Feature[] b;
    private boolean d = true;
    public int c = 0;

    public final qvy a() {
        qnm.d(this.a != null, "execute parameter required");
        return new qvw(this, this.b, this.d, this.c);
    }

    public final void b() {
        this.d = false;
    }
}
