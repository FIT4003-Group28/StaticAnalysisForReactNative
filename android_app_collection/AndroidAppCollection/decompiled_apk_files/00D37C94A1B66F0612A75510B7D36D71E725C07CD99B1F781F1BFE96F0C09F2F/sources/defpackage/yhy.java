package defpackage;

import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: yhy  reason: default package */
/* loaded from: classes4.dex */
public final class yhy {
    public final View a;
    public final TextView b;
    public final EditText c;
    public aopc d;
    private final View e;

    public yhy(View view) {
        this.e = view;
        View findViewById = view.findViewById(R.id.comment_area);
        this.a = findViewById;
        this.c = (EditText) view.findViewById(R.id.comment_input);
        this.b = (TextView) findViewById.findViewById(R.id.comment_privacy_text);
    }
}
