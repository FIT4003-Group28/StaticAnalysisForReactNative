package defpackage;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cdnr  reason: default package */
/* loaded from: classes4.dex */
public final class cdnr extends ges {
    public cebr a;
    private String b = "";

    @Override // defpackage.fd
    public final View ag(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.prompt_fragment, viewGroup, false);
    }

    @Override // defpackage.fd
    public final void ah(View view, Bundle bundle) {
        ((TextView) view.findViewById(R.id.promptText)).setText(this.b);
        dbsk.s(this.a);
    }

    @Override // defpackage.ges, defpackage.fd
    public final void l(Bundle bundle) {
        super.l(bundle);
        String string = this.o.getString("promptText");
        dbsk.s(string);
        this.b = string;
        this.o.getBoolean("betaTag");
    }
}
