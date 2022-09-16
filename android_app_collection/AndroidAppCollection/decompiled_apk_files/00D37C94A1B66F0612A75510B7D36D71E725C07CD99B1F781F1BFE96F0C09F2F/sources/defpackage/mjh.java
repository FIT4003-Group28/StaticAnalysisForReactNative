package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mjh  reason: default package */
/* loaded from: classes3.dex */
public final class mjh implements ajru {
    public final View a;
    public final TextView b;
    public mjg c;
    private final View d;

    public mjh(Context context) {
        View inflate = View.inflate(context, R.layout.expandable_message_item, null);
        this.d = inflate;
        this.b = (TextView) inflate.findViewById(R.id.message_text);
        View findViewById = inflate.findViewById(R.id.more);
        this.a = findViewById;
        findViewById.setOnClickListener(new mjf(this));
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.d;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        CharSequence charSequence;
        mjg mjgVar = (mjg) obj;
        this.c = mjgVar;
        this.a.setVisibility(true != mjgVar.c ? 0 : 8);
        TextView textView = this.b;
        if (!mjgVar.c) {
            charSequence = mjgVar.a;
        } else {
            charSequence = mjgVar.b;
        }
        zag.m(textView, charSequence);
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
