package com.google.ar.core.exceptions;
/* compiled from: PG */
/* loaded from: classes5.dex */
public class GooglePlayServicesLocationLibraryNotLinkedException extends UnsupportedConfigurationException {
    public GooglePlayServicesLocationLibraryNotLinkedException() {
        this("");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GooglePlayServicesLocationLibraryNotLinkedException(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r3 = java.lang.String.valueOf(r3)
            int r0 = r3.length()
            java.lang.String r1 = "The Google Play Services location classes must be linked into the app's binary when calling Session.configure() with Config.EarthMode.ENABLED. "
            if (r0 == 0) goto L11
            java.lang.String r3 = r1.concat(r3)
            goto L16
        L11:
            java.lang.String r3 = new java.lang.String
            r3.<init>(r1)
        L16:
            r2.<init>(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.ar.core.exceptions.GooglePlayServicesLocationLibraryNotLinkedException.<init>(java.lang.String):void");
    }
}
