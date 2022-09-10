package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: ccfc  reason: default package */
/* loaded from: classes.dex */
public final class ccfc extends afhx {
    public static final dbsl<afga> c = ccfb.a;
    public final ccif a;
    public final Uri b;
    private final gga d;

    public ccfc(Intent intent, @dzsi String str, ccif ccifVar, gga ggaVar) {
        super(intent, str, afid.LOCAL_GUIDE_SIGN_UP);
        this.a = ccifVar;
        this.d = ggaVar;
        this.b = afhg.b(intent);
    }

    @Override // defpackage.afhx
    public final void a() {
        if (this.b == null) {
            return;
        }
        affw.a(this.f, this.d, new Runnable(this) { // from class: ccfa
            private final ccfc a;

            {
                this.a = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                ccfc ccfcVar = this.a;
                ccfcVar.a.b(ccfcVar.b);
            }
        });
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_LOCAL_GUIDE_SIGN_UP;
    }
}
