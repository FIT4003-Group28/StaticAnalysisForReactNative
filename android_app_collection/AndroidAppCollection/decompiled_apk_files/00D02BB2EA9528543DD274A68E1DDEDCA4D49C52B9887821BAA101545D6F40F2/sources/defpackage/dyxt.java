package defpackage;
/* compiled from: PG */
/* renamed from: dyxt  reason: default package */
/* loaded from: classes6.dex */
public enum dyxt {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    public final String e;

    dyxt(String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }
}
