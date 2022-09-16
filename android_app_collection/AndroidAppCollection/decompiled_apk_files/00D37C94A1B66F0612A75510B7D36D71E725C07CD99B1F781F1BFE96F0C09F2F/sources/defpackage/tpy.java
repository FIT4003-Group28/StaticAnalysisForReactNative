package defpackage;
/* compiled from: PG */
/* renamed from: tpy  reason: default package */
/* loaded from: classes4.dex */
public final class tpy {
    public tpz a;
    public String b;
    public Throwable c;

    public final tqa a() {
        tpz tpzVar = this.a;
        tpzVar.getClass();
        if (this.b == null) {
            String valueOf = String.valueOf(tpzVar.name());
            this.b = valueOf.length() != 0 ? "Download result code: ".concat(valueOf) : new String("Download result code: ");
        }
        return new tqa(this);
    }
}
