package defpackage;

import android.content.Context;
import com.google.android.apps.gmm.directions.maneuvers.Maneuvers$Maneuver;
/* compiled from: PG */
/* renamed from: atiz  reason: default package */
/* loaded from: classes2.dex */
final class atiz implements cqjb<atnf, Maneuvers$Maneuver> {
    @Override // defpackage.cqjb
    public final /* bridge */ /* synthetic */ Maneuvers$Maneuver a(atnf atnfVar, Context context) {
        atnf atnfVar2 = atnfVar;
        if (!atnfVar2.J().booleanValue() && atnfVar2.b() != null && atnfVar2.b().J().booleanValue()) {
            atnfVar2 = atnfVar2.b();
        }
        return atnfVar2.K();
    }
}
