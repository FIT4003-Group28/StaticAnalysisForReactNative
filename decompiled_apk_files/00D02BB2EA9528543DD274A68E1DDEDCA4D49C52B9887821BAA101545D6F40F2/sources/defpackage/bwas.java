package defpackage;
/* compiled from: PG */
/* renamed from: bwas  reason: default package */
/* loaded from: classes4.dex */
public final class bwas extends bvwn<dmgy> {
    private dspd b;

    public bwas() {
        super(dmgy.c);
        this.b = dspd.b;
    }

    @Override // defpackage.bvwn
    /* renamed from: g */
    public final synchronized void a(dmgy dmgyVar) {
        this.b = dmgyVar.a;
    }

    public final synchronized dspd h() {
        return this.b;
    }
}
