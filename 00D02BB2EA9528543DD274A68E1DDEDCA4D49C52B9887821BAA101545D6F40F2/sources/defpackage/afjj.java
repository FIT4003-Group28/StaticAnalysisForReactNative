package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: afjj  reason: default package */
/* loaded from: classes2.dex */
public final class afjj extends afhx {
    public static final dbsl<afga> d = afji.a;
    public final Activity a;
    public final afgy b;
    public final afhb c;
    private final bvrb e;

    public afjj(Intent intent, @dzsi String str, afhb afhbVar, gga ggaVar, bvrb bvrbVar, afgy afgyVar) {
        super(intent, str, afid.FDL);
        this.c = afhbVar;
        this.a = ggaVar;
        this.e = bvrbVar;
        this.b = afgyVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        this.e.b(new Runnable(this) { // from class: afje
            private final afjj a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                final afjj afjjVar = this.a;
                cpcq<dept> a = afjjVar.c.a(afjjVar.f);
                a.s(new cpcl(afjjVar) { // from class: afjf
                    private final afjj a;

                    {
                        this.a = afjjVar;
                    }

                    @Override // defpackage.cpcl
                    public final void c(Object obj) {
                        final afjj afjjVar2 = this.a;
                        dept deptVar = (dept) obj;
                        if (deptVar != null) {
                            final Uri a2 = deptVar.a();
                            if (a2 == null || dbsj.d(a2.toString())) {
                                afhg.a(afjjVar2.f);
                                int i = dbsj.a;
                                return;
                            }
                            afjjVar2.a.runOnUiThread(new Runnable(afjjVar2, a2) { // from class: afjh
                                private final afjj a;
                                private final Uri b;

                                {
                                    this.a = afjjVar2;
                                    this.b = a2;
                                }

                                @Override // java.lang.Runnable
                                public final void run() {
                                    this.a.b.f(this.b.toString());
                                }
                            });
                        }
                    }
                });
                a.r(new cpci(afjjVar) { // from class: afjg
                    private final afjj a;

                    {
                        this.a = afjjVar;
                    }

                    @Override // defpackage.cpci
                    public final void d(Exception exc) {
                        afhg.a(this.a.f);
                        int i = dbsj.a;
                    }
                });
            }
        }, bvrj.BACKGROUND_THREADPOOL);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return null;
    }
}
