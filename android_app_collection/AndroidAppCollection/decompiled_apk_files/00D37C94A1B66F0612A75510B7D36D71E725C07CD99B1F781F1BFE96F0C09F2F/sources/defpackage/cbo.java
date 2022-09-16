package defpackage;
/* compiled from: PG */
/* renamed from: cbo  reason: default package */
/* loaded from: classes2.dex */
public enum cbo {
    JSON(".json"),
    ZIP(".zip");
    
    public final String c;

    cbo(String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
