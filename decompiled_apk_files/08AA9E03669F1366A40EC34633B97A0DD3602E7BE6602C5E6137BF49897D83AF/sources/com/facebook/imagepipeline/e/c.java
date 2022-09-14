package com.facebook.imagepipeline.e;
/* compiled from: Priority.java */
/* loaded from: classes.dex */
public enum c {
    LOW,
    MEDIUM,
    HIGH;

    public static c a(c cVar, c cVar2) {
        return cVar == null ? cVar2 : (cVar2 != null && cVar.ordinal() <= cVar2.ordinal()) ? cVar2 : cVar;
    }
}
