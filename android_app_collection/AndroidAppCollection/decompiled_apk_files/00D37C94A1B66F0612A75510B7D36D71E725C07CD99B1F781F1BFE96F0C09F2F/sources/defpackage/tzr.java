package defpackage;

import android.content.Context;
import java.util.IllegalFormatException;
/* compiled from: PG */
/* renamed from: tzr  reason: default package */
/* loaded from: classes4.dex */
public final class tzr implements trv {
    private final Context a;
    private final tqe b;

    public tzr(Context context, tqe tqeVar) {
        this.a = context;
        this.b = tqeVar;
    }

    @Override // defpackage.trv
    public final void a(Throwable th, String str, Object... objArr) {
        this.b.m();
        this.b.B();
        if (typ.a(100L)) {
            try {
                str = String.format(str, objArr);
            } catch (IllegalFormatException e) {
                typ.f(e, "Bad format string or format arguments: %s", str);
            }
            rbj rbjVar = new rbj(th);
            rbjVar.f = "com.google.android.gms.icing";
            rbjVar.c = "com.google.android.gms.icing.SILENT_FEEDBACK";
            rbjVar.b = str;
            rbjVar.d = true;
            rbh.e(this.a).x(rbjVar.a());
        }
    }
}
