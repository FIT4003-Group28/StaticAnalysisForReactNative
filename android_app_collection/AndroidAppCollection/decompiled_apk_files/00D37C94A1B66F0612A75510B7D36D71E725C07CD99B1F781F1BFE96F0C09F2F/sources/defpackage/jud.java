package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jud  reason: default package */
/* loaded from: classes3.dex */
public final class jud implements jut {
    private final Context a;
    private final jgo b;
    private final jsf c;

    public jud(Context context, jgo jgoVar, jsf jsfVar) {
        this.a = context;
        this.b = jgoVar;
        this.c = jsfVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        String str = (String) this.c.a.a(fbg.a).s(jnx.d).w(jnx.i).j("").W();
        jgo jgoVar = this.b;
        aopg aopgVar = aqpx.b;
        aopa createBuilder = aqpx.a.createBuilder();
        String string = this.a.getString(R.string.smart_downloads_title);
        createBuilder.copyOnWrite();
        aqpx aqpxVar = (aqpx) createBuilder.instance;
        string.getClass();
        aqpxVar.c |= 8;
        aqpxVar.d = string;
        createBuilder.copyOnWrite();
        aqpx aqpxVar2 = (aqpx) createBuilder.instance;
        str.getClass();
        aqpxVar2.c |= 16;
        aqpxVar2.e = str;
        String h = akzj.h(this.a.getString(R.string.smart_downloads_opt_in_button_text));
        createBuilder.copyOnWrite();
        aqpx aqpxVar3 = (aqpx) createBuilder.instance;
        h.getClass();
        aqpxVar3.c |= 32;
        aqpxVar3.f = h;
        String h2 = akzj.h(this.a.getString(R.string.dismiss));
        createBuilder.copyOnWrite();
        aqpx aqpxVar4 = (aqpx) createBuilder.instance;
        h2.getClass();
        aqpxVar4.c |= 64;
        aqpxVar4.g = h2;
        ampq b = jgoVar.b(R.raw.downloads_page_smart_downloads_opt_in_banner_element_android, aopgVar, (aqpx) createBuilder.mo39build());
        if (!b.h()) {
            return amuk.q();
        }
        aopa createBuilder2 = aslt.a.createBuilder();
        createBuilder2.copyOnWrite();
        aslt asltVar = (aslt) createBuilder2.instance;
        asltVar.av = (aqtb) b.c();
        asltVar.h |= 1048576;
        return amuk.r(new jur((aslt) createBuilder2.mo39build()));
    }
}
