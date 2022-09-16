package defpackage;

import com.google.android.libraries.ar.faceviewer.runtime.ExperienceJni;
/* compiled from: PG */
/* renamed from: sja  reason: default package */
/* loaded from: classes4.dex */
public final class sja implements AutoCloseable {
    public final ExperienceJni a;

    public sja(ExperienceJni experienceJni) {
        this.a = experienceJni;
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        ExperienceJni experienceJni = this.a;
        long j = experienceJni.b;
        if (j != 0) {
            experienceJni.nativeDestroy(j);
            experienceJni.b = 0L;
        }
    }
}
