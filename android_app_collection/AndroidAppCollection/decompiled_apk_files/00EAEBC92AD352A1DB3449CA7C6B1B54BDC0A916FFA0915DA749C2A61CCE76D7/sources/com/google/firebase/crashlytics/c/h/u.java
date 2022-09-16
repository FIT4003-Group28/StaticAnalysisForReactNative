package com.google.firebase.crashlytics.c.h;
/* loaded from: classes.dex */
public enum u {
    NONE,
    JAVA_ONLY,
    ALL;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static u a(com.google.firebase.crashlytics.c.q.i.b bVar) {
        boolean z = true;
        boolean z2 = bVar.f9135g == 2;
        if (bVar.f9136h != 2) {
            z = false;
        }
        return a(z2, z);
    }

    static u a(boolean z, boolean z2) {
        return !z ? NONE : !z2 ? JAVA_ONLY : ALL;
    }
}
