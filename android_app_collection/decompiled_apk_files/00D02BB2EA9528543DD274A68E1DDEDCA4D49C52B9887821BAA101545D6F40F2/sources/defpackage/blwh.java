package defpackage;

import java.util.HashMap;
/* compiled from: PG */
/* renamed from: blwh  reason: default package */
/* loaded from: classes3.dex */
public final class blwh {
    public final HashMap<dspd, dspd> a = new HashMap<>();
    private final dxio<akfa> b;
    @dzsi
    private btlu c;

    public blwh(dxio<akfa> dxioVar) {
        this.b = dxioVar;
    }

    public final void a() {
        btlu j = this.b.a().j();
        if (btlu.g(this.c, j)) {
            return;
        }
        this.c = j;
        this.a.clear();
    }
}
