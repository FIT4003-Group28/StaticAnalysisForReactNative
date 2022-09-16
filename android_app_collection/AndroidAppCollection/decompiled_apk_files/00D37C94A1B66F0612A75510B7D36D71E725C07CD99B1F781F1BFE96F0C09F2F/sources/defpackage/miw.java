package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.HashMap;
import java.util.Map;
/* compiled from: PG */
/* renamed from: miw  reason: default package */
/* loaded from: classes3.dex */
public final class miw implements ajru {
    public final RadioButton a;
    public final Map b;
    public apzg c;
    public miv d;
    public acti e;
    public arrp f;
    private final int g;
    private final int h;
    private final Context i;
    private final ajrx j;
    private final View k;
    private final TextView l;
    private final ViewStub m;
    private View n;
    private final axnm o;

    public miw(Context context, gem gemVar, aafo aafoVar, axnm axnmVar, axnm axnmVar2, aken akenVar) {
        this.i = context;
        this.j = gemVar;
        axnmVar.getClass();
        this.o = axnmVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.dismissal_reason_list_item, (ViewGroup) null);
        this.k = inflate;
        RadioButton radioButton = (RadioButton) inflate.findViewById(R.id.radio_button);
        this.a = radioButton;
        radioButton.setOnClickListener(new mit(this, aafoVar, axnmVar2, context));
        this.l = (TextView) inflate.findViewById(R.id.reason_text);
        this.m = (ViewStub) inflate.findViewById(R.id.video_layout);
        this.b = new HashMap();
        this.g = zhn.d(context, R.attr.ytTextSecondary);
        this.h = zhn.d(context, R.attr.ytCallToAction);
        gemVar.c(inflate);
        gemVar.b(true);
        gemVar.d(new View.OnClickListener() { // from class: mir
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                miw.this.a.performClick();
            }
        });
        if (akenVar.a) {
            radioButton.getClass();
            radioButton.setBackground(zhn.g(radioButton.getContext(), R.attr.ytRadioButton));
            radioButton.setButtonDrawable((Drawable) null);
        }
    }

    @Override // defpackage.ajru
    public final View a() {
        return ((gem) this.j).b;
    }

    public final byte[] d() {
        arrq arrqVar;
        arrr arrrVar;
        arrr arrrVar2;
        arrq arrqVar2;
        arrp arrpVar = this.f;
        if (arrpVar.b == 106353983) {
            arrqVar = (arrq) arrpVar.c;
        } else {
            arrqVar = arrq.a;
        }
        if ((arrqVar.b & 2) == 0) {
            arrp arrpVar2 = this.f;
            if (arrpVar2.b == 106118680) {
                arrrVar = (arrr) arrpVar2.c;
            } else {
                arrrVar = arrr.a;
            }
            if ((arrrVar.b & 2) == 0) {
                return null;
            }
            arrp arrpVar3 = this.f;
            if (arrpVar3.b == 106118680) {
                arrrVar2 = (arrr) arrpVar3.c;
            } else {
                arrrVar2 = arrr.a;
            }
            return arrrVar2.e.I();
        }
        arrp arrpVar4 = this.f;
        if (arrpVar4.b == 106353983) {
            arrqVar2 = (arrq) arrpVar4.c;
        } else {
            arrqVar2 = arrq.a;
        }
        return arrqVar2.e.I();
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x015d  */
    @Override // defpackage.ajru
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void oK(defpackage.ajrs r10, java.lang.Object r11) {
        /*
            Method dump skipped, instructions count: 372
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.miw.oK(ajrs, java.lang.Object):void");
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.clear();
    }
}
