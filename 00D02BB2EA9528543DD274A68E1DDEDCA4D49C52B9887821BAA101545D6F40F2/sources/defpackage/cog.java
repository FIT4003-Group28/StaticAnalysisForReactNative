package defpackage;
/* compiled from: PG */
/* renamed from: cog  reason: default package */
/* loaded from: classes5.dex */
public final class cog extends zc {
    public final cok n;
    private final abl o = new cof(this);

    public cog(cok cokVar) {
        this.n = cokVar;
    }

    @Override // defpackage.zc, defpackage.adw
    public final boolean e(acl aclVar, acl aclVar2, int i, int i2, int i3, int i4) {
        float alpha = aclVar2 != null ? aclVar2.a.getAlpha() : 0.0f;
        boolean e = super.e(aclVar, aclVar2, i, i2, i3, i4);
        if (aclVar2 != null) {
            aclVar2.a.setAlpha(alpha);
        }
        return e;
    }

    @Override // defpackage.adw
    public final void y() {
        r(this.o);
    }
}
