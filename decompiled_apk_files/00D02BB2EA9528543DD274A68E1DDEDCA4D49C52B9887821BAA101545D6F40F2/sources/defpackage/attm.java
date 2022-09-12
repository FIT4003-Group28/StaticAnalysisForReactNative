package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: attm  reason: default package */
/* loaded from: classes2.dex */
public class attm extends atth<crpz> {
    private static final long b = TimeUnit.SECONDS.toMillis(10);
    public final crpz a;

    public attm(crpz crpzVar, btrm btrmVar, btvo btvoVar, cref crefVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, Context context, boolean z) {
        super(crpzVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, b);
        this.a = crpzVar;
        this.p = this.j.getString(R.string.ENROUTE_SEARCH_RESULT_UPGRADE_PROMPT_TITLE);
        this.q = this.j.getString(R.string.ENROUTE_SEARCH_RESULT_UPGRADE_PROMPT_SUBTITLE);
        atsm S = S(false);
        S.c = cqrt.l(R.string.ENROUTE_SEARCH_RESULT_UPGRADE_PROMPT_DECLINE_BUTTON);
        S.g = d(false);
        S.h = cjtd.a(dtxw.aA);
        M(S.a());
        atsm R = R(true);
        R.f = atxv.ACCEPT;
        R.b();
        R.d = cqrt.l(R.string.ENROUTE_SEARCH_RESULT_UPGRADE_CONFIRMATION_TEXT);
        R.c = cqrt.l(R.string.ENROUTE_SEARCH_RESULT_UPGRADE_PROMPT_ACCEPT_BUTTON);
        R.g = d(true);
        R.h = cjtd.a(dtxw.az);
        j(R.a());
        H(iup.c(R.raw.ic_cloud_circle_done_black_24dp, iva.b(ibl.ac(), cqrt.c(R.color.mod_google_dark_green500))));
        this.v = cjtd.a(dtxw.ay);
    }

    private final atsn d(boolean z) {
        return new attl(this, z);
    }

    @Override // defpackage.atss, defpackage.atxz
    public boolean W() {
        return true;
    }
}
