package defpackage;

import android.content.Context;
import android.content.Intent;
/* compiled from: PG */
/* renamed from: afja  reason: default package */
/* loaded from: classes.dex */
public final class afja extends afhx {
    public static final dbsl<Intent> e = afix.a;
    public static final dbsl<afga> i = afiy.a;
    public final Context a;
    public final dxio<akfc> b;
    public final dxio<akfa> c;
    public final dxio<afha> d;

    public afja(gga ggaVar, dxio<akfc> dxioVar, dxio<akfa> dxioVar2, dxio<afha> dxioVar3, Intent intent, @dzsi String str) {
        super(intent, str, afid.MAYBE_LOGIN_THEN_CONTINUE);
        this.a = ggaVar;
        this.b = dxioVar;
        this.c = dxioVar2;
        this.d = dxioVar3;
    }

    public static Intent e(Context context, String str, Intent intent) {
        return afft.a(context).setAction("com.google.android.apps.gmm.ACTION_ENSURE_CORRECT_LOGIN_STATUS_THEN_CONTINUE").putExtra("WRAPPED_INTENT", intent).putExtra("TARGET_USER_OBFUSCATED_GAIA_ID", str);
    }

    @dzsi
    public static Intent h(Intent intent) {
        dbsk.a(intent.hasExtra("WRAPPED_INTENT"));
        return (Intent) intent.getParcelableExtra("WRAPPED_INTENT");
    }

    @Override // defpackage.afhx
    public final void a() {
        dbsk.a(this.f.hasExtra("WRAPPED_INTENT"));
        dbsk.a(this.f.hasExtra("TARGET_USER_OBFUSCATED_GAIA_ID"));
        Intent intent = (Intent) this.f.getParcelableExtra("WRAPPED_INTENT");
        if (cjqg.l(intent) == null) {
            cjqg.j(this.f, intent);
        }
        this.b.a().o(this.f.getStringExtra("TARGET_USER_OBFUSCATED_GAIA_ID"), new afiz(this, intent, d()));
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return null;
    }

    @dzsi
    public final String d() {
        btlu j = this.c.a().j();
        if (j != null) {
            return j.j();
        }
        return null;
    }
}
