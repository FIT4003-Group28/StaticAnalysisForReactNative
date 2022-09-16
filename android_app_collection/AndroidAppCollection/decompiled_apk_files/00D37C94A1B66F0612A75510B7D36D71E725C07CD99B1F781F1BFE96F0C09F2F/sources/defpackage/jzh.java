package defpackage;

import android.content.Context;
import android.text.Spanned;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jzh  reason: default package */
/* loaded from: classes3.dex */
public final class jzh implements ajru, aigm {
    public apzg a;
    private final ajmy b;
    private final View c;
    private final ImageView d;
    private final TextView e;
    private final TextView f;
    private final TextView g;
    private final View.OnClickListener h;
    private aign i;
    private acti j;
    private byte[] k;
    private final /* synthetic */ int l;

    public jzh(Context context, ajmy ajmyVar, final aafo aafoVar, ViewGroup viewGroup, int i) {
        this.l = i;
        this.b = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.app_related_end_screen_playlist_item, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.g = (TextView) inflate.findViewById(R.id.title);
        this.f = (TextView) inflate.findViewById(R.id.metadata);
        this.e = (TextView) inflate.findViewById(R.id.video_count);
        this.h = new View.OnClickListener(aafoVar, null) { // from class: jze
            public final /* synthetic */ aafo a;

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jzh jzhVar = jzh.this;
                aafo aafoVar2 = this.a;
                apzg apzgVar = jzhVar.a;
                if (apzgVar != null) {
                    aafoVar2.c(apzgVar, null);
                }
            }
        };
    }

    private final void f(int i) {
        if (i == 2) {
            this.c.setOnClickListener(this.h);
            lj.V(this.c, 0);
            byte[] bArr = this.k;
            if (bArr == null) {
                return;
            }
            this.j.u(new acte(bArr), null);
            return;
        }
        this.c.setOnClickListener(null);
        this.c.setClickable(false);
        lj.V(this.c, 4);
    }

    private final void g(int i) {
        if (i == 2) {
            lj.V(this.c, 0);
            this.c.setOnClickListener(this.h);
            byte[] bArr = this.k;
            if (bArr == null) {
                return;
            }
            this.j.u(new acte(bArr), null);
            return;
        }
        this.c.setOnClickListener(null);
        this.c.setClickable(false);
        lj.V(this.c, 4);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.l != 0 ? this.c : this.c;
    }

    @Override // defpackage.aigm
    public final void e(float f, boolean z) {
    }

    @Override // defpackage.aigm
    public final void nF(int i, int i2, int i3) {
        if (this.l == 0) {
            f(i2);
        } else {
            g(i2);
        }
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        if (this.l == 0) {
            this.i.b(this);
        } else {
            this.i.b(this);
        }
    }

    public jzh(Context context, ajmy ajmyVar, final aafo aafoVar, ViewGroup viewGroup) {
        this.b = ajmyVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.app_related_end_screen_video_item, viewGroup, false);
        this.c = inflate;
        this.d = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.e = (TextView) inflate.findViewById(R.id.title);
        this.g = (TextView) inflate.findViewById(R.id.metadata);
        this.f = (TextView) inflate.findViewById(R.id.duration);
        this.h = new View.OnClickListener() { // from class: jzg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                jzh jzhVar = jzh.this;
                aafo aafoVar2 = aafoVar;
                apzg apzgVar = jzhVar.a;
                if (apzgVar != null) {
                    aafoVar2.c(apzgVar, null);
                }
            }
        };
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        Spanned b;
        arag aragVar3;
        Spanned b2;
        if (this.l == 0) {
            aquw aquwVar = (aquw) obj;
            this.j = ajrsVar.a;
            this.k = aquwVar.k.I();
            ajmy ajmyVar = this.b;
            ImageView imageView = this.d;
            avhn avhnVar = aquwVar.d;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            TextView textView = this.e;
            if ((aquwVar.b & 8) != 0) {
                aragVar = aquwVar.f;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            textView.setText(ajgl.b(aragVar));
            TextView textView2 = this.e;
            textView2.setContentDescription(textView2.getText());
            TextView textView3 = this.g;
            int i = aquwVar.b;
            int i2 = i & 32;
            if (i2 != 0) {
                if (i2 != 0) {
                    aragVar3 = aquwVar.h;
                    if (aragVar3 == null) {
                        aragVar3 = arag.a;
                    }
                } else {
                    aragVar3 = null;
                }
                b = ajgl.b(aragVar3);
            } else {
                if ((i & 16) != 0) {
                    aragVar2 = aquwVar.g;
                    if (aragVar2 == null) {
                        aragVar2 = arag.a;
                    }
                } else {
                    aragVar2 = null;
                }
                b = ajgl.b(aragVar2);
            }
            textView3.setText(b);
            TextView textView4 = this.g;
            textView4.setContentDescription(textView4.getText());
            hqs.p(this.f, null, null, aquwVar.e, null);
            this.f.setImportantForAccessibility(2);
            apzg apzgVar = aquwVar.j;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            this.a = apzgVar;
            aign aignVar = (aign) ajrsVar.c("visibility_change_listener");
            this.i = aignVar;
            aignVar.a(this);
            f(this.i.a);
            float f = this.i.b;
            return;
        }
        aquv aquvVar = (aquv) obj;
        this.j = ajrsVar.a;
        this.k = aquvVar.i.I();
        ajmy ajmyVar2 = this.b;
        ImageView imageView2 = this.d;
        avhn avhnVar2 = aquvVar.d;
        if (avhnVar2 == null) {
            avhnVar2 = avhn.a;
        }
        ajmyVar2.h(imageView2, avhnVar2);
        TextView textView5 = this.g;
        arag aragVar4 = aquvVar.c;
        if (aragVar4 == null) {
            aragVar4 = arag.a;
        }
        textView5.setText(ajgl.b(aragVar4));
        TextView textView6 = this.g;
        textView6.setContentDescription(textView6.getText());
        TextView textView7 = this.f;
        if ((aquvVar.b & 64) != 0) {
            arag aragVar5 = aquvVar.f;
            if (aragVar5 == null) {
                aragVar5 = arag.a;
            }
            b2 = ajgl.b(aragVar5);
        } else {
            arag aragVar6 = aquvVar.g;
            if (aragVar6 == null) {
                aragVar6 = arag.a;
            }
            b2 = ajgl.b(aragVar6);
        }
        textView7.setText(b2);
        TextView textView8 = this.f;
        textView8.setContentDescription(textView8.getText());
        TextView textView9 = this.e;
        arag aragVar7 = aquvVar.h;
        if (aragVar7 == null) {
            aragVar7 = arag.a;
        }
        textView9.setText(ajgl.b(aragVar7));
        this.e.setImportantForAccessibility(2);
        apzg apzgVar2 = aquvVar.e;
        if (apzgVar2 == null) {
            apzgVar2 = apzg.a;
        }
        this.a = apzgVar2;
        aign aignVar2 = (aign) ajrsVar.c("visibility_change_listener");
        this.i = aignVar2;
        aignVar2.a(this);
        g(this.i.a);
        float f2 = this.i.b;
    }
}
