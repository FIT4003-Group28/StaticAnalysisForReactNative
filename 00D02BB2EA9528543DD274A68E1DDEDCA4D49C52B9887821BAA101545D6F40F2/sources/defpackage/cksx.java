package defpackage;

import android.location.Location;
/* compiled from: PG */
/* renamed from: cksx  reason: default package */
/* loaded from: classes4.dex */
public final class cksx {
    public final ckws a = ckwt.o.bZ();
    public boolean b;
    public boolean c;
    public int d;
    public int e;
    public boolean f;
    @dzsi
    public Location g;
    @dzsi
    public Location h;
    public boolean i;

    public final void a() {
        ckws ckwsVar = this.a;
        if ((((ckwt) ckwsVar.b).a & 32) != 0) {
            if (ckwsVar.c) {
                ckwsVar.bF();
                ckwsVar.c = false;
            }
            ckwt ckwtVar = (ckwt) ckwsVar.b;
            ckwtVar.a &= -33;
            ckwtVar.g = ckwt.o.g;
            this.i = true;
        }
    }
}
