package defpackage;

import android.app.AlertDialog;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
/* compiled from: PG */
/* renamed from: gow  reason: default package */
/* loaded from: classes3.dex */
public final class gow extends ajgv {
    public final aafo a;
    public final acti b;
    public final ajxz c;
    public apoj d;
    public apoj e;
    public Map f;
    private final ajmy j;

    public gow(aafo aafoVar, acti actiVar, ajxz ajxzVar, ajmy ajmyVar, ajgz ajgzVar) {
        super(aafoVar, ajgzVar, null, null);
        aafoVar.getClass();
        this.a = aafoVar;
        this.b = actiVar;
        this.c = ajxzVar;
        this.j = ajmyVar;
    }

    public static CharSequence b(apoj apojVar) {
        arag aragVar = null;
        if (apojVar == null) {
            return null;
        }
        if ((apojVar.b & 256) != 0 && (aragVar = apojVar.i) == null) {
            aragVar = arag.a;
        }
        return ajgl.b(aragVar);
    }

    public static CharSequence c(List list, aafo aafoVar) {
        CharSequence charSequence = null;
        if (list.isEmpty()) {
            return null;
        }
        CharSequence concat = TextUtils.concat(System.getProperty("line.separator"), System.getProperty("line.separator"));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Spanned a = aafv.a((arag) it.next(), aafoVar, false);
            charSequence = charSequence != null ? TextUtils.concat(charSequence, concat, a) : a;
        }
        return charSequence;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajgv
    public final Map d() {
        Map d = super.d();
        Map map = this.f;
        if (map != null) {
            d.putAll(map);
        }
        return d;
    }

    @Override // defpackage.ajgv
    protected final void e() {
        apoj apojVar = this.e;
        if (apojVar != null) {
            if ((apojVar.b & 1048576) != 0) {
                this.b.H(3, new acte(apojVar.t), null);
            }
            apoj apojVar2 = this.e;
            int i = apojVar2.b;
            if ((i & 16384) != 0) {
                aafo aafoVar = this.g;
                apzg apzgVar = apojVar2.o;
                if (apzgVar == null) {
                    apzgVar = apzg.a;
                }
                aafoVar.c(apzgVar, d());
            } else if ((i & 32768) == 0) {
            } else {
                aafo aafoVar2 = this.g;
                apzg apzgVar2 = apojVar2.p;
                if (apzgVar2 == null) {
                    apzgVar2 = apzg.a;
                }
                aafoVar2.c(apzgVar2, d());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.ajgv
    public final void f() {
        apoj apojVar = this.d;
        if (apojVar != null) {
            if ((apojVar.b & 1048576) != 0) {
                this.b.H(3, new acte(apojVar.t), null);
            }
            apoj apojVar2 = this.d;
            if ((apojVar2.b & 32768) == 0) {
                return;
            }
            aafo aafoVar = this.g;
            apzg apzgVar = apojVar2.p;
            if (apzgVar == null) {
                apzgVar = apzg.a;
            }
            aafoVar.c(apzgVar, d());
        }
    }

    public final void g(Resources resources, ImageView imageView, avhn avhnVar) {
        Uri q = akel.q(avhnVar);
        if (q == null) {
            return;
        }
        this.j.l(q, new acga(resources, imageView, 1));
    }

    public final void h(Context context, int i, Spanned spanned, List list, avhn avhnVar, avhn avhnVar2, avhn avhnVar3, arhs arhsVar, boolean z) {
        View inflate = LayoutInflater.from(context).inflate(i, (ViewGroup) null);
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setView(inflate);
        yzh yzhVar = new yzh(context);
        int orElse = zhn.j(context, R.attr.ytCallToAction).orElse(0);
        if (avhnVar == null || avhnVar.c.size() <= 0) {
            inflate.findViewById(R.id.header_container).setVisibility(8);
        } else {
            this.j.h((ImageView) inflate.findViewById(R.id.header), avhnVar);
            View findViewById = inflate.findViewById(R.id.link_icon_background);
            if (avhnVar2 == null || avhnVar3 == null || arhsVar == null) {
                findViewById.setVisibility(8);
            } else {
                g(context.getResources(), (ImageView) inflate.findViewById(R.id.user_avatar), avhnVar3);
                g(context.getResources(), (ImageView) inflate.findViewById(R.id.third_party_avatar), avhnVar2);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.link_icon);
                ajxz ajxzVar = this.c;
                arhr b = arhr.b(arhsVar.c);
                if (b == null) {
                    b = arhr.UNKNOWN;
                }
                imageView.setImageResource(ajxzVar.a(b));
                yzhVar.b(findViewById.getBackground(), orElse);
            }
        }
        if (z) {
            inflate.findViewById(R.id.close_button).setOnClickListener(new gov(this, 2));
            inflate.findViewById(R.id.link_button_container).setOnClickListener(new gov(this, 3));
            TextView textView = (TextView) inflate.findViewById(R.id.link_button);
            yzhVar.b(textView.getBackground(), orElse);
            textView.setTextColor(zhn.j(context, R.attr.ytFilledButtonText).orElse(0));
            textView.setText(b(this.d));
            builder.setNegativeButton((CharSequence) null, this);
            builder.setPositiveButton((CharSequence) null, this);
        } else {
            builder.setNegativeButton(b(this.e), this);
            builder.setPositiveButton(b(this.d), this);
        }
        zag.m((TextView) inflate.findViewById(R.id.title), spanned);
        TextView textView2 = (TextView) inflate.findViewById(R.id.message);
        textView2.setText(c(list, this.a));
        textView2.setMovementMethod(LinkMovementMethod.getInstance());
        j(builder.create());
        k();
        apoj apojVar = this.e;
        if (apojVar == null || (apojVar.b & 1048576) == 0) {
            return;
        }
        ((acsx) this.b).D(new acte(apojVar.t));
    }
}
