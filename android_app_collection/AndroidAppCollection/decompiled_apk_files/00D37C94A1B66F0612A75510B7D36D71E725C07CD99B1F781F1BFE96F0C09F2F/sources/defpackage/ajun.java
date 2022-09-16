package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: ajun  reason: default package */
/* loaded from: classes.dex */
public final class ajun {
    public final aafo a;
    public boolean b = false;
    private final Context c;
    private final zhf d;

    public ajun(Context context, zhf zhfVar, aafo aafoVar) {
        this.c = context;
        this.d = zhfVar;
        this.a = aafoVar;
    }

    public final void a(asof asofVar, ampq ampqVar, Object obj) {
        ampq b = ampqVar.b(aiyy.k);
        new ajul(this.c, this.d, asofVar, b, new ajum(this, asofVar, b, obj)).show();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(asof asofVar, ajul ajulVar, String str, aqrc aqrcVar, aqrc aqrcVar2, boolean z) {
        boolean z2 = true;
        boolean z3 = !amps.e(str);
        int i = asofVar.b;
        boolean z4 = (i & 256) == 0 || aqrcVar != null;
        boolean z5 = (i & 512) == 0 || aqrcVar2 != null;
        if (this.b) {
            ajulVar.c.setActivated(!z3);
            ajulVar.e.setActivated(!z4);
            ajulVar.f.setActivated(!z5);
        }
        if (!z3 || !z4 || !z5) {
            z2 = false;
        }
        if (z2) {
            ajulVar.b.setImageResource(2131232718);
        } else {
            ajulVar.b.setImageResource(2131232719);
            if (z) {
                ajulVar.b.announceForAccessibility(ajulVar.a.e);
                return false;
            }
        }
        return z2;
    }
}
