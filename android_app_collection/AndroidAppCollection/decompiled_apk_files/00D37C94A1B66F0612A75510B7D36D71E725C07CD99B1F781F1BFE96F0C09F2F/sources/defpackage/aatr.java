package defpackage;
/* compiled from: PG */
/* renamed from: aatr  reason: default package */
/* loaded from: classes.dex */
public final class aatr extends aaqs {
    public byte[] a;
    public boolean b;
    public int c;

    public aatr(aaqf aaqfVar, afvm afvmVar) {
        super("channel/get_channel_creation_form", aaqfVar, afvmVar);
        i();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aapd
    public final void c() {
        aqxo.y((((armt) a().instance).b & 2) != 0);
    }

    @Override // defpackage.aaqs
    /* renamed from: t */
    public final aopa a() {
        aopa createBuilder = armt.a.createBuilder();
        int i = this.c;
        createBuilder.copyOnWrite();
        armt armtVar = (armt) createBuilder.instance;
        int i2 = i - 1;
        if (i != 0) {
            armtVar.e = i2;
            armtVar.b |= 4;
            byte[] bArr = this.a;
            if (bArr != null) {
                aoob x = aoob.x(bArr);
                createBuilder.copyOnWrite();
                armt armtVar2 = (armt) createBuilder.instance;
                armtVar2.b |= 2;
                armtVar2.d = x;
            }
            boolean z = this.b;
            createBuilder.copyOnWrite();
            armt armtVar3 = (armt) createBuilder.instance;
            armtVar3.b |= 32;
            armtVar3.f = z;
            return createBuilder;
        }
        throw null;
    }
}
