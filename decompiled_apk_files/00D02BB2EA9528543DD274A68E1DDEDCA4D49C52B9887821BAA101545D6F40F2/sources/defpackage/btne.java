package defpackage;
/* compiled from: PG */
/* renamed from: btne  reason: default package */
/* loaded from: classes.dex */
public enum btne {
    ALL_LONG_LRU("All Long Lru Caches", 0),
    GL_LABEL("Gl Label Cache", 1),
    GENERIC_DISK_CACHE("Generic Disk Cache", 2),
    OTHER("Other Caches", 3);
    
    public final String e;
    public final int f;

    btne(String str, int i) {
        this.e = str;
        this.f = i;
    }
}
