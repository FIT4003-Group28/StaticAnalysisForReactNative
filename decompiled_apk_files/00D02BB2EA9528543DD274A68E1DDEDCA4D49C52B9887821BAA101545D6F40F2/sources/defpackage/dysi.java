package defpackage;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* renamed from: dysi  reason: default package */
/* loaded from: classes6.dex */
public final class dysi extends dygm {
    final /* synthetic */ dysk b;

    public dysi(dysk dyskVar) {
        this.b = dyskVar;
    }

    @Override // defpackage.dygm
    public final dygl a(dygz dygzVar) {
        dygk dygkVar = new dygk();
        dygkVar.a = this.b;
        dygkVar.b = ((dytf) dygzVar).a;
        boolean z = true;
        dbsk.m(dygkVar.a != null, "config is not set");
        if (dygkVar.b == null) {
            z = false;
        }
        dbsk.m(z, "callOptions is not set");
        return new dygl(dyjb.b, dygkVar.a, dygkVar.b);
    }
}
