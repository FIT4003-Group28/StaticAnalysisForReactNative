package defpackage;

import android.content.Context;
import com.google.android.gms.pseudonymous.PseudonymousIdToken;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: czoe  reason: default package */
/* loaded from: classes5.dex */
public final class czoe {
    private final Context a;

    public czoe(Context context) {
        this.a = context;
    }

    public final String a() {
        String str = "";
        try {
            String valueOf = String.valueOf(((PseudonymousIdToken) cpda.e(coym.a(this.a).a(), 1000L, TimeUnit.MILLISECONDS)).a);
            str = valueOf.length() != 0 ? "NID=".concat(valueOf) : new String("NID=");
            int i = czph.a;
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        } catch (ExecutionException | TimeoutException unused2) {
        }
        return str;
    }
}
