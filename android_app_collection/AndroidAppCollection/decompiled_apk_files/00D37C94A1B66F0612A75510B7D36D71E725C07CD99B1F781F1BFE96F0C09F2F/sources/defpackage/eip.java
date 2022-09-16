package defpackage;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: eip  reason: default package */
/* loaded from: classes3.dex */
final class eip implements View.OnClickListener {
    final /* synthetic */ eir a;

    public eip(eir eirVar) {
        this.a = eirVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        apvf a = eir.a(this.a.d);
        if (a != null) {
            eir eirVar = this.a;
            arag aragVar5 = null;
            if (eirVar.f == null) {
                eirVar.g = View.inflate(eirVar.a, R.layout.channel_offer_dialog, null);
                eirVar.h = (ImageView) eirVar.g.findViewById(R.id.thumbnail);
                eirVar.i = (TextView) eirVar.g.findViewById(R.id.header);
                eirVar.j = (TextView) eirVar.g.findViewById(R.id.title);
                eirVar.k = (TextView) eirVar.g.findViewById(R.id.subtitle);
                eirVar.l = (TextView) eirVar.g.findViewById(R.id.prices);
                eirVar.m = (TextView) eirVar.g.findViewById(R.id.additional_info);
                eirVar.f = new AlertDialog.Builder(eirVar.a).setTitle(eirVar.a.getString(R.string.more_offers)).setView(eirVar.g).setNegativeButton(R.string.dismiss, (DialogInterface.OnClickListener) null).setPositiveButton(R.string.visit_channel, new eiq(eirVar)).create();
            }
            eirVar.e = a;
            TextView textView = eirVar.i;
            if ((a.b & 1) != 0) {
                aragVar = a.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            TextView textView2 = eirVar.j;
            if ((a.b & 4) != 0) {
                aragVar2 = a.e;
                if (aragVar2 == null) {
                    aragVar2 = arag.a;
                }
            } else {
                aragVar2 = null;
            }
            textView2.setText(ajgl.b(aragVar2));
            ajmy ajmyVar = eirVar.b;
            ImageView imageView = eirVar.h;
            avhn avhnVar = a.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.k(imageView, avhnVar, ajmu.b);
            TextView textView3 = eirVar.k;
            if ((a.b & 8) != 0) {
                aragVar3 = a.f;
                if (aragVar3 == null) {
                    aragVar3 = arag.a;
                }
            } else {
                aragVar3 = null;
            }
            zag.m(textView3, ajgl.b(aragVar3));
            TextView textView4 = eirVar.l;
            if ((a.b & 16) != 0) {
                aragVar4 = a.g;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
            } else {
                aragVar4 = null;
            }
            zag.m(textView4, ajgl.b(aragVar4));
            TextView textView5 = eirVar.m;
            if ((a.b & 32) != 0 && (aragVar5 = a.h) == null) {
                aragVar5 = arag.a;
            }
            zag.m(textView5, ajgl.b(aragVar5));
            eirVar.f.show();
        }
    }
}
