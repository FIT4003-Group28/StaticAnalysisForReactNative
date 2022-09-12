package defpackage;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
/* renamed from: ciio  reason: default package */
/* loaded from: classes4.dex */
final /* synthetic */ class ciio implements cqjb {
    static final cqjb a = new ciio();

    private ciio() {
    }

    @Override // defpackage.cqjb
    public final Object a(cqkp cqkpVar, Context context) {
        ciiz ciizVar = (ciiz) cqkpVar;
        return new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN);
    }
}
