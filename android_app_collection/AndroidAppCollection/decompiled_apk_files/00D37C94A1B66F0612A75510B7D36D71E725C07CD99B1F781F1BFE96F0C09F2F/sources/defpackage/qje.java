package defpackage;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.cast.CastDevice;
/* compiled from: PG */
/* renamed from: qje  reason: default package */
/* loaded from: classes4.dex */
final class qje extends tzc {
    @Override // defpackage.tzc
    public final /* bridge */ /* synthetic */ qsn b(Context context, Looper looper, qwu qwuVar, Object obj, qsv qsvVar, qsw qswVar) {
        qjg qjgVar = (qjg) obj;
        qnm.n(qjgVar, "Setting the API options is required.");
        CastDevice castDevice = qjgVar.a;
        int i = qjgVar.c;
        return new qpj(context, looper, qwuVar, castDevice, qjgVar.e, qjgVar.b, qsvVar, qswVar, null, null, null);
    }
}
