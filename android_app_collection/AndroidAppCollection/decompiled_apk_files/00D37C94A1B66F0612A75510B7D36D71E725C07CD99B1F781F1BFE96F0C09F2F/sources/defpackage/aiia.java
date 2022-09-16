package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: aiia  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class aiia implements View.OnClickListener {
    public final /* synthetic */ aiii a;
    public final /* synthetic */ awgw b;
    private final /* synthetic */ int c;

    public /* synthetic */ aiia(aiii aiiiVar, awgw awgwVar) {
        this.a = aiiiVar;
        this.b = awgwVar;
    }

    public /* synthetic */ aiia(aiii aiiiVar, awgw awgwVar, int i) {
        this.c = i;
        this.a = aiiiVar;
        this.b = awgwVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.c == 0) {
            this.a.d(this.b);
        } else {
            this.a.d(this.b);
        }
    }
}
