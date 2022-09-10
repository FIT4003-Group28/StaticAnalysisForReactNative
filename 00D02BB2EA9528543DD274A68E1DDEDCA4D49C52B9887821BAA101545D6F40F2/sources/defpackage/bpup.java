package defpackage;

import android.graphics.Rect;
/* compiled from: PG */
/* renamed from: bpup  reason: default package */
/* loaded from: classes4.dex */
public final class bpup {
    public static akqs a(akqs akqsVar, akqq akqqVar) {
        double d = akqsVar.j().a;
        double d2 = akqsVar.k().a;
        double d3 = akqsVar.j().b;
        double d4 = akqsVar.k().b;
        double max = Math.max(Math.abs(d - akqqVar.a), Math.abs(akqqVar.a - d2));
        double max2 = Math.max(akqo.f(d3, akqqVar.b), akqo.f(d4, akqqVar.b));
        return new akqs(akqqVar, max + max, max2 + max2);
    }

    public static Rect b(Rect rect, int i) {
        int max = Math.max(0, i - rect.width());
        int max2 = Math.max(0, i - rect.height());
        return new Rect(rect.left - (max / 2), rect.top - (max2 / 2), rect.right + ((max + 1) / 2), rect.bottom + ((max2 + 1) / 2));
    }
}
