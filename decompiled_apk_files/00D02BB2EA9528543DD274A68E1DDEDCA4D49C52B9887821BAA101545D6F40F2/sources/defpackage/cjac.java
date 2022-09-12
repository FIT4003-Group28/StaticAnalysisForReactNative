package defpackage;

import android.icu.text.DateIntervalFormat;
import android.icu.util.DateInterval;
import android.text.format.DateFormat;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: cjac  reason: default package */
/* loaded from: classes4.dex */
public final class cjac implements cjab {
    @Override // defpackage.cjab
    public final String a(eaol eaolVar, eaol eaolVar2) {
        return DateIntervalFormat.getInstance("MMM d", Locale.getDefault()).format(new DateInterval(eaolVar.a, eaolVar2.a));
    }

    @Override // defpackage.cjab
    public final String b(eaol eaolVar) {
        String bestDateTimePattern = DateFormat.getBestDateTimePattern(Locale.getDefault(), "MMM d");
        return bestDateTimePattern == null ? eaolVar.toString() : eato.b(bestDateTimePattern).a(Locale.getDefault()).f(eaolVar);
    }
}
