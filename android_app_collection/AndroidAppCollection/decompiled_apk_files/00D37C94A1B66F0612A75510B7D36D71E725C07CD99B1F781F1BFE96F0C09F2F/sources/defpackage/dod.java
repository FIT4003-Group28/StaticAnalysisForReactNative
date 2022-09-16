package defpackage;

import android.content.Context;
import android.util.Log;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: dod  reason: default package */
/* loaded from: classes3.dex */
public final class dod {
    private final Context a;

    public dod() {
    }

    public dod(Context context) {
        this();
        this.a = context;
    }

    public static final void a(Context context, doo dooVar) {
        new Thread(new doc(context, dooVar)).start();
    }

    public final void b(String str, long j) {
        try {
            Context context = this.a;
            doo dooVar = new doo();
            dooVar.a = str;
            dooVar.b = true;
            dooVar.f = true;
            dooVar.e = TimeUnit.MILLISECONDS.toSeconds(j);
            a(context, dooVar);
        } catch (Exception e) {
            Log.e("GoogleConversionReporter", "Error sending ping", e);
        }
    }
}
