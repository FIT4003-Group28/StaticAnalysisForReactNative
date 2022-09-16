package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: kzr  reason: default package */
/* loaded from: classes3.dex */
public final class kzr implements ajru {
    public apzg a;
    private final View b;
    private final TextView c;

    public kzr(Context context, final aafo aafoVar, ViewGroup viewGroup) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.watch_card_dropdown_view_all, viewGroup, false);
        this.b = inflate;
        TextView textView = (TextView) inflate.findViewById(R.id.view_all);
        this.c = textView;
        textView.setOnClickListener(new View.OnClickListener() { // from class: kzp
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                kzr kzrVar = kzr.this;
                aafo aafoVar2 = aafoVar;
                apzg apzgVar = kzrVar.a;
                if (apzgVar != null) {
                    aafoVar2.c(apzgVar, null);
                }
            }
        });
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.b;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        kzq kzqVar = (kzq) obj;
        zag.m(this.c, ajgl.b(kzqVar.a));
        this.a = kzqVar.b;
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
