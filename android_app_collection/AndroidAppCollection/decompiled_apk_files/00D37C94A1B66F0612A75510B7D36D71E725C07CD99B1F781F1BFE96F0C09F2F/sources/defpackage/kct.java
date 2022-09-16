package defpackage;

import android.widget.ImageView;
/* compiled from: PG */
/* renamed from: kct  reason: default package */
/* loaded from: classes3.dex */
public final class kct implements aiza {
    public final azpm a = azpm.aI(false);
    public final azpm b = azpm.aI(false);
    public final acti c;
    public final azqb d;
    public ImageView e;

    public kct(aizb aizbVar, aacz aaczVar, acti actiVar, azqb azqbVar) {
        this.c = actiVar;
        this.d = azqbVar;
        if (eog.aL(aaczVar)) {
            aizbVar.a(this);
        }
    }

    @Override // defpackage.aiza
    public final void d(int i, int i2) {
        this.b.c(Boolean.valueOf(i < i2));
    }
}
