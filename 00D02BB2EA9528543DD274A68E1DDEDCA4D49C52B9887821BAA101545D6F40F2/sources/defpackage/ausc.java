package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: ausc  reason: default package */
/* loaded from: classes.dex */
public final class ausc extends afhx {
    public static final dbsl<afga> a = ausb.a;
    private final gga b;
    private final bvjj c;
    private final dxio<afha> d;

    public ausc(Intent intent, @dzsi String str, gga ggaVar, bvjj bvjjVar, dxio<afha> dxioVar) {
        super(intent, str, afid.GOOGLE_MY_BUSINESS_PLAYSTORE);
        this.b = ggaVar;
        this.c = bvjjVar;
        this.d = dxioVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("extra_action_type_key");
        if (stringExtra == null) {
            stringExtra = "show_opt_out_banner_action";
        }
        if (((stringExtra.hashCode() == -1654614607 && stringExtra.equals("open_referrer_url_action")) ? (char) 0 : (char) 65535) != 0) {
            if (this.c.s(bvjk.af, 0) >= 2) {
                this.c.W(bvjk.af, 1);
            }
            gga ggaVar = this.b;
            this.d.a().f(ggaVar, afft.a(ggaVar).setFlags(536870912), 1);
            return;
        }
        String stringExtra2 = this.f.getStringExtra("extra_referrer_url_key");
        if (stringExtra2 == null) {
            return;
        }
        this.d.a().f(this.b, new Intent("android.intent.action.VIEW", Uri.parse(stringExtra2)).addFlags(268435456), 1);
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_GOOGLE_MY_BUSINESS_PLAYSTORE_NOTIFICATION;
    }
}
