package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: ups  reason: default package */
/* loaded from: classes4.dex */
public final class ups extends uuo {
    final /* synthetic */ View a;
    final /* synthetic */ upt b;

    public ups(upt uptVar, View view) {
        this.b = uptVar;
        this.a = view;
    }

    @Override // defpackage.uuo
    public final void b(final Object obj) {
        this.a.post(new Runnable() { // from class: upr
            @Override // java.lang.Runnable
            public final void run() {
                ups upsVar = ups.this;
                upsVar.b.a(obj);
            }
        });
    }
}
