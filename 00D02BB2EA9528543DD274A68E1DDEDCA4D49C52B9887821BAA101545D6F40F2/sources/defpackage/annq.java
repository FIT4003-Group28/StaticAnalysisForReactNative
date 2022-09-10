package defpackage;

import android.content.Intent;
import android.net.Uri;
/* compiled from: PG */
/* renamed from: annq  reason: default package */
/* loaded from: classes.dex */
public final class annq extends afhx {
    public static final dcdc<String> a = dcdc.g("/locationhistory", "/maps/timeline");
    public static final dcdc<String> b = dcdc.g("/locationhistory", "/maps/timeline");
    public static final drsq c = new drsp();
    public static final dbsl<afga> j = annn.a;
    public final anhg d;
    public final cjqy e;
    public final Uri i;
    private final gga k;
    private final akfc l;
    private final akfa m;

    public annq(Intent intent, @dzsi String str, gga ggaVar, anhg anhgVar, cjqy cjqyVar, akfc akfcVar, akfa akfaVar) {
        super(intent, str, afid.TIMELINE_PUBLIC_URL);
        this.k = ggaVar;
        this.d = anhgVar;
        this.e = cjqyVar;
        this.i = afhg.b(intent);
        this.l = akfcVar;
        this.m = akfaVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        dbsg d = dbsg.j(this.i.getQueryParameter("gid")).d(dbsg.j(this.f.getStringExtra("obfuscated_gaia_id")));
        if (!d.a()) {
            d();
        } else if (btlu.i(this.m.j()) == btlt.INCOGNITO) {
            this.d.C();
        } else {
            this.l.o((String) d.b(), new anno(this));
        }
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    public final durz c() {
        return durz.EIT_TIMELINE_PUBLIC_URL;
    }

    public final void d() {
        affw.a(this.f, this.k, new annp(this));
    }
}
