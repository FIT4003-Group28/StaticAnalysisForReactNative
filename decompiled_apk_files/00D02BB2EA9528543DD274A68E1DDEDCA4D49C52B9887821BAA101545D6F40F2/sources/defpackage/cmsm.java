package defpackage;
/* compiled from: PG */
@Deprecated
/* renamed from: cmsm  reason: default package */
/* loaded from: classes5.dex */
public final class cmsm {
    protected Boolean a;
    public String b;

    public cmsm() {
        this.a = false;
    }

    public final cmsn a() {
        return new cmsn(this);
    }

    public cmsm(cmsn cmsnVar) {
        this.a = false;
        cmsn cmsnVar2 = cmsn.a;
        String str = cmsnVar.b;
        this.a = Boolean.valueOf(cmsnVar.c);
        this.b = cmsnVar.d;
    }
}
