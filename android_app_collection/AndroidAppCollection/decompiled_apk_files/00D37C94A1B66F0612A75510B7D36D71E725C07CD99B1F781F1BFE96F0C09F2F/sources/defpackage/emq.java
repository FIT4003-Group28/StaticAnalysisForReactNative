package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: emq  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class emq implements DialogInterface.OnCancelListener {
    public final /* synthetic */ ems a;
    private final /* synthetic */ int b;

    public /* synthetic */ emq(ems emsVar, int i) {
        this.b = i;
        this.a = emsVar;
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        if (this.b == 0) {
            this.a.finish();
        } else {
            this.a.finish();
        }
    }
}
