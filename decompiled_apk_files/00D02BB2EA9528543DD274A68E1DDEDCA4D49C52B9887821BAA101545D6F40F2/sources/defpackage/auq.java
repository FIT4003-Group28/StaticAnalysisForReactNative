package defpackage;

import androidx.preference.PreferenceGroup;
/* compiled from: PG */
/* renamed from: auq  reason: default package */
/* loaded from: classes2.dex */
public final class auq implements Runnable {
    final /* synthetic */ PreferenceGroup a;

    public auq(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            this.a.a.clear();
        }
    }
}
