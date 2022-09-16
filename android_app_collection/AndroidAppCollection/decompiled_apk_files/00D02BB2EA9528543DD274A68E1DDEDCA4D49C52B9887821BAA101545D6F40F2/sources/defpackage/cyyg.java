package defpackage;

import android.content.Context;
import com.google.android.libraries.social.populous.core.ClientConfigInternal;
import java.util.Locale;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cyyg  reason: default package */
/* loaded from: classes5.dex */
public final class cyyg implements cyzm {
    public final Context a;
    public final dehp b;
    public final cyph c;
    @dzsi
    public final cyyf d;
    private final dcep<cydt> e;
    private final ClientConfigInternal f;
    private final cyuj g;

    public cyyg(Context context, ExecutorService executorService, ClientConfigInternal clientConfigInternal, Locale locale, cyph cyphVar, cxyg cxygVar) {
        this.e = clientConfigInternal.l;
        this.f = clientConfigInternal;
        this.a = context;
        this.g = new cyuj(locale);
        this.b = dehx.c(executorService);
        this.d = dyat.b() ? new cyyf(this, cxygVar) : null;
        dbsk.s(cyphVar);
        this.c = cyphVar;
    }

    public final dcdc<cyzl> a(String str, cyor cyorVar) {
        return cyzj.a(this.a, str, this.f, this.g, this.c, cyorVar);
    }

    @Override // defpackage.cyzm
    public final boolean b() {
        if (!this.f.x) {
            dcep<cydt> dcepVar = this.e;
            return (dcepVar.contains(cydt.PHONE_NUMBER) || dcepVar.contains(cydt.EMAIL)) && c();
        }
        return false;
    }

    @Override // defpackage.cyzm
    public final boolean c() {
        return cyzj.i(this.a);
    }
}
