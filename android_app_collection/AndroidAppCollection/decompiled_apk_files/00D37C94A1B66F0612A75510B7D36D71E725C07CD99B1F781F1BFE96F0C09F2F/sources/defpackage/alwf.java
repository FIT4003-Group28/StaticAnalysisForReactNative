package defpackage;

import android.database.ContentObserver;
/* compiled from: PG */
/* renamed from: alwf  reason: default package */
/* loaded from: classes.dex */
final class alwf extends ContentObserver {
    public alwf() {
        super(null);
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        super.onChange(z);
        alwg.i();
    }
}
