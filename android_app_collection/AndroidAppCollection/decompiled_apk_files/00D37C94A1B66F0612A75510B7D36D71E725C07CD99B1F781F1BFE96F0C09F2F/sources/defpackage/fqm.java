package defpackage;

import android.graphics.drawable.Drawable;
/* compiled from: PG */
/* renamed from: fqm  reason: default package */
/* loaded from: classes3.dex */
public class fqm {
    public final Drawable a;

    /* JADX INFO: Access modifiers changed from: protected */
    public fqm(Drawable drawable) {
        Drawable mutate = drawable.mutate();
        this.a = mutate != null ? mutate : drawable;
    }

    public boolean a(fqm fqmVar) {
        throw null;
    }

    public String toString() {
        String valueOf = String.valueOf(this.a);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("resId 0 drawable ");
        sb.append(valueOf);
        return sb.toString();
    }
}
