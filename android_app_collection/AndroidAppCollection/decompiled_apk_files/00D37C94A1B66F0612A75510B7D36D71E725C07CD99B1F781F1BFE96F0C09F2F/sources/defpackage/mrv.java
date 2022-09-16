package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mrv  reason: default package */
/* loaded from: classes3.dex */
final class mrv implements ajru {
    private final View a;
    private final TextView b;
    private final TextView c;

    public mrv(ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.topic_picker_header, viewGroup, false);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.title);
        this.c = (TextView) inflate.findViewById(R.id.subtitle);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        mru mruVar = (mru) obj;
        zag.m(this.b, mruVar.a);
        zag.m(this.c, mruVar.b);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
