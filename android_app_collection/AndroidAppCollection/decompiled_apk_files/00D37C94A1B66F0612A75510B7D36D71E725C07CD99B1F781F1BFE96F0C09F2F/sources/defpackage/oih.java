package defpackage;

import android.animation.ArgbEvaluator;
/* compiled from: PG */
/* renamed from: oih  reason: default package */
/* loaded from: classes3.dex */
final class oih implements oag {
    final /* synthetic */ oik a;
    private final /* synthetic */ int b;

    public oih(oik oikVar) {
        this.a = oikVar;
    }

    public oih(oik oikVar, int i) {
        this.b = i;
        this.a = oikVar;
    }

    @Override // defpackage.oag
    public final void a(float f) {
    }

    @Override // defpackage.oag
    public final void b(float f) {
        if (this.b == 0) {
            oik oikVar = this.a;
            oikVar.b.setColor(((Integer) new ArgbEvaluator().evaluate(1.0f - f, Integer.valueOf(oikVar.c), Integer.valueOf(oikVar.d))).intValue());
            return;
        }
        this.a.a(fsb.PLAYER, 1.0f - f);
    }
}
