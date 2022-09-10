package defpackage;

import android.view.View;
/* compiled from: PG */
/* renamed from: bffh  reason: default package */
/* loaded from: classes3.dex */
final class bffh implements cqfd {
    @Override // defpackage.cqfd
    public final boolean a(View view) {
        cqkp o = cqjz.o(view);
        if ((o instanceof bfgt) && !((bfgt) o).ak().booleanValue()) {
            view.setVisibility(8);
        }
        return true;
    }
}
