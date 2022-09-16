package defpackage;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
@Deprecated
/* renamed from: alhi  reason: default package */
/* loaded from: classes.dex */
public final class alhi extends aleo {
    private final ScheduledExecutorService a;

    public alhi(aadd aaddVar, ScheduledExecutorService scheduledExecutorService, albf albfVar, akze akzeVar, alht alhtVar) {
        super(aaddVar, avuo.UPLOAD_PROCESSOR_TYPE_UNKNOWN, albfVar, akzeVar, alhtVar);
        this.a = scheduledExecutorService;
    }

    @Override // defpackage.algt
    public final albu a(alcw alcwVar) {
        return null;
    }

    @Override // defpackage.algt
    public final alct b(alcw alcwVar) {
        alct alctVar = alcwVar.f62J;
        return alctVar == null ? alct.a : alctVar;
    }

    @Override // defpackage.aleo
    public final ankt c(String str, akzp akzpVar, alcw alcwVar) {
        return s(str, akzpVar);
    }

    @Override // defpackage.algt
    public final aypx e() {
        return alhh.a;
    }

    @Override // defpackage.algt
    public final String f() {
        return "WaitForScottyResourceIdTask";
    }

    @Override // defpackage.algt
    public final boolean h() {
        return true;
    }

    @Override // defpackage.aleo
    public final boolean i(alcw alcwVar) {
        return (alcwVar.c & 1) != 0;
    }

    public final ankt s(final String str, final akzp akzpVar) {
        alcw b = akzpVar.b(str);
        if (b != null) {
            if ((b.c & 2) == 0) {
                alct alctVar = b.H;
                if (alctVar == null) {
                    alctVar = alct.a;
                }
                if (alht.k(alctVar)) {
                    return anlz.q(t(this.d.c(avun.UPLOAD_PROCESSOR_FAILURE_REASON_INVALID_JOB_STATE), true));
                }
                return anlz.s(new aniq() { // from class: alhg
                    @Override // defpackage.aniq
                    public final ankt a() {
                        return alhi.this.s(str, akzpVar);
                    }
                }, 10000L, TimeUnit.MILLISECONDS, this.a);
            }
            return anlz.q(t(this.d.e(), true));
        }
        throw akzh.a(avun.UPLOAD_PROCESSOR_FAILURE_REASON_JOB_NOT_FOUND);
    }
}
