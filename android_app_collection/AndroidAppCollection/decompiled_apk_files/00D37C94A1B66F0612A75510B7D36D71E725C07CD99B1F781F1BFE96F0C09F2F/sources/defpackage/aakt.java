package defpackage;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: aakt  reason: default package */
/* loaded from: classes.dex */
public final class aakt {
    private final abfh a;

    public aakt(abfh abfhVar) {
        this.a = abfhVar;
    }

    public final boolean a() {
        try {
            return ((Boolean) this.a.f().get(1L, TimeUnit.SECONDS)).booleanValue();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            return false;
        } catch (ExecutionException e) {
            e = e;
            zep.d("Failed to read safemode", e);
            return false;
        } catch (TimeoutException e2) {
            e = e2;
            zep.d("Failed to read safemode", e);
            return false;
        }
    }
}
