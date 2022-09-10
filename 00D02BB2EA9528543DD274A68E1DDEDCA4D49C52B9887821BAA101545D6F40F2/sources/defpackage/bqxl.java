package defpackage;

import android.app.Dialog;
import com.google.android.apps.maps.R;
/* compiled from: PG */
/* renamed from: bqxl  reason: default package */
/* loaded from: classes4.dex */
public final class bqxl implements bqtd {
    private final Dialog a;
    private final cjtd b;
    private final bqst c;
    private final CharSequence d;

    public bqxl(Dialog dialog, akqi akqiVar, bqst bqstVar) {
        this.a = dialog;
        cjta b = cjtd.b();
        b.g = akqiVar.n();
        b.d = dtyf.T;
        this.b = b.a();
        this.c = bqstVar;
        this.d = dialog.getContext().getString(R.string.DATE_PICKER_CONFIRM_DATE_BUTTON_TEXT);
    }

    @Override // defpackage.bqtd
    public cjtd a() {
        return this.b;
    }

    @Override // defpackage.bqtd
    public cqkl b() {
        this.a.dismiss();
        return cqkl.a;
    }

    @Override // defpackage.bqtd
    public bqst c() {
        return this.c;
    }

    @Override // defpackage.bqtd
    public CharSequence d() {
        return this.d;
    }
}
