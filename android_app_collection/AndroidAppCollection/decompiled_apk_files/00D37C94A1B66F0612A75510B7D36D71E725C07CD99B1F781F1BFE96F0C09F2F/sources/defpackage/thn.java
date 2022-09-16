package defpackage;
/* compiled from: PG */
/* renamed from: thn  reason: default package */
/* loaded from: classes4.dex */
public final class thn {
    public Long a;
    public Long b;
    public Long c;
    public Integer d;
    public thp e;
    private String f;

    public final thr a() {
        String str = this.f;
        if (str == null) {
            throw new IllegalStateException("Missing required properties: name");
        }
        return new thr(str, this.a, this.b, this.c, this.d, this.e);
    }

    public final void b(String str) {
        if (str != null) {
            this.f = str;
            return;
        }
        throw new NullPointerException("Null name");
    }
}
