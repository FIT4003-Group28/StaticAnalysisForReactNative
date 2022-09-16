package defpackage;

import android.widget.TextView;
import j$.util.Optional;
/* compiled from: PG */
/* renamed from: kmi  reason: default package */
/* loaded from: classes3.dex */
final class kmi implements ayqb {
    final /* synthetic */ kmk a;

    public kmi(kmk kmkVar) {
        this.a = kmkVar;
    }

    @Override // defpackage.ayqb
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        Optional optional = (Optional) obj;
        if (this.a.b.isPresent()) {
            if (optional.isPresent()) {
                ((TextView) ((yye) this.a.b.get()).b).setText(((ahwm) optional.get()).a);
                ((yye) this.a.b.get()).a(true, false);
                return;
            }
            ((yye) this.a.b.get()).a(false, false);
        }
    }
}
