package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: aciv  reason: default package */
/* loaded from: classes.dex */
public final class aciv extends yo {
    public final TextView t;
    public final TextView u;
    public arbt v;

    public aciv(View view, final acis acisVar) {
        super(view);
        this.t = (TextView) view.findViewById(R.id.game_title_text);
        this.u = (TextView) view.findViewById(R.id.game_title_year);
        view.setOnClickListener(new View.OnClickListener() { // from class: aciu
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                aciv acivVar = aciv.this;
                acis acisVar2 = acisVar;
                ((aciq) acisVar2).a.a(acivVar.v);
            }
        });
    }
}
