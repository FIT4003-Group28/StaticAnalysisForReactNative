package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: acjv  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class acjv implements DialogInterface.OnClickListener {
    public final /* synthetic */ acke a;
    private final /* synthetic */ int b;

    public /* synthetic */ acjv(acke ackeVar) {
        this.a = ackeVar;
    }

    public /* synthetic */ acjv(acke ackeVar, int i) {
        this.b = i;
        this.a = ackeVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.b == 0) {
            this.a.aH();
        } else {
            this.a.az.r(false);
        }
    }
}
