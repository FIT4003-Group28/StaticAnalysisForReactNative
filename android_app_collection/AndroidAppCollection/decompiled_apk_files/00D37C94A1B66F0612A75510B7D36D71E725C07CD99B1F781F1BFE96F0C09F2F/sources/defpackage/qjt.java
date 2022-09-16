package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
/* compiled from: PG */
/* renamed from: qjt  reason: default package */
/* loaded from: classes4.dex */
final class qjt extends tzc {
    @Override // defpackage.tzc
    public final /* bridge */ /* synthetic */ qsn b(Context context, Looper looper, qwu qwuVar, Object obj, qsv qsvVar, qsw qswVar) {
        qjg qjgVar = (qjg) obj;
        qnm.n(qjgVar, "Setting the API options is required.");
        CastDevice castDevice = qjgVar.a;
        int i = qjgVar.c;
        return new qpk(context, looper, qwuVar, castDevice, qjgVar.b, qjgVar.d, qsvVar, qswVar);
    }
}
