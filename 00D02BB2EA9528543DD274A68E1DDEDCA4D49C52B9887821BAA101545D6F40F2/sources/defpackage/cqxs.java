package defpackage;

import com.google.android.libraries.geller.portable.Geller;
import java.util.Set;
import java.util.concurrent.ExecutorService;
/* compiled from: PG */
/* renamed from: cqxs  reason: default package */
/* loaded from: classes5.dex */
public final class cqxs {
    public final Geller a;
    public final String b;
    public final ExecutorService c;
    public final ExecutorService d;
    public final ExecutorService e;
    public final Set<cqyx> f;
    public final cqxq i;
    public final pgq j;
    public final pgg k;
    public final cqwq l = new cqwq();
    public final dspt g = dsuz.b(60);
    public final String h = "geller-pa.googleapis.com";

    public cqxs(Geller geller, pgq pgqVar, pgg pggVar, Set set, ExecutorService executorService, ExecutorService executorService2, ExecutorService executorService3) {
        cqws cqwsVar = new cqws();
        Boolean bool = cqwsVar.a;
        if (!(bool == null ? dbpy.a : dbsg.i(bool)).a()) {
            cqwsVar.a = false;
        }
        String str = cqwsVar.a == null ? " enableUploadPagination" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        this.i = new cqwt(cqwsVar.a.booleanValue());
        this.a = geller;
        this.b = "gmm";
        this.j = pgqVar;
        this.k = pggVar;
        this.f = set;
        this.c = executorService;
        this.d = executorService2;
        this.e = executorService3;
    }
}
