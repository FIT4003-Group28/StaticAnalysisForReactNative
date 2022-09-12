package defpackage;

import android.app.Activity;
import android.view.View;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: cbqd  reason: default package */
/* loaded from: classes4.dex */
public class cbqd {
    public final dxio<ache> a;
    private final Activity b;

    public cbqd(Activity activity, dxio<ache> dxioVar) {
        this.b = activity;
        this.a = dxioVar;
    }

    public final idl a(final cbqv cbqvVar) {
        View.OnClickListener onClickListener = new View.OnClickListener(this, cbqvVar) { // from class: cbqc
            private final cbqd a;
            private final cbqv b;

            {
                this.a = this;
                this.b = cbqvVar;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cbqd cbqdVar = this.a;
                cbqv cbqvVar2 = this.b;
                achc achcVar = achc.EVENTS_UGC;
                acgz b = achb.b();
                b.c("recurrence_tab_type", cbqvVar2.toString());
                cbqdVar.a.a().k(false, true, achcVar, b.b());
            }
        };
        idm i = idn.i();
        String string = this.b.getString(R.string.UGC_FEEDBACK_CARD_TITLE);
        if (string != null) {
            idh idhVar = (idh) i;
            idhVar.a = string;
            String str = "";
            idhVar.b = str;
            String string2 = this.b.getString(R.string.UGC_FEEDBACK_CARD_BUTTON_TITLE);
            if (string2 != null) {
                idhVar.c = string2;
                idhVar.d = onClickListener;
                idhVar.e = cjtd.a(dtyd.l);
                if (idhVar.a == null) {
                    str = " title";
                }
                if (idhVar.b == null) {
                    str = str.concat(" subtitle");
                }
                if (idhVar.c == null) {
                    str = String.valueOf(str).concat(" buttonText");
                }
                if (idhVar.d == null) {
                    str = String.valueOf(str).concat(" sendFeedbackClickListener");
                }
                if (idhVar.e == null) {
                    str = String.valueOf(str).concat(" cardLoggingParams");
                }
                if (str.isEmpty()) {
                    return new idi(idhVar.a, idhVar.b, idhVar.c, idhVar.d, idhVar.e);
                }
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            throw new NullPointerException("Null buttonText");
        }
        throw new NullPointerException("Null title");
    }
}
