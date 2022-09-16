package defpackage;

import android.content.Context;
/* compiled from: PG */
/* renamed from: uov  reason: default package */
/* loaded from: classes4.dex */
public final class uov extends uox {
    private final qqh a;
    private final qqh b;
    private final String c;

    public uov(Context context) {
        qqh qqhVar = new qqh(context, "ONEGOOGLE_MOBILE", null);
        qqh b = qqh.b(context, "ONEGOOGLE_MOBILE");
        this.a = qqhVar;
        this.b = b;
        this.c = context.getApplicationContext().getPackageName();
    }

    @Override // defpackage.uox, defpackage.uoy
    public final void a(Object obj, aoul aoulVar) {
        tlf b;
        String str;
        qqe qqeVar;
        String str2;
        if (obj != null) {
            ulx ulxVar = (ulx) obj;
            str2 = ((ulx) obj).c;
            b = tlf.a(str2);
        } else {
            b = tlf.b();
        }
        int i = b.b;
        if (i == 4) {
            return;
        }
        if (i == 1) {
            if (obj != null) {
                ulx ulxVar2 = (ulx) obj;
            } else {
                i = 2;
            }
        }
        boolean z = false;
        aqxo.p(aoulVar.e() != aouq.UNKNOWN_EVENT);
        aqxo.p(aoulVar.d() != aouo.UNKNOWN_COMPONENT);
        if (aoulVar.c() != aoun.UNKNOWN_COMPONENT_APPEARANCE) {
            z = true;
        }
        aqxo.p(z);
        aopa createBuilder = aoum.a.createBuilder();
        aouk aoukVar = (aouk) aoulVar.mo52toBuilder();
        String str3 = this.c;
        aoukVar.copyOnWrite();
        ((aoul) aoukVar.instance).o(str3);
        aoul aoulVar2 = (aoul) aoukVar.mo39build();
        createBuilder.copyOnWrite();
        aoum aoumVar = (aoum) createBuilder.instance;
        aoulVar2.getClass();
        aoumVar.c = aoulVar2;
        aoumVar.b |= 1;
        aoum aoumVar2 = (aoum) createBuilder.mo39build();
        int i2 = i - 1;
        if (i2 == 0) {
            qqe a = this.a.a(aoumVar2.toByteArray());
            str = ((ulx) obj).c;
            a.e(String.valueOf(str));
            qqeVar = a;
        } else if (i2 != 1) {
            qqeVar = this.b.a(aoumVar2.toByteArray());
        } else {
            qqeVar = this.a.a(aoumVar2.toByteArray());
        }
        qqeVar.c(aoulVar.e().ae);
        qqeVar.b();
    }
}
