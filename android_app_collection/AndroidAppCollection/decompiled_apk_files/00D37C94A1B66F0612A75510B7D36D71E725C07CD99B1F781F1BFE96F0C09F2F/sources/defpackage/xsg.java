package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import com.google.protos.youtube.api.innertube.ButtonRendererOuterClass;
import java.util.HashMap;
/* compiled from: PG */
/* renamed from: xsg  reason: default package */
/* loaded from: classes4.dex */
public final class xsg implements ajru {
    private final ajmy a;
    private final aafo b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final akbm h;
    private final TextView i;

    public xsg(Context context, ajmy ajmyVar, aafo aafoVar, akbn akbnVar) {
        ajmyVar.getClass();
        this.a = ajmyVar;
        aafoVar.getClass();
        this.b = aafoVar;
        View inflate = View.inflate(context, R.layout.backstage_zero_state, null);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.logo);
        this.e = (TextView) inflate.findViewById(R.id.title);
        this.f = (TextView) inflate.findViewById(R.id.text);
        this.g = (TextView) inflate.findViewById(R.id.learn_more);
        this.i = (TextView) inflate.findViewById(R.id.footer);
        this.h = akbnVar.a((TextView) inflate.findViewById(R.id.post_button));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.c;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        arag aragVar5;
        aplr aplrVar = (aplr) obj;
        ajmy ajmyVar = this.a;
        ImageView imageView = this.d;
        avhn avhnVar = aplrVar.e;
        if (avhnVar == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        TextView textView = this.e;
        HashMap hashMap = null;
        if ((aplrVar.b & 1) != 0) {
            aragVar = aplrVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        textView.setText(ajgl.b(aragVar));
        TextView textView2 = this.f;
        if ((aplrVar.b & 2) != 0) {
            aragVar2 = aplrVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        textView2.setText(ajgl.b(aragVar2));
        TextView textView3 = this.g;
        if ((aplrVar.b & 8) != 0) {
            aragVar3 = aplrVar.f;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        textView3.setText(aafv.a(aragVar3, this.b, false));
        int i = aplrVar.b & 8;
        if (i != 0) {
            if (i != 0) {
                aragVar5 = aplrVar.f;
                if (aragVar5 == null) {
                    aragVar5 = arag.a;
                }
            } else {
                aragVar5 = null;
            }
            CharSequence i2 = ajgl.i(aragVar5);
            if (i2 != null) {
                this.g.setContentDescription(i2);
            }
        }
        TextView textView4 = this.i;
        if ((aplrVar.b & 16) != 0) {
            aragVar4 = aplrVar.g;
            if (aragVar4 == null) {
                aragVar4 = arag.a;
            }
        } else {
            aragVar4 = null;
        }
        textView4.setText(ajgl.b(aragVar4));
        aunb aunbVar = aplrVar.h;
        if (aunbVar == null) {
            aunbVar = aunb.a;
        }
        apoj apojVar = (apoj) aunbVar.qm(ButtonRendererOuterClass.buttonRenderer);
        if (apojVar != null) {
            akbm akbmVar = this.h;
            acti actiVar = ajrsVar.a;
            ajyj ajyjVar = (ajyj) ajrsVar.c("sectionController");
            if (ajyjVar != null) {
                hashMap = new HashMap();
                hashMap.put("com.google.android.libraries.youtube.comment.comment_thread_created_callback", new xnh(ajyjVar));
            }
            akbmVar.a(apojVar, actiVar, hashMap);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
