package defpackage;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: hrd  reason: default package */
/* loaded from: classes3.dex */
public final class hrd implements hvm {
    public final Activity a;
    public final hvn b;
    public final hra c;
    public final acth d;
    public final htu e;
    public final hwq f;
    public final aakr g;

    public hrd(Activity activity, hvn hvnVar, hra hraVar, aakr aakrVar, htu htuVar, acth acthVar, hwq hwqVar, byte[] bArr, byte[] bArr2) {
        this.a = activity;
        this.b = hvnVar;
        this.c = hraVar;
        this.g = aakrVar;
        this.e = htuVar;
        this.d = acthVar;
        this.f = hwqVar;
    }

    private final TextView c(String str) {
        TextView textView = (TextView) LayoutInflater.from(this.a).inflate(R.layout.unicode_emoji_sticker, (ViewGroup) null);
        textView.setText(str);
        return textView;
    }

    private static final String d(axbm axbmVar) {
        axcg axcgVar;
        axbk i = axbmVar.i();
        if (i.c == 7) {
            axcgVar = (axcg) i.d;
        } else {
            axcgVar = axcg.a;
        }
        if ((axcgVar.b & 4) != 0) {
            axch axchVar = axcgVar.e;
            if (axchVar == null) {
                axchVar = axch.a;
            }
            aopu aopuVar = axchVar.d;
            return (String) aopuVar.get((aopuVar.indexOf(axchVar.c) + 1) % aopuVar.size());
        }
        return axcgVar.d;
    }

    private static final axbl e(axbm axbmVar, String str) {
        axcg axcgVar;
        axcg axcgVar2;
        axbk i = axbmVar.i();
        if (i.c == 7) {
            axcgVar = (axcg) i.d;
        } else {
            axcgVar = axcg.a;
        }
        axch axchVar = axcgVar.e;
        if (axchVar == null) {
            axchVar = axch.a;
        }
        aopa mo52toBuilder = axchVar.mo52toBuilder();
        mo52toBuilder.copyOnWrite();
        axch axchVar2 = (axch) mo52toBuilder.instance;
        str.getClass();
        axchVar2.b |= 1;
        axchVar2.c = str;
        axch axchVar3 = (axch) mo52toBuilder.mo39build();
        axbl axblVar = (axbl) axbmVar.mo52toBuilder();
        aopa mo52toBuilder2 = axbmVar.i().mo52toBuilder();
        axbk i2 = axbmVar.i();
        if (i2.c == 7) {
            axcgVar2 = (axcg) i2.d;
        } else {
            axcgVar2 = axcg.a;
        }
        aopa mo52toBuilder3 = axcgVar2.mo52toBuilder();
        mo52toBuilder3.copyOnWrite();
        axcg axcgVar3 = (axcg) mo52toBuilder3.instance;
        str.getClass();
        axcgVar3.b |= 2;
        axcgVar3.d = str;
        mo52toBuilder3.copyOnWrite();
        axcg axcgVar4 = (axcg) mo52toBuilder3.instance;
        axchVar3.getClass();
        axcgVar4.e = axchVar3;
        axcgVar4.b |= 4;
        mo52toBuilder2.copyOnWrite();
        axbk axbkVar = (axbk) mo52toBuilder2.instance;
        axcg axcgVar5 = (axcg) mo52toBuilder3.mo39build();
        axcgVar5.getClass();
        axbkVar.d = axcgVar5;
        axbkVar.c = 7;
        axblVar.copyOnWrite();
        ((axbm) axblVar.instance).F((axbk) mo52toBuilder2.mo39build());
        return axblVar;
    }

    @Override // defpackage.hvm
    public final void a(axaj axajVar) {
        final aopa mo52toBuilder = axajVar.mo52toBuilder();
        axbm c = axajVar.c();
        String d = d(c);
        TextView c2 = c(d);
        this.d.oi().H(3, new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
        hxb.e(this.a, this.g, c2, e(c, d), new hvg() { // from class: hrc
            @Override // defpackage.hvg
            public final void a(axbl axblVar) {
                hrd hrdVar = hrd.this;
                aopa aopaVar = mo52toBuilder;
                aopaVar.copyOnWrite();
                ((axaj) aopaVar.instance).e((axbm) axblVar.mo39build());
                hrdVar.b.aR(aopaVar);
            }
        });
    }

    @Override // defpackage.hvm
    public final void mt(axbm axbmVar) {
        String d = d(axbmVar);
        TextView c = c(d);
        this.d.oi().H(3, new acte(actj.EDIT_STICKER_TAP_TO_CHANGE_STYLE_BUTTON), null);
        hxb.e(this.a, this.g, c, e(axbmVar, d), new hrb(this));
    }
}
