package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: akoi  reason: default package */
/* loaded from: classes.dex */
public final class akoi {
    public final View a;
    private final TextView b;
    private final TextView c;
    private final akpg d;

    public akoi(Context context, ajmy ajmyVar) {
        ajmyVar.getClass();
        View inflate = View.inflate(context, R.layout.conversation_bottom_sheet_header, null);
        this.a = inflate;
        this.b = (TextView) inflate.findViewById(R.id.bottom_sheet_header_large_text);
        this.c = (TextView) inflate.findViewById(R.id.bottom_sheet_header_medium_text);
        this.d = new akpg(ajmyVar, (ImageView) inflate.findViewById(R.id.bottom_sheet_user_thumbnail));
    }

    public final void a(CharSequence charSequence, CharSequence charSequence2, avhn avhnVar) {
        this.a.setVisibility(0);
        this.b.setVisibility(0);
        this.b.setText(charSequence);
        zag.m(this.c, charSequence2);
        this.d.a(avhnVar);
    }
}
