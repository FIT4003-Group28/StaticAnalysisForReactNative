package defpackage;

import android.util.DisplayMetrics;
/* compiled from: PG */
/* renamed from: bybg  reason: default package */
/* loaded from: classes4.dex */
public final class bybg {
    /* JADX INFO: Access modifiers changed from: package-private */
    public static final aifq a(byay byayVar, DisplayMetrics displayMetrics) {
        float f;
        dbsk.s(byayVar);
        aifp j = aifq.j();
        j.e = akra.f(byayVar.a);
        j.f(displayMetrics.density * 0.25f);
        aifa aifaVar = byayVar.d;
        if (aifaVar != null) {
            akra a = aifaVar.a().a().a();
            akra f2 = akra.f(byayVar.a);
            if (a.equals(f2)) {
                f = aifaVar.a().e();
            } else {
                f = (float) akra.G(a, f2);
            }
        } else {
            bqyh bqyhVar = byayVar.b;
            f = bqyhVar != null ? bqyhVar.d : 0.0f;
        }
        j.k(f, akwd.WORLD_RELATIVE);
        return j.i();
    }
}
