package defpackage;

import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: cntf  reason: default package */
/* loaded from: classes.dex */
public final class cntf {
    public static void a(Status status, cpct<Void> cpctVar) {
        b(status, null, cpctVar);
    }

    public static <TResult> void b(Status status, TResult tresult, cpct<TResult> cpctVar) {
        if (status.d()) {
            cpctVar.a(tresult);
        } else {
            cpctVar.c(new cnob(status));
        }
    }

    public static <ResultT> void c(Status status, ResultT resultt, cpct<ResultT> cpctVar) {
        if (status.d()) {
            cpctVar.b(resultt);
        } else {
            cpctVar.d(new cnob(status));
        }
    }

    @Deprecated
    public static void d(cpcq<Boolean> cpcqVar) {
        cpcqVar.f(new cnte());
    }
}
