package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;
/* compiled from: PG */
/* renamed from: jad  reason: default package */
/* loaded from: classes3.dex */
public final class jad implements aatg {
    private final Context a;
    private final agbd b;

    public jad(Context context, agbd agbdVar) {
        this.a = context;
        this.b = agbdVar;
    }

    @Override // defpackage.aatg
    public final void a(aatf aatfVar) {
        aopa createBuilder = atop.a.createBuilder();
        boolean d = this.b.d(this.a);
        createBuilder.copyOnWrite();
        atop atopVar = (atop) createBuilder.instance;
        atopVar.b |= 2;
        atopVar.c = d;
        boolean booleanValue = ((Boolean) ylx.g(this.b.c(), 5L, TimeUnit.SECONDS, true)).booleanValue();
        createBuilder.copyOnWrite();
        atop atopVar2 = (atop) createBuilder.instance;
        atopVar2.b |= 8;
        atopVar2.e = booleanValue;
        if (this.b.a() > 0) {
            long a = this.b.a();
            createBuilder.copyOnWrite();
            atop atopVar3 = (atop) createBuilder.instance;
            atopVar3.b |= 4;
            atopVar3.d = a;
        }
        aatfVar.v = (atop) createBuilder.mo39build();
    }
}
