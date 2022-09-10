package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: btay  reason: default package */
/* loaded from: classes.dex */
public final class btay extends afhm {
    public static final dbsl<afga> b = btax.a;
    public final dxio<bsvm> a;
    private final gga c;

    public btay(Intent intent, @dzsi String str, gga ggaVar, dxio<bsvm> dxioVar) {
        super(intent, str, afid.MANAGE_NETWORK_ACTION, ggaVar);
        this.a = dxioVar;
        this.c = ggaVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        this.c.B(new Runnable(this) { // from class: btaw
            private final btay a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.a.a.a().e();
            }
        });
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return null;
    }
}
