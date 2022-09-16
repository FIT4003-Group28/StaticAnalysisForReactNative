package defpackage;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: nri  reason: default package */
/* loaded from: classes3.dex */
public final class nri implements nsk {
    public Rect b;
    private final ViewGroup c;
    private final aynx d = azpa.as(0);
    public final azpb a = azpa.ar().ax();

    public nri(ViewGroup viewGroup) {
        this.c = viewGroup;
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
        return this.d;
    }

    @Override // defpackage.nsk
    public final void e() {
        this.a.c(new Rect(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom()));
        this.c.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: nrg
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                nri nriVar = nri.this;
                if (i == i5 && i2 == i6 && i3 == i7 && i4 == i8) {
                    return;
                }
                nriVar.a.c(new Rect(i, i2, i3, i4));
            }
        });
        this.a.Z(new ayqb() { // from class: nrh
            @Override // defpackage.ayqb
            public final void a(Object obj) {
                nri.this.b = (Rect) obj;
            }
        });
    }
}
