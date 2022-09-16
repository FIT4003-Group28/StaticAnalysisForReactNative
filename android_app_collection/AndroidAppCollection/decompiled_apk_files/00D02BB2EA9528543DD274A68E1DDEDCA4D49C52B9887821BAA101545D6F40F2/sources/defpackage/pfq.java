package defpackage;

import com.google.firebase.appindexing.internal.ActionImpl;
import java.util.concurrent.ExecutionException;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: pfq  reason: default package */
/* loaded from: classes7.dex */
public final class pfq implements Runnable {
    final /* synthetic */ pex a;
    final /* synthetic */ ilo b;
    final /* synthetic */ ckcq c;
    final /* synthetic */ pfs d;

    public pfq(pfs pfsVar, pex pexVar, ilo iloVar, ckcq ckcqVar) {
        this.d = pfsVar;
        this.a = pexVar;
        this.b = iloVar;
        this.c = ckcqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ckcq ckcqVar;
        try {
            try {
                pfs pfsVar = this.d;
                pex pexVar = this.a;
                ilo iloVar = this.b;
                demb dembVar = demb.getInstance(pfsVar.a);
                String n = iloVar.n();
                String uri = iloVar.ax().build().toString();
                pfsVar.b(n, uri, iloVar);
                deln delnVar = new deln(pexVar.g);
                cnwc.a(uri);
                delnVar.c = n;
                delnVar.d = uri;
                delo deloVar = new delo();
                deloVar.a = false;
                delnVar.e = deloVar.a();
                cnwc.n(delnVar.c, "setObject is required before calling build().");
                cnwc.n(delnVar.d, "setObject is required before calling build().");
                String str = delnVar.b;
                String str2 = delnVar.c;
                String str3 = delnVar.d;
                ActionImpl.MetadataImpl metadataImpl = delnVar.e;
                if (metadataImpl == null) {
                    metadataImpl = new delo().a();
                }
                try {
                    cpda.d(dembVar.a(new ActionImpl(str, str2, str3, null, metadataImpl, null, delnVar.a)));
                } catch (InterruptedException | ExecutionException unused) {
                }
                ((ckcn) this.d.b.a().a(ckdf.b)).a();
                ckcqVar = this.c;
            } catch (Throwable th) {
                this.c.b();
                throw th;
            }
        } catch (Error | RuntimeException e) {
            ((ckcn) this.d.b.a().a(ckdf.c)).a();
            bvoo.f(new RuntimeException("Unexpected exception.", e));
            ckcqVar = this.c;
        }
        ckcqVar.b();
    }
}
