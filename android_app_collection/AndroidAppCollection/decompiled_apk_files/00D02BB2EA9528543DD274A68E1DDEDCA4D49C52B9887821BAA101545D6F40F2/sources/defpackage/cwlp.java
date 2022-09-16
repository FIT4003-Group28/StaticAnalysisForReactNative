package defpackage;

import android.accounts.Account;
import android.content.Context;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cwlp  reason: default package */
/* loaded from: classes5.dex */
public final class cwlp implements cwll {
    public static final String[] a = {cpka.a("googleone")};
    public final Context b;
    public final dehp c;

    public cwlp(Context context, ExecutorService executorService) {
        this.b = context;
        this.c = dehx.c(executorService);
    }

    @Override // defpackage.cwll
    public final dehn<List<Account>> a() {
        return dbae.e(new Callable(this) { // from class: cwlm
            private final cwlp a;

            {
                this.a = this;
            }

            @Override // java.util.concurrent.Callable
            public final Object call() {
                return Arrays.asList(cmrb.d(this.a.b));
            }
        }, this.c);
    }
}
