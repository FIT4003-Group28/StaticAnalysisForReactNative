package defpackage;
/* compiled from: PG */
/* renamed from: bhhq  reason: default package */
/* loaded from: classes3.dex */
public final class bhhq extends bhhu {
    public bhhw a;
    public ilo b;
    public dwyd c;
    public int d;

    @Override // defpackage.bhhu
    public final bhhx a() {
        String str = this.d == 0 ? " recommendedAction" : "";
        if (!str.isEmpty()) {
            throw new IllegalStateException(str.length() != 0 ? "Missing required properties:".concat(str) : new String("Missing required properties:"));
        }
        return new bhhr(this.d, this.a, this.b, this.c);
    }
}
