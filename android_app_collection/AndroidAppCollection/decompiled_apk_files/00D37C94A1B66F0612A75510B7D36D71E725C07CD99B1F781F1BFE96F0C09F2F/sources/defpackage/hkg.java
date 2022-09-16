package defpackage;

import android.net.Uri;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: hkg  reason: default package */
/* loaded from: classes3.dex */
public final class hkg {
    public static final hkf a = new hkf();
    public final akzg b;
    public final albf c;
    public final akyh d;
    public String e;
    public boolean f;
    private final Executor g;

    public hkg(akzg akzgVar, albf albfVar, akyh akyhVar, hkl hklVar, Executor executor) {
        this.b = akzgVar;
        this.c = albfVar;
        this.d = akyhVar;
        this.g = executor;
        auuw auuwVar = hklVar.a.a().z;
        this.f = (auuwVar == null ? auuw.a : auuwVar).s;
    }

    public final ampq a(ankt anktVar) {
        try {
            return (ampq) anktVar.get(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | CancellationException | ExecutionException | TimeoutException e) {
            amon amonVar = amon.a;
            afus.c(2, 6, "[ShortsCreation][Android][Upload]Failure while retrieving upload.", e);
            return amonVar;
        }
    }

    public final void b() {
        if (!this.f) {
            return;
        }
        c("Failure while clearing files to delete after upload.", this.d.f(this.e));
    }

    public final void c(String str, ankt anktVar) {
        ylx.j(anktVar, this.g, new hke(str));
    }

    public final void d(Uri uri) {
        if (!this.f) {
            return;
        }
        c("Failure while setting source URI.", this.d.n(this.e, uri));
    }

    public final void e(boolean z) {
        if (!this.f) {
            return;
        }
        c("Failure while setting upload flow flavor.", this.d.M(this.e, true != z ? 2 : 7));
    }
}
