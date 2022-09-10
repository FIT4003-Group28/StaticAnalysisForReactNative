package defpackage;

import android.app.Activity;
/* compiled from: PG */
/* renamed from: cjxl  reason: default package */
/* loaded from: classes4.dex */
public class cjxl {
    public final dxio<akfa> a;
    public final dxio<cxnc> b;
    private final dbsg<dxio<afha>> c;

    public cjxl(dxio<akfa> dxioVar, dxio<cxnc> dxioVar2, dbsg<dxio<afha>> dbsgVar) {
        this.a = dxioVar;
        this.b = dxioVar2;
        this.c = dbsgVar;
    }

    public final void a(final Activity activity) {
        ((afha) ((dxio) ((dbsu) this.c).a).a()).G(new Runnable(this, activity) { // from class: cjxk
            private final cjxl a;
            private final Activity b;

            {
                this.a = this;
                this.b = activity;
            }

            @Override // java.lang.Runnable
            public final void run() {
                cjxl cjxlVar = this.a;
                Activity activity2 = this.b;
                cjxlVar.b.a();
                cxnc.b(activity2, cjxlVar.a.a().o());
            }
        });
    }
}
