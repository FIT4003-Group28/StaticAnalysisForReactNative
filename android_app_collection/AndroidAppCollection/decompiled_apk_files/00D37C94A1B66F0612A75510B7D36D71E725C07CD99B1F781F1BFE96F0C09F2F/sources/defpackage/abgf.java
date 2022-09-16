package defpackage;

import android.content.SharedPreferences;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
/* compiled from: PG */
/* renamed from: abgf  reason: default package */
/* loaded from: classes.dex */
public final class abgf extends abge {
    private final azqb a;
    private final Executor b;
    private boolean c;

    public abgf(SharedPreferences sharedPreferences, azqb azqbVar, azqb azqbVar2, Executor executor) {
        super(sharedPreferences, azqbVar2);
        this.a = azqbVar;
        this.b = executor;
    }

    @Override // defpackage.abge
    protected final synchronized void c() {
        if (this.c) {
            return;
        }
        aaxg aaxgVar = (aaxg) this.a.get();
        aaxf a = aaxgVar.a();
        a.k(aadi.b);
        try {
            try {
                try {
                    b((asgd) aaxgVar.b(a, this.b).get(4L, TimeUnit.SECONDS));
                } catch (TimeoutException unused) {
                    d(4);
                }
            } catch (InterruptedException unused2) {
                d(21);
            }
        } catch (ExecutionException unused3) {
            d(22);
        }
        this.c = true;
    }
}
