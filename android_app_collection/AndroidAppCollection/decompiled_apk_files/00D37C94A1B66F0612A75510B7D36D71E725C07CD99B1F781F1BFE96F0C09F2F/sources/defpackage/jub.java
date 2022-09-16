package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jub  reason: default package */
/* loaded from: classes3.dex */
public final class jub implements jut {
    private final Context a;
    private final jgo b;

    public jub(Context context, jgo jgoVar) {
        this.a = context;
        this.b = jgoVar;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        jgo jgoVar = this.b;
        aopg aopgVar = aqpg.b;
        aopa createBuilder = aqpg.a.createBuilder();
        String string = this.a.getString(R.string.smart_downloads_loading_spinner_text);
        createBuilder.copyOnWrite();
        aqpg aqpgVar = (aqpg) createBuilder.instance;
        string.getClass();
        aqpgVar.c |= 4;
        aqpgVar.d = string;
        ampq b = jgoVar.b(R.raw.downloads_page_loading_spinner_element_android, aopgVar, (aqpg) createBuilder.mo39build());
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
