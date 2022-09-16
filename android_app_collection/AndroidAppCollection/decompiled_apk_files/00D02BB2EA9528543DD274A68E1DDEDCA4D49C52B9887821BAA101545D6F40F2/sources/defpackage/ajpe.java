package defpackage;

import android.app.AlertDialog;
import android.view.View;
import android.widget.CheckBox;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: ajpe  reason: default package */
/* loaded from: classes2.dex */
public class ajpe implements ajpq {
    final /* synthetic */ ajpj a;
    final /* synthetic */ AlertDialog b;
    final /* synthetic */ deig c;
    final /* synthetic */ View d;
    final /* synthetic */ btlu e;
    final /* synthetic */ ajpg f;

    public ajpe(ajpg ajpgVar, ajpj ajpjVar, AlertDialog alertDialog, deig deigVar, View view, btlu btluVar) {
        this.f = ajpgVar;
        this.a = ajpjVar;
        this.b = alertDialog;
        this.c = deigVar;
        this.d = view;
        this.e = btluVar;
    }

    @Override // defpackage.ajpq
    public ajpj a() {
        return this.a;
    }

    @Override // defpackage.ajpq
    public CharSequence b() {
        return this.f.a.getText(17039360);
    }

    @Override // defpackage.ajpq
    public cqkl c() {
        this.b.dismiss();
        this.c.j(false);
        return cqkl.a;
    }

    @Override // defpackage.ajpq
    public CharSequence d() {
        return this.f.a.getString(R.string.REQUEST_LOCATION);
    }

    @Override // defpackage.ajpq
    public cqkl e() {
        if (((CheckBox) this.d.findViewById(ajpk.a)).isChecked()) {
            this.f.b.T(bvjk.gA, this.e, true);
        }
        this.b.dismiss();
        this.c.j(true);
        return cqkl.a;
    }
}
