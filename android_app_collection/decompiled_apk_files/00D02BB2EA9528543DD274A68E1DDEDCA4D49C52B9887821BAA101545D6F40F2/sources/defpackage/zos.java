package defpackage;

import android.content.Context;
import android.widget.Toast;
/* compiled from: PG */
/* renamed from: zos  reason: default package */
/* loaded from: classes7.dex */
final class zos implements whq {
    final /* synthetic */ Context a;

    public zos(Context context) {
        this.a = context;
    }

    @Override // defpackage.whq
    public final void a() {
    }

    @Override // defpackage.whq
    public final void b() {
        Toast.makeText(this.a, "Something went wrong. Try again.", 1).show();
    }
}
