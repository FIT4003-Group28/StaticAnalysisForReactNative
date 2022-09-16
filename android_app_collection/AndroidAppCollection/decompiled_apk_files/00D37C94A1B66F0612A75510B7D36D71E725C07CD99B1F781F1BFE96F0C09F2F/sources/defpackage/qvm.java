package defpackage;

import com.google.android.gms.common.Feature;
/* compiled from: PG */
/* renamed from: qvm  reason: default package */
/* loaded from: classes4.dex */
public final class qvm {
    public qvo a;
    public qvo b;
    public qvd c;
    public Feature[] d;
    public int e;
    private final Runnable f = qvl.a;

    public final qvn a() {
        boolean z = true;
        qnm.d(this.a != null, "Must set register function");
        qnm.d(this.b != null, "Must set unregister function");
        if (this.c == null) {
            z = false;
        }
        qnm.d(z, "Must set holder");
        qnm.n(this.c.b, "Key must not be null");
        return new qvn(new qvj(this, this.c, this.d, this.e), new qwb(this), this.f);
    }
}
