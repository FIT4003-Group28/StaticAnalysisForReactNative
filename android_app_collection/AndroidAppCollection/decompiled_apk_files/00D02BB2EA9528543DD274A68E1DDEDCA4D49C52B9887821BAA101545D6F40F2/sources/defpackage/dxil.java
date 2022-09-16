package defpackage;
/* compiled from: PG */
/* renamed from: dxil  reason: default package */
/* loaded from: classes6.dex */
public enum dxil {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    
    private final String e;

    dxil(String str) {
        this.e = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.e;
    }
}
