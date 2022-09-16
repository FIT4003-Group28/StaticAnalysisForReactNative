package defpackage;

import android.content.SharedPreferences;
import java.util.UUID;
/* compiled from: PG */
/* renamed from: qlv  reason: default package */
/* loaded from: classes4.dex */
public final class qlv {
    private final String a;
    private final int b;
    private final oso c;

    public qlv(SharedPreferences sharedPreferences, oso osoVar, long j) {
        this.c = osoVar;
        String string = sharedPreferences.getString("client_sender_id", null);
        if (string == null) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString("client_sender_id", string).apply();
        }
        this.a = string;
        this.b = j == 0 ? 1 : 2;
    }

    public final void a(angc angcVar, int i) {
        osk f;
        angb c = angc.c(angcVar);
        String str = this.a;
        c.copyOnWrite();
        ((angc) c.instance).t(str);
        angc angcVar2 = (angc) c.mo39build();
        if (this.b - 1 == 0) {
            f = osk.f(i - 1, angcVar2);
        } else {
            f = osk.d(i - 1, angcVar2);
        }
        this.c.a(f);
    }
}
