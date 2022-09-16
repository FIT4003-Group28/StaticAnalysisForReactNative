package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wfc  reason: default package */
/* loaded from: classes4.dex */
public final class wfc extends ajsl {
    public final aafo a;
    public final View b;
    public final acti c;
    public apzg d;
    public byte[] e;
    private final Context f;
    private final ajmy g;
    private final TextView h;
    private final ImageView i;
    private final ajxz j;
    private TextView k;
    private final ColorStateList l;

    public wfc(Context context, ajmy ajmyVar, ajxz ajxzVar, aafo aafoVar, acth acthVar) {
        this.f = context;
        ajxzVar.getClass();
        this.j = ajxzVar;
        aafoVar.getClass();
        ajmyVar.getClass();
        this.g = ajmyVar;
        this.a = aafoVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.account_compact_link, (ViewGroup) null);
        this.b = inflate;
        this.h = (TextView) inflate.findViewById(R.id.title);
        this.i = (ImageView) inflate.findViewById(R.id.thumbnail);
        this.l = zhn.f(context, R.attr.ytTextPrimary);
        this.c = acthVar.oi();
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        arag aragVar;
        arag aragVar2;
        apzg apzgVar;
        acti actiVar;
        aqdr aqdrVar = (aqdr) obj;
        TextView textView = this.h;
        if ((aqdrVar.b & 16) != 0) {
            aragVar = aqdrVar.j;
            if (aragVar == null) {
                aragVar = arag.a;
            }
        } else {
            aragVar = null;
        }
        zag.m(textView, ajgl.b(aragVar));
        if ((aqdrVar.b & 32) != 0) {
            aragVar2 = aqdrVar.k;
            if (aragVar2 == null) {
                aragVar2 = arag.a;
            }
        } else {
            aragVar2 = null;
        }
        Spanned b = ajgl.b(aragVar2);
        if (!TextUtils.isEmpty(b) && this.k == null) {
            this.k = (TextView) ((ViewStub) this.b.findViewById(R.id.subtitle)).inflate().findViewById(R.id.subtitle);
        }
        TextView textView2 = this.k;
        if (textView2 != null) {
            zag.m(textView2, b);
        }
        boolean z = true;
        int i = 8;
        if ((aqdrVar.b & 1) == 0) {
            ajmy ajmyVar = this.g;
            ImageView imageView = this.i;
            avhn avhnVar = aqdrVar.i;
            if (avhnVar == null) {
                avhnVar = avhn.a;
            }
            ajmyVar.h(imageView, avhnVar);
            kw.h(this.i, null);
            ImageView imageView2 = this.i;
            if ((aqdrVar.b & 4) != 0) {
                i = 0;
            }
            imageView2.setVisibility(i);
        } else {
            ajxz ajxzVar = this.j;
            arhs arhsVar = aqdrVar.g;
            if (arhsVar == null) {
                arhsVar = arhs.a;
            }
            arhr b2 = arhr.b(arhsVar.c);
            if (b2 == null) {
                b2 = arhr.UNKNOWN;
            }
            int a = ajxzVar.a(b2);
            this.g.e(this.i);
            if (a == 0) {
                this.i.setVisibility(8);
            } else {
                this.i.setImageResource(a);
                ImageView imageView3 = this.i;
                imageView3.setImageDrawable(new yzh(this.f).c(imageView3.getDrawable(), this.l));
                this.i.setVisibility(0);
            }
        }
        if (aqdrVar.e == 4) {
            apzgVar = (apzg) aqdrVar.f;
        } else {
            apzgVar = apzg.a;
        }
        this.d = apzgVar;
        apzg apzgVar2 = aqdrVar.e == 9 ? (apzg) aqdrVar.f : null;
        byte[] I = aqdrVar.n.I();
        this.e = I;
        if (I != null && (actiVar = this.c) != null) {
            actiVar.u(new acte(I), null);
        }
        this.b.setOnClickListener(new View.OnClickListener() { // from class: wfb
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                acti actiVar2;
                wfc wfcVar = wfc.this;
                byte[] bArr = wfcVar.e;
                if (bArr != null && (actiVar2 = wfcVar.c) != null) {
                    actiVar2.H(3, new acte(bArr), null);
                }
                apzg apzgVar3 = wfcVar.d;
                if (apzgVar3 != null) {
                    wfcVar.a.a(apzgVar3);
                }
            }
        });
        View view = this.b;
        if (this.d == null && apzgVar2 == null) {
            z = false;
        }
        view.setClickable(z);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((aqdr) obj).n.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
