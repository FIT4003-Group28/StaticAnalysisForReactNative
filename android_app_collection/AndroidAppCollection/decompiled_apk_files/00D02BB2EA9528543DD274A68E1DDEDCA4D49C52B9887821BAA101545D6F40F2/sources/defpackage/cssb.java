package defpackage;

import android.net.Uri;
import java.io.InputStream;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: cssb  reason: default package */
/* loaded from: classes5.dex */
public final class cssb {
    public final czif a;
    private final Executor b;

    public cssb(Executor executor, czif czifVar) {
        this.b = executor;
        this.a = czifVar;
    }

    public final dehn<InputStream> a(csrx csrxVar, int i) {
        final Uri parse;
        if (i == 0) {
            parse = Uri.parse(csrxVar.a);
        } else if (i == 1) {
            parse = Uri.parse(csrxVar.b);
        } else if (i == 2) {
            parse = Uri.parse(csrxVar.c);
        } else {
            parse = Uri.parse(csrxVar.d);
        }
        return deha.f(new deff(this, parse) { // from class: cssa
            private final cssb a;
            private final Uri b;

            {
                this.a = this;
                this.b = parse;
            }

            @Override // defpackage.deff
            public final dehn a() {
                cssb cssbVar = this.a;
                return deha.a((InputStream) cssbVar.a.d(this.b, czjj.b(), new czio[0]));
            }
        }, this.b);
    }
}
