package defpackage;

import android.content.Context;
import android.widget.PopupWindow;
import java.util.Collections;
/* compiled from: PG */
/* renamed from: sfq  reason: default package */
/* loaded from: classes4.dex */
public final class sfq extends sfi {
    public final boolean f;
    public final sfu g;

    public sfq(Context context) {
        super(context);
        this.f = true;
        sfu sfuVar = new sfu(this);
        this.g = sfuVar;
        final sfp sfpVar = new sfp(this);
        sfuVar.a.setOnDismissListener(new PopupWindow.OnDismissListener() { // from class: sft
            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                sab sabVar;
                sfq sfqVar = sfp.this.a;
                if (!sfqVar.f || (sabVar = sfqVar.b) == null) {
                    return;
                }
                sabVar.x.g(Collections.emptyList());
            }
        });
    }

    @Override // defpackage.sfi, defpackage.sez
    public final void a(sai saiVar) {
        if (!this.d) {
            return;
        }
        super.e(saiVar.l(), saiVar.x);
    }

    @Override // defpackage.sfi, defpackage.sez
    public final /* bridge */ /* synthetic */ void d(sai saiVar) {
    }

    @Override // defpackage.sfi
    public final sfu f() {
        return this.g;
    }
}
