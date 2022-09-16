package defpackage;

import android.content.Context;
import com.google.android.apps.maps.R;
import java.util.List;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: atty  reason: default package */
/* loaded from: classes2.dex */
public class atty extends atss<crqh> {
    private final vtn a;

    public atty(Context context, vtn vtnVar, btrm btrmVar, btvo btvoVar, cref crefVar, cqat cqatVar, cjqy cjqyVar, cjqq cjqqVar, dehq dehqVar, Executor executor, atsr atsrVar, boolean z, cqhn cqhnVar, crqh crqhVar) {
        super(crqhVar, context, btrmVar, btvoVar, crefVar, context.getResources(), cqatVar, cjqyVar, cjqqVar, dehqVar, executor, atsrVar, z, 3500L);
        this.a = vtnVar;
    }

    @Override // defpackage.atss, defpackage.atxz
    public List<atxw> I() {
        return dcdc.e();
    }

    @Override // defpackage.atss, defpackage.atxz
    public Boolean J(int i) {
        return false;
    }

    @Override // defpackage.atss, defpackage.atxz
    public void Oa() {
        String string = this.j.getString(((crqh) this.e).a.intValue());
        dbsk.s(string);
        this.p = string;
        this.q = this.j.getString(R.string.INCIDENT_CALLOUT_PROMPT_REPORTED_TEXT);
        M(S(true).a());
        auei aueiVar = ((crqh) this.e).c;
        cqtd a = yzw.a(aueiVar.a(), aueiVar.b(), this.a, new vtk(this) { // from class: attx
            private final atty a;

            {
                this.a = this;
            }

            @Override // defpackage.vtk
            public final void a(cqtd cqtdVar) {
                this.a.H(cqtdVar);
            }
        });
        if (a == null) {
            a = cqtt.c();
        }
        H(a);
        super.Oa();
    }

    @Override // defpackage.atss, defpackage.atxz
    public atxx U() {
        return atxx.DEFAULT;
    }
}
