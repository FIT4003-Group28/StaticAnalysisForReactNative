package defpackage;

import android.content.Context;
import com.google.android.youtube.R;
import java.util.Map;
/* compiled from: PG */
/* renamed from: akmo  reason: default package */
/* loaded from: classes.dex */
public final class akmo implements aafl {
    public final Context a;
    public final aazu b;
    public final aafo c;
    private final acti d;

    public akmo(Context context, aazu aazuVar, aafo aafoVar, acti actiVar) {
        this.a = context;
        aazuVar.getClass();
        this.b = aazuVar;
        aafoVar.getClass();
        this.c = aafoVar;
        this.d = actiVar;
    }

    @Override // defpackage.aafl
    public final void kD(apzg apzgVar, Map map) {
        aopa createBuilder = aqft.a.createBuilder();
        arag h = ajgl.h(this.a.getString(R.string.publish_and_share_confirm_dialog_title));
        createBuilder.copyOnWrite();
        aqft aqftVar = (aqft) createBuilder.instance;
        h.getClass();
        aqftVar.c = h;
        aqftVar.b |= 1;
        createBuilder.ab(ajgl.h(this.a.getString(R.string.publish_and_share_confirm_dialog_body)));
        aopa createBuilder2 = apok.a.createBuilder();
        aopc aopcVar = (aopc) apoj.a.createBuilder();
        arag h2 = ajgl.h(this.a.getString(R.string.publish_and_share_confirm_dialog_confirm_button));
        aopcVar.copyOnWrite();
        apoj apojVar = (apoj) aopcVar.instance;
        h2.getClass();
        apojVar.i = h2;
        apojVar.b |= 256;
        createBuilder2.copyOnWrite();
        apok apokVar = (apok) createBuilder2.instance;
        apoj apojVar2 = (apoj) aopcVar.mo39build();
        apojVar2.getClass();
        apokVar.c = apojVar2;
        apokVar.b |= 1;
        createBuilder.copyOnWrite();
        aqft aqftVar2 = (aqft) createBuilder.instance;
        apok apokVar2 = (apok) createBuilder2.mo39build();
        apokVar2.getClass();
        aqftVar2.h = apokVar2;
        aqftVar2.b |= 32;
        aopa createBuilder3 = apok.a.createBuilder();
        aopc aopcVar2 = (aopc) apoj.a.createBuilder();
        arag h3 = ajgl.h(this.a.getString(R.string.cancel));
        aopcVar2.copyOnWrite();
        apoj apojVar3 = (apoj) aopcVar2.instance;
        h3.getClass();
        apojVar3.i = h3;
        apojVar3.b |= 256;
        createBuilder3.copyOnWrite();
        apok apokVar3 = (apok) createBuilder3.instance;
        apoj apojVar4 = (apoj) aopcVar2.mo39build();
        apojVar4.getClass();
        apokVar3.c = apojVar4;
        apokVar3.b |= 1;
        createBuilder.copyOnWrite();
        aqft aqftVar3 = (aqft) createBuilder.instance;
        apok apokVar4 = (apok) createBuilder3.mo39build();
        apokVar4.getClass();
        aqftVar3.i = apokVar4;
        aqftVar3.b |= 64;
        ajgx.c(this.a, (aqft) createBuilder.mo39build(), this.c, this.d, new akmm(this, apzgVar, map), map);
    }
}
