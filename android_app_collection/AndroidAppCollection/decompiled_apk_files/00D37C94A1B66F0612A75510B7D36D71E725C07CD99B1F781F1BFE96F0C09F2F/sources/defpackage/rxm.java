package defpackage;

import android.database.ContentObserver;
/* compiled from: PG */
/* renamed from: rxm  reason: default package */
/* loaded from: classes4.dex */
final class rxm extends ContentObserver {
    public rxm() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        rxn.e.set(true);
    }
}
