package defpackage;

import android.content.DialogInterface;
import com.google.android.youtube.R;
/* compiled from: PG */
/* renamed from: xky  reason: default package */
/* loaded from: classes4.dex */
public final /* synthetic */ class xky implements DialogInterface.OnCancelListener {
    public final /* synthetic */ xli a;
    public final /* synthetic */ xlp b;
    public final /* synthetic */ ajyj c;
    public final /* synthetic */ xvr d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ boolean f;
    private final /* synthetic */ int g;

    public /* synthetic */ xky(xli xliVar, xlp xlpVar, ajyj ajyjVar, xvr xvrVar, Long l, boolean z) {
        this.a = xliVar;
        this.b = xlpVar;
        this.c = ajyjVar;
        this.d = xvrVar;
        this.e = l;
        this.f = z;
    }

    public /* synthetic */ xky(xli xliVar, xlp xlpVar, ajyj ajyjVar, xvr xvrVar, Long l, boolean z, int i) {
        this.g = i;
        this.a = xliVar;
        this.b = xlpVar;
        this.c = ajyjVar;
        this.d = xvrVar;
        this.e = l;
        this.f = z;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.g == 0) {
            xli xliVar = this.a;
            xliVar.d(xliVar.a.getText(R.string.comments_discard_get_membership), ampq.j(xliVar.a.getText(R.string.comments_discard_get_membership_title)), R.string.comments_discard_get_membership_button, this.b, this.c, this.d, this.e, this.f, true);
            return;
        }
        xli xliVar2 = this.a;
        xliVar2.d(xliVar2.a.getText(R.string.comments_discard), amon.a, R.string.comments_discard_positive_button, this.b, this.c, this.d, this.e, this.f, false);
    }
}
