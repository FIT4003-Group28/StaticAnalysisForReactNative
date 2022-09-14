package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.util.Pair;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.googlehelp.GoogleHelp;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* compiled from: PG */
/* renamed from: cody  reason: default package */
/* loaded from: classes5.dex */
public final class cody implements Runnable {
    private final Context a;
    private final GoogleHelp b;
    private final codq c;
    private final long d;

    public cody(Context context, GoogleHelp googleHelp, codq codqVar, long j) {
        this.a = context;
        this.b = googleHelp;
        this.c = codqVar;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        List singletonList;
        try {
            code codeVar = new code();
            codeVar.c();
            singletonList = new ArrayList(1);
            singletonList.add(Pair.create("version", "10.55.4"));
            try {
                singletonList.add(Pair.create("gms:googlehelp:async_help_psd_collection_time_ms", String.valueOf(codeVar.a())));
            } catch (UnsupportedOperationException unused) {
                ArrayList arrayList = new ArrayList(singletonList);
                arrayList.add(Pair.create("gms:googlehelp:async_help_psd_collection_time_ms", String.valueOf(codeVar.a())));
                singletonList = arrayList;
            }
        } catch (Exception unused2) {
            singletonList = Collections.singletonList(Pair.create("gms:googlehelp:async_help_psd_failure", "exception"));
        }
        coej b = codv.b(this.a);
        GoogleHelp googleHelp = this.b;
        Bundle a = codd.a(singletonList);
        long j = this.d;
        GoogleApiClient googleApiClient = b.i;
        coef coefVar = new coef(googleApiClient, a, j, googleHelp);
        googleApiClient.enqueue(coefVar);
        cnwb.c(coefVar);
    }
}
