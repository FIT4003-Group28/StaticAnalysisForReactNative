package defpackage;

import android.view.View;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zzt  reason: default package */
/* loaded from: classes4.dex */
public final class zzt implements View.OnClickListener {
    final /* synthetic */ zzy a;

    public zzt(zzy zzyVar) {
        this.a = zzyVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.b.a();
        this.a.g(true);
    }
}
