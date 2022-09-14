package defpackage;
/* compiled from: PG */
/* renamed from: ngt  reason: default package */
/* loaded from: classes7.dex */
public class ngt implements ngc {
    private final CharSequence a;
    private final Runnable b;
    @dzsi
    private CharSequence c;
    @dzsi
    private final dbty<Boolean> d;
    @dzsi
    private final cqtd e;
    @dzsi
    private final CharSequence f;
    @dzsi
    private final cjtd g;

    public ngt(CharSequence charSequence, Runnable runnable, @dzsi CharSequence charSequence2, @dzsi cqtd cqtdVar, @dzsi ddho ddhoVar) {
        this(charSequence, runnable, charSequence2, null, cqtdVar, ddhoVar, null);
    }

    @Override // defpackage.nfx
    public CharSequence a() {
        return this.a;
    }

    @Override // defpackage.ngc
    public Boolean b() {
        return Boolean.valueOf(this.e != null);
    }

    @Override // defpackage.ngc
    @dzsi
    public cqtd c() {
        return this.e;
    }

    @Override // defpackage.ngc
    public cqkl d() {
        if (g().booleanValue()) {
            this.b.run();
            cqkx.p(this);
        }
        return cqkl.a;
    }

    @Override // defpackage.ngc
    public Boolean e() {
        CharSequence charSequence = this.c;
        boolean z = false;
        if (charSequence != null && charSequence.length() > 0) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.ngc
    @dzsi
    public CharSequence f() {
        return this.c;
    }

    @Override // defpackage.ngc
    public Boolean g() {
        dbty<Boolean> dbtyVar = this.d;
        if (dbtyVar == null) {
            return true;
        }
        return dbtyVar.a();
    }

    @Override // defpackage.ngc
    @dzsi
    public cjtd h() {
        return this.g;
    }

    @Override // defpackage.ngc
    @dzsi
    public CharSequence i() {
        return this.f;
    }

    public ngt(CharSequence charSequence, Runnable runnable, @dzsi CharSequence charSequence2, @dzsi dbty<Boolean> dbtyVar, @dzsi cqtd cqtdVar, @dzsi ddho ddhoVar) {
        this(charSequence, runnable, null, dbtyVar, null, ddhoVar, null);
    }

    public ngt(CharSequence charSequence, Runnable runnable, @dzsi CharSequence charSequence2, @dzsi dbty<Boolean> dbtyVar, @dzsi cqtd cqtdVar, @dzsi ddho ddhoVar, @dzsi CharSequence charSequence3) {
        dbsk.s(charSequence);
        this.a = charSequence;
        dbsk.s(runnable);
        this.b = runnable;
        this.c = charSequence2;
        this.d = dbtyVar;
        this.e = cqtdVar;
        this.g = ddhoVar != null ? cjtd.a(ddhoVar) : null;
        this.f = charSequence3;
    }

    public ngt(CharSequence charSequence, Runnable runnable, @dzsi CharSequence charSequence2, @dzsi ddho ddhoVar, @dzsi CharSequence charSequence3) {
        this(charSequence, runnable, null, null, null, ddhoVar, charSequence3);
    }
}
