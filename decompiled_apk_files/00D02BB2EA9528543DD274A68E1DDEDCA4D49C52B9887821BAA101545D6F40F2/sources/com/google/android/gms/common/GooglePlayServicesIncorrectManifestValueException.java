package com.google.android.gms.common;
/* compiled from: PG */
/* loaded from: classes5.dex */
public final class GooglePlayServicesIncorrectManifestValueException extends GooglePlayServicesManifestException {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public GooglePlayServicesIncorrectManifestValueException(int r4) {
        /*
            r3 = this;
            int r0 = defpackage.cnmr.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r2 = 320(0x140, float:4.48E-43)
            r1.<init>(r2)
            java.lang.String r2 = "The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected "
            r1.append(r2)
            r1.append(r0)
            java.lang.String r0 = " but found "
            r1.append(r0)
            r1.append(r4)
            java.lang.String r4 = ".  You must have the following declaration within the <application> element:     <meta-data android:name=\""
            r1.append(r4)
            java.lang.String r4 = "com.google.android.gms.version"
            r1.append(r4)
            java.lang.String r4 = "\" android:value=\"@integer/google_play_services_version\" />"
            r1.append(r4)
            java.lang.String r4 = r1.toString()
            r3.<init>(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException.<init>(int):void");
    }
}