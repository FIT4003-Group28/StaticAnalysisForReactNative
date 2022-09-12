package defpackage;
/* compiled from: PG */
/* renamed from: aekv  reason: default package */
/* loaded from: classes2.dex */
public final class aekv extends aeky {
    public ddho a;
    public ddho b;
    public ddho c;

    @Override // defpackage.aeky
    public final aekz a() {
        String str = this.c == null ? " veType" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new aekw(this.a, this.b, this.c);
    }
}
