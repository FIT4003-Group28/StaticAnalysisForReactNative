package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* compiled from: PG */
/* renamed from: min  reason: default package */
/* loaded from: classes3.dex */
public final class min extends mjx implements mip {
    public miq ae;
    private atpl af;

    @Override // defpackage.dh, defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.ae.c = this;
        try {
            this.af = (atpl) aopi.parseFrom(atpl.a, this.m.getByteArray("notification_text_renderer"), aoos.b());
        } catch (aopx e) {
            zep.d("Unable to create dialog due to missing proto or invalid proto format", e);
            dismiss();
        }
    }

    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ajrs ajrsVar = new ajrs();
        ajrsVar.f("dismissal_follow_up_dialog", true);
        this.ae.oK(ajrsVar, (arro) this.af.qm(atpk.b));
        return this.ae.a();
    }

    @Override // defpackage.dh
    public final Dialog oy(Bundle bundle) {
        Dialog oy = super.oy(bundle);
        oy.setCanceledOnTouchOutside(false);
        return oy;
    }
}
