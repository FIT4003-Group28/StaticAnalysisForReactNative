package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atuh  reason: default package */
/* loaded from: classes2.dex */
public class atuh extends atss<crqs> {
    private final dpdf c;
    private static final cqtd b = asab.d;
    static final long a = TimeUnit.SECONDS.toMillis(10);

    public atuh(crqs crqsVar, btrm btrmVar, btvo btvoVar, cref crefVar, Context context, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, vtn vtnVar, dehq dehqVar, Executor executor, atsr atsrVar, boolean z) {
        super(crqsVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, a);
        dpdf dpdfVar = crqsVar.a;
        this.c = dpdfVar;
        this.p = dpdfVar.e;
        int a2 = dpde.a(dpdfVar.d);
        cqtd cqtdVar = null;
        if (a2 != 0 && a2 == 2 && (dpdfVar.b != 6 || (cqtdVar = vtnVar.e(albv.e(((dpda) dpdfVar.c).b), bvlw.a)) == null)) {
            cqtdVar = b;
        }
        H(cqtdVar);
        cjtd a3 = cjtd.a(dtxw.bz);
        atsm S = S(true);
        S.h = a3;
        M(S.a());
        this.v = cjtd.a(dtxw.by);
    }

    @Override // defpackage.atss, defpackage.atxz
    public atxx U() {
        return atxx.NAVIGATION_POPUP;
    }

    @Override // defpackage.atss
    protected final crfj u() {
        return this.i.q().i(-1, this.c.f, -1, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.atss
    public final void v() {
        this.l.g().d(cjtd.a(dtxw.bA));
    }

    @Override // defpackage.atss, defpackage.atxz
    public CharSequence y() {
        return this.j.getString(R.string.BORDER_CROSSING_WELCOME_TO);
    }
}
