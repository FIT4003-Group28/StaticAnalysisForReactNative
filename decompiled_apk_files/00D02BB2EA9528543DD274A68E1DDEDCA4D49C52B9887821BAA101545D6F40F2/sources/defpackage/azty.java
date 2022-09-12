package defpackage;

import android.content.Intent;
/* compiled from: PG */
/* renamed from: azty  reason: default package */
/* loaded from: classes.dex */
public final class azty extends afhx {
    public final gga a;
    public final dxio<axwy> b;
    private final akfc j;
    private static final dcqe d = dcqe.c("azty");
    private static final int e = ((int) Math.pow(10.0d, 7.0d)) * 100;
    private static final int i = ((int) Math.pow(10.0d, 7.0d)) * 190;
    public static final dbsl<afga> c = aztw.a;

    public azty(Intent intent, @dzsi String str, gga ggaVar, dxio<axwy> dxioVar, akfc akfcVar) {
        super(intent, str, afid.EDIT_ALIAS);
        this.a = ggaVar;
        this.b = dxioVar;
        this.j = akfcVar;
    }

    @Override // defpackage.afhx
    public final void a() {
        String stringExtra = this.f.getStringExtra("obfuscated_gaia_id");
        if (stringExtra == null) {
            bvoo.h("Obfuscated gaia id required but not present.", new Object[0]);
            return;
        }
        int intExtra = this.f.getIntExtra("aliasType", -1);
        dndr b = dndr.b(intExtra);
        if (b == null || b == dndr.UNKNOWN_ALIAS_TYPE) {
            bvoo.h("Unknown alias type %d in EditAliasIntent", Integer.valueOf(intExtra));
            return;
        }
        String e2 = dbsj.e(this.f.getStringExtra("initialQuery"));
        Intent intent = this.f;
        int i2 = e;
        int intExtra2 = intent.getIntExtra("initialLatE7", i2);
        Intent intent2 = this.f;
        int i3 = i;
        int intExtra3 = intent2.getIntExtra("initialLngE7", i3);
        this.j.o(stringExtra, new aztx(this, b, e2, (intExtra2 == i2 || intExtra3 == i3) ? null : akqq.d(intExtra2, intExtra3), this.f.getBooleanExtra("send_to_suggest", false), this.f.getBooleanExtra("prepopulate_with_stp_results", false), this.f.getStringExtra("aliasEditToken")));
    }

    @Override // defpackage.afhx
    public final boolean b() {
        return false;
    }

    @Override // defpackage.afhx
    @dzsi
    public final durz c() {
        return durz.EIT_EDIT_ALIAS;
    }
}
