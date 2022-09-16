package com.google.android.libraries.youtube.systemhealth.termination;

import android.content.Context;
import java.io.File;
/* compiled from: PG */
/* loaded from: classes3.dex */
public class NativeCrashDetector {
    public final akwr a;
    public final acrr b;
    private final Context c;

    public NativeCrashDetector(Context context, akwr akwrVar, acrr acrrVar) {
        this.c = context;
        this.a = akwrVar;
        this.b = acrrVar;
    }

    private native void setupCrashDetector(String str, long j);

    public final File a() {
        File filesDir = this.c.getFilesDir();
        String str = File.separator;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 23);
        sb.append("systemhealth");
        sb.append(str);
        sb.append("nativecrash");
        return new File(filesDir, sb.toString());
    }

    public final void b() {
        avfc avfcVar = this.a.get().l;
        if (avfcVar == null) {
            avfcVar = avfc.a;
        }
        if (!avfcVar.b) {
            return;
        }
        try {
            zgd.a(this.c, "nativecrashdetector");
            setupCrashDetector(a().getAbsolutePath(), 0L);
        } catch (UnsatisfiedLinkError e) {
            afus.c(1, 27, "Unable to link native crash library.", e);
        }
    }
}
