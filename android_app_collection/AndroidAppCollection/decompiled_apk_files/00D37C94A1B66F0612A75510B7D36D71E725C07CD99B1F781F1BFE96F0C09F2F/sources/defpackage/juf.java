package defpackage;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.youtube.R;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: juf  reason: default package */
/* loaded from: classes3.dex */
public final class juf implements jut {
    private final Context a;
    private final jgo b;
    private final ampq c;
    private final /* synthetic */ int d;

    public juf(Context context, jgo jgoVar, ampq ampqVar) {
        this.a = context;
        this.b = jgoVar;
        this.c = ampqVar;
    }

    public juf(Context context, jgo jgoVar, ampq ampqVar, int i) {
        this.d = i;
        this.a = context;
        this.b = jgoVar;
        this.c = ampqVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        int i = this.d;
        if (i == 0) {
            aopa createBuilder = aqpw.a.createBuilder();
            String string = this.a.getString(R.string.smart_downloads_title);
            createBuilder.copyOnWrite();
            aqpw aqpwVar = (aqpw) createBuilder.instance;
            string.getClass();
            aqpwVar.c |= 4;
            aqpwVar.d = string;
            if (this.c.h()) {
                int days = (int) TimeUnit.MILLISECONDS.toDays(((juu) this.c.c()).b);
                String quantityString = this.a.getResources().getQuantityString(R.plurals.smart_downloads_future_update_text, days, Integer.valueOf(days));
                createBuilder.copyOnWrite();
                aqpw aqpwVar2 = (aqpw) createBuilder.instance;
                quantityString.getClass();
                aqpwVar2.c |= 8;
                aqpwVar2.e = quantityString;
                Context context = this.a;
                String string2 = context.getString(R.string.smart_downloads_used_storage_label, zgh.o(context.getResources(), ((juu) this.c.c()).a).replace(" ", ""));
                createBuilder.copyOnWrite();
                aqpw aqpwVar3 = (aqpw) createBuilder.instance;
                string2.getClass();
                aqpwVar3.c |= 16;
                aqpwVar3.f = string2;
            }
            ampq b = this.b.b(R.raw.downloads_page_smart_downloads_header_element_android, aqpw.b, (aqpw) createBuilder.mo39build());
            if (b.h()) {
                aopa createBuilder2 = aslo.a.createBuilder();
                createBuilder2.copyOnWrite();
                aslo asloVar = (aslo) createBuilder2.instance;
                asloVar.i = (aqtb) b.c();
                asloVar.b |= 64;
                return amuk.r(new jur((aslo) createBuilder2.mo39build()));
            }
            return amuk.q();
        } else if (i == 1) {
            if (!this.c.h()) {
                return amuk.q();
            }
            jth jthVar = (jth) this.c.c();
            jgo jgoVar = this.b;
            aopg aopgVar = aqoz.b;
            aopa createBuilder3 = aqoz.a.createBuilder();
            Resources resources = this.a.getResources();
            int i2 = jthVar.a;
            String str = ajgl.h(resources.getQuantityString(R.plurals.offline_go_online_to_renew_dialog_message, i2, Integer.valueOf(i2))).d;
            createBuilder3.copyOnWrite();
            aqoz aqozVar = (aqoz) createBuilder3.instance;
            str.getClass();
            aqozVar.c |= 4;
            aqozVar.d = str;
            int i3 = jthVar.b;
            createBuilder3.copyOnWrite();
            aqoz aqozVar2 = (aqoz) createBuilder3.instance;
            aqozVar2.e = i3 - 1;
            aqozVar2.c |= 8;
            ampq b2 = jgoVar.b(R.raw.downloads_page_disclaimer_element_android, aopgVar, (aqoz) createBuilder3.mo39build());
            if (!b2.h()) {
                return amuk.q();
            }
            aopa createBuilder4 = aslt.a.createBuilder();
            createBuilder4.copyOnWrite();
            aslt asltVar = (aslt) createBuilder4.instance;
            asltVar.av = (aqtb) b2.c();
            asltVar.h |= 1048576;
            return amuk.r(new jur((aslt) createBuilder4.mo39build()));
        } else {
            int days2 = (int) TimeUnit.SECONDS.toDays(((Long) this.c.e(0L)).longValue());
            jgo jgoVar2 = this.b;
            aopg aopgVar2 = aqpz.b;
            aopa createBuilder5 = aqpz.a.createBuilder();
            String quantityString2 = this.a.getResources().getQuantityString(R.plurals.smart_downloads_future_update_text, days2, Integer.valueOf(days2));
            createBuilder5.copyOnWrite();
            aqpz aqpzVar = (aqpz) createBuilder5.instance;
            quantityString2.getClass();
            aqpzVar.c |= 8;
            aqpzVar.d = quantityString2;
            String h = akzj.h(this.a.getString(R.string.smart_downloads_update_button_text));
            createBuilder5.copyOnWrite();
            aqpz aqpzVar2 = (aqpz) createBuilder5.instance;
            h.getClass();
            aqpzVar2.c |= 64;
            aqpzVar2.e = h;
            String h2 = akzj.h(this.a.getString(R.string.smart_downloads_opt_out_button_text));
            createBuilder5.copyOnWrite();
            aqpz aqpzVar3 = (aqpz) createBuilder5.instance;
            h2.getClass();
            aqpzVar3.c |= 128;
            aqpzVar3.f = h2;
            String w = emn.w();
            createBuilder5.copyOnWrite();
            aqpz aqpzVar4 = (aqpz) createBuilder5.instance;
            w.getClass();
            aqpzVar4.c |= 256;
            aqpzVar4.g = w;
            ampq b3 = jgoVar2.b(R.raw.downloads_page_smart_downloads_zero_state_element_android, aopgVar2, (aqpz) createBuilder5.mo39build());
            if (b3.h()) {
                aopa createBuilder6 = aslt.a.createBuilder();
                createBuilder6.copyOnWrite();
                aslt asltVar2 = (aslt) createBuilder6.instance;
                asltVar2.av = (aqtb) b3.c();
                asltVar2.h |= 1048576;
                return amuk.r(new jur((aslt) createBuilder6.mo39build()));
            }
            return amuk.q();
        }
    }
}
