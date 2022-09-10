package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: atws  reason: default package */
/* loaded from: classes2.dex */
public class atws extends atss<crqk> {
    private static final long a = TimeUnit.SECONDS.toMillis(3);

    public atws(crqk crqkVar, Context context, btrm btrmVar, btvo btvoVar, cref crefVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, boolean z) {
        super(crqkVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, a);
        cqtd h;
        izn iznVar = new izn(this) { // from class: atwr
            private final atws a;

            {
                this.a = this;
            }

            @Override // defpackage.izn
            public final cqkl a() {
                return this.a.d();
            }
        };
        boolean z2 = false;
        if (!this.w.h() && !this.w.c()) {
            z2 = true;
        }
        dbsk.l(z2);
        this.w = new iwr(iznVar, dehqVar, executor);
        this.p = context.getString(crqkVar.a == 0 ? R.string.JOURNEY_SHARING_CREATED : R.string.JOURNEY_WAS_NOT_CREATED);
        if (crqkVar.a == 0) {
            h = cqrt.h(2131231568, ibl.H());
        } else {
            h = cqrt.h(2131232980, ire.n());
        }
        super.H(h);
        if (crqkVar.a == 2) {
            this.q = context.getString(R.string.JOURNEY_SHARING_TRY_AGAIN_LATER);
        }
    }

    @Override // defpackage.atss, defpackage.atxz
    public Boolean c() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ cqkl d() {
        super.p();
        return cqkl.a;
    }
}
