package defpackage;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: jea  reason: default package */
/* loaded from: classes3.dex */
public final class jea implements jec {
    public final Context a;
    public final azqb b;
    public final jed c;
    public final ahcy d;
    public final azqb e;
    public final aafo f;
    public final jpd g;
    public final airr h;
    public final fcu i;
    private final azqb j;

    public jea(Context context, jed jedVar, ahcy ahcyVar, azqb azqbVar, airr airrVar, azqb azqbVar2, fcu fcuVar, aafo aafoVar, jpd jpdVar, azqb azqbVar3) {
        this.a = context;
        this.d = ahcyVar;
        this.b = azqbVar;
        this.f = aafoVar;
        this.e = azqbVar2;
        this.c = jedVar;
        this.g = jpdVar;
        this.j = azqbVar3;
        this.h = airrVar;
        this.i = fcuVar;
    }

    public final boolean a(agqv agqvVar) {
        try {
            return ((Boolean) ((agss) this.j.get()).c(agqvVar).get(4L, TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            zep.d("Unable to retrieve if a failed download is retryable.", e);
            if (!(e instanceof InterruptedException)) {
                return false;
            }
            Thread.currentThread().interrupt();
            return false;
        }
    }
}
