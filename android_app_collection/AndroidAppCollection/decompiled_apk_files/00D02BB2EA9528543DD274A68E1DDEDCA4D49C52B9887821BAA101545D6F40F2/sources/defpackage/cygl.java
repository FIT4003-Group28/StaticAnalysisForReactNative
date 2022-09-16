package defpackage;
/* compiled from: PG */
/* renamed from: cygl  reason: default package */
/* loaded from: classes5.dex */
public enum cygl {
    UNKNOWN_PROVENANCE(0, false),
    DEVICE(1, false),
    CLOUD(2, true),
    USER_ENTERED(3, false),
    PAPI_AUTOCOMPLETE(4, true),
    PAPI_TOPN(5, true),
    PAPI_LIST_PEOPLE_BY_KNOWN_ID(6, true),
    DIRECTORY(8, false);
    
    public final int i;
    public final boolean j;

    cygl(int i, boolean z) {
        this.i = i;
        this.j = z;
    }
}
