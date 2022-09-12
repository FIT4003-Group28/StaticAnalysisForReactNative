package defpackage;

import android.content.ComponentName;
/* compiled from: PG */
/* renamed from: aqw  reason: default package */
/* loaded from: classes2.dex */
public final class aqw {
    public final ComponentName a;

    public aqw(ComponentName componentName) {
        this.a = componentName;
    }

    public final String a() {
        return this.a.getPackageName();
    }

    public final String toString() {
        return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
    }
}
