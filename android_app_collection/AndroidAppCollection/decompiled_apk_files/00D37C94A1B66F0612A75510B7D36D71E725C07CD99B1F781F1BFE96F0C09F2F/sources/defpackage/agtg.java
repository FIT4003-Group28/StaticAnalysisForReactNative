package defpackage;

import android.text.TextUtils;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: agtg  reason: default package */
/* loaded from: classes.dex */
final class agtg implements ankb {
    final /* synthetic */ ampt a;
    final /* synthetic */ agpt b;
    final /* synthetic */ String c;
    final /* synthetic */ ankt d;
    final /* synthetic */ Executor e;
    final /* synthetic */ int f;

    public agtg(ampt amptVar, agpt agptVar, String str, int i, ankt anktVar, Executor executor) {
        this.a = amptVar;
        this.b = agptVar;
        this.c = str;
        this.f = i;
        this.d = anktVar;
        this.e = executor;
    }

    @Override // defpackage.ankb
    public final void a(Throwable th) {
    }

    @Override // defpackage.ankb
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        agti agtiVar = (agti) obj;
        if (this.a.a(agtiVar.a)) {
            int i = agtiVar.b;
            int i2 = i != 1 ? i != 2 ? 1 : 4 : 3;
            if (i2 == 1) {
                zep.b("[Offline] Encountered unknown fallback reason. Likely bug in fallback strategy.");
            }
            this.b.e(TextUtils.isEmpty(this.c) ? amon.a : ampq.j(this.c), this.f, i2);
            return;
        }
        anlz.A(this.d, new agth(this.b, this.c, this.f), this.e);
    }
}
