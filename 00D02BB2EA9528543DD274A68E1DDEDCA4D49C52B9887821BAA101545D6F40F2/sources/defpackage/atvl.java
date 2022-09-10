package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atvl  reason: default package */
/* loaded from: classes2.dex */
public class atvl extends atth<crrc> {
    private static final long a = TimeUnit.SECONDS.toMillis(20);
    private final atsn b;

    public atvl(crrc crrcVar, btrm btrmVar, btvo btvoVar, cref crefVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, Context context, dehq dehqVar, Executor executor, atsr atsrVar, boolean z) {
        super(crrcVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, a);
        atvk atvkVar = new atvk(this);
        this.b = atvkVar;
        dbsk.b(crrcVar.a == dqvj.DRIVE, "Suggested travel mode should be driving. Other travel modes are not implemented yet.");
        atsm S = S(true);
        S.h = cjtd.a(dtxw.cP);
        M(S.a());
        atsm R = R(false);
        R.b();
        R.c = cqvf.l(R.string.SUGGEST_PROMPT_SWITCH_TRAVEL_MODE_BUTTON);
        R.d = cqvf.l(R.string.SUGGEST_PROMPT_SWITCH_TRAVEL_MODE_ACTION);
        R.f = atxv.ACCEPT;
        R.g = atvkVar;
        R.h = cjtd.a(dtxw.cO);
        j(R.a());
        this.p = this.j.getString(R.string.SUGGEST_PROMPT_SWITCH_TO_DRIVING_NAVIGATION);
        B(this.j.getString(R.string.SUGGEST_PROMPT_STATE_YOU_ARE_USING_WALKING_NAVIGATION));
        H(iup.g(iup.c(R.raw.ic_qu_drive, cqta.g()), 0.6f, ibl.H()));
        this.v = cjtd.a(dtxw.cN);
    }

    @Override // defpackage.atss
    protected final crfj u() {
        return crfj.b(crfi.OTHER, this.j.getString(R.string.SUGGEST_PROMPT_STATE_YOU_ARE_USING_WALKING_NAVIGATION), -1);
    }
}
