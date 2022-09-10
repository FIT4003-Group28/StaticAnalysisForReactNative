package defpackage;
/* compiled from: PG */
/* renamed from: brgh  reason: default package */
/* loaded from: classes4.dex */
public class brgh implements brgt {
    private final String a;
    @dzsi
    private final String b;

    public brgh(String str, @dzsi String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // defpackage.brgt
    public String a() {
        return this.a;
    }

    @Override // defpackage.brgt
    public Boolean b() {
        return Boolean.valueOf(this.b != null);
    }

    @Override // defpackage.brgt
    @dzsi
    public jic c() {
        String str = this.b;
        if (str == null) {
            return null;
        }
        return new jic(str, ckqc.FULLY_QUALIFIED, 0);
    }
}
