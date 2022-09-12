package defpackage;

import android.database.ContentObserver;
/* compiled from: PG */
/* renamed from: cpkd  reason: default package */
/* loaded from: classes.dex */
final class cpkd extends ContentObserver {
    public cpkd() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        cpke.e.set(true);
    }
}
