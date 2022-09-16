package defpackage;

import android.content.SharedPreferences;
/* compiled from: PG */
/* renamed from: fgm  reason: default package */
/* loaded from: classes3.dex */
final class fgm {
    public final ampq a;
    public final ampq b;

    public fgm(SharedPreferences sharedPreferences) {
        this.a = ampq.i(sharedPreferences);
        this.b = amon.a;
    }

    public fgm(vlq vlqVar) {
        this.a = amon.a;
        this.b = ampq.i(vlqVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final int a(String str, int i) {
        if (this.a.h()) {
            return ((SharedPreferences) this.a.c()).getInt(str, i);
        }
        return this.b.h() ? ((vlq) this.b.c()).a(str, i) : i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(String str) {
        if (this.a.h()) {
            return ((SharedPreferences) this.a.c()).contains(str);
        }
        return this.b.h() && ((vlq) this.b.c()).e(str);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c(String str) {
        if (this.a.h()) {
            return ((SharedPreferences) this.a.c()).getBoolean(str, false);
        }
        return this.b.h() && ((vlq) this.b.c()).f(str, false);
    }
}
