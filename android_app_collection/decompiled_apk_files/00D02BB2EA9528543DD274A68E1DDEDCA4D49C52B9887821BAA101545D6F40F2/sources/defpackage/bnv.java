package defpackage;
/* compiled from: PG */
/* renamed from: bnv  reason: default package */
/* loaded from: classes3.dex */
public enum bnv {
    JSON(".json"),
    ZIP(".zip");
    
    public final String c;

    bnv(String str) {
        this.c = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.c;
    }
}
