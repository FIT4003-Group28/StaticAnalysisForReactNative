package defpackage;
/* compiled from: PG */
/* renamed from: eaeh  reason: default package */
/* loaded from: classes6.dex */
public enum eaeh {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2"),
    H2_PRIOR_KNOWLEDGE("h2_prior_knowledge"),
    QUIC("quic");
    
    public final String g;

    eaeh(String str) {
        this.g = str;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.g;
    }
}
