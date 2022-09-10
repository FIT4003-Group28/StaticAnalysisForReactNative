package defpackage;

import java.util.List;
/* compiled from: PG */
/* renamed from: aaxy  reason: default package */
/* loaded from: classes2.dex */
public class aaxy implements aawx {
    @dzsi
    private final jic a;
    private final String b;
    private final List<jbi> c;
    private final boolean d;

    public aaxy(djso djsoVar, boolean z) {
        this.d = z;
        this.b = djsoVar.c;
        dccx F = dcdc.F();
        for (String str : djsoVar.d) {
            F.g(new iyb(str));
        }
        this.c = F.f();
        String str2 = djsoVar.b;
        this.a = !str2.isEmpty() ? new jic(str2, ckqc.FULLY_QUALIFIED, (cqtd) null, 250) : null;
    }

    @Override // defpackage.aawx
    @dzsi
    public jic a() {
        return this.a;
    }

    @Override // defpackage.aawx
    public String b() {
        return this.b;
    }

    @Override // defpackage.aawx
    public List<jbi> c() {
        return this.c;
    }

    @Override // defpackage.aawx
    public Boolean d() {
        boolean z = false;
        if (this.a == null && this.d) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aawx
    public Boolean e() {
        return Boolean.valueOf(!this.b.isEmpty());
    }
}
