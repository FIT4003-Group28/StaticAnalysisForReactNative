package defpackage;

import android.content.ComponentName;
/* compiled from: PG */
/* renamed from: bgi  reason: default package */
/* loaded from: classes2.dex */
public final class bgi {
    public final ComponentName a;

    public bgi(ComponentName componentName) {
        this.a = componentName;
    }

    public final String a() {
        return this.a.getPackageName();
    }

    public final String toString() {
        return "ProviderMetadata{ componentName=" + this.a.flattenToShortString() + " }";
    }
}
