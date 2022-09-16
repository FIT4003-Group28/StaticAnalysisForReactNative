package defpackage;

import android.content.Context;
import android.os.Looper;
/* compiled from: PG */
/* renamed from: rsg  reason: default package */
/* loaded from: classes4.dex */
final class rsg extends tzc {
    @Override // defpackage.tzc
    public final /* bridge */ /* synthetic */ qsn b(Context context, Looper looper, qwu qwuVar, Object obj, qsv qsvVar, qsw qswVar) {
        rsj rsjVar = (rsj) obj;
        qnm.n(rsjVar, "Must provide valid PeopleOptions!");
        return new rst(context, looper, qsvVar, qswVar, String.valueOf(rsjVar.a), qwuVar);
    }
}
