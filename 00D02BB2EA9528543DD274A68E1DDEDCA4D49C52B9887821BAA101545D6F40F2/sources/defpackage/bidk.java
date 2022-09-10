package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.provider.ContactsContract;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bidk  reason: default package */
/* loaded from: classes3.dex */
public class bidk implements bicw {
    public final Activity a;
    public final axwq b;
    public final akfa c;
    public final bvrb d;
    public final azvo e;
    public final bwrs<ilo> f;
    public final dxio<afha> g;
    public final bidn h;
    private final axrx i;
    private final axru j;
    private final ckcw k;
    private final jic l;

    public bidk(Activity activity, axrx axrxVar, axru axruVar, axwq axwqVar, ckcw ckcwVar, akfa akfaVar, bvrb bvrbVar, dxio dxioVar, azvo azvoVar, bwrs bwrsVar, bidn bidnVar) {
        this.a = activity;
        this.i = axrxVar;
        this.j = axruVar;
        this.k = ckcwVar;
        this.b = axwqVar;
        this.c = akfaVar;
        this.d = bvrbVar;
        this.g = dxioVar;
        this.e = azvoVar;
        this.f = bwrsVar;
        this.h = bidnVar;
        this.l = new jic(azvoVar.n(), ckqc.FIFE, 2131232998);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final Intent k(String str) {
        return new Intent("android.intent.action.VIEW", Uri.withAppendedPath(ContactsContract.Contacts.CONTENT_URI, str));
    }

    @Override // defpackage.bicw
    public String a() {
        return this.e.e(this.a);
    }

    @Override // defpackage.bicw
    public String b() {
        CharSequence text;
        dnkb dnkbVar = dnkb.UNKNOWN;
        int ordinal = this.e.k().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                text = this.e.l();
            } else if (ordinal == 2) {
                text = this.a.getText(R.string.ADDRESS_TYPE_HOME);
            } else if (ordinal == 3) {
                text = this.a.getText(R.string.ADDRESS_TYPE_WORK);
            } else if (ordinal != 4) {
                text = "";
            }
            return text.toString().trim();
        }
        text = this.a.getText(R.string.ADDRESS_TYPE_OTHER);
        return text.toString().trim();
    }

    @Override // defpackage.bicw
    public jic c() {
        return this.l;
    }

    @Override // defpackage.bicw
    public jht d() {
        jhu h = jhv.h();
        jhi jhiVar = (jhi) h;
        jhiVar.e = this.a.getString(R.string.CONTACT_OVERFLOW_CONTENT_DESCRIPTION, new Object[]{a()});
        if (j()) {
            jhm jhmVar = new jhm();
            jhmVar.l = R.string.SEE_CONTACTS_TEXT;
            jhmVar.a = this.a.getText(R.string.SEE_CONTACTS_TEXT);
            jhmVar.d(new bida(this));
            h.d(jhmVar.c());
        }
        jhm jhmVar2 = new jhm();
        jhmVar2.l = R.string.HIDE_CONTACT_TEXT;
        jhmVar2.a = this.a.getText(R.string.HIDE_CONTACT_TEXT);
        jhmVar2.d(new bidb(this));
        h.d(jhmVar2.c());
        if ((this.e.m().a & 4) != 0) {
            jhm jhmVar3 = new jhm();
            jhmVar3.l = R.string.REMOVE_CONTACT_MENU_TEXT;
            jhmVar3.a = this.a.getText(R.string.REMOVE_CONTACT_MENU_TEXT);
            jhmVar3.d(new bidc(this));
            h.d(jhmVar3.c());
        }
        return jhiVar.b();
    }

    @Override // defpackage.jaf
    public Boolean e() {
        return Boolean.valueOf(j());
    }

    @Override // defpackage.jaf
    public cqkl f(cjqm cjqmVar) {
        return g();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final cqkl g() {
        ((ckcn) this.k.a(ckep.b)).a();
        if (this.j.a("android.permission.READ_CONTACTS")) {
            h();
        } else {
            this.i.b("android.permission.READ_CONTACTS", new bidd(this));
        }
        return cqkl.a;
    }

    public final void h() {
        new bidj(this).execute(Long.toHexString(this.e.g()));
    }

    public final axxd i(boolean z) {
        return new bicz(this, z);
    }

    final boolean j() {
        return k("0").resolveActivityInfo(this.a.getPackageManager(), 0) != null;
    }
}
