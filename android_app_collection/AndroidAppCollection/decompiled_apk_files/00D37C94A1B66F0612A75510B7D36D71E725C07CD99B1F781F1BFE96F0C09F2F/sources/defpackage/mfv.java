package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: mfv  reason: default package */
/* loaded from: classes3.dex */
public final class mfv implements ajru {
    private final LinearLayout a;
    private final TextView b;
    private final Button c;

    public mfv(Context context) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.loading_frame_status_error_view, (ViewGroup) null);
        this.a = linearLayout;
        this.b = (TextView) linearLayout.findViewById(R.id.error_message_text);
        this.c = (Button) linearLayout.findViewById(R.id.error_retry_button);
    }

    @Override // defpackage.ajru
    public final View a() {
        return this.a;
    }

    @Override // defpackage.ajru
    public final /* bridge */ /* synthetic */ void oK(ajrs ajrsVar, Object obj) {
        mfu mfuVar = (mfu) obj;
        if (mfuVar == null) {
            return;
        }
        zag.o(this.a, true);
        zag.m(this.b, mfuVar.a);
        zag.o(this.c, true);
        this.c.setOnClickListener(new mft(mfuVar));
    }

    @Override // defpackage.ajru
    public final void qZ(ajsa ajsaVar) {
    }
}
