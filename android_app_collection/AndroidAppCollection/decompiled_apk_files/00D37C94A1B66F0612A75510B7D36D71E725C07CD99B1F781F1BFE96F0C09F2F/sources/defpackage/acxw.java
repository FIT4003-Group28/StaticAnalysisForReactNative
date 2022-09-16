package defpackage;

import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: acxw  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acxw implements ylw {
    public final /* synthetic */ acya a;
    private final /* synthetic */ int b;

    public /* synthetic */ acxw(acya acyaVar) {
        this.a = acyaVar;
    }

    public /* synthetic */ acxw(acya acyaVar, int i) {
        this.b = i;
        this.a = acyaVar;
    }

    @Override // defpackage.ylw, defpackage.zdt
    public final void a(Object obj) {
        long j;
        int i = this.b;
        if (i != 0) {
            if (i == 1) {
                this.a.j.e("mdx_fallback_background_scanner", ((acxt) obj).c, true, 2, null, acya.a, false);
                return;
            } else {
                this.a.b((List) obj);
                return;
            }
        }
        acya acyaVar = this.a;
        acxt acxtVar = (acxt) obj;
        if (!acyaVar.d.r()) {
            j = 0;
        } else {
            long millis = TimeUnit.SECONDS.toMillis(acxtVar.b);
            String.format(Locale.US, "scanning for %d ms", Long.valueOf(millis));
            if (!acyaVar.g) {
                acyaVar.b.Q(acyaVar);
            } else {
                acyaVar.b.P(acyaVar);
            }
            j = millis;
        }
        acyaVar.h.postDelayed(acyaVar.i, j);
    }
}
