package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: wfj  reason: default package */
/* loaded from: classes4.dex */
public final class wfj implements ajru {
    private final TextView a;

    public wfj(Context context) {
        this.a = (TextView) LayoutInflater.from(context).inflate(R.layout.other_accounts_header, (ViewGroup) null);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        wfi wfiVar = (wfi) obj;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
