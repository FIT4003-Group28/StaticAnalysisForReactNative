package defpackage;

import android.content.DialogInterface;
import android.text.TextUtils;
/* compiled from: PG */
/* renamed from: ira  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class ira implements DialogInterface.OnClickListener {
    public final /* synthetic */ irh a;
    private final /* synthetic */ int b;

    public /* synthetic */ ira(irh irhVar) {
        this.a = irhVar;
    }

    public /* synthetic */ ira(irh irhVar, int i) {
        this.b = i;
        this.a = irhVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b == 0) {
            this.a.dismiss();
            return;
        }
        irh irhVar = this.a;
        String obj = irhVar.ax.getText().toString();
        if (TextUtils.equals(irhVar.au, obj)) {
            return;
        }
        irhVar.aK(obj);
    }
}
