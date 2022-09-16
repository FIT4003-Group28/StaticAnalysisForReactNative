package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: nta  reason: default package */
/* loaded from: classes3.dex */
public final class nta implements nsk {
    public final azpb a;
    public Rect b;

    public nta() {
        azpb ax = azpa.ar().ax();
        this.a = ax;
        ax.c(new Rect(0, 0, 0, 0));
    }

    @Override // defpackage.nsk
    public final int a() {
        return 0;
    }

    @Override // defpackage.nsk
    public final Rect b() {
        return this.b;
    }

    @Override // defpackage.nsk
    public final aynx c() {
        return this.a;
    }

    @Override // defpackage.nsk
    public final aynx d() {
        return aynx.B(0).h(nps.i);
    }

    @Override // defpackage.nsk
    public final void e() {
        this.a.Z(new ayqb() { // from class: nsz
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                nta.this.b = (Rect) obj;
            }
        });
    }
}
