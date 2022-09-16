package defpackage;

import androidx.preference.PreferenceGroup;
/* compiled from: PG */
/* renamed from: bjs  reason: default package */
/* loaded from: classes2.dex */
public final class bjs implements Runnable {
    final /* synthetic */ PreferenceGroup a;

    public bjs(PreferenceGroup preferenceGroup) {
        this.a = preferenceGroup;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this) {
            this.a.a.clear();
        }
    }
}
