package defpackage;

import android.app.ProgressDialog;
import android.content.res.Resources;
import android.view.View;
import com.google.android.apps.maps.R;
import java.net.URL;
/* compiled from: PG */
/* renamed from: znm  reason: default package */
/* loaded from: classes7.dex */
final class znm implements View.OnClickListener {
    final /* synthetic */ amub a;
    final /* synthetic */ zad b;
    final /* synthetic */ Resources c;
    final /* synthetic */ gn d;
    final /* synthetic */ bvsl e;
    final /* synthetic */ bwft f;

    public znm(amub amubVar, zad zadVar, Resources resources, gn gnVar, bvsl bvslVar, bwft bwftVar) {
        this.a = amubVar;
        this.b = zadVar;
        this.c = resources;
        this.d = gnVar;
        this.e = bvslVar;
        this.f = bwftVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.a.h != dqvj.TWO_WHEELER) {
            URL a = zae.a(afhv.MAP_VIEW, this.a);
            if (a == null) {
                return;
            }
            zno.a(a, this.a, this.c, this.d, this.e, this.f);
            return;
        }
        zad zadVar = this.b;
        if (zadVar == null) {
            return;
        }
        amub amubVar = this.a;
        znl znlVar = new znl(amubVar, this.c, this.d, this.e, this.f);
        dhrp bZ = dhru.g.bZ();
        drrp a2 = zad.a(amubVar);
        if (bZ.c) {
            bZ.bF();
            bZ.c = false;
        }
        dhru dhruVar = (dhru) bZ.b;
        a2.getClass();
        dhruVar.b = a2;
        dhruVar.a |= 1;
        dhru dhruVar2 = (dhru) bZ.b;
        dhruVar2.c = 2;
        dhruVar2.a |= 2;
        dhru dhruVar3 = (dhru) bZ.b;
        dhruVar3.d = 2;
        dhruVar3.a |= 4;
        zadVar.b();
        zadVar.d = new ProgressDialog(zadVar.a, 0);
        zadVar.d.setMessage(zadVar.a.getString(R.string.LOADING));
        zadVar.d.setCancelable(false);
        zadVar.d.setCanceledOnTouchOutside(false);
        zadVar.d.show();
        zadVar.e = zadVar.f.b(bZ.bK(), new zac(zadVar, znlVar), zadVar.b);
    }
}
