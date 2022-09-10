package defpackage;
/* compiled from: PG */
/* renamed from: apik  reason: default package */
/* loaded from: classes2.dex */
public abstract class apik implements aphq {
    public boolean e = false;
    public dead f = dead.UNASSIGNED_DIRECTIONAL_MOVEMENT_ID;
    public final cjqy g;
    public final cjtd h;

    public apik(cjqy cjqyVar, cjtd cjtdVar) {
        this.g = cjqyVar;
        this.h = cjtdVar;
    }

    @Override // defpackage.aphq
    public cqqw c() {
        return new apij(this);
    }
}
