package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: onr  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class onr implements View.OnClickListener {
    public final /* synthetic */ ons a;
    private final /* synthetic */ int b;

    public /* synthetic */ onr(ons onsVar, int i) {
        this.b = i;
        this.a = onsVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b != 0) {
            ons onsVar = this.a;
            int i = onsVar.c;
            if (i == 0) {
                throw null;
            }
            if (i == 3) {
                onsVar.a.e(apnc.BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL);
            }
            awcn awcnVar = onsVar.b;
            if (awcnVar == null) {
                return;
            }
            aunb aunbVar = awcnVar.e;
            if (aunbVar == null) {
                aunbVar = aunb.a;
            }
            onsVar.f(aunbVar);
            return;
        }
        ons onsVar2 = this.a;
        awcn awcnVar2 = onsVar2.b;
        if (awcnVar2 != null) {
            aunb aunbVar2 = awcnVar2.f;
            if (aunbVar2 == null) {
                aunbVar2 = aunb.a;
            }
            onsVar2.f(aunbVar2);
        }
        int i2 = onsVar2.c;
        if (i2 == 0) {
            throw null;
        }
        if (i2 != 3) {
            return;
        }
        onsVar2.a.c(apnc.BEDTIME_REMINDER_NOTIFICATION_UI_TYPE_ENGAGE_PANEL);
    }
}
