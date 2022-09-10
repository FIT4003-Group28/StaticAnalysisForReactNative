package defpackage;
/* compiled from: PG */
/* renamed from: zsb  reason: default package */
/* loaded from: classes7.dex */
public class zsb implements zdu {
    protected static int a = -1;
    protected int b = a;
    @dzsi
    private final jhk c;
    @dzsi
    private final zvb d;

    public zsb(@dzsi jhk jhkVar, @dzsi zvb zvbVar) {
        this.c = jhkVar;
        this.d = zvbVar;
    }

    @Override // defpackage.zdu
    @dzsi
    public jhk b() {
        return this.c;
    }

    @Override // defpackage.zdu
    @dzsi
    public zvb c() {
        return this.d;
    }

    @Override // defpackage.zdu
    @dzsi
    public cjtd d() {
        return null;
    }

    @Override // defpackage.zdu
    public void e(int i) {
        this.b = i;
    }
}
