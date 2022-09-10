package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: awri  reason: default package */
/* loaded from: classes.dex */
public final class awri extends afhx {
    public static final dbsl<afga> b = awrh.a;
    public final dxio<awre> a;
    private final gga c;

    public awri(Intent intent, @dzsi String str, gga ggaVar, dxio<awre> dxioVar) {
        super(intent, str, afid.PARKING_LOCATION);
        this.c = ggaVar;
        this.a = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        affw.a(this.f, this.c, new Runnable(this) { // from class: awrg
            private final awri a;

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
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_SAVED_PARKING;
    }
}
