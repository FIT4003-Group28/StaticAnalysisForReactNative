package defpackage;

import android.content.DialogInterface;
/* compiled from: PG */
/* renamed from: ajll  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ajll implements DialogInterface.OnClickListener {
    public final /* synthetic */ tcu a;
    public final /* synthetic */ awmt b;
    public final /* synthetic */ tcs c;
    private final /* synthetic */ int d;

    public /* synthetic */ ajll(tcu tcuVar, awmt awmtVar, tcs tcsVar) {
        this.a = tcuVar;
        this.b = awmtVar;
        this.c = tcsVar;
    }

    public /* synthetic */ ajll(tcu tcuVar, awmt awmtVar, tcs tcsVar, int i) {
        this.d = i;
        this.a = tcuVar;
        this.b = awmtVar;
        this.c = tcsVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        if (this.d == 0) {
            this.a.b(this.b, this.c).Q();
        } else {
            this.a.b(this.b, this.c).Q();
        }
    }
}
