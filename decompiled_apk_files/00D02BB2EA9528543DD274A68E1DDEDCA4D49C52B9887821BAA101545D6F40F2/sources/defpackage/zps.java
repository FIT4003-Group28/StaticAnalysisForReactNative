package defpackage;

import android.graphics.drawable.Drawable;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: zps  reason: default package */
/* loaded from: classes7.dex */
public abstract class zps {
    public abstract zpt a();

    public abstract void b(@dzsi cqtd cqtdVar);

    public abstract void c(CharSequence charSequence);

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void d(@dzsi Drawable drawable) {
        b(drawable == null ? null : new zpr(new Object[]{drawable}, drawable));
    }
}
