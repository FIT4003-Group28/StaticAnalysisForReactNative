package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mmv  reason: default package */
/* loaded from: classes3.dex */
public final class mmv extends ajsl {
    public audd a;
    private final View b;
    private final TextView c;

    public mmv(Context context, aafo aafoVar) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.playlist_panel_link_layout, (ViewGroup) null);
        this.b = inflate;
        this.c = (TextView) inflate.findViewById(R.id.title);
        inflate.setOnClickListener(new mmu(this, aafoVar));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ void d(ajrs ajrsVar, Object obj) {
        audd auddVar = (audd) obj;
        this.a = auddVar;
        zag.m(this.c, auddVar.c);
    }

    @Override // defpackage.ajsl
    protected final /* bridge */ /* synthetic */ byte[] e(Object obj) {
        return ((audd) obj).e.I();
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
