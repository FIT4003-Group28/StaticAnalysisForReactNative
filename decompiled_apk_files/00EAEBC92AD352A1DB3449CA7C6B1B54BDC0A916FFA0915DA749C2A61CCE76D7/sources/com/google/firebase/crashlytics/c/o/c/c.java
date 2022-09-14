package com.google.firebase.crashlytics.c.o.c;

import java.io.File;
import java.util.Map;
/* loaded from: classes.dex */
public interface c {

    /* loaded from: classes.dex */
    public enum a {
        JAVA,
        NATIVE
    }

    String a();

    Map<String, String> b();

    File[] c();

    String d();

    File e();

    a getType();

    void remove();
}
