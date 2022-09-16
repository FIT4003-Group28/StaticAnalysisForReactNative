package defpackage;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.libraries.youtube.livechat.innertube.SupportedPickerPanelWrapper;
/* compiled from: PG */
/* renamed from: ablu  reason: default package */
/* loaded from: classes.dex */
public final class ablu extends ablf implements abri {
    public ajyi b;
    private View c;

    @Override // defpackage.abri
    public final void aE() {
        Activity activity = this.a;
        if (activity == null) {
            return;
        }
        activity.setRequestedOrientation(1);
    }

    @Override // defpackage.dp
    public final void mQ(Bundle bundle) {
        super.mQ(bundle);
        this.b.a(asqj.class);
        this.b.a(assi.class);
    }

    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ajsa] */
    @Override // defpackage.dp
    public final View mc(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ajru h;
        Object obj = ((SupportedPickerPanelWrapper) this.m.getParcelable("picker_panel")).a;
        if (obj != null && (h = akel.h(this.b.get(), obj, viewGroup)) != null) {
            ajrs ajrsVar = new ajrs();
            ajrsVar.f("listenerKey", this);
            h.oK(ajrsVar, obj);
            this.c = h.a();
        }
        return this.c;
    }

    @Override // defpackage.abri
    public final void p() {
        o();
    }

    @Override // defpackage.abri
    public final void r() {
    }

    @Override // defpackage.abri
    public final void s() {
        dp dpVar = this.C;
        if (dpVar != null) {
            eo mL = dpVar.mL();
            if (mL.a() > 0) {
                mL.L();
            } else {
                o();
            }
        }
    }
}
