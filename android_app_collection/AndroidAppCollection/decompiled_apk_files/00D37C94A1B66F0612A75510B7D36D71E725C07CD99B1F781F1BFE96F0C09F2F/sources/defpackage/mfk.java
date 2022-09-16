package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mfk  reason: default package */
/* loaded from: classes3.dex */
final class mfk extends mfs {
    private final ImageView C;
    private final TextView D;
    private final TextView E;
    private final View F;
    private final View G;
    public final View a;
    private final ajmy b;
    private final eze c;
    private final fer d;
    private final ajrx e;
    private final ajrp f;

    public mfk(Context context, ajmy ajmyVar, eze ezeVar, ajrx ajrxVar, View view, aafo aafoVar, fer ferVar) {
        super(context, ajmyVar, ajrxVar, view, aafoVar, null, null, null);
        this.c = ezeVar;
        this.e = ajrxVar;
        this.d = ferVar;
        this.b = ajmyVar;
        this.f = new ajrp(aafoVar, ajrxVar);
        View findViewById = this.i.findViewById(R.id.thumbnail_container);
        this.a = findViewById == null ? this.x : findViewById;
        this.C = (ImageView) view.findViewById(R.id.channel_thumbnail);
        this.G = view.findViewById(R.id.play);
        this.F = view.findViewById(R.id.insets_container);
        this.D = (TextView) view.findViewById(R.id.mdx_queue_button);
        this.E = (TextView) view.findViewById(R.id.mdx_play_hint);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e.a();
    }

    @Override // defpackage.ajru
    /* renamed from: d */
    public final void oK(ajrs ajrsVar, arjw arjwVar) {
        apzg apzgVar;
        arag aragVar;
        arag aragVar2;
        arag aragVar3;
        arag aragVar4;
        ajrp ajrpVar = this.f;
        acti actiVar = ajrsVar.a;
        avhn avhnVar = null;
        if ((arjwVar.b & 256) != 0) {
            apzgVar = arjwVar.i;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
        } else {
            apzgVar = null;
        }
        ajrpVar.b(actiVar, apzgVar, ajrsVar.e(), this);
        ajrsVar.a.u(new acte(arjwVar.h), null);
        arju arjuVar = arjwVar.g;
        if (arjuVar == null) {
            arjuVar = arju.a;
        }
        arjt arjtVar = arjuVar.c;
        if (arjtVar == null) {
            arjtVar = arjt.a;
        }
        if ((arjtVar.b & 1) != 0) {
            aragVar = arjtVar.c;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        B(ajgl.b(aragVar));
        if ((arjtVar.b & 2) != 0) {
            aragVar2 = arjtVar.d;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        n(ajgl.b(aragVar2));
        if ((arjtVar.b & 4) != 0) {
            aragVar3 = arjtVar.e;
            if (aragVar3 == null) {
                aragVar3 = arag.a;
            }
        } else {
            aragVar3 = null;
        }
        CharSequence b = ajgl.b(aragVar3);
        arag aragVar5 = arjtVar.j;
        if (aragVar5 == null) {
            aragVar5 = arag.a;
        }
        Spanned b2 = ajgl.b(aragVar5);
        if (!TextUtils.isEmpty(b2)) {
            if (b != null) {
                alj a = alj.a();
                b = TextUtils.concat(a.b(b.toString()), " · ", a.b(b2.toString()));
            } else {
                b = null;
            }
        }
        m(b, null, false);
        TextView textView = this.l;
        if ((arjwVar.b & 16) == 0) {
            kz.t(textView, R.drawable.player_live_dot, 0);
            textView.setText(R.string.live_label);
        } else {
            kz.t(textView, 0, 0);
            if ((arjwVar.b & 16) != 0) {
                aragVar4 = arjwVar.f;
                if (aragVar4 == null) {
                    aragVar4 = arag.a;
                }
            } else {
                aragVar4 = null;
            }
            o(ajgl.b(aragVar4), null);
        }
        e(arjwVar);
        ajmy ajmyVar = this.b;
        ImageView imageView = this.C;
        if ((arjtVar.b & 8) != 0 && (avhnVar = arjtVar.f) == null) {
            avhnVar = avhn.a;
        }
        ajmyVar.h(imageView, avhnVar);
        if (this.F != null) {
            Rect a2 = this.c.a();
            this.F.setPadding(a2.left, a2.top, a2.right, a2.bottom);
        }
        this.e.e(ajrsVar);
    }

    public final void e(arjw arjwVar) {
        avhn avhnVar;
        ajmy ajmyVar = this.b;
        fer ferVar = this.d;
        ImageView imageView = this.x;
        int i = arjwVar.b;
        avhn avhnVar2 = null;
        String str = (i & 1024) != 0 ? arjwVar.k : null;
        if ((i & 2) != 0) {
            avhn avhnVar3 = arjwVar.c;
            if (avhnVar3 == null) {
                avhnVar3 = avhn.a;
            }
            avhnVar = avhnVar3;
        } else {
            avhnVar = null;
        }
        etk.h(ajmyVar, ferVar, imageView, str, avhnVar, null);
        if ((arjwVar.b & 2) != 0 && (avhnVar2 = arjwVar.c) == null) {
            avhnVar2 = avhn.a;
        }
        this.A = avhnVar2;
    }

    public final void f(boolean z, ivt ivtVar) {
        String string;
        TextView textView = this.D;
        if (textView != null) {
            zag.o(textView, ivtVar.a());
        }
        TextView textView2 = this.E;
        if (textView2 != null) {
            zag.o(textView2, z);
            String str = null;
            if (z) {
                if (ivtVar.a()) {
                    adnt e = ivtVar.a.e();
                    if (e != null && e.k() != null) {
                        str = e.k().b();
                    }
                    TextView textView3 = this.E;
                    if (str == null) {
                        string = this.g.getString(R.string.play_on_screen);
                    } else {
                        string = this.g.getString(R.string.inline_mdx_play_hint, str);
                    }
                    textView3.setText(string);
                    return;
                }
                this.E.setText(this.g.getString(R.string.connecting));
                return;
            }
            this.E.setText((CharSequence) null);
        }
    }

    public final void g(boolean z) {
        this.G.setVisibility(true != z ? 8 : 0);
    }

    @Override // defpackage.mfs, defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        super.qZ(ajsaVar);
        this.f.c();
    }
}
