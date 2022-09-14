package defpackage;

import android.content.Context;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: zvd  reason: default package */
/* loaded from: classes7.dex */
public final class zvd {
    public static void a(@dzsi zvb zvbVar, TextView textView) {
        if (zvbVar == null) {
            b("", textView);
            textView.setTag(R.id.renderable_components_applier, null);
            return;
        }
        Context context = textView.getContext();
        alcc[] alccVarArr = new alcc[1];
        float textSize = textView.getTextSize();
        alcb a = alcc.a();
        a.f = textSize;
        a.k = textView.getPaint();
        a.b();
        a.a = context;
        vtm vtmVar = (vtm) btsr.a(vtm.class);
        dbsk.s(vtmVar);
        a.b = vtmVar.qa();
        a.c = zvbVar.b;
        a.d = albv.b(context);
        a.e = new zvc(alccVarArr, textView, zvbVar);
        if (textView instanceof zxb) {
            zxb zxbVar = (zxb) textView;
            a.g = zxbVar.c;
            a.h = zxbVar.d;
            a.i = zxbVar.e;
            a.d = Integer.valueOf(zxbVar.f).intValue();
        }
        alcc a2 = a.a();
        alccVarArr[0] = a2;
        textView.setTag(R.id.renderable_components_applier, a2);
        textView.setTextDirection(5);
        b(alccVarArr[0].b(zvbVar.c()), textView);
    }

    public static void b(@dzsi CharSequence charSequence, TextView textView) {
        if (charSequence == null) {
            charSequence = "";
        }
        if (textView instanceof zxb) {
            ((zxb) textView).setDesiredText(charSequence);
        } else {
            textView.setText(charSequence);
        }
    }
}
