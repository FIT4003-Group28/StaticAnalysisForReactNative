package com.google.android.libraries.youtube.systemhealth.termination;

import java.io.File;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class NativeCrashDetectorV2 {
    public final akwh a;

    public NativeCrashDetectorV2(akwh akwhVar) {
        this.a = akwhVar;
    }

    private native void setupCrashDetector(String str, long j);

    public final File a() {
        File filesDir = this.a.b.getFilesDir();
        String str = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("systemhealth");
        sb.append(str);
        sb.append("nativecrash");
        return new File(filesDir, sb.toString());
    }

    public final void b() {
        try {
            zgd.a(this.a.b, "nativecrashdetector");
            setupCrashDetector(a().getAbsolutePath(), this.a.c);
        } catch (UnsatisfiedLinkError e) {
            afus.c(1, 27, "Unable to link native crash library.", e);
        }
    }
}
