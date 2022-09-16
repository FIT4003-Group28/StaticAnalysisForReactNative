package defpackage;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hub  reason: default package */
/* loaded from: classes3.dex */
public final class hub implements iic, hvm {
    public static final amup a = amup.l(awzv.CHANNEL_MENTION_NORMAL, Integer.valueOf((int) R.style.NormalDynamicSticker), awzv.CHANNEL_MENTION_LIGHT, Integer.valueOf((int) R.style.LightDynamicSticker));
    public static final awzv b = awzv.CHANNEL_MENTION_NORMAL;
    public final iie c;
    public final dt d;
    public final hvn e;
    public final hta f;
    public final htu g;
    public final acth h;
    public final hwq i;
    public ViewGroup j;
    public iid k;
    public aunb l;
    public boolean m;
    public apzg n;
    public gtx o;
    public hrm p;
    public final aakr q;
    private final ajmy r;

    public hub(iie iieVar, dt dtVar, ajmy ajmyVar, hvn hvnVar, hta htaVar, aakr aakrVar, htu htuVar, acth acthVar, hwq hwqVar, byte[] bArr, byte[] bArr2) {
        this.c = iieVar;
        this.d = dtVar;
        this.r = ajmyVar;
        this.e = hvnVar;
        this.f = htaVar;
        this.q = aakrVar;
        this.g = htuVar;
        this.h = acthVar;
        this.i = hwqVar;
    }

    private final void f(axbl axblVar, awzv awzvVar, hvg hvgVar) {
        awzu awzuVar;
        awzu awzuVar2;
        awzu awzuVar3;
        View inflate = LayoutInflater.from(new ContextThemeWrapper(this.d, ((Integer) a.get(awzvVar)).intValue())).inflate(R.layout.user_mention_sticker, new FrameLayout(this.d));
        aopa mo52toBuilder = ((axbm) axblVar.instance).i().mo52toBuilder();
        axbk i = ((axbm) axblVar.instance).i();
        if (i.c == 6) {
            awzuVar = (awzu) i.d;
        } else {
            awzuVar = awzu.a;
        }
        aopa mo52toBuilder2 = awzuVar.mo52toBuilder();
        axbk i2 = ((axbm) axblVar.instance).i();
        if (i2.c == 6) {
            awzuVar2 = (awzu) i2.d;
        } else {
            awzuVar2 = awzu.a;
        }
        awzt awztVar = awzuVar2.f;
        if (awztVar == null) {
            awztVar = awzt.b;
        }
        aopa mo52toBuilder3 = awztVar.mo52toBuilder();
        mo52toBuilder3.copyOnWrite();
        awzt awztVar2 = (awzt) mo52toBuilder3.instance;
        awztVar2.d = awzvVar.d;
        awztVar2.c |= 1;
        mo52toBuilder2.copyOnWrite();
        awzu awzuVar4 = (awzu) mo52toBuilder2.instance;
        awzt awztVar3 = (awzt) mo52toBuilder3.mo39build();
        awztVar3.getClass();
        awzuVar4.f = awztVar3;
        awzuVar4.b |= 8;
        mo52toBuilder.copyOnWrite();
        axbk axbkVar = (axbk) mo52toBuilder.instance;
        awzu awzuVar5 = (awzu) mo52toBuilder2.mo39build();
        awzuVar5.getClass();
        axbkVar.d = awzuVar5;
        axbkVar.c = 6;
        axblVar.copyOnWrite();
        ((axbm) axblVar.instance).F((axbk) mo52toBuilder.mo39build());
        axbk i3 = ((axbm) axblVar.instance).i();
        if (i3.c == 6) {
            awzuVar3 = (awzu) i3.d;
        } else {
            awzuVar3 = awzu.a;
        }
        ((TextView) inflate.findViewById(R.id.text)).setText(awzuVar3.d);
        this.r.l(zgt.j(awzuVar3.e), new hua(this, (ImageView) inflate.findViewById(R.id.icon), inflate, axblVar, hvgVar));
    }

    @Override // defpackage.hvm
    public final void a(axaj axajVar) {
        awzu awzuVar;
        this.h.oi().H(3, new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
        axbk i = axajVar.c().i();
        if (i.c == 6) {
            awzuVar = (awzu) i.d;
        } else {
            awzuVar = awzu.a;
        }
        awzt awztVar = awzuVar.f;
        if (awztVar == null) {
            awztVar = awzt.b;
        }
        aops aopsVar = new aops(awztVar.e, awzt.a);
        awzv b2 = awzv.b(awztVar.d);
        if (b2 == null) {
            b2 = awzv.CHANNEL_MENTION_STYLE_UNSPECIFIED;
        }
        final aopa mo52toBuilder = axajVar.mo52toBuilder();
        f((axbl) ((axaj) mo52toBuilder.instance).c().mo52toBuilder(), (awzv) htj.a(aopsVar, b2), new hvg() { // from class: hty
            @Override // defpackage.hvg
            public final void a(axbl axblVar) {
                hub hubVar = hub.this;
                aopa aopaVar = mo52toBuilder;
                aopaVar.copyOnWrite();
                ((axaj) aopaVar.instance).e((axbm) axblVar.mo39build());
                hubVar.e.aR(aopaVar);
            }
        });
    }

    public final void c(axbl axblVar, awzv awzvVar, final boolean z) {
        f(axblVar, awzvVar, new hvg() { // from class: htz
            @Override // defpackage.hvg
            public final void a(axbl axblVar2) {
                hub hubVar = hub.this;
                boolean z2 = z;
                hubVar.e.aH(axblVar2);
                if (z2) {
                    hubVar.g.d(axblVar2);
                }
            }
        });
    }

    public final void d() {
        this.o.a();
        this.j.setVisibility(8);
    }

    public final void e(ImageView imageView) {
        imageView.getDrawable().setTint(this.d.getColor(R.color.yt_dark_blue));
    }

    @Override // defpackage.hvm
    public final void mt(axbm axbmVar) {
        awzu awzuVar;
        this.h.oi().H(3, new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
        axbk i = axbmVar.i();
        if (i.c == 6) {
            awzuVar = (awzu) i.d;
        } else {
            awzuVar = awzu.a;
        }
        awzt awztVar = awzuVar.f;
        if (awztVar == null) {
            awztVar = awzt.b;
        }
        aops aopsVar = new aops(awztVar.e, awzt.a);
        awzv b2 = awzv.b(awztVar.d);
        if (b2 == null) {
            b2 = awzv.CHANNEL_MENTION_STYLE_UNSPECIFIED;
        }
        c((axbl) axbmVar.mo52toBuilder(), (awzv) htj.a(aopsVar, b2), false);
    }
}
