package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: vyq  reason: default package */
/* loaded from: classes4.dex */
public final class vyq implements ajru {
    private final View a;
    private final TextView b;

    public vyq(Context context, wfh wfhVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.fusion_add_account_item, (ViewGroup) null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.name);
        inflate.setOnClickListener(new wew(wfhVar, 1));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        vyp vypVar = (vyp) obj;
        this.b.setText(R.string.account_switcher_add_account);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
