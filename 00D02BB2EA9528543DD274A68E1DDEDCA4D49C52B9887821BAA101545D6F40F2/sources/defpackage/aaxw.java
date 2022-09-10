package defpackage;
/* compiled from: PG */
/* renamed from: aaxw  reason: default package */
/* loaded from: classes2.dex */
public class aaxw implements aaww {
    private final aawx a;
    private final aawx b;
    private final String c;
    private final boolean d;

    public aaxw(djsp djspVar) {
        djso djsoVar = djspVar.b;
        boolean z = true;
        if (((djsoVar == null ? djso.e : djsoVar).a & 1) == 0) {
            djso djsoVar2 = djspVar.c;
            if (((djsoVar2 == null ? djso.e : djsoVar2).a & 1) == 0) {
                z = false;
            }
        }
        this.d = z;
        djso djsoVar3 = djspVar.b;
        this.a = aaxz.a(djsoVar3 == null ? djso.e : djsoVar3, z);
        djso djsoVar4 = djspVar.c;
        this.b = aaxz.a(djsoVar4 == null ? djso.e : djsoVar4, z);
        this.c = djspVar.d;
    }

    @Override // defpackage.aaww
    public aawx a() {
        return this.a;
    }

    @Override // defpackage.aaww
    public aawx b() {
        return this.b;
    }

    @Override // defpackage.aaww
    public String c() {
        return this.c;
    }

    @Override // defpackage.aaww
    public Boolean d() {
        boolean z = false;
        if (!this.a.b().isEmpty() && !this.b.b().isEmpty()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }

    @Override // defpackage.aaww
    public Boolean e() {
        return Boolean.valueOf(this.d);
    }
}
