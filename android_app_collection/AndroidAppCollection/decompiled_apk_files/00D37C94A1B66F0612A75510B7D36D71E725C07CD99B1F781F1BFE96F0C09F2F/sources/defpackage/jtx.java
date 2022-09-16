package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: jtx  reason: default package */
/* loaded from: classes3.dex */
public final class jtx implements jut {
    private final Context a;

    public jtx(Context context) {
        this.a = context;
    }

    @Override // defpackage.jut
    public final amuk a(jnb jnbVar) {
        aopa createBuilder = aslo.a.createBuilder();
        aopa createBuilder2 = aslu.a.createBuilder();
        arag h = ajgl.h(this.a.getResources().getString(R.string.download_recommendations_title));
        createBuilder2.copyOnWrite();
        aslu asluVar = (aslu) createBuilder2.instance;
        h.getClass();
        asluVar.c = h;
        asluVar.b |= 1;
        aslu asluVar2 = (aslu) createBuilder2.mo39build();
        createBuilder.copyOnWrite();
        aslo asloVar = (aslo) createBuilder.instance;
        asluVar2.getClass();
        asloVar.g = asluVar2;
        asloVar.b |= 16;
        return amuk.r(new jur((aslo) createBuilder.mo39build()));
    }
}
