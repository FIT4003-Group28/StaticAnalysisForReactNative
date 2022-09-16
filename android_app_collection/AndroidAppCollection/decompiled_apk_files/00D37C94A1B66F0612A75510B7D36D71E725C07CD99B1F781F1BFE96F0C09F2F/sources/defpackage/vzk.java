package defpackage;

import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: vzk  reason: default package */
/* loaded from: classes4.dex */
public final class vzk {
    public final aasc a;
    public final whp b;
    public final Executor c;
    public final afvy d;
    public final wea e;
    private final Executor f;

    public vzk(aasc aascVar, whp whpVar, afvy afvyVar, Executor executor, Executor executor2, wea weaVar) {
        aascVar.getClass();
        this.a = aascVar;
        whpVar.getClass();
        this.b = whpVar;
        afvyVar.getClass();
        this.d = afvyVar;
        executor.getClass();
        this.f = executor;
        executor2.getClass();
        this.c = executor2;
        weaVar.getClass();
        this.e = weaVar;
    }

    public static boolean a(aase aaseVar) {
        for (aarw aarwVar : aaseVar.c()) {
            if (aarwVar.l() && (aarwVar.p() || aarwVar.m())) {
                aasf aasfVar = aarwVar.c;
                if (aasfVar.h == null) {
                    aasfVar.b();
                }
                Boolean bool = aasfVar.h;
                if (bool == null || !bool.booleanValue()) {
                    return true;
                }
            }
        }
        return false;
    }

    public final void b(AccountIdentity accountIdentity, cfa cfaVar) {
        this.f.execute(new vzg(this, accountIdentity, new WeakReference(cfaVar)));
    }
}
