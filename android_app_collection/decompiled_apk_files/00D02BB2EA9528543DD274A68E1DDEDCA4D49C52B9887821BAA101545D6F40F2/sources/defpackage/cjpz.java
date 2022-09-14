package defpackage;
/* compiled from: PG */
/* renamed from: cjpz  reason: default package */
/* loaded from: classes4.dex */
public final class cjpz extends cjqe {
    public jjn a;
    public jjn b;
    public Integer c;

    @Override // defpackage.cjqe
    public final cjqf a() {
        String str = this.a == null ? " startState" : "";
        if (this.b == null) {
            str = str.concat(" endState");
        }
        if (!str.isEmpty()) {
            String valueOf = String.valueOf(str);
            throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
        }
        return new cjqa(this.a, this.b, this.c);
    }
}
