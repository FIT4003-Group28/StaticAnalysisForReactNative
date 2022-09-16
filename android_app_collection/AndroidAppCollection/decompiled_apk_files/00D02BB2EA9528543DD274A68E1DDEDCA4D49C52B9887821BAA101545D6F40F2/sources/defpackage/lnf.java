package defpackage;
/* compiled from: PG */
/* renamed from: lnf  reason: default package */
/* loaded from: classes7.dex */
public class lnf implements lne {
    private final noo a;
    private final jzp b;
    private final btrm c;
    private final lzf d;
    private final String e;

    public lnf(noo nooVar, jzp jzpVar, btrm btrmVar, lzf lzfVar, String str) {
        this.a = nooVar;
        this.b = jzpVar;
        this.c = btrmVar;
        this.d = lzfVar;
        this.e = str;
    }

    @Override // defpackage.lne
    public CharSequence a() {
        return this.e;
    }

    @Override // defpackage.lne
    public Boolean b() {
        return Boolean.valueOf(this.b.h());
    }

    @Override // defpackage.lne
    public cqkl c() {
        this.c.b(new crhv());
        this.a.a();
        return cqkl.a;
    }

    @Override // defpackage.lne
    public cqkl d() {
        this.d.b();
        return cqkl.a;
    }
}
