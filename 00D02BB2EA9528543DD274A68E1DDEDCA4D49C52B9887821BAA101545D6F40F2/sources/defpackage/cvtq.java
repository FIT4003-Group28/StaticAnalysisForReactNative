package defpackage;

import android.os.Bundle;
/* compiled from: PG */
/* renamed from: cvtq  reason: default package */
/* loaded from: classes5.dex */
public final class cvtq {
    public cvtr a;
    public cvmb b;

    public final void a(int i) {
        czhz.c();
        cvmb cvmbVar = this.b;
        if (((cvmc) cvmbVar).b.d(7)) {
            cvlw.a("ChimePeriodicTaskManager", "Periodic Task already scheduled.", new Object[0]);
        } else {
            try {
                ((cvmc) cvmbVar).b.e(7, "PERIODIC_TASK", new Bundle(), cvmc.a);
            } catch (cvno unused) {
                cvlw.f("ChimePeriodicTaskManager", "Unable to schedule periodic task.", new Object[0]);
            }
        }
        cvtr cvtrVar = this.a;
        for (cvkc cvkcVar : cvtrVar.a.a()) {
            String b = cvkcVar.b();
            cviv f = cvkcVar.f();
            if (f == cviv.REGISTERED || f == cviv.PENDING_REGISTRATION || f == cviv.FAILED_REGISTRATION) {
                cvtrVar.a(b, true, i);
            }
        }
    }
}
