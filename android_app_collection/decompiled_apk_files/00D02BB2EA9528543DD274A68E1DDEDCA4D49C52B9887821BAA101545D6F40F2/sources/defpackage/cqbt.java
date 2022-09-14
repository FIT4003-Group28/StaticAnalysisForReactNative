package defpackage;

import android.text.Spanned;
import java.util.List;
/* compiled from: PG */
/* renamed from: cqbt  reason: default package */
/* loaded from: classes5.dex */
public final class cqbt {
    public static Spanned a(dczt dcztVar) {
        return alq.a(new dczr(dcztVar.a).a, 63);
    }

    public static dcdc<Spanned> b(List<dczt> list) {
        dccx F = dcdc.F();
        for (dczt dcztVar : list) {
            F.g(a(dcztVar));
        }
        return F.f();
    }
}
