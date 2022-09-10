package defpackage;

import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajpf  reason: default package */
/* loaded from: classes2.dex */
public class ajpf implements ajpj {
    final /* synthetic */ String a;
    final /* synthetic */ ajpg b;

    public ajpf(ajpg ajpgVar, String str) {
        this.b = ajpgVar;
        this.a = str;
    }

    @Override // defpackage.ajpj
    public String a() {
        return this.b.a.getString(R.string.REQUEST_LOCATION_SHARE_EMAIL_DIALOG_DESCRIPTION, this.a);
    }

    @Override // defpackage.ajpj
    @dzsi
    public cjtd b() {
        return cjtd.a(dtxu.eF);
    }
}
