package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: emj  reason: default package */
/* loaded from: classes3.dex */
public final class emj implements ajru {
    private final TextView a;
    private final foh b;
    private final acti c;

    public emj(Context context, foi foiVar, acti actiVar, ViewGroup viewGroup) {
        TextView textView = (TextView) LayoutInflater.from(context).inflate(R.layout.subscription_notification_toggle_button, viewGroup, false);
        this.a = textView;
        this.b = foiVar.a(textView);
        this.c = actiVar;
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        this.b.h((avbh) obj, this.c);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
        this.b.h(null, this.c);
    }
}
