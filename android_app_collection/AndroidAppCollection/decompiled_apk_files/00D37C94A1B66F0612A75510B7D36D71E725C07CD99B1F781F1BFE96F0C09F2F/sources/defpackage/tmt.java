package defpackage;

import java.util.HashSet;
import java.util.Set;
/* compiled from: PG */
/* renamed from: tmt  reason: default package */
/* loaded from: classes4.dex */
public final class tmt {
    public final Set a;

    public tmt() {
        this.a = new HashSet();
    }

    public tmt(Set set) {
        this.a = set;
    }

    public static final void d(RuntimeException runtimeException) {
        ((anav) ((anav) ((anav) tol.a.f()).h(runtimeException)).i("com/google/android/libraries/logging/ve/handlers/result/flogger/FloggerResultDaggerModule", "lambda$provideErrorHandler$0", 19, "FloggerResultDaggerModule.java")).o();
    }

    public final void a(Object obj) {
        if (!this.a.isEmpty()) {
            for (tmr tmrVar : this.a) {
                tmrVar.b(obj);
            }
        }
    }

    public final void b(Object obj) {
        if (!this.a.isEmpty()) {
            for (tmr tmrVar : this.a) {
                tmrVar.d(obj);
            }
        }
    }

    public final boolean c() {
        return !this.a.isEmpty();
    }

    public final void e(String str, int i, String str2) {
        for (tmt tmtVar : this.a) {
            tmtVar.e(str, i, str2);
        }
    }

    public final void f(String str, int i, dlj dljVar, String str2) {
        for (tmt tmtVar : this.a) {
            tmtVar.f(str, i, dljVar, str2);
        }
    }

    public final void g(String str, int i, int i2, String str2) {
        for (tmt tmtVar : this.a) {
            tmtVar.g(str, i, i2, str2);
        }
    }

    public final void h(String str, Object obj, Object obj2, String str2, String str3, Boolean bool, String str4) {
        for (tmt tmtVar : this.a) {
            tmtVar.h(str, obj, obj2, str2, str3, bool, str4);
        }
    }

    public final void i(String str, int i, dlj dljVar, String str2) {
        for (tmt tmtVar : this.a) {
            tmtVar.i(str, i, dljVar, str2);
        }
    }
}
