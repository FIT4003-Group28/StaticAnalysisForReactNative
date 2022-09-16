package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.libraries.youtube.account.identity.AccountIdentity;
import com.google.android.youtube.R;
import java.util.Locale;
/* compiled from: PG */
/* renamed from: wet  reason: default package */
/* loaded from: classes4.dex */
public final class wet implements ajru {
    public final Activity a;
    public final yrj b;
    public final yzv c;
    public final afvn d;
    public final whp e;
    public final wge f;
    public final aasc g;
    public final acti h;
    public final afwc i;
    public ajgr j;
    final ajsc k;
    private final ajmy l;
    private final View m;
    private final View n;
    private final TextView o;
    private final TextView p;
    private final TextView q;
    private final TextView r;
    private final ImageView s;
    private final ImageView t;
    private final ajmu u;
    private final View v;
    private final LinearLayout w;
    private final akbk x;
    private final ajxz y;

    public wet(Activity activity, afwc afwcVar, ajmy ajmyVar, yrj yrjVar, afvn afvnVar, azqb azqbVar, yzv yzvVar, whp whpVar, wge wgeVar, aasc aascVar, akbk akbkVar, ajxz ajxzVar, acth acthVar) {
        afwcVar.getClass();
        this.k = new ajsc(azqbVar);
        this.a = activity;
        ajmyVar.getClass();
        this.l = ajmyVar;
        yrjVar.getClass();
        this.b = yrjVar;
        yzvVar.getClass();
        this.c = yzvVar;
        this.d = afvnVar;
        this.e = whpVar;
        this.f = wgeVar;
        this.g = aascVar;
        this.x = akbkVar;
        this.y = ajxzVar;
        View inflate = LayoutInflater.from(activity).inflate(R.layout.active_account_header, (ViewGroup) null);
        this.m = inflate;
        this.s = (ImageView) inflate.findViewById(R.id.account_thumbnail);
        this.o = (TextView) inflate.findViewById(R.id.account_name);
        this.p = (TextView) inflate.findViewById(R.id.email);
        TextView textView = (TextView) inflate.findViewById(R.id.manage_account);
        this.q = textView;
        this.t = (ImageView) inflate.findViewById(R.id.switch_account);
        this.r = (TextView) inflate.findViewById(R.id.status_text);
        this.n = inflate.findViewById(R.id.separator);
        this.w = (LinearLayout) inflate.findViewById(R.id.compact_links);
        ajmt b = ajmyVar.c().b();
        b.b(2131232143);
        this.u = b.a();
        this.v = inflate.findViewById(R.id.account_container);
        this.i = afwcVar;
        textView.setOnClickListener(new weq(this, 1));
        this.h = acthVar.oi();
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.m;
    }

    public final void d() {
        if (this.d.c() instanceof AccountIdentity) {
            AccountIdentity accountIdentity = (AccountIdentity) this.d.c();
            if (accountIdentity.w()) {
                this.j.c(this.a, Uri.parse("https://accounts.google.com/AccountChooser").buildUpon().appendQueryParameter("hl", Locale.getDefault().getLanguage()).appendQueryParameter("continue", String.format("https://myaccount.google.com/?pageId=%s&utm_source=YouTubeAndroid&utm_medium=act&hl=%s", accountIdentity.e(), Locale.getDefault().getLanguage())).appendQueryParameter("Email", accountIdentity.a()).build());
            } else {
                this.a.startActivityForResult(new Intent("com.google.android.gms.accountsettings.action.VIEW_SETTINGS").setPackage("com.google.android.gms").putExtra("extra.accountName", accountIdentity.a()), 0);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x023f  */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r11, java.lang.Object r12) {
        /*
            Method dump skipped, instructions count: 607
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wet.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
