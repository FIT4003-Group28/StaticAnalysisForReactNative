package com.facebook.common.l;
/* compiled from: TriState.java */
/* loaded from: classes.dex */
public enum e {
    YES,
    NO,
    UNSET;

    public static e a(boolean z) {
        return z ? YES : NO;
    }
}
