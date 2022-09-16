package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zvk  reason: default package */
/* loaded from: classes4.dex */
public final class zvk extends yo {
    final /* synthetic */ zvo t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zvk(zvo zvoVar, View view) {
        super(view);
        this.t = zvoVar;
        this.a.setOnClickListener(new View.OnClickListener() { // from class: zvj
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                zvk zvkVar = zvk.this;
                if (zvkVar.t.d != null) {
                    int b = zvkVar.b();
                    if (zvkVar.t.C(b)) {
                        zvkVar.t.d.a();
                    } else if (b == -1) {
                    } else {
                        zvo zvoVar2 = zvkVar.t;
                        zvoVar2.d.b(zvoVar2, b);
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final zvp E() {
        View view = this.a;
        if (view instanceof zvp) {
            return (zvp) view;
        }
        return null;
    }
}
