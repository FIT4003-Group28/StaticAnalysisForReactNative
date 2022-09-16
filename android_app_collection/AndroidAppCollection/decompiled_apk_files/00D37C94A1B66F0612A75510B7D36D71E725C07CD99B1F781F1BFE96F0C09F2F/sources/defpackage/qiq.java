package defpackage;

import android.content.Context;
import com.google.android.gms.common.api.Status;
/* compiled from: PG */
/* renamed from: qiq  reason: default package */
/* loaded from: classes4.dex */
public final class qiq extends qst implements qie {
    private static final qso a;
    private static final saz b;
    private static final twx c;
    private static final tzc d;

    static {
        twx twxVar = new twx();
        c = twxVar;
        qio qioVar = new qio();
        d = qioVar;
        a = new qso("GoogleAuthService.API", qioVar, twxVar, null, null, null);
        b = qhp.c("GoogleAuthServiceClient");
    }

    public qiq(Context context) {
        super(context, a, qsl.f, qss.a);
    }

    public static void a(Status status, Object obj, rvh rvhVar) {
        if (!tgo.m(status, obj, rvhVar)) {
            b.b("The task is already complete.", new Object[0]);
        }
    }
}
