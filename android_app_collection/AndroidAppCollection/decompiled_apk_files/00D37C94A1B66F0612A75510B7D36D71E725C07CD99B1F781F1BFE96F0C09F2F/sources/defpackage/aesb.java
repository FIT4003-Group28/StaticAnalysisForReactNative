package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: aesb  reason: default package */
/* loaded from: classes.dex */
public final class aesb extends afyl {
    private final afzf a;

    public aesb(String str, afzf afzfVar) {
        super(2, str, afzfVar);
        this.a = afzfVar;
    }

    @Override // defpackage.yua
    public final boolean h() {
        return true;
    }

    @Override // defpackage.yua
    public final ytz i() {
        return ytz.IMMEDIATE;
    }

    @Override // defpackage.yua
    public final cfb qy(cew cewVar) {
        try {
            return cfb.b(cewVar.b, null);
        } catch (Exception e) {
            return cfb.a(new cey(e));
        }
    }

    @Override // defpackage.yua
    public final /* bridge */ /* synthetic */ void qz(Object obj) {
        ((anie) this.a).o((byte[]) obj);
    }
}
