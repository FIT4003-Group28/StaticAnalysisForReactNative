package defpackage;

import android.net.Uri;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: wnm  reason: default package */
/* loaded from: classes4.dex */
public final class wnm {
    private final afvn a;
    private final Executor b;

    public wnm(afvn afvnVar, Executor executor) {
        this.a = afvnVar;
        this.b = executor;
    }

    private final void c(final xey xeyVar, final Uri uri, final afxt afxtVar, final boolean z, final long j) {
        if (uri == null || Uri.EMPTY.equals(uri)) {
            throw new wup("Null or empty uri when trying to log");
        }
        final afwt c = xeyVar.c(uri, this.a.c());
        this.b.execute(new Runnable() { // from class: wnl
            @Override // java.lang.Runnable
            public final void run() {
                Uri uri2 = uri;
                afwt afwtVar = c;
                afxt afxtVar2 = afxtVar;
                boolean z2 = z;
                long j2 = j;
                xey xeyVar2 = xeyVar;
                String.valueOf(String.valueOf(uri2)).length();
                afwtVar.a(afxtVar2);
                afwtVar.d = z2;
                afwtVar.e = j2;
                xeyVar2.a(afwtVar, afzr.a);
            }
        });
    }

    public final void a(xey xeyVar, xcd xcdVar) {
        c(xeyVar, xcdVar.a, xcdVar.b, xcdVar.c, xcdVar.d);
    }

    public final void b(xey xeyVar, apae apaeVar, Uri uri) {
        c(xeyVar, uri, new xex(apaeVar.e), apaeVar.f, Long.MAX_VALUE);
    }
}
