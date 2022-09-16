package defpackage;

import com.google.protos.youtube.api.innertube.UpdateKidsAllowlistCommandOuterClass;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: abgv  reason: default package */
/* loaded from: classes.dex */
public final class abgv implements aafl {
    public final aafo a;
    private final aaxm b;
    private final Executor c;

    public abgv(aaxm aaxmVar, Executor executor, aafo aafoVar) {
        aaxmVar.getClass();
        this.b = aaxmVar;
        executor.getClass();
        this.c = executor;
        aafoVar.getClass();
        this.a = aafoVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        if (apzgVar != null && apzgVar.qn(UpdateKidsAllowlistCommandOuterClass.updateKidsAllowlistCommand)) {
            final avtb avtbVar = (avtb) apzgVar.qm(UpdateKidsAllowlistCommandOuterClass.updateKidsAllowlistCommand);
            if ((avtbVar.b & 1) == 0) {
                return;
            }
            if (avtbVar.d.size() == 0 && avtbVar.e.size() == 0) {
                return;
            }
            aaxm aaxmVar = this.b;
            aoob aoobVar = apzgVar.c;
            aaxl aaxlVar = new aaxl(aaxmVar.e, aaxmVar.a.c());
            aaxlVar.j(aoobVar);
            aaxlVar.a = avtbVar.c;
            aaxlVar.b = avtbVar.d;
            aaxlVar.c = avtbVar.e;
            ylx.k(aaxmVar.b.b(aaxlVar, anjk.a), this.c, new ylv() { // from class: abgt
                @Override // defpackage.zdt
                /* renamed from: b */
                public final void a(Throwable th) {
                    abgv abgvVar = abgv.this;
                    avtb avtbVar2 = avtbVar;
                    if ((avtbVar2.b & 4) != 0) {
                        aafo aafoVar = abgvVar.a;
                        apzg apzgVar2 = avtbVar2.f;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar.a(apzgVar2);
                    }
                }
            }, new ylw() { // from class: abgu
                @Override // defpackage.ylw, defpackage.zdt
                public final void a(Object obj) {
                    abgv abgvVar = abgv.this;
                    avta avtaVar = (avta) obj;
                    if ((avtaVar.b & 2) != 0) {
                        aafo aafoVar = abgvVar.a;
                        apzg apzgVar2 = avtaVar.d;
                        if (apzgVar2 == null) {
                            apzgVar2 = apzg.a;
                        }
                        aafoVar.a(apzgVar2);
                    }
                }
            });
        }
    }
}
