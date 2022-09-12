package defpackage;

import android.app.Dialog;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cchr  reason: default package */
/* loaded from: classes4.dex */
public final class cchr implements ccif {
    public final dxio<akfa> a;
    private final gga b;
    private final akfc c;
    private final cqkj d;

    public cchr(gga ggaVar, dxio<akfa> dxioVar, akfc akfcVar, cqkj cqkjVar) {
        this.b = ggaVar;
        this.a = dxioVar;
        this.c = akfcVar;
        this.d = cqkjVar;
    }

    @Override // defpackage.ccif
    public final void a(ddho ddhoVar, dinw dinwVar) {
        this.b.D(cchc.g(ddhoVar, dinwVar, null));
    }

    @Override // defpackage.ccif
    public final void b(Uri uri) {
        this.b.D(cchc.g(null, null, uri.toString()));
    }

    @Override // defpackage.ccif
    public final void c(@dzsi ddho ddhoVar, @dzsi String str) {
        if (this.a.a().c()) {
            e(ddhoVar, str);
        } else {
            this.c.k(new cchn(this, ddhoVar, str), null);
        }
    }

    @Override // defpackage.ccif
    public final void d() {
        Dialog dialog = new Dialog(this.b, 16973840);
        String str = null;
        cqkf c = this.d.c(new hsz(), null);
        ccho cchoVar = new ccho(dialog);
        btlu j = this.a.a().j();
        if (j != null) {
            str = j.v();
        }
        if (dbsj.d(str)) {
            this.a.a().o();
            str = this.b.getString(R.string.LOCAL_GUIDE_PREFIX);
        }
        String string = this.b.getString(R.string.LOCAL_GUIDE_OPTIN_WELCOME_PAGE_TITLE, new Object[]{str});
        String string2 = this.b.getString(R.string.LOCAL_GUIDE_OPTIN_WELCOME_PAGE_SUBTITLE);
        String string3 = this.b.getString(R.string.LOCAL_GUIDE_OPTIN_WELCOME_PAGE_BODY);
        StringBuilder sb = new StringBuilder(String.valueOf(string2).length() + 1 + String.valueOf(string3).length());
        sb.append(string2);
        sb.append("\n");
        sb.append(string3);
        c.e(new cchq(cchoVar, string, sb.toString()));
        dialog.setContentView(c.c());
        dialog.show();
    }

    public final void e(@dzsi ddho ddhoVar, @dzsi String str) {
        if (this.b.K() instanceof cchc) {
            this.b.g().e();
        }
        gga ggaVar = this.b;
        cchj cchjVar = new cchj();
        Bundle bundle = new Bundle();
        if (ddhoVar != null) {
            bundle.putInt("arg_key_entry_point_ve_type", ddhoVar.b());
        }
        bundle.putString("arg_key_intent_url", str);
        cchjVar.B(bundle);
        ggaVar.D(cchjVar);
    }

    @Override // defpackage.ccif
    public final void f() {
        ccgu.g((dinw) null).aJ(this.b);
    }
}
