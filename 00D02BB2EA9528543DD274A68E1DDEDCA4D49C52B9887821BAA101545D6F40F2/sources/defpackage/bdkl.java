package defpackage;

import android.app.Application;
import android.media.MediaMetadataRetriever;
import java.util.concurrent.Executor;
/* compiled from: PG */
/* renamed from: bdkl  reason: default package */
/* loaded from: classes3.dex */
public final class bdkl {
    public final Application a;
    public final bbtk b;
    public final bbtt c;
    private final Executor d;

    public bdkl(Application application, bbtk bbtkVar, bbtt bbttVar, Executor executor) {
        this.a = application;
        this.b = bbtkVar;
        this.c = bbttVar;
        this.d = executor;
    }

    public static boolean a(bbtj bbtjVar) {
        boolean z = bbtjVar.r().a() && bbtjVar.s().a();
        return bbtjVar.b().equals(bbti.VIDEO) ? z && bbtjVar.t().a() : z;
    }

    public static final boolean c(bbtj bbtjVar) {
        return !a(bbtjVar);
    }

    public final void b(final bbtj bbtjVar, final bdnz bdnzVar) {
        if (a(bbtjVar)) {
            return;
        }
        this.d.execute(new Runnable(this, bbtjVar, bdnzVar) { // from class: bdkk
            private final bdkl a;
            private final bbtj b;
            private final bdnz c;

            {
                this.a = this;
                this.b = bbtjVar;
                this.c = bdnzVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                bbtj b;
                bdkl bdklVar = this.a;
                bbtj bbtjVar2 = this.b;
                bdnz bdnzVar2 = this.c;
                try {
                    bvrj.UI_THREAD.d();
                    if (!bbtjVar2.b().equals(bbti.VIDEO)) {
                        dbsk.a(bbtjVar2.b().equals(bbti.PHOTO));
                        if (!bdkl.a(bbtjVar2)) {
                            int[] b2 = bdklVar.c.b(bbtjVar2.a());
                            dbuh.a(b2.length == 2);
                            bbtl u = bbtjVar2.q().u();
                            u.q(Integer.valueOf(b2[0]));
                            u.p(Integer.valueOf(b2[1]));
                            u.n(0);
                            b = bdklVar.b.b(u.a());
                            bdnzVar2.a(dbsg.i(b));
                            return;
                        }
                        b = bbtjVar2;
                        bdnzVar2.a(dbsg.i(b));
                        return;
                    }
                    dbsk.a(bbtjVar2.b().equals(bbti.VIDEO));
                    if (!bdkl.a(bbtjVar2)) {
                        bbtm q = bbtjVar2.q();
                        bbtl u2 = q.u();
                        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                        mediaMetadataRetriever.setDataSource(bdklVar.a, bbtjVar2.a());
                        if (!q.g().a()) {
                            u2.q(Integer.valueOf(Integer.parseInt(mediaMetadataRetriever.extractMetadata(18))));
                        }
                        if (!q.h().a()) {
                            u2.p(Integer.valueOf(Integer.parseInt(mediaMetadataRetriever.extractMetadata(19))));
                        }
                        if (!q.i().a()) {
                            u2.n(Integer.valueOf(Integer.parseInt(mediaMetadataRetriever.extractMetadata(24))));
                        }
                        if (!bbtjVar2.t().a()) {
                            u2.d(Long.valueOf(Long.parseLong(mediaMetadataRetriever.extractMetadata(9))));
                        }
                        b = bdklVar.b.b(u2.a());
                        bdnzVar2.a(dbsg.i(b));
                        return;
                    }
                    b = bbtjVar2;
                    bdnzVar2.a(dbsg.i(b));
                    return;
                } catch (Exception unused) {
                    bbtjVar2.a();
                    bdnzVar2.a(dbpy.a);
                }
                bbtjVar2.a();
                bdnzVar2.a(dbpy.a);
            }
        });
    }
}
