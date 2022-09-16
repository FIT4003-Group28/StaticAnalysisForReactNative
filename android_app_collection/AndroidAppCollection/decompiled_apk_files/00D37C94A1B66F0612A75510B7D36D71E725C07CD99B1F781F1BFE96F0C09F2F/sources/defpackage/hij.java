package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: hij  reason: default package */
/* loaded from: classes3.dex */
public final /* synthetic */ class hij implements View.OnClickListener {
    public final /* synthetic */ hin a;
    private final /* synthetic */ int b;

    public /* synthetic */ hij(hin hinVar) {
        this.a = hinVar;
    }

    public /* synthetic */ hij(hin hinVar, int i) {
        this.b = i;
        this.a = hinVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (this.b == 0) {
            hin hinVar = this.a;
            if (!hinVar.a.getText().toString().isEmpty()) {
                hinVar.a.setText("");
                return;
            }
            hic hicVar = hinVar.c;
            if (hicVar == null) {
                return;
            }
            hicVar.a.af.c();
            return;
        }
        hin hinVar2 = this.a;
        if (!hinVar2.a.getText().toString().isEmpty()) {
            hinVar2.a.setText("");
            return;
        }
        hic hicVar2 = hinVar2.c;
        if (hicVar2 == null) {
            return;
        }
        hicVar2.a.p(false);
    }
}
