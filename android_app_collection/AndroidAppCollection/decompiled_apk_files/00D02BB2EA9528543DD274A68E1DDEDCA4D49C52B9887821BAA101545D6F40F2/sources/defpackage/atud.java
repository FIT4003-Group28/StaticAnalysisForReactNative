package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atud  reason: default package */
/* loaded from: classes2.dex */
public class atud extends atth<crql> {
    private static final long b = TimeUnit.SECONDS.toMillis(10);
    public final lnp a;

    public atud(crql crqlVar, btrm btrmVar, btvo btvoVar, cref crefVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, Context context, boolean z) {
        super(crqlVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, b);
        lnp lnpVar = crqlVar.a;
        this.a = lnpVar;
        this.p = this.j.getString(R.string.JOURNEY_SHARING_PENDING_PROMPT_TEXT, d());
        atsm R = R(true);
        R.g = new atsn(this) { // from class: atua
            private final atud a;

            {
                this.a = this;
            }

            @Override // defpackage.atsn
            public final void a(boolean z2) {
                lnp lnpVar2 = this.a.a;
                lnpVar2.a.c(dcdc.f(lnpVar2.c));
                lnpVar2.b.e();
            }
        };
        R.h = cjtd.a(dtxm.bi);
        j(R.a());
        atsm S = S(false);
        S.c = cqrt.l(R.string.JOURNEY_CANCEL);
        S.g = new atsn(this) { // from class: atub
            private final atud a;

            {
                this.a = this;
            }

            @Override // defpackage.atsn
            public final void a(boolean z2) {
                lnp lnpVar2 = this.a.a;
                lnpVar2.a.a();
                lnpVar2.b.f();
            }
        };
        S.h = cjtd.a(dtxm.bh);
        M(S.a());
        H(cqrt.f(2131232998));
        atuc atucVar = new atuc(this);
        Bitmap bitmap = lnpVar.e;
        if (bitmap != null) {
            atucVar.a(bitmap);
        }
        lnpVar.d.add(atucVar);
    }

    private final CharSequence d() {
        dqyb dqybVar;
        dqya dqyaVar;
        dqyj dqyjVar;
        if (e().a != 1) {
            dqzx e = e();
            if (e.a == 2) {
                dqybVar = (dqyb) e.b;
            } else {
                dqybVar = dqyb.j;
            }
            if (dqybVar.b == 6) {
                dqyaVar = (dqya) dqybVar.c;
            } else {
                dqyaVar = dqya.e;
            }
            return dqyaVar.b;
        }
        dqzx e2 = e();
        if (e2.a == 1) {
            dqyjVar = (dqyj) e2.b;
        } else {
            dqyjVar = dqyj.f;
        }
        return dqyjVar.d;
    }

    private final dqzx e() {
        return this.a.c;
    }

    @Override // defpackage.atth, defpackage.atss, defpackage.atxz
    public atxx U() {
        return atxx.JRNY_PENDING;
    }

    @Override // defpackage.atss
    @dzsi
    protected final crfj u() {
        return crfj.d(crfi.OTHER, this.j.getString(R.string.JOURNEY_SHARING_PENDING_PROMPT_TTS, d()).toString());
    }
}
