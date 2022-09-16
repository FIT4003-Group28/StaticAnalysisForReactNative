package defpackage;

import android.content.Context;
import android.os.Build;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.youtube.app.common.widget.WrappingTextView;
import com.google.android.youtube.R;
import java.util.Iterator;
import java.util.List;
/* compiled from: PG */
/* renamed from: ekl  reason: default package */
/* loaded from: classes3.dex */
public abstract class ekl implements ajru {
    final Context a;
    final fny b;
    final fmg c;
    final ajrp d;
    public final View e;
    public final TextView f;
    public final WrappingTextView g;
    protected final TextView h;
    boolean i;
    public Object j;
    private final ajmy k;
    private final ajmu l;
    private final ajrx m;
    private final ajyc n;
    private final Runnable o;
    private final TextView p;
    private final TextView q;
    private final ImageView r;
    private final ImageView s;
    private final View t;
    private TextView u;

    public ekl(Context context, ajmy ajmyVar, gem gemVar, ajrq ajrqVar, ajyc ajycVar, fmh fmhVar, fnz fnzVar) {
        this.a = context;
        ajmyVar.getClass();
        this.k = ajmyVar;
        this.m = gemVar;
        this.n = ajycVar;
        View inflate = LayoutInflater.from(context).inflate(R.layout.compact_channel_item, (ViewGroup) null);
        this.e = inflate;
        this.f = (TextView) inflate.findViewById(R.id.channel_name);
        this.p = (TextView) inflate.findViewById(R.id.video_count);
        this.q = (TextView) inflate.findViewById(R.id.subscriber_count);
        this.r = (ImageView) inflate.findViewById(R.id.channel_avatar);
        this.s = (ImageView) inflate.findViewById(R.id.contextual_menu_anchor);
        this.g = (WrappingTextView) inflate.findViewById(R.id.channel_byline);
        this.t = inflate.findViewById(R.id.channel_subscribe_button_container);
        this.h = (TextView) inflate.findViewById(R.id.purchase_button);
        ajmt b = ajmyVar.c().b();
        b.b(2131232143);
        this.l = b.a();
        fny a = fnzVar.a(inflate.findViewById(R.id.subscription_notification_view));
        this.b = a;
        this.c = fmhVar.a((TextView) inflate.findViewById(R.id.subscribe_button), a);
        if (gemVar.b == null) {
            gemVar.c(inflate);
        }
        this.d = ajrqVar.a(gemVar);
        this.o = new Runnable() { // from class: ekk
            @Override // java.lang.Runnable
            public final void run() {
                ekl eklVar = ekl.this;
                if (eklVar.j == null || eklVar.g.getLineCount() < 2 || eklVar.g.getLineCount() + eklVar.f.getLineCount() < 4) {
                    return;
                }
                eklVar.g.a(ekl.p(eklVar.h(eklVar.j), null));
            }
        };
    }

    public static final amuk p(CharSequence charSequence, CharSequence charSequence2) {
        amuf h = amuk.h(2);
        if (!TextUtils.isEmpty(charSequence)) {
            h.h(charSequence);
        }
        if (!TextUtils.isEmpty(charSequence2)) {
            h.h(charSequence2);
        }
        return h.g();
    }

    private final avaq q(avaq avaqVar, acti actiVar) {
        View a;
        if (avaqVar != null) {
            aopa mo52toBuilder = avaqVar.mo52toBuilder();
            fyv.c(this.a, mo52toBuilder, this.f.getText());
            avaqVar = (avaq) mo52toBuilder.mo39build();
        }
        this.c.i(avaqVar, actiVar);
        boolean z = true;
        if (!this.i && (a = this.b.a()) != null) {
            int dimensionPixelOffset = this.a.getResources().getDimensionPixelOffset(R.dimen.channel_subscribe_button_vertical_padding);
            int dimensionPixelOffset2 = this.a.getResources().getDimensionPixelOffset(R.dimen.channel_subscribe_button_horizontal_padding);
            int dimensionPixelSize = this.a.getResources().getDimensionPixelSize(R.dimen.notification_bell_min_size) - dimensionPixelOffset2;
            a.setPaddingRelative(dimensionPixelOffset2, dimensionPixelOffset, 0, dimensionPixelOffset);
            if (a instanceof TextView) {
                TextView textView = (TextView) a;
                if (textView.getMinWidth() > dimensionPixelSize) {
                    textView.setMinWidth(dimensionPixelSize);
                }
            }
            if (a.getMinimumWidth() > dimensionPixelSize) {
                a.setMinimumWidth(dimensionPixelSize);
            }
            this.i = true;
        }
        View view = this.t;
        if (avaqVar == null) {
            z = false;
        }
        zag.o(view, z);
        return avaqVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.e;
    }

    public abstract apzg d(Object obj);

    public abstract ates e(Object obj);

    public abstract avaq f(Object obj);

    public abstract avhn g(Object obj);

    public abstract CharSequence h(Object obj);

    public abstract CharSequence i(Object obj);

    public abstract CharSequence j(Object obj);

    public abstract CharSequence k(Object obj);

    public abstract CharSequence l(Object obj);

    public abstract Object m(Object obj, avaq avaqVar);

    public abstract List n(Object obj);

    public abstract byte[] o(Object obj);

    @Override // defpackage.ajru
    public void oK(ajrs ajrsVar, Object obj) {
        WrappingTextView wrappingTextView;
        aplz aplzVar;
        Spanned spanned;
        arag aragVar;
        this.j = obj;
        byte[] o = o(obj);
        atep atepVar = null;
        if (o != null) {
            ajrsVar.a.u(new acte(o), null);
        }
        this.f.setText(k(obj));
        avaq f = f(obj);
        acti actiVar = ajrsVar.a;
        if ((Build.VERSION.SDK_INT < 26 && zdg.f(this.a)) || f == null) {
            q(null, actiVar);
            zag.m(this.p, l(obj));
            zag.m(this.q, j(obj));
            zag.o(this.g, false);
        } else {
            Object m = m(obj, q(f, actiVar));
            this.g.a(p(h(m), i(m)));
            this.g.post(this.o);
            zag.o(this.p, false);
            zag.o(this.q, false);
            zag.o(this.g, !wrappingTextView.a.isEmpty());
        }
        zag.o(this.h, false);
        this.k.k(this.r, g(obj), this.l);
        Iterator it = n(obj).iterator();
        while (true) {
            if (!it.hasNext()) {
                aplzVar = null;
                break;
            }
            aplw aplwVar = (aplw) it.next();
            if ((aplwVar.b & 2) != 0) {
                aplzVar = aplwVar.d;
                if (aplzVar == null) {
                    aplzVar = aplz.a;
                }
            }
        }
        if (aplzVar != null) {
            if ((aplzVar.b & 1) != 0) {
                aragVar = aplzVar.c;
                if (aragVar == null) {
                    aragVar = arag.a;
                }
            } else {
                aragVar = null;
            }
            spanned = ajgl.b(aragVar);
        } else {
            spanned = null;
        }
        if (!TextUtils.isEmpty(spanned)) {
            if (this.u == null) {
                this.u = (TextView) ((ViewStub) this.e.findViewById(R.id.live_badge)).inflate();
            }
            zag.m(this.u, spanned);
        } else {
            TextView textView = this.u;
            if (textView != null) {
                zag.o(textView, false);
            }
        }
        acti actiVar2 = ajrsVar.a;
        ates e = e(obj);
        ajyc ajycVar = this.n;
        View view = this.e;
        ImageView imageView = this.s;
        if (e != null && (e.b & 1) != 0 && (atepVar = e.c) == null) {
            atepVar = atep.a;
        }
        ajycVar.e(view, imageView, atepVar, obj, actiVar2);
        this.m.e(ajrsVar);
        this.d.a(ajrsVar.a, d(obj), ajrsVar.e());
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.d.c();
        this.c.d();
    }
}
