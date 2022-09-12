package defpackage;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: zac  reason: default package */
/* loaded from: classes7.dex */
public final class zac implements btzi<dhru, dhry> {
    final /* synthetic */ zad a;
    final /* synthetic */ znl b;

    public zac(zad zadVar, znl znlVar) {
        this.a = zadVar;
        this.b = znlVar;
    }

    @Override // defpackage.btzi
    public final void QY(btzr<dhru> btzrVar, btzy btzyVar) {
        this.a.c();
    }

    @Override // defpackage.btzi
    public final /* bridge */ /* synthetic */ void QZ(btzr<dhru> btzrVar, dhry dhryVar) {
        c(dhryVar);
    }

    public final void c(dhry dhryVar) {
        zad zadVar;
        try {
            try {
                final URL url = new URL(dhryVar.b);
                Executor executor = this.a.c;
                final znl znlVar = this.b;
                executor.execute(new Runnable(znlVar, url) { // from class: zab
                    private final URL a;
                    private final znl b;

                    {
                        this.b = znlVar;
                        this.a = url;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        znl znlVar2 = this.b;
                        zno.a(this.a, znlVar2.a, znlVar2.b, znlVar2.c, znlVar2.d, znlVar2.e);
                    }
                });
                zadVar = this.a;
            } catch (MalformedURLException e) {
                bvoo.j(e);
                zadVar = this.a;
            }
            zadVar.c();
        } catch (Throwable th) {
            this.a.c();
            throw th;
        }
    }
}
