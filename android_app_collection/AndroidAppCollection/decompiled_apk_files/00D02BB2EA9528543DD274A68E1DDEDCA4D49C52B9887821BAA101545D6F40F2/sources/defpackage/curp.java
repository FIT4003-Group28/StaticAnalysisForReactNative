package defpackage;

import android.content.Context;
import android.view.View;
import com.google.android.libraries.messaging.lighter.richcard.ui.RichCardContentView;
/* compiled from: PG */
/* renamed from: curp  reason: default package */
/* loaded from: classes5.dex */
public final class curp implements cuzw {
    private final cuuc a;
    private final cuwi b;
    private final cuiv c;

    public curp(cuuc cuucVar, cuwi cuwiVar, cuiv cuivVar) {
        this.a = cuucVar;
        this.b = cuwiVar;
        this.c = cuivVar;
        synchronized (curb.a) {
            curb.a.clear();
        }
    }

    @Override // defpackage.cuzw
    public final View a(cugu cuguVar, Context context, ctyy ctyyVar) {
        RichCardContentView richCardContentView = new RichCardContentView(context);
        dbsg<cupx> a = cumv.a(cuguVar);
        richCardContentView.setDrawBorder(false);
        if (a.a()) {
            richCardContentView.a(a.b(), this.a, this.b, this.c, ctyyVar, cuguVar);
        }
        return richCardContentView;
    }

    @Override // defpackage.cuzw
    public final boolean b(cugu cuguVar) {
        dbsg<cupx> a = cumv.a(cuguVar);
        if (a.a() && a.b().b() == cupw.STACK_CARD) {
            dcdc<cuql> a2 = a.b().c().a();
            int size = a2.size();
            for (int i = 0; i < size; i++) {
                cuql cuqlVar = a2.get(i);
                cuqi cuqiVar = cuqi.STACK_COMPONENT;
                int ordinal = cuqlVar.b().ordinal();
                if (ordinal == 0) {
                    dcdc<cuqq> a3 = cuqlVar.a().a();
                    int size2 = a3.size();
                    int i2 = 0;
                    while (i2 < size2) {
                        int i3 = i2 + 1;
                        if (!cury.a(a3.get(i2), this.a)) {
                            return false;
                        }
                        i2 = i3;
                    }
                    continue;
                } else if (ordinal == 1) {
                    return cury.a(cuqlVar.c(), this.a);
                }
            }
            return true;
        }
        return false;
    }
}
