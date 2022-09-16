package defpackage;

import android.content.Context;
import android.content.res.Configuration;
import java.util.ArrayList;
import java.util.List;
/* compiled from: PG */
/* renamed from: taq  reason: default package */
/* loaded from: classes4.dex */
public final class taq {
    final List a = new ArrayList();
    private final tdb b;

    public taq(tdb tdbVar) {
        this.b = tdbVar;
    }

    private final synchronized void d(int i, Context context) {
        for (tat tatVar : this.a) {
            tatVar.e.a(tatVar.a.d(tatVar.b, i, context, tatVar.c, tatVar.d));
        }
    }

    public final void a(Configuration configuration, Context context) {
        int i = configuration.orientation;
        int i2 = 2;
        if (i == 1) {
            i2 = 4;
        } else if (i != 2) {
            i2 = 1;
        }
        aopa createBuilder = awnj.a.createBuilder();
        createBuilder.copyOnWrite();
        awnj awnjVar = (awnj) createBuilder.instance;
        awnjVar.c = i2 - 1;
        awnjVar.b = 1 | awnjVar.b;
        d(i2, context);
        this.b.c("/device/orientation", ((awnj) createBuilder.mo39build()).toByteArray(), false);
    }

    public final synchronized void b(tat tatVar) {
        this.a.add(tatVar);
    }

    public final synchronized void c(tat tatVar) {
        this.a.remove(tatVar);
    }
}
