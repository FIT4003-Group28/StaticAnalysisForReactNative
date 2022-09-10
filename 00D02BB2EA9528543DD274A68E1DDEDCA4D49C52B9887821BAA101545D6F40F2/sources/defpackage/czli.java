package defpackage;

import android.net.Uri;
import java.io.Closeable;
import java.io.IOException;
/* compiled from: PG */
/* renamed from: czli  reason: default package */
/* loaded from: classes5.dex */
final class czli<T> implements czjv<T> {
    private final czlk<T> a;

    public czli(czlk<T> czlkVar) {
        this.a = czlkVar;
    }

    @Override // defpackage.czjv
    public final dehn<Void> a(final dehn<T> dehnVar) {
        final czlk<T> czlkVar = this.a;
        return czlkVar.k.b(dazv.f(new deff(czlkVar, dehnVar) { // from class: czle
            private final czlk a;
            private final dehn b;

            {
                this.a = czlkVar;
                this.b = dehnVar;
            }

            @Override // defpackage.deff
            public final dehn a() {
                dehn e;
                czlk czlkVar2 = this.a;
                dehn dehnVar2 = this.b;
                Uri uri = (Uri) deha.r(czlkVar2.b);
                czix a = czix.a((Closeable) czlkVar2.e.d(uri, czjh.b(), new czio[0]));
                try {
                    try {
                        czlkVar2.d(uri);
                        e = dehk.a;
                    } catch (IOException unused) {
                        e = czlkVar2.e(dehnVar2);
                    }
                    dehn f = czlk.f(e, a.b(), czlkVar2.d);
                    a.close();
                    return f;
                } catch (Throwable th) {
                    try {
                        a.close();
                    } catch (Throwable th2) {
                        deki.a(th, th2);
                    }
                    throw th;
                }
            }
        }), czlkVar.d);
    }
}
