package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.youtube.R;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ekr  reason: default package */
/* loaded from: classes3.dex */
public final class ekr implements View.OnClickListener {
    final /* synthetic */ ekx a;

    public ekr(ekx ekxVar) {
        this.a = ekxVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int integer = this.a.c.getInteger(R.integer.channel_header_description_collapsed_lines);
        ekx ekxVar = this.a;
        TextView textView = ekxVar.e;
        if (true != ekxVar.o) {
            integer = Integer.MAX_VALUE;
        }
        textView.setMaxLines(integer);
        ekx ekxVar2 = this.a;
        ekxVar2.o = !ekxVar2.o;
    }
}
