package defpackage;
/* compiled from: PG */
/* renamed from: aoyf  reason: default package */
/* loaded from: classes2.dex */
public enum aoyf {
    INITIAL_LOADING,
    LOADING,
    PARTIALLY_LOADED,
    FULLY_LOADED,
    ERROR,
    INITIAL_LOADING_ERROR;

    public final boolean a() {
        return this == ERROR || this == INITIAL_LOADING_ERROR;
    }
}
